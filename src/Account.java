
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


