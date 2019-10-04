package classesAndobjects.student;


public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Mo","Ali",23);
        Student student2 = new Student("Mac","Müller");
        Student student3 = new Student("Bobby","Li",23);
        Student student4 = new Student("Yannik","Ali");

        student2.setAge(30);
        student4.setAge(20);

        student1.printStudentInfo();
        student2.printStudentInfo();
        student3.printStudentInfo();
        student4.printStudentInfo();
        System.out.println("Number of students : "+Student.getCounter());

    }
}
