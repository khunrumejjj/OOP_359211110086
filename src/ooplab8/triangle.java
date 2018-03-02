package ooplab8;

public class triangle implements Shape{
    private double H;
    private double B;

    public triangle(double h, double b) {
        H = h;
        B = b;
    }

    @Override
    public String toString() {
        return "triangle{" +
                "H=" + H +
                ", B=" + B +
                '}';
    }

    public double getH() {
        return H;
    }

    public void setH(double h) {
        H = h;
    }

    public double getB() {
        return B;
    }

    public void setB(double b) {
        B = b;
    }

    @Override
    public double getArea() {
        return 0.5*H*B;
    }
}