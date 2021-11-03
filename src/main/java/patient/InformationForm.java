package patient;

public class InformationForm {

    private String firstName, lastName, gender, docName, address, city, hcNumber, dob;
    private Long phoneNumber;

    public InformationForm(){
        System.out.println("Default Constructor in patient package");
    }

    public InformationForm(String fName,
                           String lName, String gender, String doctorName, String address, String cityName,
                           String healthCardNumber, String dob, Long contactNumber){
        this.firstName = fName;
        this.lastName = lName;
        this.gender = gender;
        this.docName = doctorName;
        this.address = address;
        this.city = cityName;
        this.hcNumber = healthCardNumber;
        this.dob = dob;
        this.phoneNumber = contactNumber;
    }

    public void showFullName(){
        System.out.println(firstName + " " + lastName);
    }
    /*
    1. Create 3 Patients
    2. Display their data
    Patient Name:
    Gender      :
    Doc Name    :
    Address     :
    City        :
    HC #        :
    DOB         :
    Phone #     :
     */
}
