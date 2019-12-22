package surgery;

import java.time.LocalDate;

public class Patient extends Person{
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String parentFirstName;
    private String parentLastName;
    private String parentJob;
    private Checkup checkup;
    private Vaccination vacc;

    public Patient(String firstName, String lastName, LocalDate dateOfBirth, String parentFirstName, String parentLastName,
                   String parentJob){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.parentFirstName = parentFirstName;
        this.parentLastName = parentLastName;
        this.parentJob = parentJob;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getParentFirstName() {
        return parentFirstName;
    }

    public void setParentFirstName(String parentFirstName) {
        this.parentFirstName = parentFirstName;
    }

    public String getParentLastName() {
        return parentLastName;
    }

    public void setParentLastName(String parentLastName) {
        this.parentLastName = parentLastName;
    }

    public String getParentJob() {
        return parentJob;
    }

    public void setParentJob(String parentJob) {
        this.parentJob = parentJob;
    }






    public void addCheckup(Checkup checkup){
        this.checkup = checkup;
    }


    public void addVaccination(Vaccination vacc){
        this.vacc = vacc;

    }


    public boolean expiredVaccinations(){
        if(vacc.isExpired()){
            return true;
        } else
        return false;
    }




    @Override
    public String toString() {
        return "Patient{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", parentFirstName='" + parentFirstName + '\'' +
                ", parentLastName='" + parentLastName + '\'' +
                ", parentJob='" + parentJob + '\'' +
                '}';
    }
}
