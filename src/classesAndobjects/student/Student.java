package classesAndobjects.student;

/**
 * this program printout on the console some of your students info
 * @autor Mohammed Ali
 * @version 1.0
 *
 */


public class Student {

    /**
     * Students infos, which can be entered
     * instant variable
     */
    private String name;
    private String lastName;
    private int age;
    private static int studentCounter = 0;


    /**
     * first student, all his infos are available
     * @param name first name of the student
     * @param lastName of the student
     * @param age how is the student
     */
    public Student(String name, String lastName, int age){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        studentCounter++;

    }


    /**
     * second Student which have no age, age need to be set later
     * @param name
     * @param lastName
     */
    public Student (String name, String lastName){
        this.name = name;
        this.lastName = lastName;
        this.age = -1;
        studentCounter++;
    }


    /**
     * a method to print out the Students infos on the console
     */
    public void printStudentInfo(){
        System.out.println(name +" "+ lastName+ " " +age + " Years old");
    }


    /**
     * a method to set the age of the second student, whos age need to be set
     * @param age
     */
    public void setAge(int age){
        this.age = age;
    }


    /**
     *
     * @return students number.
     */
    public static int getCounter(){
        return studentCounter;
        }
}