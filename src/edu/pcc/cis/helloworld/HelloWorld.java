package edu.pcc.cis.helloworld;

import java.util.Date;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hi. Walter!");
        System.out.println("The current date is: ");
        System.out.println(new Date());

        System.out.println(addNumbers(3, 4));
    }

    public static String addNumbers(int numA, int numB) {
        return "The sum of " +
                Integer.toString(numA) +
                " and " +
                Integer.toString(numB) +
                " is " +
                Integer.toString(numA + numB );
    }
}
