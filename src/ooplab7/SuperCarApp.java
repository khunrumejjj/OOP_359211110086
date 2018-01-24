package ooplab7;
import java.util.Scanner;
public class SuperCarApp {
    public static void main(String[] args) {

        SuperCar s1 = new SuperCar();
        System.out.println(s1.toString());
        s1 = inputData(s1);
        System.out.println(s1.toString());
    }//main


    private static SuperCar inputData(SuperCar s) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleaes enter a supercar info: ");

        System.out.print("CarBrand: ");
        s.setCarBrand(scanner.nextLine());
        System.out.print("CarColor: ");
        s.setCarColor(scanner.nextLine());
        System.out.print("CarEngineSize: ");
        s.setCarEngineSize(scanner.nextLine());
        System.out.print("MaxSpeed: ");
        s.setMaxSpeed(scanner.nextLine());
        System.out.print("CountryOfOrigin: ");
        s.setCountryOfOrigin(scanner.nextLine());
        return s;

    }//inputData
}//class