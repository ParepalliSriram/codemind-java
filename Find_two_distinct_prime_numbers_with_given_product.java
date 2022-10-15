import java.util.Scanner;
class sc
{
    public static boolean prime(int a)
    {
        if(a<2)
        {
            return false;
        }
        else
        {
            for(int i=2;i*i<=a;i++)
            {
                if(a%i==0)
                {
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] arr=new int[100];
        int p=0,q=0;
        for(int i=1;i<=a;i++)
        {
            if(prime(i))
            {
                arr[p++]=i;
            }
        }
        for(int i=0;i<p;i++)
        {
            int count=0;
            for(int k=0;k<p;k++)
            {
                if(arr[i]*arr[k]==a)
                {
                    System.out.print(arr[i]+" "+arr[k]);
                    count+=1;
                    q+=1;
                    break;
                }
            }
            if(count>0)
            {
                break;
            }
        }
        if(q==0)
        {
            System.out.print("-1");
        }
    }
}