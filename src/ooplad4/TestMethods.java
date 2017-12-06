package ooplad4;

public class TestMethods {
    // Method types
    // type 1
    public static void A(){
        System.out.println("Hello A");
    }//A
    //type 2
    public static void B(int x, int y){
        System.out.println(x+" "+y);
    }
    //type 3
    public static int C(int x, int y){
        return x+y;
    }
    public static void main(String[] args) {
        System.out.println("Hello");
        A();
        B(5,10);
        int x = 10, y = 20;
        B(x, y);
        // type 3 return value management
        //1
        int num = C(x,y);
        System.out.println(num);

    }//main


}//class
