import java.util.*;
class Matrix
{
	public static void main(String ar[])throws IOException
	{
		Scanner s = new Scanner(System.in);
		int a[][] = new int[3][3]; 
		int b[][] = new int[3][3];
		int c[][] = new int[3][3];
		System.out.println("enter the value into the first matrix");
		for(int i=0; i<3; i++)
			for(int j=0; j<3;j++)
				a[i][j] = s.nextInt(i);
		System.out.println("enter the value into the first matrix");
			for(int i=0; i<3; i++)
				for(int j=0; j<3;j++)
				{
					b[i][j] = s.nextInt();
					c[i][j] = a[i][j] + b[i][j];
				}
		System.out.println("Sum of matrix is : ");	
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3;j++)
			{
				System.out.print(c[i][j]+" ");
				c[i][j] = a[i][j] - b[i][j];
			}
 			System.out.println();
		}	
		System.out.println("difference of matrix is : ");	
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3;j++)
			{
				System.out.print(c[i][j]+" ");
			}
 			System.out.println();
		}	
		System.out.println("Transpose of the matrix a is");
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3;j++)
			{
				c[i][j] = a[j][i];
				System.out.print(m2[i][j]+" ");
			}
 			System.out.println();
		}
	}
}