
import java.util.Scanner;




 // @author 
 
public class Account {

   
String User;
String Pass;
String userName;
String userLast;
String user;
String pass;


public boolean checkUsername(){
   boolean Username=false;
    for(int i=0; i<User.length(); i++){
   if(User.length() <=5){
       
   if((int)User.charAt(i) ==95)
       Username=true;
   }
    }
    return Username;
}

   
 
public boolean checkPasswordComplexity(){
  boolean Number =false;
  boolean Special=false;
    boolean Letters=false;  

 for(int i=0; i<Pass.length(); i++){
   if(Pass.length() >= 8){ 
   if((int)Pass.charAt(i) >65 &&(int)Pass.charAt(i) <=90) {
       Letters=true;
   }  
    

   if((int)Pass.charAt(i) >=48 &&(int)Pass.charAt(i) <=57){
       Number=true;
               }          
        if((int)Pass.charAt(i) >=33 &&(int)Pass.charAt(i) <=47 || (int)Pass.charAt(i) >=58 &&(int)Pass.charAt(i) <=64 || (int)Pass.charAt(i) >=91 &&(int)Pass.charAt(i) <=96 || (int)Pass.charAt(i) >=123 &&(int)Pass.charAt(i) <=126)   
          

       Special=true;
   }

       
   }
return Letters && Number && Special;
}
public String registerUser(){
 
  if(checkUsername()==true){
           System.out.println("Username succefully captured");
       }else{
           System.out.println("Username is not correctly formatted,please ensure that your Username contains an underscore and is no more than 5 characters in length ");
       }   
       if(checkPasswordComplexity()==true){
           System.out.println("Password succefully captured");
       }else{
           System.out.println("Password is not correctly formatted please ensure that the password contains atleast 8characters, a capital letter , a number and a special character ");
       }
           if(checkUsername()==true && (checkPasswordComplexity()==true)){
         System.out.println("The two above conditions have been met and the user has been registered succefully");  
}
       
         if(checkPasswordComplexity()==false){
               System.out.println("The password does not meet the complexity requirements");      
         }
     if(checkUsername()==false){
         System.out.println("The username is incorrectly formatted");
         
     }
      

       return("") ;

}
public boolean loginUser(){
 boolean login=false;
 
   
 if(user.equals(User) && (pass.equals(Pass))){
     login=true;
 }
    return login;
}
String returnLoginStatus(){
    
         
     
if(loginUser()==true) {
    
    
    System.out.println("Succeful Login");
    System.out.println("Welcome " +" "+ userName +" "+ userLast +" " + " It is great to see you again " );

}
else{
     System.out.println("A Failed Login"); 
     System.out.println("Username or Password incorrect please try again");
            
}  
     return"";
} 
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      Account Acc = new Account();
      
      System.out.println("Enter your username");
      Acc.User=input.next();
      System.out.println("Enter your password");
      Acc.Pass=input.next();
      System.out.println("Enter your firstName");
      Acc.userName=input.next();
      System.out.println("Enter your lastName");
      Acc.userLast=input.next();
       System.out.println(Acc.registerUser());
 
     if(Acc.checkUsername()==true && (Acc.checkPasswordComplexity())==true){
     System.out.println("Enter your username");
     Acc.user=input.next();
       System.out.println("Enter your password");
       Acc.pass=input.next();
      System.out.println(Acc.returnLoginStatus()); 
     
   
    }}}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template*/

package com.mycompany.account;

import java.util.Scanner;

/**
 * This class represents a user account with functionalities to register and log in.
 * It includes methods to check username and password validity.
 */
public class Account {

    // User details
    private String user;       // Current username for login
    private String pass;       // Current password for login
    private String username;   // Registered username
    private String password;    // Registered password
    private String firstName;  // User's first name
    private String lastName;   // User's last name
    private boolean register;

    /**
     * Checks if the username is valid.
     * A valid username must contain an underscore and be no more than 5 characters.
     *
     * @return true if the username is valid, false otherwise.
     */
    public boolean checkUsername() {
        boolean isValid = false;
        if (user.length() <= 5 && user.contains("_")) {
            isValid = true;
        }
        return isValid;
    }

    /**
     * Checks the complexity of the password.
     * A valid password must be at least 8 characters long and contain
     * at least one uppercase letter, one number, and one special character.
     *
     * @return true if the password meets the complexity requirements, false otherwise.
     */
    public boolean checkPasswordComplexity() {
        boolean hasNumber = false;
        boolean hasSpecial = false;
        boolean hasLetter = false;

        if (password.length() >= 8) {
            for (int i = 0; i < password.length(); i++) {
                char ch = password.charAt(i);
                if (Character.isUpperCase(ch)) {
                    hasLetter = true;
                } else if (Character.isDigit(ch)) {
                    hasNumber = true;
                } else if (!Character.isLetterOrDigit(ch)) {
                    hasSpecial = true;
                }
            }
        }
        return hasLetter && hasNumber && hasSpecial;
    }

    /**
     * Registers a user by checking their username and password.
     * If both are valid, it stores the user details.
     *
     * @return a message indicating the registration status.
     */
    public String registerUser () {
        // Check username validity
        if (checkUsername()) {
            System.out.println("Username successfully captured.");
            username = user; // Store the registered username
        } else {
            return "Username is not correctly formatted. Ensure it contains an underscore and is no more than 5 characters in length.";
        }

        // Check password complexity
        if (checkPasswordComplexity()) {
            System.out.println("Password successfully captured.");
            password = pass; // Store the registered password
        } else {
            return "Password is not correctly formatted. Ensure it contains at least 8 characters, a capital letter, a number, and a special character.";
        }

        return "User  has been registered successfully.";
    }

    /**
     * Logs in the user by checking the provided username and password.
     *
     * @return true if the login is successful, false otherwise.
     */
    public boolean loginUser () {
        return user.equals(username) && pass.equals(password);
    }

    /**
     * Returns the login status message.
     *
     * @return a message indicating the login status.
     */
    public String returnLoginStatus() {
        if (loginUser ()) {
            return "Successful Login. Welcome " + firstName + " " + lastName + "! It is great to see you again.";
        } else {
            return "Login Failed. Username or Password incorrect. Please try again.";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account acc = new Account();

        // User registration
        System.out.println("Enter your username:");
        acc.user = input.next(); // Capture input for username
        System.out.println("Enter your password:");
        acc.pass = input.next(); // Capture input for password
        System.out.println("Enter your first name:");
        acc.firstName = input.next(); // Capture input for first name
        System.out.println("Enter your last name:");
        acc.lastName = input.next(); // Capture input for last name

        // Register the user and display the result
        System.out.println(acc.register);}
}
