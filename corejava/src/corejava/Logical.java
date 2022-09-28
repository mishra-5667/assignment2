package corejava;

import java.util.Scanner;

public class Logical {

	public static void main(String[] args) {
		// create a scanner class
		Scanner sc=new Scanner(System.in);
       System.out.println("enter a number");
       int num1=sc.nextInt();
       System.out.println("enter the secound number");
       int num2=sc.nextInt();
       System.out.println("enter the third number");
       int num3=sc.nextInt();
       //using logic or to verify the constraints
       if((num1<num2)&&(num2==num3)) {
    	   int sum=num1+num2+num3;
    	   System.out.println("the num is:+sum");
    	   
       }
       else {
    	   System.out.println("false condition");
    	   //using logical and to verify and two constraints
    	   if((num1<num2)||(num2==num2)) {
    		   int sum=num1+num2+num3;
    		   System.out.println("the num is:+sum");
    	   }
    	   else {
    		   System.out.println("false condition");
    	   }
    	   System.out.println("performing not operation");
    	   //performing not operator
    	   System.out.println("!(num1<num2)="+!(num1<num2));
    	   System.out.println("!(num2<num3)="+!(num2<num3));
       }
	}

}
