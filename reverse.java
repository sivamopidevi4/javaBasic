package mywork;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("enter which number want to reverse");
		int n=obj.nextInt();
	int	rem,rev=0;
	while(n!=0) 
	{
		rem=n%10;
		rev=(rev*10)+rem;
		n=n/10;		
	}
	System.out.println("reversed number is"+" "+rev);

	}

}
