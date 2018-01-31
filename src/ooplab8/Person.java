package ooplab8;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
    private String name;
    private String gender;
    private Date dateofBirth;
    private int age;
    //constructor


    public Person(String name, String gender, Date dateofBirth, int age) {
        this.name = name;
        this.gender = gender;
        this.dateofBirth = dateofBirth;
        this.age = age;
    }
    //toString()

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", dateofBirth=" + dateofBirth +
                ", age=" + age +
                '}';
    }

    //getter and setter methods

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDateofBirth() {
        return dateofBirth;
    }

    public void setDateofBirth(Date dateofBirth) {
        this.dateofBirth = dateofBirth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}//class
