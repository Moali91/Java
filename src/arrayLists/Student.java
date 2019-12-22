package arrayLists;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private String name;
    private int age;
    ArrayList<Double> grades = new ArrayList<Double>();

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public double getAvg(){
        int sum = 0;
        for(int i = 0; i<grades.size();i++){
            sum+=grades.get(i);
        }
        return sum/grades.size();
    }

    //i made this methode just to check
    public String getName(){
        return this.name;
    }


    public void addGrade(double g){
        grades.add(g);
    }

    public void printGrades(){
        System.out.println("The grades of the Student ("+ this.name+"):");
        for(Double s : grades){
            System.out.println(s);
        }

    }

}
