import java.util.Scanner;
class First
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] arr=new int[a];
        int[] arr2=new int[100];
        int i,j,k=0,l=0,m=0,n=0,p;
        for(i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
        }
        int b=sc.nextInt();
        int c=sc.nextInt();
        for(i=0;i<a;i++)
        {
            if(arr[i]>=b && arr[i]<=c)
            {
                arr2[m++]=arr[i];
            }
        }
        if(m==0)
        {
            System.out.print("-1");
        }
        else
        {
            p=arr2[0];
            for(i=0;i<m;i++)
            {
                if(arr2[i]<p)
                {
                    p=arr2[i];
                }
            }
            System.out.print(p);
        }
    }
}