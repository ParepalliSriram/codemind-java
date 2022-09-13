import java.util.Scanner;
class First
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] arr1=new int[a];
        int[] arr2=new int[100];
        int i,j,k,l=0;
        float count=0,avg,m=0;
        for(i=0;i<a;i++)
        {
            arr1[i]=sc.nextInt();
            count+=arr1[i];
            m+=1;
        }
        avg=count/m;
        System.out.printf("%.2f",avg);
    }
}