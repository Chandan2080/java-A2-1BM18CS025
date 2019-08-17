import java.util.*;
class Matrix
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Row and Column size of Matrix - A");
		int r1 = sc.nextInt();
		int c1 = sc.nextInt();
		System.out.println("Enter Row and Column size of Matrix - B");
		int r2 = sc.nextInt();
		int c2 = sc.nextInt();
		int a[][]=new int[r1][c1];
		int b[][]=new int[r2][c2];
		int sum[][]=new int[r1][c1];
		int diff[][]=new int[r1][c1];
		if(r1==r2 && c1==c2)
		{
			System.out.println("Enter the elements of Matrix - A");
			for(int i=0;i<r1;i++)
			{
				for(int j=0;j<c1;j++)
					a[i][j]=sc.nextInt();
			}
			System.out.println("Enter the elements of Matrix - B");
			for(int i=0;i<r2;i++)
			{
				for(int j=0;j<c2;j++)
				b[i][j]=sc.nextInt();
			}
			
			for(int i=0;i<r1;i++)
			{
				for(int j=0;j<c1;j++)
				{
					 sum[i][j]=a[i][j]+b[i][j];
					 diff[i][j]=a[i][j]-b[i][j];
				}		
			}
			System.out.println("The SUM of Matrices A and B is:\n");
			for(int i=0;i<r1;i++)
			{
				for(int j=0;j<c1;j++)
				System.out.print(sum[i][j]+" ");
				System.out.print("\n");
			}
			System.out.println("The DIFFERENCE of Matrices A and B is:\n");
			for(int i=0;i<r1;i++)
			{
				for(int j=0;j<c1;j++)
				System.out.print(diff[i][j]+" ");
				System.out.print("\n");
			}
		}
		else
		{
			System.out.println("the Row size and Column size of matrix A and B should be same!!");
			System.out.println("The SUM and DIFFERENCE is not possible!!");
		}
	}
}