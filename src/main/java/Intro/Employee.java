package Intro;

public class Employee {
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

    public static void main(String[] args) {
        //ClassName objectName = new ClassName();
        Employee emp1 = new Employee();
        emp1.firstName = "John";
        emp1.lastName = "Smith";
        emp1.gender = "M";
        emp1.age = 35;
        emp1.isWFH = false;
        emp1.country = "CA";

        System.out.println("Intro.Employee 1 - Full Name: " + emp1.fullName());

        Employee emp2 = new Employee();
        emp2.firstName = "Sandy";
        emp2.lastName = "Hale";
        emp2.gender = "M";
        emp2.age = 45;
        emp2.isWFH = true;
        emp2.country = "US";

        System.out.println("Intro.Employee 2 - Full Name: " + emp2.fullName());

    }
}
