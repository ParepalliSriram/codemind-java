import java.util.Scanner;
class First
{
	public static void main(String args[])
	{
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int[] arr=new int[a];
	    int i,k,l=0,m,n=0;
	    for(i=0;i<a;i++)
	    {
	        arr[i]=sc.nextInt(); 
	    }
	    for(i=1;i<a;i++)
	    {
	        if(arr[i]>arr[i-1])
	        {
	            l=5;
	            break;
	        }
	    }
	    if(l==5)
	    {
	        System.out.println("no");
	    }
	    else
	    {
	        System.out.println("yes");
	    }
	}
}