import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CS60812Balluri {
	public static int[][] readFile(String file_name) throws FileNotFoundException {
		System.out.println("Name:vineetha Alluri");
		System.out.println("course id:CS608");
		System.out.println(java.time.LocalDate.now());
		FileInputStream line=new FileInputStream(file_name);
		
			@SuppressWarnings("resource")
			Scanner sc=new Scanner(line);
			int m=15;
			int n=15;
		    int i,j;
			int[][] mat=new int[m][n];
			while(sc.hasNextInt())
			{
			for(i=0;i<m;i++)
			{
				
				for(j=0;j<n;j++) 
				{
					mat[i][j]=sc.nextInt();
					
						
		}
				
		}
}return mat;
}	
public static void main(String[]args)throws FileNotFoundException
{   
	int[] arr=new int[15];
	int[] ham=new int[15];
	int ham_count=0;
	int l=0;
	int toll;
	int even=0;
	int odd=0;
	int k=0;
	int count=0;
	int[][] adjacency_matrix=readFile("inputData12B.txt");
	for(int i=0;i<adjacency_matrix.length;i++)
	{
		for(int j=0;j<adjacency_matrix.length;j++)
		{
			
			if(adjacency_matrix[i][j]==1)
			{
				count++;
				ham_count++;
			}
		}
		arr[k]=count;
	    ham[l]=ham_count;
		k++;
		l++;
		count=0;
		ham_count=0;
			}
	
	for(int p=0;p<arr.length;p++)
	{
		
		arr[p]=arr[p]%2;
		if(arr[p]==0)
		{
			even++;
		}
		else
		{
			odd++;
		}
	}
	
if(odd==2)
{
	System.out.println("Eulers path: It has eulers path");
	System.out.println("Explanation:\nIt is possible to visit all the nodes such that you can traverse each edge once ");
	System.out.println("\n\n");
	System.out.println("Eulers circuit: It does not have eulers circuit");
	System.out.println("Explanation:\nYou cannot traverse the graph such that you can start from one vertex and come back to the same vertex after covering all the edges once");
	}
else if(even==arr.length)
{  
	System.out.println("Eulers path: It has a eulers path");
	System.out.println("Explanation:\nIt is possible to visit all the nodes such that you can traverse each edge once ");
	System.out.println("\n\n");
	System.out.println("Eulers circuit: It also has eulers circuit");
	System.out.println("Explanation:\nYou can traverse the graph such that you can start from one vertex and come back to the same vertex after covering all the edges once");
	
}
else
{
	System.out.println("Eulers path:It does not have eulers path");
	System.out.println("Explanation:\nIt is not  possible to visit all the nodes such that you can traverse each edge once ");
	System.out.println("\n\n");
	System.out.println("Eulers circuit: It does not have eulers circuit");
	System.out.println("Explanation:\nYou cannot traverse the graph such that you can start from one vertex and come back to the same vertex after covering all the edges once");
	}
toll=0;
for(int h=0;h<ham.length;h++)
{
	if(ham[h]>=adjacency_matrix.length/2)
	{
	
	toll++;	
	}
	
	
}
if(toll==adjacency_matrix.length)
{   System.out.println("\n\n");
	System.out.println("Dirac's Theorem: The graph satisfies Dirac theorem");
	System.out.println("Explanation:\nDegree of every vertex is greater that or equal to n/2,n being the no of vertices");
	}
else
{
System.out.println("\n\n");
System.out.println("Dirac's Theorem:The graph does not satisfy Diracs theorem");	
System.out.println("Explanation:\n"+toll+" vertices have a degree that is less than n/2,n being the number of vertices ");
}
int ore=0;
for(int z=0;z<ham.length;z++)
{   
for(int y=z+2;y<ham.length;y++)
	
	if(ham[z]+ham[y]<adjacency_matrix.length)
	{
		ore++;
	}
}

if(ore==0)
{
	System.out.println("\n\n");
	System.out.println("Ore's Theorem: Satisfies Ore's theorem");
	System.out.println("Explanation:\nFor all distinct non-adjacent vertices  the sum of any two of their degrees greater than or equal to n,n being the no of vertices");
}
else
{   System.out.println("\n\n");
	System.out.println("Ore's Theorem: Does not satisfy ores theorem");
	System.out.println("Explanation:\nFor "+ore+" pair of  non-adjacent vertices the sum of their degrees is less than n,n being the no of vertices");
}
}


}