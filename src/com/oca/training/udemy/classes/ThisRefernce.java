package com.oca.training.udemy.classes;

public class ThisRefernce {
    private String firstName;
    private String lastName;

    public ThisRefernce(){
        this("Deafault", "Deafault");
    }

    public ThisRefernce(String firstName, String last){
       // this(); // Recursive constructor invocatio -> never ends goes in loop.
        this.firstName = firstName;
      /*  this.lastName = last;
        String lastName = "nyName";*/
        this.lastName = last;
    }

    public  void SetFirstName(String firstName){
       // this("Deafault", "Deafault"); // this() -> Always in constructor not in method
        this.firstName = firstName;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getFullName(){
      //  return this.firstName + " " + this.lastName;
        return firstName + " " +lastName;
    }

    public static void main(String[] args) {

    }
}
