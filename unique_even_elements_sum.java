import java.util.Scanner;
class First
{
	public static void main(String args[])
	{
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int[] arr=new int[a];
	    int[] arr2=new int[100];
	    int i,k,l=0,m,n=0,p=0,q=0;
	    for(i=0;i<a;i++)
	    {
	        arr[i]=sc.nextInt();
	    }
	    arr2[p++]=arr[0];
	    for(i=0;i<a;i++)
	    {
	        for(k=0;k<p;k++)
	        {
	            if(arr2[k]==arr[i])
	            {
	                q+=1;
	                break;
	            }
	        }
	        if(q==0)
	        {
	            arr2[p++]=arr[i];
	        }
	        q=0;
	    }
	    for(i=0;i<p;i++)
	    {
	        if( arr2[i]%2==0)
	        {
	            for(m=0;m<a;m++)
	            {
	                if(arr2[m]==arr2[i])
	                {
	                    n+=1;
	                }
	            }
	            if(n==1)
	            {
	                l+=arr2[i];
	            }
	            n=0;
	        }
	    }
	    System.out.println(l);
	}
}