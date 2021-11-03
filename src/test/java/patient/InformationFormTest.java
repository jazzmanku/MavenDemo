package patient;

import org.testng.annotations.Test;

public class InformationFormTest {

    @Test
    public void testConstructor(){
        InformationForm patientObj = new InformationForm("John", "Smith", "M",
                "","","","","",6479874579l);

        patientObj.showFullName();
    }
}