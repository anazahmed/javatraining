package com.digitek.business;

public class BreakExampe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		searchChar();
	}

	private static void searchChar() {
		String  searchMe = "It is a cold winter this year";
		int maxLength = searchMe.length();
		boolean condition = false;
		
		for (int i=0; i<maxLength; i++) {
			if (searchMe.charAt(i) == 'i')	{
				condition = true;
				break;
			}
		}
		if (condition) {
			System.out.println("Found atleast 1 i in the string");
		}
	}

}
