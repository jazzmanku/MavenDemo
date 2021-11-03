package Intro;

public class Greetings {
    /*
    #3 Intro.Greetings
    for 4 people
    function, Intro.Arrays, Loops, conditions
    Inputs:
    fName, lastName, gender, age
    if age <10 - Jr if boy or Miss if girl
    if not, gender = m => Mr,
    f => Ms.
    */
    public static void main(String[] args) {
        String person1 = "Sam, Smith, M, 43";
        String person2 = "Joane, Smith, F, 41";
        String person3 = "John, Smith, M, 6";
        String person4 = "Cindy, Smith, F, -9";

        String[] details = personalDetails(person1);
        greetings(details[0],details[1],details[2],Integer.parseInt(details[3]));

        details = personalDetails(person2);
        greetings(details[0],details[1],details[2],Integer.parseInt(details[3]));

        details = personalDetails(person3);
        greetings(details[0],details[1],details[2],Integer.parseInt(details[3]));

        details = personalDetails(person4);
        greetings(details[0],details[1],details[2],Integer.parseInt(details[3]));

//        greetings(details[0],details[1].trim(),details[2].trim(), Integer.parseInt(details[3].trim()));
//        details= person2.split(",");
//        greetings(details[0],details[1].trim(),details[2].trim(), Integer.parseInt(details[3].trim()));
//        details= person3.split(",");
//        greetings(details[0],details[1].trim(),details[2].trim(), Integer.parseInt(details[3].trim()));
//        details= person4.split(",");
//        greetings(details[0],details[1].trim(),details[2].trim(), Integer.parseInt(details[3].trim()));
    }

    public static String[] personalDetails(String person){
        String[] details= person.split(",");
        String[] returnData = new String[details.length];
        for(int i=0;i<details.length;i++){
            returnData[i] = details[i].trim();
        }
        return returnData;

    }
    public static void greetings(String fName, String lName, String gender, int age){

        if(age>0 && age<10){
            if(gender.equals("M")){
                System.out.println("Hello Jr."+fName+" "+lName);
            }
            else{
                System.out.println("Hello Miss."+fName+" "+lName);
            } }
        else{
            if(gender.equals("M")){
                System.out.println("Hello Mr."+fName+" "+lName);
            }
            else{
                System.out.println("Hello Ms."+fName+" "+lName);
            }
        }
    }
}

