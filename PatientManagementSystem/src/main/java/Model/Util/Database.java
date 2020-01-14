/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Util;

import Model.Address;
import Model.Appointment;
import Model.Medicine;
import Model.People.Admin;
import Model.People.Doctor;
import Model.People.Patient;
import Model.People.Person;
import Model.People.Secretary;
import Model.People.TempPerson;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author wmasters
 */
public class Database {
    // Will be used to read / write to json files
    
    private static Person[] allUsers;
    private static TempPerson[] allTempPeople;
    private static Appointment[] allAppointments;
    private static Medicine[] allMedicine;
    
    private static String peopleFile = "people.txt";
    private static String tmpPeopleFile = "tempPeople.txt";
    
    public static Person[] GetAllUsers() {
        // if there are no users it will get them all from the file
        if(allUsers == null) {
            allUsers = getAllPeopleFromFile();
        }
        return allUsers;
    }
    
    private static Person[] getAllPeopleFromFile() {
        ArrayList<Person> myPeople = new ArrayList<Person>();
        
        try {
          BufferedReader br = new BufferedReader(new FileReader(new File(peopleFile)));  
          
          // Reads how many people will be in the file
          int numberOfPeople = Integer.parseInt(br.readLine());
          for(int i =0; i < numberOfPeople; i++) {
              
              // Reads each attribute for the person
              String id = br.readLine();
              String passwordHash = br.readLine();
              String firstName = br.readLine();
              String lastName = br.readLine();
              String houseNumberName = br.readLine();
              String streetName = br.readLine();
              String town = br.readLine();
              String postcode = br.readLine();
              
              
              // Depending on their id the correct Type of person is created
              switch(id.charAt(0)){
                  case 'a': 
                      Admin newAdmin = new Admin(id, passwordHash, firstName, lastName, new Address(houseNumberName, streetName, town, postcode));
                      myPeople.add(newAdmin);
                      break;
                  case 'd':
                      Doctor newDoctor = new Doctor(id, passwordHash, firstName, lastName, new Address(houseNumberName, streetName, town, postcode));
                      myPeople.add(newDoctor);
                      break;
                  case 'p':
                      // Patient has more data so rest of attributes are read from the file
                      String sex = br.readLine();
                      int age = Integer.parseInt(br.readLine());
                      Patient newPatient = new Patient(id, passwordHash, firstName, lastName, new Address(houseNumberName, streetName, town, postcode), sex, age);
                      myPeople.add(newPatient);
                      break;
                  case 's':
                      Secretary newSecretary = new Secretary(id, passwordHash, firstName, lastName, new Address(houseNumberName, streetName, town, postcode));
                      myPeople.add(newSecretary);
                      break;
              }
              
          }
          
          // Converts arraylist back to array
          Person[] peopleToReturn = myPeople.toArray(new Person[myPeople.size()]);
          
          // closes the file
          br.close();
          return peopleToReturn;
          
        }catch (IOException e) {
            e.printStackTrace();
        } catch(NumberFormatException e) {
            e.printStackTrace();
        }
        
                
        // There was an error openeing the file so null will be returned
        return null;
    }
    
    public static Person getPerson(String id) {
        // fills temporary array with all the users
        Person[] people = GetAllUsers();
        
        // Loops through each person
        for(Person p : people) {
            
            // compares the id 
            if(id.equals(p.getId())) {
                System.out.println("Match");
                return p;
            }
        }
        
        return null;
    }
    
    public static void addPerson(Person newPerson) {
        GetAllUsers();
        
        // makes empty array one bigger that the array containing all the users
        Person[] all = new Person[allUsers.length+1];
        for(int i=0; i < allUsers.length; i++) {
            // loops through and adds each user to the new array
            all[i] = allUsers[i];
        }
        // adds the new user to the end of the array
        all[allUsers.length] = newPerson;
        allUsers = all;
        
        //writes the new array to the file
        writePeopleToFile();
    }
    
    private static void writePeopleToFile() {
        // makes sure the array isnt empty
        GetAllUsers();
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(new File(peopleFile), false));
            // Writes how many people are in the array
            bw.write(Integer.toString(allUsers.length));
            bw.newLine();
            for(Person p : allUsers) {
                // Writes all the attributes for each person
                bw.write(p.getId());
                bw.newLine();
                bw.write(p.getPasswordHash());
                bw.newLine();
                bw.write(p.getFirstName());
                bw.newLine();
                bw.write(p.getLastName());
                bw.newLine();
                bw.write(p.getAddress().getHouseNumberName());
                bw.newLine();
                bw.write(p.getAddress().getStreetName());
                bw.newLine();
                bw.write(p.getAddress().getTown());
                bw.newLine();
                bw.write(p.getAddress().getPostcode());
                bw.newLine();
                if(p instanceof Patient) {
                    // Writes the extra attributes for the patients
                    bw.write(((Patient) p).getSex());
                    bw.newLine();
                    bw.write( Integer.toString(((Patient) p).getAge()) );
                    bw.newLine();
                }
            }
            bw.close();
            
        } catch(IOException e) {
            e.printStackTrace();
        }
        
    }
    
    public static void removePerson(String id) {
        // Make sure array of all people is up to date
        GetAllUsers();
        
        
        ArrayList<Person> restOfPeople = new ArrayList<Person>();
        
        // adds every person to the array list unless that have the same id as what is passed to the function
        for(Person p : GetAllUsers()) {
            if(!(p.getId().equals(id))) {
                restOfPeople.add(p);
            }
        }
        
        // converts the arraylist back to an array
        Person[] allUsersArray = restOfPeople.toArray(new Person[restOfPeople.size()]);
        
        allUsers = allUsersArray;
        
        writePeopleToFile();
    }
    
    
    
    public static TempPerson[] getAllTempPeople() {
        if(allTempPeople == null) {
            allTempPeople = getAllTempPeopleFromFile();
        }
        return allTempPeople;
    }
    
    private static TempPerson[] getAllTempPeopleFromFile() {
        ArrayList<TempPerson> myTempPeople = new ArrayList<TempPerson>();
        
        try {
          BufferedReader br = new BufferedReader(new FileReader(new File(tmpPeopleFile)));  
          int numberOfPeople = Integer.parseInt(br.readLine());
          for(int i =0; i < numberOfPeople; i++) {
              String passwordHash = br.readLine();
              String firstName = br.readLine();
              String lastName = br.readLine();
              String houseNumberName = br.readLine();
              String streetName = br.readLine();
              String town = br.readLine();
              String postcode = br.readLine();
              String sex = br.readLine();
              int age = Integer.parseInt(br.readLine());
              
              myTempPeople.add(new TempPerson(firstName, lastName, passwordHash, new Address(houseNumberName, streetName, town, postcode), sex, age));
              
              
              
              //System.out.println(id.charAt(0));
          }
          TempPerson[] peopleToReturn = myTempPeople.toArray(new TempPerson[myTempPeople.size()]);
          //peopleToReturn = (Person) myPeople.toArray();
          br.close();
          return peopleToReturn;
          
        }catch (IOException e) {
            e.printStackTrace();
        } catch(NumberFormatException e) {
            e.printStackTrace();
        }
        
                
        
        return null;
    }
    
    public static void addTempPerson(TempPerson newTempPerson) {
        getAllTempPeople();
        //allTempPeople
        TempPerson[] all = new TempPerson[allTempPeople.length+1];
        for(int i=0; i < allTempPeople.length; i++) {
            all[i] = allTempPeople[i];
        }
        all[allTempPeople.length] = newTempPerson;
        allTempPeople = all;
        writeTempPeopleToFile();
    }
    
    private static void writeTempPeopleToFile() {
        getAllTempPeople();
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(new File(tmpPeopleFile), false));
            bw.write(Integer.toString(allTempPeople.length));
            bw.newLine();
            for(TempPerson p : allTempPeople) {
                bw.write(p.getPasswordHash());
                bw.newLine();
                bw.write(p.getFirstName());
                bw.newLine();
                bw.write(p.getLastName());
                bw.newLine();
                bw.write(p.getAddress().getHouseNumberName());
                bw.newLine();
                bw.write(p.getAddress().getStreetName());
                bw.newLine();
                bw.write(p.getAddress().getTown());
                bw.newLine();
                bw.write(p.getAddress().getPostcode());
                bw.newLine();
                bw.write(p.getSex());
                bw.newLine();
                bw.write(Integer.toString(p.getAge()));
                bw.newLine();
                
            }
            bw.close();
            
        } catch(IOException e) {
            e.printStackTrace();
        }
        
    }
    
    public static void popTempPerson() {
        TempPerson[] newArray = new TempPerson[allTempPeople.length-1];
        for(int i=0; i < allTempPeople.length-1; i++) {
            newArray[i] = allTempPeople[i+1];
        }
        allTempPeople = newArray;
        writeTempPeopleToFile();
    }
    
    public static boolean doesIdAlreadyExist(String id) {
        Person[] people = GetAllUsers();
        
        for(Person p : people) {
            if(p.getId().equals(id)) {
                return true;
            }
        }
        
        return false;
        
    }
    
    public static String generateAdminId() {
        String newId = "";
        Random rand = new Random();
        boolean newIdOkay = false;
        while(!newIdOkay) {
            newId = "a";
            for(int i=0; i<4; i++) {
                newId += Integer.toString(rand.nextInt(10));
            }
            newIdOkay = !doesIdAlreadyExist(newId);
            
        }
        
        return newId;
    }
    
    public static String generateDoctorId() {
        String newId = "";
        Random rand = new Random();
        boolean newIdOkay = false;
        while(!newIdOkay) {
            newId = "d";
            for(int i=0; i<4; i++) {
                newId += Integer.toString(rand.nextInt(10));
            }
            newIdOkay = !doesIdAlreadyExist(newId);
            
        }
        
        return newId;
    }
    
    public static String generateSecretaryId() {
        String newId = "";
        Random rand = new Random();
        boolean newIdOkay = false;
        while(!newIdOkay) {
            newId = "s";
            for(int i=0; i<4; i++) {
                newId += Integer.toString(rand.nextInt(10));
            }
            newIdOkay = !doesIdAlreadyExist(newId);
            
        }
        
        return newId;
    }
    
    public static String generatePatientId() {
        String newId = "";
        Random rand = new Random();
        boolean newIdOkay = false;
        while(!newIdOkay) {
            newId = "p";
            for(int i=0; i<4; i++) {
                newId += Integer.toString(rand.nextInt(10));
            }
            newIdOkay = !doesIdAlreadyExist(newId);
            
        }
        
        return newId;
    }
    
    //
    public static Appointment[] GetAllAppointments() {
        if(allAppointments == null) {
            allAppointments = getAllAppointmentsFromFile();
        }
        return allAppointments;
    }
    
    private static Appointment[] getAllAppointmentsFromFile() {
        ArrayList<Appointment> myAppointments = new ArrayList<Appointment>();
        
        try {
          BufferedReader br = new BufferedReader(new FileReader(new File("appointments.txt")));  
          int numberOfAppointments = Integer.parseInt(br.readLine());
          for(int i =0; i < numberOfAppointments; i++) {
              String drId = br.readLine();
              String patientId = br.readLine();
              String dateTime = br.readLine();
              String note = br.readLine();
              
              Appointment newAppointment = new Appointment(drId, patientId, dateTime, note);
              myAppointments.add(newAppointment);
              
              //System.out.println(id.charAt(0));
          }
          Appointment[] appointmentsToReturn = myAppointments.toArray(new Appointment[myAppointments.size()]);
          br.close();
          return appointmentsToReturn;
          
        }catch (IOException e) {
            e.printStackTrace();
        } catch(NumberFormatException e) {
            e.printStackTrace();
        }
        
                
        
        return null;
    }
    
    public static Appointment[] getDrsAppointments(String drId) {
        Appointment[] appointmetns = GetAllAppointments();
        //System.out.println("Controller.Database.getDrsAppointments(), id: " + drId);
        ArrayList<Appointment> matching = new ArrayList<>();
        for(Appointment a : appointmetns) {
           // System.out.println("p.getId() : " + p.getId());
            
            if(drId.equals(a.getDoctorId())) {
                //System.out.println("Appointment Found");
                matching.add(a);
            }
        }
        //System.out.println("mathcing size: " + matching.size());
        if(matching.size() > 0) {
            
            return matching.toArray(new Appointment[matching.size()]);
        } else {
            return null;
        }
        
    }
    
    public static Appointment[] getPatientsAppointments(String id) {
        Appointment[] appointmetns = GetAllAppointments();
        
        ArrayList<Appointment> matching = new ArrayList<>();
        for(Appointment a : appointmetns) {
           // System.out.println("p.getId() : " + p.getId());
            
            if(id.equals(a.getPatientId())) {
                
                matching.add(a);
            }
        }
        //System.out.println("mathcing size: " + matching.size());
        if(matching.size() > 0) {
            
            return matching.toArray(new Appointment[matching.size()]);
        } else {
            return null;
        }
        
    }
    
    public static void addAppointment(Appointment newAppointment) {
        GetAllAppointments();
        
        Appointment[] all = new Appointment[allAppointments.length+1];
        for(int i=0; i < allAppointments.length; i++) {
            
            all[i] = allAppointments[i];
        }
        all[allAppointments.length] = newAppointment;
        allAppointments = all;
        writeAppointmentsToFile();
    }
    
    private static void writeAppointmentsToFile() {
        GetAllUsers();
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(new File("appointments.txt"), false));
            bw.write(Integer.toString(allAppointments.length));
            bw.newLine();
            for(Appointment a : allAppointments) {
                bw.write(a.getDoctorId());
                bw.newLine();
                bw.write(a.getPatientId());
                bw.newLine();
                bw.write(a.getDateTime());
                bw.newLine();
                bw.write(a.getNotes());
                bw.newLine();
                
                
            }
            bw.close();
            
        } catch(IOException e) {
            e.printStackTrace();
        }
        
    }
    
    
    
    public static Medicine[] GetAllMedicine() {
        if(allMedicine == null) {
            allMedicine = getAllMedicineFromFile();
        }
        return allMedicine;
    }
    
    private static Medicine[] getAllMedicineFromFile() {
        ArrayList<Medicine> myMedicines = new ArrayList<Medicine>();
        
        try {
          BufferedReader br = new BufferedReader(new FileReader(new File("medicines.txt")));  
          int numberOfMedicines = Integer.parseInt(br.readLine());
          for(int i =0; i < numberOfMedicines; i++) {
              String name = br.readLine();
              String desc = br.readLine();
              int qty = Integer.parseInt(br.readLine());
              
              Medicine newMedicine = new Medicine(name, desc, qty);
              myMedicines.add(newMedicine);
              
              //System.out.println(id.charAt(0));
          }
          Medicine[] medicinesToReturn = myMedicines.toArray(new Medicine[myMedicines.size()]);
          br.close();
          return medicinesToReturn;
          
        }catch (IOException e) {
            e.printStackTrace();
        } catch(NumberFormatException e) {
            e.printStackTrace();
        }
        
                
        
        return null;
    }
    
    public static Medicine getMedicine(String name) {
        Medicine[] medicines = GetAllMedicine();
        
        for(Medicine m : medicines) {
            
            if(name.equals(m.getName())) {
                return m;
            }
        }
        return null;
        
        
    }
    
    public static void addMedicine(Medicine newMedicine) {
        GetAllMedicine();
        
        Medicine[] all = new Medicine[allMedicine.length+1];
        for(int i=0; i < allMedicine.length; i++) {
            
            all[i] = allMedicine[i];
        }
        all[allMedicine.length] = newMedicine;
        allMedicine = all;
        writeMedicinesToFile();
    }
    
    private static void writeMedicinesToFile() {
        GetAllMedicine();
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(new File("medicines.txt"), false));
            bw.write(Integer.toString(allMedicine.length));
            bw.newLine();
            for(Medicine m : allMedicine) {
                bw.write(m.getName());
                bw.newLine();
                bw.write(m.getDescription());
                bw.newLine();
                bw.write(Integer.toString(m.getQuantity()));
                bw.newLine();
                
                
            }
            bw.close();
            
        } catch(IOException e) {
            e.printStackTrace();
        }
        
    }
    
    public static void setPeopleFile(String newFile) {
        peopleFile = newFile;
    }
    
    public static void setTempPeopleFile(String newFile) {
        tmpPeopleFile = newFile;
    }
}
