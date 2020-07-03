package mywork;
import java.util.Scanner;
public class largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner obj=new Scanner(System.in);
System.out.println("enter first number");
int a=obj.nextInt();
System.out.println("enter second number");
int b=obj.nextInt();
System.out.println("enter third number");
int c=obj.nextInt();

if(a>b && a>c)
{
	System.out.println("greatest number"+ a);
}
else if(b>a && b>c)
{
	System.out.println("greatest number"+b);
}
else
{
	System.out.println("greatest number"+ c);
}

	}

}
