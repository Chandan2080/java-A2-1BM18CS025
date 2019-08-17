import java.util.*;
class Maximum
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Row and Column size of the 2-D Array: ");
		int row = sc.nextInt();
		int col = sc.nextInt();
		int a[][] = new int[row][col];
		System.out.println("Enter the elements of the 2-D Array: ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			a[i][j] = sc.nextInt();
		}
		int l = a[0][0];
		for(int y[]:a)
		{
			for(int x:y)
			{
				if(x>l)
				l=x;
			}
		}
		System.out.println("The Maximum element of the array is:   "+l);
	}
}
