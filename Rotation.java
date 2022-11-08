import java.util.Scanner;
class First
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0;i<a;i++)
        {
            int b=sc.nextInt();
            int c=sc.nextInt();
            c=c%b;
            int[] arr=new int[b];
            for(int k=0;k<b;k++)
            {
                arr[k]=sc.nextInt();
            }
            
            for(int k=b-c;k<b;k++)
            {
                System.out.print(arr[k]+" ");
            }
            for(int k=0;k<b-c;k++)
            {
                System.out.print(arr[k]);
                if(k!=b-c-1)
                {
                    System.out.print(" ");
                }
            }
            
            System.out.println();
        }
    }
}