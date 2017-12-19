package com.digitek.business;

public class AdditionExamples {
	
	public static void main(String[] args) {
		AdditionExamples ae = new AdditionExamples();
	int result1 = ae.addTwoNumbers();
	int result2 = ae.addThreeNumbers();
	ae.addResults(result1, result2);
	ae.addDecimals();
	}
	
public static int addTwoNumbers() {
        
        int a = 10;
        int b = 20;
        int result = a+b;
        System.out.println("result of 2 numbers:" + result);
        return result;
                
    }
    
    public static int addThreeNumbers() {
        
        int a = 10;
        int b = 20;
        int c = 30;
        int result = a+b+c;
        System.out.println("result of 3 numbers:" + result);
        return result;
                
    }
    public static int addResults(int result1,int result2) {
    	int result = result1 + result2;
   System.out.println("the result of two results is" + result); 	
   
		return result;
    	
    }
    public static double addDecimals() {
    	
    	double a = 10.5;
    	double b = 5.5;
    	double result = a+b;
    	System.out.println("The Result is of two decimals is:" + result);
    	return result;
    			
    }
		}

