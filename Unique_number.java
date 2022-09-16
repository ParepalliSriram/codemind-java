import java.util.Scanner;
class First
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int i,j,k=0,l,m=0,count=0,n=0;
        int[] arr=new int[100];
        i=a;
        while(i!=0)
        {
            l=i%10;
            i=i/10;
            n+=1;
            arr[k++]=l;
        }
        for(i=0;i<k;i++)
        {
            for(l=0;l<k;l++)
            {
                if(arr[l]==arr[i])
                {
                    count+=1;
                }
            }
            if(count==1)
            {
                m+=1;
            }
            count=0;
        }
        if(n==m)
        {
            System.out.print("Unique Number");
        }
        else
        {
            System.out.print("Not Unique Number");
        }
    }
}