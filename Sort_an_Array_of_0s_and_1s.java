import java.util.Scanner;
class sort
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int[] arr2=new int[100];
        int p=0,q;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]==0)
            {
                arr2[p++]=arr[i];
            }
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]==1)
            {
                arr2[p++]=arr[i];
            }
        }
        for(int i=0;i<p;i++)
        {
            System.out.print(arr2[i]+" ");
        }
    }
}