package com.digitek.business;

public class ConditionalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ternaryOperator(30);
	}
		 public static void ternaryOperator(int marks) {
			 
		        String result = (marks > 35)?"pass":"fail";
		 
		        System.out.println("result:"+ result);
		        marksUsingIfElse(marks);
		    }
		private static void marksUsingIfElse(int marks) {
			// TODO Auto-generated method stub
			
		}
	}
	
	