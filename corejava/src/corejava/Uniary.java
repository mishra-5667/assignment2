package corejava;

import java.util.Scanner;

public class Uniary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num1=sc.nextInt();
		//performing Uniary operation
		num1=-num1;
		System.out.println("Result is:"+num1);
		//performing pre increment operation
		++num1;
		System.out.println("pre increment:"+num1);
		--num1;
		System.out.println("pre decrement:"+num1);
		num1++;
		System.out.println("post increment:+num1");
		num1--;
		System.out.println("post decrement:num1");

	}

}
