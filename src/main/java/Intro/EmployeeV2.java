package Intro;

public class EmployeeV2 {
    //field
    String firstName;
    String lastName;
    String gender;
    int age;
    boolean isWFH;
    String country;

    public String fullName(){
        return firstName + " " + lastName;
    }

    public String greetings(){
        if(age>0 && age<10){
            if(gender.equals("M")){
                return ("Hello Jr. "+firstName+" "+lastName);
            }
            else{
                return ("Hello Miss. "+firstName+" "+lastName);
            } }
        else{
            if(gender.equals("M")){
                return ("Hello Mr. "+firstName+" "+lastName);
            }
            else{
                return("Hello Ms. "+firstName+" "+lastName);
            }
        }
    }

    public String greetings(boolean check){
        //check

        if(age>0 && age<10){
            if(gender.equals("M")){
                return ("Hello Jr. "+firstName+" "+lastName);
            }
            else{
                return ("Hello Miss. "+firstName+" "+lastName);
            } }
        else{
            if(gender.equals("M")){
                return ("Hello Mr. "+firstName+" "+lastName);
            }
            else{
                return("Hello Ms. "+firstName+" "+lastName);
            }
        }
    }
}
