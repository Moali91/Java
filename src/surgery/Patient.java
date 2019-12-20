package surgery;

import java.time.LocalDate;

public class Patient extends Person{
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String parentFirstName;
    private String parentLastName;
    private String parentJob;

    public Patient(String firstName, String lastName, LocalDate dateOfBirth, String parentFirstName, String parentLastName,
                   String parentJob){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.parentFirstName = parentFirstName;
        this.parentLastName = parentLastName;
        this.parentJob = parentJob;

    }
}
