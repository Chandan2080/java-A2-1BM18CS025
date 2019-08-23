import java.util.*;
class Student
{
	String usn, name;
	int cr[];
	int marks[];
	int n, i;
	double sgpa;
	void getdata()
	{
		System.out.println("Enter the number of Subjects");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		cr = new int[n];
		marks = new int[n];
		System.out.println("Enter the Name of the student");
		name = sc.next();
		System.out.println("Enter the USN of the student");
		usn = sc.next();
		System.out.println("Enter "+n+" Subject Credits and Marks\n\n");
		for(i=0;i<n;i++)
		{
			System.out.println("Subject "+(i+1)+":");
			System.out.print("Credicts: "); 
			cr[i] = sc.nextInt();
			System.out.print("Marks: ");
			marks[i] = sc.nextInt();
		}
	}
	void calc()
	{
		int gpt[] = new int[n];
		for(i=0;i<n;i++)
		{
			if(marks[i]>=90)
				gpt[i] = 10;
			else if(marks[i]>75&&marks[i]<90)
				gpt[i] = 9;
			else if(marks[i]>=60&&marks[i]<75)
				gpt[i] = 8;
			else if(marks[i]>=50&&marks[i]<60)
				gpt[i] = 7;
			else if(marks[i]>=40&&marks[i]<50)
				gpt[i] = 6;
			else
				gpt[i] = 0;
		}
		double tmp1 = 0;
		int tmp2 = 0;
		for(i=0;i<n;i++)
		{
			tmp1 += cr[i]*gpt[i];
			tmp2 += cr[i];
		}
		sgpa = (tmp1/tmp2);
	}
	void putdata()
	{
		System.out.println("Name:  "+name);
		System.out.println("USN:  "+usn);
		System.out.println("Marks: ");
		for(i=0;i<n;i++)
		{
			System.out.println("Subject "+i+":  "+marks[i]);
		}
		System.out.println("SGPA:  "+sgpa);
	}
}
class StudentDemo
{
	public static void main(String args[])
	{
		Student s = new Student();
		s.getdata();
		s.calc();
		s.putdata();
	}
}
