import java.util.Scanner;
class First
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] arr=new int[a];
        int count=0;
        for(int i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
            count+=arr[i];
        }
        System.out.print(count);
    }
}