package ooplab8;

import java.util.Date;
//Student is Person
//Student is sub-calss of person class
//Person is super-class

public class Student extends Person {
    private String id;
    private String program;
    public Student(String name, String gender, Date dateofBirth, int age, String id, String program) {
        super(name, gender, dateofBirth, age);
        this.id = id;
        this.program = program;
    }
    //toString()

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", program='" + program + '\'' +
                "} " + super.toString();
    }

    //getter and setter method

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }
}//class
