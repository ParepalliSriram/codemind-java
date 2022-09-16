import java.util.Scanner;
class First
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int i,j,l,m=0,n;
        for(i=0;i<a/2;i++)
        {
            if(i*(i+1)==a)
            {
                System.out.print("YES");
                m+=1;
                break;
            }
        }
        if(m==0)
        {
            System.out.print("NO");
        }
    }
}