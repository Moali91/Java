package interfaces;

import inheritance_p1.Employer;

public class ResturantTest {
    public static void main(String[] args) {
        Employee empl = new Employee();
        Student stud = new Student();
        Resturant rest = new Resturant();
        rest.receive(empl);
        rest.receive(stud);
    }

}
