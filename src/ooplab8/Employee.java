package ooplab8;

public class Employee extends Person {
    private String Position;
    private int Salary;
    public Employee(String name, String gender, String dateofBirth, int age, String Position, int Salary) {
        super(name, gender, dateofBirth, age);
        this.Position = Position;
        this.Salary = Salary;
    }
    //toString()

    @Override
    public String toString() {
        return "Employee{" +
                "Position='" + Position + '\'' +
                ", Salary='" + Salary + '\'' +
                "} " + super.toString();
    }

    //getter and setter method

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }
}//class
