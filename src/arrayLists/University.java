package arrayLists;

import java.time.LocalDate;
import java.util.ArrayList;

public class University {
    private String name;
    ArrayList<Student> students = new ArrayList<>();

    University(String name){
        this.name = name;
    }


    public void addStudent(Student student){
        students.add(student);
    }



    //check if he is a student
    public boolean isStudent(String name){
        boolean isStu = false;
        for(Student s : students){
            if(s.getName().equals(name)){
                isStu = true;
            }
        }
        return isStu;
    }

    public void removeStudent(String name){
        for(Student student : students){
            if(student.getName().equals(name)){
                students.remove(student);
            }
        }
    }

    public void printStudents(){
        for(Student s : students){
            System.out.println(s.getName());
        }

    }

}
