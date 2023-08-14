/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
// WAP to check the root is real ,imaginary,or eqaual;

import java.util.Scanner;
public class Quadratic
{
	public static void main(String[] args) {
	    System.out.println("The Quadratic equation Looks link : aX^2 + bX + c");
		System.out.println("Enter the coefficient of X^2:");
		Scanner num = new Scanner(System.in);
		int a=num.nextInt();
		System.out.println("Enter the Coefficient of X:");
		int b=num.nextInt();
		System.out.println("Enter the constant C:");
		int c=num.nextInt();
		
		float D=b*b - 4*a*c;
		System.out.println("The value of D:"+D);
		if(D>0){
		    System.out.println("The root is real and distinct");
		}else if(D==0){
		    System.out.println("The root is real and equal");
		}else
		System.out.println("The root is imaginary");
		
	}
}
