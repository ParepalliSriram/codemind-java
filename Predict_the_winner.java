import java.util.Scanner;
class First
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] arr=new int[a];
        for(int k=0;k<a;k++)
        {
            arr[k]=sc.nextInt();
        }
        int c=0,b=0,on=0,t=0;
        for(int i=0;i<a;i++)
        {
            if(c!=2)
            {
                c+=1;
                on+=arr[i];
                if(c==2)
                {
                    b=0;
                }
            }
            else if(b!=2)
            {
                b+=1;
                t+=arr[i];
                if(b==2)
                {
                    c=0;
                }
            }
        }
        int ans=Math.abs(on-t);
        if(ans%4==0)
        {
            System.out.print("X");
        }
        else
        {
            System.out.print("Y");
        }
    }
}