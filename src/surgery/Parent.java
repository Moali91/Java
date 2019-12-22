package surgery;

public class Parent extends Person{
    private String firstName;
    private String lastName;
    private String address;
    private String job;

    public Parent(String firstName, String lastName, String address, String job){
        super(firstName,lastName,address,job);
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.job = job;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", job='" + job + '\'' +
                '}';
    }

}
