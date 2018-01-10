//condition
      //  score 0-49 grade F
      //  score 50-59 grade D
      //  score 60-69 grade C
      //  score 80-100 grade A

package ooplab3;

import java.util.Scanner;

public class CalGrade {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        int score;
        System.out.print("Enter your score: ");
        score = scanner.nextInt();
//          test condition score
        if(score<49)System.out.println("Your qrade is F");
        else if (score<59)System.out.println("Your qrade is D");
        else if (score<69)System.out.println("Your qrade is C");
        else if (score<79)System.out.println("Your qrade is B");
        else System.out.println("Your qrade is A");
    }//for
    }//main


