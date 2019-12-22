package surgery;

import java.util.ArrayList;
import java.time.LocalDate;


public class Surgery {
    private String name;
    ArrayList<Patient> patients = new ArrayList<>();

    public Surgery(String name){
        this.name = name;
    }


    public void addPatient(String firstName, String lastName, LocalDate dateOfBirth, String parentFirstName, String parentLastName,String parentJob)
    {
        patients.add(new Patient(firstName,lastName,dateOfBirth,parentFirstName,parentLastName,parentJob));
    }

    public void addCheckup(String firstname, String lastname,LocalDate date, int height, double weight, double temperature, boolean eyesightOk){
        Checkup checkup = new Checkup(date,height,weight,temperature,eyesightOk);
        for(Patient p : patients) {
            if (p.getFirstName().equals(firstname) && p.getLastName().equals(lastname)) {
                p.addCheckup(checkup);
                patients.add(p);
            }
        }
    }

    public void addVacc(String firstname, String lastname, String name, LocalDate vaccinationDate, LocalDate expiryDate){
        Vaccination vacc = new Vaccination(name,vaccinationDate,expiryDate);
        for(Patient p : patients){
            if(p.getFirstName().equals(firstname) && p.getLastName().equals(lastname)){
                p.addVaccination(vacc);
                patients.add(p);
            }
        }
    }

    public boolean checkVacc(String firstname, String lastname){
        boolean check = false;
        for(Patient p : patients){
            if(p.getFirstName().equals(firstname) && p.getLastName().equals(lastname)){
                    check = p.expiredVaccinations();
                }
            }
        return check;
    }

    public boolean isPatient(String firstname, String lastname){
        boolean isIn = false;
        for(Patient p : patients){
                isIn = p.getFirstName().equals(firstname) && p.getLastName().equals(lastname);
        }
        return isIn;
    }
}
