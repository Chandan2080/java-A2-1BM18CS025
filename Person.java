import java.util.*;
class Person{
	public String name;
	String address;
	int age;
	Person(){
		System.out.print("\tEnter the name:\t");
		Scanner sc = new Scanner(System.in);
		name = sc.next();
		System.out.print("\tEnter the age:\t");
		age = sc.nextInt();
		System.out.print("\tEnter the address:\t");
		address = sc.next();
	}
}
class Student extends Person{
	int rno;
	int sem;
	Student(){
		super();
		System.out.print("\tEnter the roll number:\t");
		Scanner sc = new Scanner(System.in);
		rno = sc.nextInt();
		System.out.print("\tEnter the Semester:\t");
		sem = sc.nextInt();
	}		
}
class Exam extends Student{
	float marks1;
	float marks2;
	Exam(){
		super();
		System.out.print("\tEnter the Subject 1 marks:\t");
		Scanner sc = new Scanner(System.in);
		marks1 = sc.nextInt();
		System.out.print("\tEnter the Subject 2 marks:\t");
		marks2 = sc.nextInt();
	}
	double avg(){
		return ((marks1+marks2)/2);
	}
}
class Person{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("\tEnter the number of students:\t");
		int n = sc.nextInt();
		Exam ob[] = new Exam[n];
		for(int i=0;i<n;i++){
			System.out.println("STUDENT "+(i+1));
			ob[i] = new Exam();
		}
		double largest = 0;
		String larname = null;
		for(int i=0;i<n;i++){
			System.out.println("\n\nSTUDENT "+(i+1));
			System.out.println("\tAverage Marks = "+ob[i].avg());
		}
		for(int i=0;i<n;i++){
			if(ob[i].avg() > largest){
				largest = ob[i].avg();
				larname = ob[i].name;
			}
		}
		System.out.println("The topper is: "+larname+", with average marks of: "+largest);
	}
}
