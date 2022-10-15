import java.util.Scanner;
class ones
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] arr=new int[a];
        for(int i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
        }
        int[] ar2=new int[100];
        int p=0;
        for(int i=0;i<a;i++)
        {
            int count=0;
            if(arr[i]==1)
            {
                for(int k=i;k<a;k++)
                {
                    if(arr[k]!=1)
                    {
                        break;
                    }
                    else
                    {
                        count+=1;
                    }
                }
            }
            ar2[p++]=count;
        }
        int max=ar2[0];
        for(int i=0;i<p;i++)
        {
            if(ar2[i]>max)
            {
                max=ar2[i];
            }
        }
        System.out.print(max);
    }
}