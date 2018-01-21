package MidTerm2560;
import java.util.Scanner;
public class Test3_2 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String ID = getID();
        String Name = getName();
        float Salary = getSalary();
        float OverTime = getOverTime();
        calculateTax(Salary,OverTime);
        ShowDataInfo(ID,Name,Salary,OverTime);
    }//main
    private static void ShowDataInfo(String ID, String Name, float Salary, float OverTime) {
        Test3_2 a = new Test3_2();
        System.out.println("ID: "+ID);
        System.out.println("Name: "+Name);
        System.out.println("Salary: "+Salary);
        System.out.println("OverTime: "+OverTime);
        System.out.println("Tax: "+a.calculateTax(Salary,OverTime));
    }
    private static float calculateTax(float a, float b) {
        float tax = a+b;
        System.out.println("Salary Total: "+tax);
        if (tax>=100000)
        {
            return (tax*10)/100;
        }
        else if (tax>=70000)
        {
            return (tax*7)/100;
        }
        else if (tax>=50000)
        {
            return (tax*5)/100;
        }
        else if (tax>=30000)
        {
            return (tax*3)/100;
        }
        else{
            return (tax*1)/100;
        }
    }
    private static Float getOverTime() {
        System.out.print("Enter your OverTime: ");
        Float OverTime = scan.nextFloat();
        return OverTime;
    }
    private static int getSalary() {
        System.out.print("Enter your Salary: ");
        int Salary = scan.nextInt();
        return Salary;
    }
    private static String getName() {
        System.out.print("Enter your Name: ");
        String Name = scan.nextLine();
        return Name;
    }
    private static String getID() {
        System.out.print("Enter your ID: ");
        String ID = scan.nextLine();
        return ID;
    }
}//class


