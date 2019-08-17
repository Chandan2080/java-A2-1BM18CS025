import java.util.*;
class Rectangle
{
	int length,width;
	void input()
	{
		Scanner sc=new Scanner(System.in);	
		length=sc.nextInt();
		width=sc.nextInt();
	}
	double area()
	{
		return (length*width);
	}
	void print()
	{
		System.out.println("Length = "+length);	
		System.out.println("Width = "+width);	
		System.out.println("Area = "+area());	
	}
}
class RectangleDemo
{
	public static void main(String args[])
	{
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		System.out.println("Enter the Length and Width of Rectangle - 1");
		r1.input();
		r1.print();
		System.out.println("Enter the Length and Width of Rectangle - 2");
		r2.input();
		r2.print();
	}
}
