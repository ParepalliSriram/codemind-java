import java.util.Scanner;
class First
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int i,j,k=0,l,s=0,p=0;
        while(a!=0)
        {
            i=a%10;
            a=a/10;
            k=k*10+i;
        }
        while(k!=0)
        {
            l=k%10;
            k=k/10;
            if(l==6 && s==0)
            {
                l=9;
                s+=1;
            }
            p=p*10+l;
        }
        System.out.print(p);
    }
}