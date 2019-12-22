package surgery;


import java.util.ArrayList;
import java.time.LocalDate;


public class Surgery {
    private String name;
    ArrayList<Patient> patients = new ArrayList<>();

    public Surgery(String name){
        this.name = name;
    }


    public void addPatient(String firstName, String lastName, LocalDate dateOfBirth, String parentFirstName, String parentLastName,String parentAddress, String parentJob)
    {
        patients.add(new Patient(firstName,lastName,dateOfBirth,parentFirstName,parentLastName,parentAddress,parentJob));
    }

    public void addCheckup(String firstname, String lastname,LocalDate date, int height, double weight, double temperature, boolean eyesightOk){
        Checkup checkup = new Checkup(date,height,weight,temperature,eyesightOk);
        for(Patient p : patients) {
            if (p.getFirstName().equals(firstname) && p.getLastName().equals(lastname)) {
                p.addCheckup(checkup);
            }
        }
    }

    public void addVacc(String firstname, String lastname, String name, LocalDate vaccinationDate, LocalDate expiryDate){
        Vaccination vacc = new Vaccination(name,vaccinationDate,expiryDate);
        for(Patient p : patients){
            if(p.getFirstName().equals(firstname) && p.getLastName().equals(lastname)){
                p.addVaccination(vacc);
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

    public void init() {
        addPatient("Jim","Johnson",LocalDate.of(2000, 12, 12),"Jack","Johnson","Somestreet","IT");
        addVacc("Jim","Johnson","Tetanus",LocalDate.of(2018, 12, 12),LocalDate.of(2020, 12, 12));
        addPatient("Jack","Smith",LocalDate.of(2000, 12, 12),"Anna","Smith","Somestreet","Engineer");
        addVacc("Jack","Smith","Measles",LocalDate.of(2018, 12, 12),LocalDate.of(2019, 12, 12));
    }

   /* public void printPatient() {
        System.out.println("Patients are: ");
        for (Patient p : patients) {
            System.out.println(p);
        }
    }
*/
}
