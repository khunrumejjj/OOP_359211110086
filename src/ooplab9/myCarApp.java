package ooplab9;

public class myCarApp {
    public static void main(String[] args) {
        Engine engine = new Engine("1500 cc",
                "V-TEC V4");
        Car car = new Car("Honda","black","City",engine);
        System.out.println(car.toString());

        Car car1 = new Car("Toyata", "Red", "Altis", engine);
        System.out.println(car1.toString());

    }//main
}//class