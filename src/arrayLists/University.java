package arrayLists;

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

}
