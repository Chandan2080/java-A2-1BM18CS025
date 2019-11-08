package CIE;
import java.util.*;
import CIE.Student;
public class Internals extends Student{
	int marks[] = new int[5];
	//Student s;
	Internals(){
		//s = new Student();
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the 5 Subject marks:\n");
		for(int i=0;i<5;i++){
			System.out.print("\nSubject "+(i+1)+"  :\t");
			marks[i] = sc.nextInt();
		}
	}
}
