import java.util.Scanner;
class First
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr1=new int[n];
        int i,j,k,c=0,q;
        for(i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }
        q=arr1[0];
        for(i=q;i<=5000;i++)
        {
            for(k=0;k<n;k++)
            {
                if(i%arr1[k]==0)
                {
                    c+=1;
                }
            }
            if(c==n)
            {
                System.out.print(i);
                break;
            }
            c=0;
        }
    }
}