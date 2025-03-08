
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @@author Vansh Cahawla
 */
public class UserName {
    private String username; // a variable to store the username
    private String password; // a variable to store the password
    
    public UserName (String username, String password) { // A constructor that assign the values
        this.username = username; //assigning the value of username
        this.password = password; //assigning the value of password

    }
    
    public boolean check () throws FileNotFoundException { // a typed method of the tpe boolean that checks to see if the username / pssword exists
        String tempName = ""; // A variable to store the value of name from the textfile
        String tempPassword = ""; // A variable to store the value of password from the textfile
        boolean found = false;  // Changes if the username and password is found
        Scanner scFile = new Scanner (new File ("UserNames.txt")); // opens the text file with all the usernmes and passwords
        while (scFile.hasNext()) { // checks to see if the text file has more line
            Scanner scLine = new Scanner (scFile.next()); // splits the line from the file
            scLine.useDelimiter("#"); // a delimeter is specified to break up each part of the line
            tempName = scLine.next();  // The username is extracted
            tempPassword = scLine.next();  // the password is extracted
                if (tempName.equals(username) && tempPassword.equals(password)) { // checks if the username and password matches the ones that the user entered
                    found = true; // changes the value of found
                    break; // stops the program from running
                }
                
                 
                      
        }
        
        return found; // returns the value of found
    } 
}
