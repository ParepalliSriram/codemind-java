import java.util.Scanner;
class First
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] arr=new int[a];
        int i,j,k=0,l;
        arr[0]=0;
        arr[1]=1;
        for(i=2;i<a;i++)
        {
            arr[i]=arr[i-1]+arr[i-2];
        }
        for(i=0;i<a;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}