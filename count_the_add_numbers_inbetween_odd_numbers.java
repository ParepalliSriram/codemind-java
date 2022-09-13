import java.util.Scanner;
class First
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] arr1=new int[a];
        int[] arr2=new int[100];
        int i,j,k,l=0,count=0,avg;
        for(i=0;i<a;i++)
        {
            arr1[i]=sc.nextInt();
        }
        for(i=1;i<a-1;i++)
        {
            if(arr1[i-1]%2!=0 && arr1[i+1]%2!=0)
            {
                if(arr1[i]%2!=0)
                {
                    count+=1;
                }
            }
        }
        System.out.print(count);
        
    }
}