import java.util.*;
class A
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
        Arrays.sort(arr);
        for(int i=0;i<(a/2);i++)
        {
            int temp=arr[i];
            arr[i]=arr[a-1-i];
            arr[a-1-i]=temp;
        }
        for(int i=0;i<a-1;i++)
        {
           if(i%2==0)
           {
               if(arr[i]>arr[i+1])
               {
                    int t=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=t;
               }
           }
           else
           {
               if(arr[i]<arr[i+1])
               {
                   int p=arr[i];
                   arr[i]=arr[i+1];
                   arr[i+1]=p;
               }
           }
        }
        for(int i=0;i<a;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}