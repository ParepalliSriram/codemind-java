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
	        for(k=1;k<=arr[i];k++)
	        {
	            if(arr[i]%k==0)
	            {
	                l+=1;
	            }
	        }
	        if(l==2)
	        {
	            n+=1;
	        }
	        l=0;
	    }
	    System.out.println(n);
	    
	}
}