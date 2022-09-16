import java.util.Scanner;
class First
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] arr=new int[a];
        int i,j,k=0,l,m=0,n=0;
        for(i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<a;i++)
        {
            for(l=1;l<=(arr[i]/2)+1;l++)
            {
                if(l*l==arr[i])
                {
                    m=1;
                    break;
                }
            }
            if(m==1)
            {
                n+=arr[i];
            }
            m=0;
        }
        System.out.print(n);
    }
}