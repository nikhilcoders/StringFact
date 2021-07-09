




import java.util.*;
public class Main {
	
	static boolean isInvalid(int a[],int b[])
	{
		int big=0,small=0,eq=0;
		for(int c=0;c<3;c++) {
			
			if(a[c]<b[c])
				small++;
			else if(a[c]>b[c])
			{
				big++;
			}
			else {
				eq++;
			}
			
		}
		if(eq==3 || (big>0 && small>0))return
				true;
		return false;
		
	}
	
		public static void main(String[] args) 
		{
			int n[][]=new int[3][3];
			
			Scanner sc = new Scanner(System.in);
			int testcase=sc.nextInt();
			sc.nextLine();
			for(int c=0;c<testcase;c++)
			{
				for(int d=0;d<3;d++)
				{
					String[]tmp=sc.nextLine().split(" ");
					for(int e=0;e<3;e++)
					{
						n[d][e]=Integer.parseInt(tmp[e]);
					}
				}
					if(!isInvalid(n[0],n[1])&&!isInvalid(n[0],n[2])&&!isInvalid(n[1],n[2]))
					{
						System.out.println("yes");
					}
						else {
							System.out.println("no");
						}
					}
				}
		
		
		
		
			
		}
		


