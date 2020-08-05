import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CS60812Aalluri {
	static int total_path;

	public static void main(String[]arg)throws FileNotFoundException
	{
		System.out.println("Name:vineetha Alluri");
		System.out.println("course id:CS608");
		System.out.println(java.time.LocalDate.now());
		int adjacency_matrix[][]=readFile("inputData12A.txt");
		for(int i=0;i<15;i++)
			for(int j=0;j<15;j++)
				if(adjacency_matrix[i][j]==0)
					adjacency_matrix[i][j]=Integer.MAX_VALUE;
		System.out.println("Minimum spanning tree");
		prims_algorithm(adjacency_matrix);
		System.out.println("Total path sum="+total_path);
					
		
	}
	static void prims_algorithm(int[][] graph)
	{
		
		int ne;
		int min,x=0,y=0;
		boolean[] selected=new boolean[15];
		total_path=0;
		for(int i=0;i<15;i++)
		
		selected[i]=false;
		selected[0]=true;
		ne=0;
		while(ne<14)
		{
			min=Integer.MAX_VALUE;
			for(int i=0;i<15;i++)
			{
				if(selected[i])
				{
					for(int j=0;j<15;j++)
					{
						if(!selected[j])
						{
					if(min>graph[i][j]) 
					{
						min=graph[i][j];
						x=i;
						y=j;
					}
				}
			}
		}
	}
    
	selected[y]=true;
	char s=change(x);
	char s1=change(y);
	System.out.println("Edge: "+s+"-"+s1+";Edge Length=" +min);
	ne=ne+1;
	total_path+=min;
}
}
	public static int[][] readFile(String file_name) throws FileNotFoundException {
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
public static char change(int h)
{
int final_value=h;
switch(final_value)
{
case 0 : return 'A';
case 1: return 'B';
case 2: return 'C';
case 3: return 'D';
case 4: return 'E';
case 5: return 'F';
case 6: return 'G';
case 7: return 'H';
case 8: return 'I';
case 9: return 'J';
case 10: return 'K';
case 11: return 'L';
case 12: return 'M';
case 13: return 'N';
case 14: return 'O';
}return 'Z';
}
}