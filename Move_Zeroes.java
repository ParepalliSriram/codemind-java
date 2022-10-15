import java.util.Scanner;
class ones
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] arr=new int[a];
        int[] ar2=new int[100];
        int p=0;
        for(int i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]!=0)
            {
                ar2[p++]=arr[i];
            }
        }
        
        for(int i=0;i<a;i++)
        {
            if(arr[i]==0)
            {
                ar2[p++]=arr[i];
            }
        }
        for(int i=0;i<p;i++)
        {
            System.out.print(ar2[i]);
            if(i!=p-1)
            {
                System.out.print(" ");
            }
        }
        
    }
}