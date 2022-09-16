import java.util.Scanner;
class First
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] arr=new int[a];
        int i,j,k=0;
        for(i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
        }
        int b=sc.nextInt();
        for(i=0;i<a;i++)
        {
            if(arr[i]>b)
            {
                k+=1;
            }
        }
        System.out.print(a+k);
    }
}