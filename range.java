package mywork;

import java.util.Scanner;


public class range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a number from 1 to 100");
		int i=obj.nextInt();
		if( i>=1 && i<=100)
		{
			System.out.println("number is in range" + " " + i);
		}
		else if(i<=0 || i>100)
		{
			System.out.println("number not in range"+" "+ i);
		}
	}

}
