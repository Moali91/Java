package arrayLists;

public class universityTest {
    public static void main(String[] args) {

//small test 
        University uni1 = new University("BFH");
        Student stu1 = new Student("Mo",23);
        Student stu2 = new Student("Mohammed",22);



        stu1.addGrade(8);
        stu1.addGrade(5);
        stu1.addGrade(9);
        uni1.addStudent(stu1);
        uni1.addStudent(stu2);
        stu1.getAvg();

        stu1.printGrades();
        System.out.println("your average is "+stu1.getAvg());
        System.out.println(uni1.isStudent("Moha"));


    }
}
