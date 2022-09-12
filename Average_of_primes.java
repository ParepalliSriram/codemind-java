import java.util.Scanner;
class First
{
	public static void main(String args[])
	{
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int[] arr=new int[a];
	    int i,k,l=0;
	    float m=0,n=0;
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
	            m+=arr[i];
	            n+=1;
	        }
	        l=0;
	    }
	    System.out.printf("%.2f",m/n);
	    
	}
}