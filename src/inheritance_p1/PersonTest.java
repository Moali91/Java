package inheritance_p1;

public class PersonTest {




    public static void main(String[] args) {

        Person person1 = new Person("Mo",23);
        Employee employee1 = new Employee("Mohammed",23,"IT-Manager", 10000);
        Employer employer1 = new Employer("Ali",24,"Software AG");

        System.out.println("Person1 name is : "+ person1.getName()+" Person1 age is : "+person1.getAge());
        System.out.println("Employee1 age is : "+ employee1.getAge());
        System.out.println("Employer1 age is : "+ employer1.getAge());
        System.out.println("Company name before setting the name : "+ employer1.getCompanyName());
        employer1.setCompanyName("Mo AG");
        System.out.println("Company name after setting the name : "+ employer1.getCompanyName());



    }
}
