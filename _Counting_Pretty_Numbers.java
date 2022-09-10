import java.util.Scanner;
class First
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,i,j,k,l,m,n,c=0;
        a=sc.nextInt();
        for(i=0;i<a;i++)
        {
            k=sc.nextInt();
            l=sc.nextInt();
            for(m=k;m<=l;m++)
            {
                n=m%10;
                if(n==2 || n==3 || n==9)
                {
                    c+=1;
                }
            }
            System.out.println(c);
            c=0;
        }
        
    }
}