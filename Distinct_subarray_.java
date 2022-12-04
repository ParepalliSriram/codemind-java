import java.util.Scanner;
class First
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt(),k=0;
        int [] arr=new int[b];
        for(int i=a;i<=b;i++)
        {
            arr[k++]=i;
        }
        int cou=0;
        for(int i=0;i<k;i++)
        {
            int count=0;
            for(int l=i;l<k;l++)
            {
                count+=arr[l];
                if(count%2!=0)
                {
                    cou+=1;
                }
            }
        }
        System.out.println(cou);
    }
}