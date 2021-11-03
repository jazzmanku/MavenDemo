package Intro;

public class callEmployeeV2 {
    public static void main(String[] args) {
        //ClassName objectName = new ClassName();
        EmployeeV2 emp1 = new EmployeeV2();

        emp1.firstName = "John";
        emp1.lastName = "Smith";
        emp1.gender = "M";
        emp1.age = 35;

        System.out.println(emp1.greetings());

        EmployeeV2 emp2 = new EmployeeV2();
        emp2.firstName = "Sandy";
        emp2.lastName = "Hale";
        emp2.gender = "F";
        emp2.age = 25;

        System.out.println(emp2.greetings());
    }
}
