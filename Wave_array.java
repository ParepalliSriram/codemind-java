import java.util.Scanner;
class First
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int i,j,k,count=0,l=0;
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n-2;i++)
        {
            if(arr[i]<arr[i+1] && arr[i+1]>arr[i+2] || arr[i]>arr[i+1] && arr[i+1]<arr[i+2])
            {
                continue;
            }
            else
            {
                count+=1;
                break;
            }
        }
        if(count==0)
        {
            System.out.print("yes");
        }
        else
        {
            System.out.print("no");
        }
    }
}