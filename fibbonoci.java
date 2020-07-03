package mywork;

import java.util.Scanner;

public class fibbonoci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj=new Scanner(System.in);
		int a=0,b=2,c;
		System.out.println("enter a value");
		int n=obj.nextInt();
		System.out.println(a+" "+b);
		for(int i=1;i<=n;i++)
		{
			c=a+b;
			a=b;
			b=c;
		
		System.out.print(a+" ");
		
		

	}

}
}
