package mywork;
import java.util.Scanner;
public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner obj=new Scanner(System.in);
System.out.println("enter factorial number");
int fact=1;
int n=obj.nextInt();
for(int i=1;i<=n;i++)
{
	fact=fact*i;
}
System.out.println(fact);
	}

}
