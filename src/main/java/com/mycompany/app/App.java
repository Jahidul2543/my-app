package com.mycompany.app;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 * Wrap
 * int 2 --> into an object representation --> You can use wrapper class
 * int ---> Object representation Integer
 * byte --> Byte
 *
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //args = {"10", "0"}
        System.out.println("Args Array Length: " + args.length);
        System.out.println( "This is new code!" );
        if(args[0].equals("add")){
            add(args[1], args[2]);
        } else if (args[0].equals("deduct")) {
            deduct(args[1], args[2]);
        }
        else if (args[0].equals("divide")) {
            divide(args[1], args[2]);
        }
        else {
            System.out.println("Please tell us if you like to add or deduct!!!");
        }
    }

    public static void add(String args1, String args2){

        int a = Integer.parseInt(args1);
        //int a = 4;
        int b = Integer.parseInt(args2);
        int c = a + b;
        System.out.println("Result: " + c);
    }

    public static void deduct(String args1, String args2){

        int a = Integer.parseInt(args1);
        //int a = 4;
        int b = Integer.parseInt(args2);
        int c = a-b;
        System.out.println("Result: " + c);
    }

    public static void divide(String args1, String args2){

        int a = Integer.parseInt(args1);
        //int a = 4;
        int b = Integer.parseInt(args2);
        try {
           int c = a / b;
            System.out.println("Result: " + c);
        } catch (Exception exception){
           // exception.printStackTrace();
            System.out.println("A number cant be divided by Zero!!! : " + args1 + " " + args2);

        }
    }

    public void wrapInteger(){
        Integer carNumber = new Integer(23); // Object representation of int 23
        List<Integer> cars = new ArrayList<>();
        cars.add(carNumber);
        System.out.println(cars.size());

        int carN = cars.get(0);
        System.out.println(carN);
    }
}

/**
 * 1. Exception --> RuntimeException ---> ArithMaticException
 * java -cp .\target\my-app-1.0-SNAPSHOT.jar com.mycompany.app.App divide 100000 0
 * */