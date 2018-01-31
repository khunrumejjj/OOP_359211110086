package ooplab8;

public class Person {
    private String name;
    private String gender;
    private String dateofBirth;
    private int age;
    //constructor


    public Person(String name, String gender, String dateofBirth, int age) {
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

    public String getDateofBirth() {
        return dateofBirth;
    }

    public void setDateofBirth(String dateofBirth) {
        this.dateofBirth = dateofBirth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}//class
