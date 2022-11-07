import java.util.Scanner;
class First
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt(),c=0;
        int[] arr=new int[a];
        for(int i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<a;i++)
        {
            int count=0;
            for(int k=i;k<a;k++)
            {
                count+=arr[k];
                if(count==b)
                {
                    c+=1;
                    break;
                }
                else if(count>b)
                {
                    break;
                }
            }
        }
        System.out.print(c);
    }
}