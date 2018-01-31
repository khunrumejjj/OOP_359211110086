package ooplab8;

public abstract class Pet {
    private String name;
    private int age;
    //constructor
    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //abstract method
    public abstract void makeNoise();


    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    //getter and setter method

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}//class
