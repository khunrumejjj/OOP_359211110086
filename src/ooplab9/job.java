package ooplab9;

public class job {
    private String position;
    private double salary;

    public job(String position, double salary) {
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "job{" +
                "position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}//class
