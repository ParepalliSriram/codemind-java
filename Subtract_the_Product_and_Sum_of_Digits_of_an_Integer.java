import java.util.Scanner;
class First
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int i,j,k=0,l,s=0,p=1;
        while(a!=0)
        {
            i=a%10;
            a=a/10;
            s+=i;
            p*=i;
        }
        System.out.print(p-s);
    }
}