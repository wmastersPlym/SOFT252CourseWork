/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Util;

import Model.Address;
import Model.Appointment;
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
    
    public static Person[] GetAllUsers() {
        if(allUsers == null) {
            allUsers = getAllPeopleFromFile();
        }
        return allUsers;
    }
    
    private static Person[] getAllPeopleFromFile() {
        ArrayList<Person> myPeople = new ArrayList<Person>();
        
        try {
          BufferedReader br = new BufferedReader(new FileReader(new File("people.txt")));  
          int numberOfPeople = Integer.parseInt(br.readLine());
          for(int i =0; i < numberOfPeople; i++) {
              String id = br.readLine();
              String passwordHash = br.readLine();
              String firstName = br.readLine();
              String lastName = br.readLine();
              String houseNumberName = br.readLine();
              String streetName = br.readLine();
              String town = br.readLine();
              String postcode = br.readLine();
              
              
              
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
                      Patient newPatient = new Patient(id, passwordHash, firstName, lastName, new Address(houseNumberName, streetName, town, postcode));
                      myPeople.add(newPatient);
                      break;
                  case 's':
                      Secretary newSecretary = new Secretary(id, passwordHash, firstName, lastName, new Address(houseNumberName, streetName, town, postcode));
                      myPeople.add(newSecretary);
                      break;
              }
              
              //System.out.println(id.charAt(0));
          }
          for(Person p : myPeople) {
              System.out.println(p.toString());
          }
          Person[] peopleToReturn = myPeople.toArray(new Person[myPeople.size()]);
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
    
    public static Person getPerson(String id) {
        Person[] people = GetAllUsers();
        //System.out.println("Controller.Database.getPerson(), id: " + id);
        
        for(Person p : people) {
           // System.out.println("p.getId() : " + p.getId());
            
            if(id.equals(p.getId())) {
                System.out.println("Match");
                return p;
            }
        }
        
        return null;
    }
    
    public static void addPerson(Person newPerson) {
        GetAllUsers();
        System.out.println("Model.Util.Database.addPerson():" + newPerson.getId());
        //allTempPeople
        Person[] all = new Person[allUsers.length+1];
        for(int i=0; i < allUsers.length; i++) {
            all[i] = allUsers[i];
        }
        all[allUsers.length] = newPerson;
        allUsers = all;
        writePeopleToFile();
    }
    
    private static void writePeopleToFile() {
        GetAllUsers();
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(new File("people.txt"), false));
            bw.write(Integer.toString(allUsers.length));
            bw.newLine();
            for(Person p : allUsers) {
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
                
            }
            bw.close();
            
        } catch(IOException e) {
            e.printStackTrace();
        }
        
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
          BufferedReader br = new BufferedReader(new FileReader(new File("tempPeople.txt")));  
          int numberOfPeople = Integer.parseInt(br.readLine());
          for(int i =0; i < numberOfPeople; i++) {
              String passwordHash = br.readLine();
              String firstName = br.readLine();
              String lastName = br.readLine();
              String houseNumberName = br.readLine();
              String streetName = br.readLine();
              String town = br.readLine();
              String postcode = br.readLine();
              
              myTempPeople.add(new TempPerson(firstName, lastName, passwordHash, new Address(houseNumberName, streetName, town, postcode)));
              
              
              
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
            BufferedWriter bw = new BufferedWriter(new FileWriter(new File("tempPeople.txt"), false));
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
}
