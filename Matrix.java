import java.util.*;
class Matrix
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int i,j;
		System.out.println("Enter the number of Rows and Columns in the Matrix 'A'");
		int row1 = sc.nextInt();
		int col1 = sc.nextInt();
		System.out.println("Enter the number of Rows and Columns in the Matrix 'B'");
		int row2 = sc.nextInt();
		int col2 = sc.nextInt();
		int a[][] = new int[row1][col1];
		int b[][] = new int[row2][col2];
		int c[][] = new int[row1][col1];
		int d[][] = new int[row2][col2];
			
		System.out.println("Enter the elements of Array 'A'");
		for(i=0;i<(row1);i++)
		{
			for(j=0;j<(col1);j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter the elements of Array 'B'");
		for(i=0;i<(row2);i++)
		{
			for(j=0;j<(col2);j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		if((row1 == row2) && (col1 == col2))
		{
			System.out.println("The Addition and Subtraction is possible!");
			for(i=0;i<(row1);i++)
			{
				for(j=0;j<(col1);j++)
				{
					c[i][j] = ((a[i][j]) + (b[i][j]));
				}
			}
			System.out.println("The Addition of Array 'A' and Array 'B' is:");
			for(i=0;i<(row1);i++)
			{
				for(j=0;j<(col1);j++)
				{
					System.out.println(c[i][j]);
				}
			}
			for(i=0;i<(row1);i++)
			{
				for(j=0;j<(col1);j++)
				{
					d[i][j] = ((a[i][j]) - (b[i][j]));
				}
			}
			System.out.println("The Subtraction of Array 'A' and Array 'B' is:");
			for(i=0;i<(row1);i++)
			{
				for(j=0;j<(col1);j++)
				{
					System.out.println(d[i][j]);
				}
			}
		}
		else
		{
			System.out.println("The Adition and Subtraction is not possible!!");
		}
	}
}
