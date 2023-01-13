package com.company.core;

import java.io.IOException;
import java.util.Scanner;

public class HelloWorld{
    public static void main(String[] args) throws IOException {
        System.out.println("=============================================");
        System.out.println("This is a program showing the java data types");
        System.out.println("=============================================");
        
        //int type
        System.out.println("=============================================");
        System.out.println("int type");
        System.out.println("=============================================");
        System.out.println(intType());

        //long type
        System.out.println("=============================================");
        System.out.println("long type");
        System.out.println("=============================================");
        longType();

        //double type
        System.out.println("=============================================");
        System.out.println("double type");
        System.out.println("=============================================");
        doubleType();

        //String type
        System.out.println("=============================================");
        System.out.println("String type");
        System.out.println("=============================================");
        System.out.println(stringType());

        //boolean type
        System.out.println("=============================================");
        System.out.println("boolean type test with an if");
        System.out.println("=============================================");
        if(legalAge()){
            System.out.println("You're already legal");
        } else{
            System.out.println("You'rent legal yet");
        }
    }

    private static boolean legalAge() {
        int age = -1;
        System.out.println("Now your age");
        age = intReader();
        return age > 18;
    }

    private static String stringType() {
        return "This is an String";
    }

    private static void doubleType() {
        System.out.println("This is the PI number showed as a double");
        System.out.println("PI: " + Math.PI);
    }

    private static void longType() {
        System.out.println("This is the PI number showed as a long");
        System.out.println("PI: " + (long) Math.PI);
    }

    private static int plus(int num1, int num2) {
        return num1 + num2;
    }

    private static int intType(){
        int num1 = -1, num2 = -1;
        num1 = intReader();
        num2 = intReader();
        return plus(num1, num2);
    }

    private static int intReader() {
        int number = -1;
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Digit the number: ");
            number = input.nextInt();
        }catch(Exception e){
            e.printStackTrace();
        }
        return number;
    }
}
