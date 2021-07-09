import java.util.*;
class Main{
static boolean isIn(String [] arr,int n)
{
	for(int i=0;i<arr.length;i++)
		if(Integer.parseInt(arr[i])==n)return true;
	return false;
}
public static void main(String x[])
{
	Scanner s=new Scanner(System.in);
	int testcase=s.nextInt();
	for(int c=0;c<testcase;c++)
{
	int n=s.nextInt();s.nextLine();
	int flag=1;
	String s1[]=s.nextLine().split(" ");
	for(int d=0;d<n-1;d++)
	{
		for(int e=0;e<n;e++)
		{
			if(d==e)continue;
		if(!isIn(s1,Integer.parseInt(s1[0])*Integer.parseInt(s1[0])))
			{
				flag=0;
				break;
			}
	}
	}
if (flag==1)System.out.println("YES");
	else System.out.println("NO");
}
}
}




