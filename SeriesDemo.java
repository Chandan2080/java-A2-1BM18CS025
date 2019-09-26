import java.util.*;
abstract class Series
{
	Scanner sc = new Scanner(System.in);
	double a, n, d;
	void getvalues()
	{
		System.out.print("Enter the Number of terms:  ");
		n = sc.nextDouble();
		System.out.print("Enter the First term (a):  ");
		a = sc.nextDouble();
		System.out.print("Enter the Common difference/ratio:  ");
		d = sc.nextDouble();
	}
	abstract double sum();
}
class AP extends Series
{
	double sum()
	{
		return (0.5*n*((2*a)+(n-1)*d));
	}
}
class GP extends Series
{
	double sum()
	{
		return ((a*(Math.pow(d,n)-1))/(d-1));
	}
}
class Main
{
	public static void main(String args[])
	{
		Series ref[] = new Series[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.print("\n\n1 : Arithematic Progression");
			System.out.print("\n2 : Geometric Progression");
			System.out.print("\nEnter your choise:  ");
			int ch = sc.nextInt();
			switch(ch)
			{
				case 1: ref[i]=new AP();
				    	break;
				case 2: ref[i]=new GP();
					    break;
				default:System.out.println("Invalid input");
			}
			ref[i].getvalues();
			System.out.println("The Sum to n trems is:   "+ref[i].sum());
		}
	}
}
