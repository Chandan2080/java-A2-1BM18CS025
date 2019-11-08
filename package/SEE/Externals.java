package SEE;
import java.util.*;
import CIE.*;
public class Externals extends Student{
	int see[] = new int[5];
	Externals(){
		super();
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the 5 subject SEE marks:");
		for(int i=0;i<5;i++){
			System.out.print("\nSubject-"+(i+1)+":\t");
			see[i] = sc.nextInt();
		}
	}
	/*void get(){
		//super.get();
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
	}*/
}
