import java.util.Scanner;
class welcome
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] ar1=new int[a];
        for(int i=0;i<a;i++)
        {
            ar1[i]=sc.nextInt();
        }
        int count=0;
        int b=sc.nextInt();
        for(int i=0;i<a;i++)
        {
            if(ar1[i]==b)
            {
                System.out.print(i+" ");
                count+=1;
                break;
            }
        }
        for(int i=a-1;i>=0;i--)
        {
            if(ar1[i]==b)
            {
                System.out.print(i);
                count+=1;
                break;
            }
        }
        if(count==0)
        {
            System.out.print("-1 -1");
        }
    }
}