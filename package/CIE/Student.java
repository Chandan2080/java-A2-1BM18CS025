package CIE;
import java.util.*;
public class Student{
	String usn, name;
	int sem;
	Student(){
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\nEnter the name:\t");
		name = sc.next();
		System.out.print("\nEnter the USN:\t");
		usn = sc.next();
		System.out.println("\nEnter the Semester:\t");
		sem = sc.nextInt();
	}
}
