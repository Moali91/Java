package dataTypes;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Mo", 100);
        System.out.println("Name of the employee: "+employee1.getName());
        System.out.println("Salary before raising: "+employee1.getSalary());
        employee1.raiseSalary( 10);
        System.out.println("Salary raised: "+employee1.getSalary());
    }
}
