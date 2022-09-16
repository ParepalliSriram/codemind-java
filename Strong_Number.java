import java.util.Scanner;
class First
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int i,j,k=0,l,s=1,p=0,m;
        m=a;
        while(a!=0)
        {
            i=a%10;
            a=a/10;
            for(l=i;l>=1;l--)
            {
                s*=l;
            }
            p+=s;
            s=1;
        }
        if(p==m)
        {
            System.out.print("The number "+m+" is a strong number");
        }
        else
        {
            System.out.print("The number "+m+" is not a strong number");
        }
    }
}