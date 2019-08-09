import java.util.*;
class Quadratic
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of 'a'");
		int a = sc.nextInt();
		System.out.println("Enter the value of 'b'");
		int b = sc.nextInt();
		System.out.println("Enter the value of 'c'");
		int c = sc.nextInt();
		double x1,x2;
		double d = ((b*b)-(4*a*c));
		if(d<0)
		{
			System.out.println("There are no real roots!");
		}
		else if(d==0)
		{
			System.out.println("The roots are real and equal!");
			x1 = ((-b)/(2*a));
			x2 = x1;
			System.out.println("x1 =  "+x1);
			System.out.println("x2 =  "+x2);
		}
		else
		{
			System.out.println("The roots are real and distinct");
			x1 = (((-b)+(Math.sqrt(d)))/(2*a));
			x2 = (((-b)-(Math.sqrt(d)))/(2*a));
			System.out.println("x1 =  "+x1);
			System.out.println("x2 =  "+x2);
		}
	}
}
