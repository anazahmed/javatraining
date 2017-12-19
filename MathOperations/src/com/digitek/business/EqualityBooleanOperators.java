package com.digitek.business;

public class EqualityBooleanOperators {
	
	static int number1 = 10;
    static int number2 = 30;
    static int number3 = 30;
 
    public static void main(String[] args) {
        equalityOperators();
        booleanOperators();
    }
     
    public static void equalityOperators() {
        System.out.println("Relational Operators:");
         
        System.out.println("comparing number1==number2:" + (number1 == number2));
        System.out.println("comparing number1!=number2:" + (number1 != number2));
    }
     
    public static void booleanOperators() {
         
        // greater than >
        System.out.println("Checking > operator");
        System.out.println("number1 > number2:" + (number1 > number2));
        System.out.println("number2 > number3:" + (number2 > number3));
        System.out.println("number3 > number1:" + (number3 > number1));
         
        // greater than or equal to >=
        System.out.println("Checking >= operator");
        System.out.println("number1 >= number2:" + (number1 >= number2));
        System.out.println("number2 >= number3:" + (number2 >= number3));
        System.out.println("number3 >= number1:" + (number3 >= number1));
         
        // less than operator
        System.out.println("Checking < operator");
        System.out.println("number1 < number2:" + (number1 < number2));
        System.out.println("number2 < number3:" + (number2 < number3));
        System.out.println("number3 < number1:" + (number3 < number1));
         
        // less than or equal to <=
        System.out.println("Checking <= operator");
        System.out.println("number1 <= number2:" + (number1 <= number2));
        System.out.println("number2 <= number3:" + (number2 <= number3));
        System.out.println("number3 <= number1:" + (number3 <= number1));
         
    }
}
