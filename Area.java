import java.util.*;
abstract class Shape{
	protected int a,b;
	abstract void printArea();
}
class Rectangle extends Shape{
	Rectangle(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length:   ");
		a = sc.nextInt();
		System.out.print("Enter the breadth:  ");
		b = sc.nextInt();
	}
	void printArea(){
		System.out.println("Area of Rectangle =   "+(a*b));
	}
}
class Circle extends Shape{
	Circle(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of the circle:    ");
		a = sc.nextInt();
	}
	void printArea(){
		System.out.println("Area of Circle =   "+(3.14*a*a));
	}
}
class Triangle extends Shape{
	Triangle(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the height of the Triangle:   ");
		a = sc.nextInt();
		System.out.print("Enter the base length of the Triangle:   ");
		b = sc.nextInt();
	}
	void printArea(){
		System.out.println("Area of Triangle =   "+(0.5*a*b));
	}
}

class Area{
	public static void main(String args[]){
		int ch;
		Scanner sc = new Scanner(System.in);
		Shape ref = null;
		do{
			System.out.println("1 : Area of Rectangle");
			System.out.println("2 : Area of Circle");
			System.out.println("3 : Area of Triangle");
			System.out.println("4 : Exit");
			System.out.print("Enter your choise:    ");
			ch = sc.nextInt();
			switch(ch){
				case 1:	ref = new Rectangle();
						break;
				case 2:	ref = new Circle();
						break;
				case 3:	ref = new Triangle();
						break;
				case 4:	break;
				default:System.out.println("Invalid choise!!!!");
			}
			ref.printArea();
		}while(ch!=4);
	}
}
//OUTPUT:
/*
1 : Area of Rectangle
2 : Area of Circle
3 : Area of Triangle
4 : Exit
Enter your choise:    1
Enter the length:   10
Enter the breadth:  20
Area of Rectangle =   200
1 : Area of Rectangle
2 : Area of Circle
3 : Area of Triangle
4 : Exit
Enter your choise:    3
Enter the height of the Triangle:   15
Enter the base length of the Triangle:   20
Area of Triangle =   150.0
1 : Area of Rectangle
2 : Area of Circle
3 : Area of Triangle
4 : Exit
Enter your choise:    2
Enter the radius of the circle:    
5
Area of Circle =   78.5
1 : Area of Rectangle
2 : Area of Circle
3 : Area of Triangle
4 : Exit
Enter your choise:    4
*/
