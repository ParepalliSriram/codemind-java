import java.util.Scanner;
class First
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] arr=new int[a];
        for(int k=0;k<a;k++)
        {
            arr[k]=sc.nextInt();
        }
        int c=0;
        for(int i=0;i<a;i++)
        {
            int count=0;
            for(int k=0;k<a;k++)
            {
                if(arr[k]==arr[i])
                {
                    count+=1;
                }
            }
            if(count==1)
            {
                System.out.print(arr[i]+" ");
                c+=1;
            }
        }
        if(c==0)
        {
            System.out.print("-1");
        }
    }
}