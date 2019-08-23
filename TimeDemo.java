import java.util.*;
class Time
{
	int h, m, s;
	Time()
	{
	 h = 0;
	 m = 0;
	 s = 0;
	}
	Time(int x,int y,int z)
	{
	h=x;
	m=y;
	s=z;
	}
	void print()
	{
		System.out.println("Time = "+h+" : "+m+" : "+s);
	}
	void advance(int x,int y,int z)
	{
		s += z;
		m =  m + y + (s/60);
		s =  s % 60;
		h =  h + x + (m/60);
		m =  m % 60;
		h =  h % 24;
	}
	void currtime(int x,int y,int z)
	{
	h = x;
	m = y;
	s = z;
	}
}
class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int ch;
		System.out.println("Enter the Time (Enter Hour:Minute:Second):");
	    int hr = sc.nextInt();
	    int mr = sc.nextInt();
	    int sr = sc.nextInt();
	    Time ob = new Time(hr,mr,sr);
		while(true)
		{  
			System.out.println("1:  Update TIME  \n2:  Advance TIME\n3:  Display Time\n4: EXIT");
			System.out.println("Enter your choice: ");
			ch = sc.nextInt();
			switch(ch)
			{
				case 1: System.out.println("Enter Hour:Minute:Second :");
						int hh=sc.nextInt();
						int mm=sc.nextInt();
						int ss=sc.nextInt();
						ob.currtime(hh,mm,ss);
						break;
				case 2: System.out.println("Enter Hour:Minute:Second (to advance):");
						int k=sc.nextInt();
						int l=sc.nextInt();
						int m=sc.nextInt();
						ob.advance(k,l,m);
						break;
				case 3: ob.print();
						break;
				case 4: java.lang.System.exit(0);
			}
		}
	}
}
