

import java.util.ArrayList;

public class Student {

    public long id;
    public ArrayList<Integer>grades;
    public static String name;

    public Student(long id, String name){
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // returns the student's id
    public long getId(){
        return this.id;
    };

    // returns the student's name
    public String getName(){
        return this.name;
    };

    // adds the given grade to the grades list
    public void addGrade(int grade){
        this.grades.add(grade);
    };

    public ArrayList<Integer> getGrades() {
        return this.grades;
    }

    public double getGradeAverage() {
        double sum = 0;
        for (int grade: this.grades) {
            sum += grade;
        }
        return sum / this.grades.size() ;
    }

}
