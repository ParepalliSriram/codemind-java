import java.util.Scanner;
class First
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] arr=new int[a];
        int[] arr2=new int[100];
        int i,j,k=0,l;
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
                arr2[k++]=arr[i];
            }
        }
        if(k==0)
        {
            System.out.print("-1");
        }
        else
        {
            for(i=0;i<k;i++)
            {
                System.out.print(arr2[i]+" ");
            }
        }
    }
}