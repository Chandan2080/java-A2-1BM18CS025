import java.util.*;
class Sort
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int i, j, n, tmp;
		System.out.println("Enter the number of numbers");
		n = sc.nextInt();
		int a[] = new int[10];
		System.out.println("Enter "+n+" numbers");
		for(i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("The entered elements are:");
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		for(i=0;i<(n-1);i++)
		{
			for(j=0;j<(n-i-1);j++)
			{
				if(a[j]>a[j+1])
				{
					tmp = a[j];
					a[j] = a[j+1];
					a[j+1] = tmp;
				}
			}
		}
		System.out.println("The sorted array is:");
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}
}
