import java.util.Scanner;
class First
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] arr1=new int[a];
        int i,j,k,l,m=0,n=0,count=0;
        for(i=0;i<a;i++)
        {
            arr1[i]=sc.nextInt();
        }
        int b=sc.nextInt();
        for(i=0;i<a;i++)
        {
            count+=1;
            if(count<=b)
            {
                m+=arr1[i];
            }
            else
            {
                break;
            }
        }
        System.out.print(m);
    }
}
