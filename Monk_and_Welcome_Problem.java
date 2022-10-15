import java.util.Scanner;
class welcome
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] ar1=new int[a];
        int[] ar2=new int[a];
        for(int i=0;i<a;i++)
        {
            ar1[i]=sc.nextInt();
        }
        for(int i=0;i<a;i++)
        {
            ar2[i]=sc.nextInt();
        }
        for(int i=0;i<a;i++)
        {
            System.out.print(ar1[i]+ar2[i]+" ");
        }
    }
}