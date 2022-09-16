import java.util.Scanner;
class First
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] arr=new int[100];
        int i,j,k=0,l=0,m=0,n=0;
        arr[0]=0;
        arr[1]=1;
        for(i=2;i<=30;i++)
        {
            arr[i]=arr[i-1]+arr[i-2];
        }
        for(i=0;i<=30;i++)
        {
            if(arr[i]<=a)
            {
                m=arr[i];
            }
            if(arr[i]>a)
            {
                n=arr[i];
                break;
            }
        }
        if(a-m<n-a)
        {
            System.out.print(m);
        }
        else if(a-m==n-a)
        {
            System.out.print(m+" "+n);
        }
        else
        {
            System.out.print(n);
        }
    }
}