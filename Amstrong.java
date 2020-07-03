package mywork;

import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		int rem,rev=0;
		System.out.println("enter amstrong number");
		int n=obj.nextInt();
		int t=n;
		
		while(n!=0)
		{
			rem=n%10;
			rev=(rem*rem*rem)+rev;
			n=n/10;
		}
		if(t==rev)
		{
			System.out.println("amstrong number"+" "+ t);
		}
		else 
		{
			System.out.println("Not amstrong number");
		}

	}

}
