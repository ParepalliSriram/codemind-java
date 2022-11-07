import java.util.Scanner;
class First
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] arr=new int[a];
        for(int i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<a;i++)
        {
            int count=0;
            for(int k=0;k<i;k++)
            {
                if(arr[k]<arr[i])
                {
                    count=arr[k];
                }
            }
            if(count==0)
            {
                System.out.print("-1"+" ");
            }
            else
            {
                System.out.print(count+" ");
            }
        }
    }
}