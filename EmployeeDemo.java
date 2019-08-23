import java.util.*;

class Employee
{
	String emp_no;
	String emp_name;
	double basic, da, it, net_salary;
	Employee()
	{
		basic=0;
		da=0;
		it=0;
		net_salary=0;
	}
	void read()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter EMPLOYEE Details\nEmployee No.:  ");
		emp_no=sc.next();
		System.out.print("Name:  ");
		emp_name=sc.next();
		System.out.print("Basic Pay:  ");
		basic=sc.nextDouble();
	}
	void calculate()
	{
		da = 0.75 * basic;
		double g = basic + da;
		it = 0.3 * g;
		net_salary = g - it;
	}
	void print()
	{
		System.out.println("Employee Details :\nID:"+emp_no+"\nName: "+emp_name+"\nBasic: Rs."+basic+"\nDA: Rs."+da+"\nIT: Rs."+it+"\nNet Salary: Rs."+net_salary);
	}
}
class EmployeeDemo
{
	public static void main(String args[])
	{
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter No. of employees :");
		int n = ob.nextInt();
		for(int i=0;i<n;i++)
		{
			Employee e = new Employee();
			e.read();
			e.calculate();
			e.print();
		}
	}
}
