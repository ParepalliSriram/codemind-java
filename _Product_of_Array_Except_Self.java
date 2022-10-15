import java.util.Scanner;
class Triplets
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int[] arr=new int[m];
        int p=1;
        for(int i=0;i<m;i++)
        {
            arr[i]=sc.nextInt();
            p*=arr[i];
        }
        for(int i=0;i<m;i++)
        {
            System.out.print((int)(p/arr[i])+" ");
        }
        
        
    }
}