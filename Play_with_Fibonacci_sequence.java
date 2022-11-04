import java.util.Scanner;
class First
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),c=0;
        int[] arr=new int[100];
        arr[0]=0;
        arr[1]=1;
        System.out.print(arr[0]+" "+arr[1]+" ");
        for(int i=2;i<a;i++)
        {
            arr[i]=arr[i-1]+arr[i-2];
            System.out.print(arr[i]+" ");
        }
    }
}