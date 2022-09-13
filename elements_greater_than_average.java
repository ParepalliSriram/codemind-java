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
            l+=arr1[i];
        }
        avg=l/a;
        for(i=0;i<a;i++)
        {
            if(arr1[i]>=avg)
            {
                count+=1;
            }
        }
        System.out.print(count);
    }
}