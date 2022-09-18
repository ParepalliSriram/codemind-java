import java.util.Scanner;
class First
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] arr=new int[a];
        int i,j,k=0,l=0,m,n=0,p=0;
        for(i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
        }
        if(a%2!=0)
        {
            for(i=0;i<a;i++)
            {
                System.out.print(arr[i]+" ");
            }
            System.out.print("0");
        }
        else
        {
            for(i=0;i<a;i++)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
}