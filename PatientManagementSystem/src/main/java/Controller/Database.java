/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Address;
import Model.People.Admin;
import Model.People.Doctor;
import Model.People.Patient;
import Model.People.Person;
import Model.People.Secretary;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author wmasters
 */
public class Database {
    // Will be used to read / write to json files
    
    private static Person[] allUsers;
    
    
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
    
    /*private static Person[] GetAllUsersFromJSON() {
        ArrayList<Person> myPeople = new ArrayList<Person>();
        
        JSONParser jp = new JSONParser();
        
        try(FileReader reader = new FileReader("people.json")) {
            Object obj = jp.parse(reader);
            
            JSONArray people = (JSONArray) obj;
            
            
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } 
        
        return null;
    }
    
    public static void test() {
        JSONParser jp = new JSONParser();
        
        try(FileReader reader = new FileReader("people.json")) {
            Object obj = jp.parse(reader);
            
            JSONArray people = (JSONArray) obj;
            System.out.println(people);
            
            for(Object o : people) {
                System.out.println((JSONObject)o);
            }
            
            
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } 
    }*/
}


// My JSON Simple Cheat sheet
/*
    JSONObject myObject = new JSONObject(); - creates a json object
    myObject.put("attribute", "value"); - adds a attribute to a object

    JSONArray myArray = new JSONArray(); - creates a array of json objects
    myArray.add(myObject); - adds a json object to the array;

    Code to write list to file
    try(FileWriter file = new FileWriter("myFile.json")) {
            file.write(myList.toJSONString());
            file.flush();
        } catch(IOException e) {
            e.printStackTrace();
        }
*/