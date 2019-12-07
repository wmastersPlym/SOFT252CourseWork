/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


/**
 *
 * @author wmasters
 */
public class Database {
    // Will be used to read / write to json files
    
    public static void GetAllUsers() {
        
    }
    
    public static void test() {
        JSONParser jp = new JSONParser();
        
        try(FileReader reader = new FileReader("people.json")) {
            Object obj = jp.parse(reader);
            
            JSONArray people = (JSONArray) obj;
            System.out.println(people);
            
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } 
    }
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