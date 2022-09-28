package corejava;

import java.util.Scanner;

public class Assignmentoperator {

	public static void main(String[] args) {
		// creating object of scanner class
		Scanner sc=new Scanner(System.in);
		//taking input from the user 
		System.out.println("enter the first value");
		int num1=sc.nextInt();
		System.out.println("enter second value");
		int num2=sc.nextInt();
		//adding as assigning value
		num1+=num2;
		//substracting and assigning the value
		num2-=num1;
		System.out.println("num2="+num2);
		//multiplying and assigning the value
		num2*=num1;
		System.out.println("num2="+num2);
		//dividing and assigning
		num2/=num1;
		System.out.println("num2="+num2);
		//module and assigning the value
		num2%=num1;
		System.out.println("num2="+num2);
		

	}

}
