import java.util.Scanner;
class sc
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),ab=0,be=0,ans,p=0;
        while(true)
        {
            ans=(int)Math.pow(2,p);
            if(ans<a)
            {
                be=ans;
            }
            if(ans>=a)
            {
                ab=ans;
                break;
            }
            p+=1;
        }
        if(a-be<=ab-a)
        {
            System.out.println(a-be);
        }
        else
        {
            System.out.print(ab-a);
        }
    }
}