import java.util.Scanner;
class First
{
	public static void main(String args[])
	{
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    int[] arr=new int[a];
	    int i,k,l=0;
	    for(i=0;i<a;i++)
	    {
	        arr[i]=sc.nextInt();
	        if(arr[i]%b==0)
	        {
	            l+=1;
	        }
	    }
	    System.out.print(l);
	    
	}
}