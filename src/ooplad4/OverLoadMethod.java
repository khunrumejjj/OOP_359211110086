package ooplad4;
//Overloading method
        //Overload method
//Method Overload
public class OverLoadMethod {
    private static int numver =100;
    public static void Summation(int x,int y){
        System.out.println(x+y);
        int t = numver + x + y;
    }
    public static void Summation() {
        System.out.println("Hello" + numver);
    }
    public static void Summation(int x,int y,int z) {
        System.out.println(x + y + z + numver);
    }

    public static void main(String[] args) {
        Summation();
        Summation(10, 10);
        Summation(5, 5, 5);
    }//main
}//class
