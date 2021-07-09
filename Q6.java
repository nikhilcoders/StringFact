import java.util.*;
class Main{
static boolean check(int c,int d,int l)
{
	if(l%4!=0)return false;
	if(l==(c+d)*4)return true;
	for(int i=1;i<=c&&i<=d*2;i++)
	{
		if(l==(c-i+d)*4)return true;
	}
	return false;
}
public static void main(String x[])
{
	Scanner s=new Scanner(System.in);
	int testcase=s.nextInt();s.nextLine();
	for(int c=0;c<testcase;c++)
{
	int flag=1;
	String s1[]=s.nextLine().split(" ");
	if(check(Integer.parseInt(s1[0]),Integer.parseInt(s1[1]),Integer.parseInt(s1[2])))System.out.println("YES");
	else System.out.println("NO");
}
}
}






