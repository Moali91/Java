package surgery;

import java.util.ArrayList;
import java.time.LocalDate;


public class Surgery {
    private String name;
    ArrayList<Patient> patients = new ArrayList<>();

    public Surgery(String name){
        this.name = name;
    }

    public void addPatient(String firstName, String lastName, LocalDate dateOfBirth, String parentFirstname,
                           String parentLastname, String parentAddress, String parentJob)
    {
        Patient patient = new Patient(firstName,lastName,dateOfBirth,parentFirstname,parentLastname,parentAddress,parentJob);
        patients.add(patient);
    }

    public void addCheckup(String firstname, String lastname, LocalDate date, int height,
                           double weight, double temperature, boolean eyesightOK){
        Checkup checkup = new Checkup(firstname,lastname,date,height,weight,temperature,eyesightOK);
        for(int i = 0; i< patients.size(); i++){
            
        }
        patients.add();
    }
}
