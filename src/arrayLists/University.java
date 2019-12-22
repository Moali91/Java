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



    public boolean isStudent(String name){
        boolean isStu = false;
        for(Student s : students){
            if(s.getName().equals(name)){
                isStu = true;
            }
        }
        return isStu;
    }

}
