package interfaces;

public class Employee implements Customer {

    @Override
    public void eat() {
        System.out.println("Employee is eating.");

    }

    @Override
    public void pay() {
        System.out.println("Employee is paying.");

    }
}
