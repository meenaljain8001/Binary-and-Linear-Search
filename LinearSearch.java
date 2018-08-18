import java.util.*;
class LinearSearch
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the size of array:");
	int n=sc.nextInt();
	int a[]=new int[n];	
	for(int i=0;i<n;i++)
 		a[i]=sc.nextInt();
	System.out.print("enter the value to be search:");
	int s=sc.nextInt();
	boolean b=false;	
	for(int i=0;i<n;i++)
	{
		if(s==a[i])
		{
			b=true;
			System.out.println("element found at "+(i+1));
			break;
		}
	}
	if(b==false)
	System.out.println("element not found");
	}
}
