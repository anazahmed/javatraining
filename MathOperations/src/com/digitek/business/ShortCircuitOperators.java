package com.digitek.business;

public class ShortCircuitOperators {
	
	public static void main(String[] args) {
		 
        //shortCircuitOperators();
 
         
 
        testLogicalOperators();
 
    }
 
  
 
    public static void shortCircuitOperators() {
 
          
 
        int number1= 10;
 
        int number2 = 40;
 
        int number3 = 30;
 
          
 
        // && operator looks for the first false expression and gets out of the comparison check
 
        boolean resultAND = (number1 < number2) && compare2And3(number2, number3);
 
        System.out.println("resultAND:" + resultAND);
 
          
 
        // || operator looks for the first true expression and gets out of the comparison check
 
        boolean resultOR = (number1 > number2) || compare2And3(number2, number3)||compare2And3(number2, number1);
 
        System.out.println("resultOR:" + resultOR);   
 
    }
 
  
 
    private static boolean compare2And3(int number2, int number3) {
 
        System.out.println("compare2And3");
 
        return number2 < number3;
 
    }
 
     
 
    public static void testLogicalOperators() {
 
         
 
        boolean value1 = true;
 
        boolean value2 = false;
 
         
 
        boolean result = value1 & value2;
 
        System.out.println("result:" + result);
 
         
 
         
 
        int no1 = 10;
 
        int no2 = 20;
 
        boolean result2 = (no1 > no2) & (no2 > 10);
 
        System.out.println("result2:" + result2);
 
         
 
        boolean result3 = (no1 < no2) | (no2 > 10);
 
        System.out.println("result3:" + result3);
 
         
 
        boolean result4 = true & true;
 
        System.out.println("result4:" + result4);
 
         
 
        boolean result5 = true & false;
 
        System.out.println("result5:" + result5);
 
         
 
        boolean value3 = true;
 
        System.out.println("result6:" + !value3);
 
         
 
    }
}
