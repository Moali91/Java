package surgery;

import java.time.LocalDate;

public class Person {
    private String firstName;
    private String lastName;
    private String address;
    private String job;
    private LocalDate dateOfBirth;
    private String parentFirstName;
    private String parentLastName;

    public Person(String parentFirstName, String parentLastName, String address, String job){
        this.firstName = parentFirstName;
        this.lastName = parentLastName;
        this.address = address;
        this.job = job;
    }

    public Person(String firstName, String lastName, LocalDate dateOfBirth, String parentFirstName, String parentLastName, String parentAddress,
                   String parentJob){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.parentFirstName = parentFirstName;
        this.parentLastName = parentLastName;
        this.address = parentAddress;
        this.job = parentJob;
    }
}
