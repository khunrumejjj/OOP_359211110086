package ooplab6;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class myStringToken {
    public static void main(String[] args) {
        String s = "Welcome to RMUTSV";
        StringTokenizer tokenizer = new StringTokenizer(s);
        //count word String
        System.out.println(tokenizer.countTokens());
        //cut word in String
        //reverse word in String
        while (tokenizer.hasMoreElements()){
            StringBuffer buffer = new StringBuffer(tokenizer.nextToken());
            System.out.println(buffer.reverse());
        }

    }//main
}//class
