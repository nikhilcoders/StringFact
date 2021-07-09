import java.util.*;
class Main{

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
		if(s1[d].equals("cookie") && s1[d+1].equals("cookie"))
		{
			flag=0;
			break;
		}
	}
	if(n==1){if(s1[0].equals("cookie"))flag=0;}
	if (flag==1)System.out.println("YES");
	else System.out.println("NO");
}
}
}


