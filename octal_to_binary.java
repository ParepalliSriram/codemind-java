import java.util.Scanner;
class First
{
    public static int deci(int a)
    {
        int i,j,k=0,m=0;
        double l;
        while(a!=0)
        {
            i=a%10;
            a=a/10;
            l=Math.pow(8,m);
            k+=i*(l);
            m+=1;
        }
        return k;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] arr=new int[100];
        int i,j,k=0,l;
        l=deci(a);
        while(l!=0)
        {
            i=l%2;
            l=l/2;
            arr[k++]=i;
        }
        for(i=k-1;i>=0;i--)
        {
            System.out.print(arr[i]);
        }
    }
}