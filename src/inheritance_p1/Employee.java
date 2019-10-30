package inheritance_p1;

public class Employee extends Person {
    private String jobTitle;
    private int salary;


    public Employee(String name, int age, String jobTitle, int salary ) {
        super(name, age);
        this.jobTitle = jobTitle;
        this.salary = salary;

    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getSalary(){
        return salary;

    }

}
