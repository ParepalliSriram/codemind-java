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
        int b=sc.nextInt();
        for(i=a-1;i>=0;i--)
        {
            if(arr1[i]==b)
            {
               count+=1;
               System.out.print("True");
               break;
            }
        }
        if(count==0)
        {
            System.out.print("False");
        }
    }
}