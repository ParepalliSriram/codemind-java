import java.util.Scanner;
class First
{
	public static void main(String args[])
	{
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int[] arr=new int[a];
	    int[] arr2=new int[100];
	    int i,k,l=0,m=0,n=0;
	    for(i=0;i<a;i++)
	    {
	        arr[i]=sc.nextInt();
	        for(k=2;k<arr[i];k++)
	        {
	            if(arr[i]%k==0)
	            {
	                l=5;
	                break;
	            }
	        }
	        if(l!=5 && arr[i]>1)
	        {
	            arr2[m++]=arr[i];
	        }
	        l=0;
	    }
	    int b=sc.nextInt();
	    for(i=0;i<m;i++)
	    {
	        if(arr2[i]>=b)
	        {
	            n+=1;
	        }
	    }
	    System.out.print(n);
	    
	}
}