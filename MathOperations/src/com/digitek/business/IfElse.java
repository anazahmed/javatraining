package com.digitek.business;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  weekday(8);
	}
	public static void weekday(int days) {
		if (days==1) {
			System.out.println("monday");
		}
		else if (days==2) {
			System.out.println("Tuesday");
		}
		else if (days==3) {
			System.out.println("Wednesday");
		}
		 else if (days==4) {
			System.out.println("Thursday");
		}
		  else if (days==5) {
				System.out.println("Friday");
			}
		  else if (days==6) {
				System.out.println("Saturday");
			}
		  else if (days==7) {
				System.out.println("Sunday");
			}
		  else { System.out.println("Not a valid Weekday Number");
	
	}
		
}	
}
