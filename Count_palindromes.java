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
	        m=arr[i];
	        while(m!=0)
	        {
	            k=m%10;
	            m=m/10;
	            l=l*10+k;
	        }
	        if(l==arr[i])
	        {
	            n+=1;
	        }
	        l=0;
	    }
	    System.out.print(n);
	    
	}
}