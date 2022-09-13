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
        for(i=0;i<a;i++)
        {
            arr1[i]=sc.nextInt();
            if(arr1[i]%2!=0)
            {
                System.out.print(arr1[i]+" ");
            }
            else
            {
                arr2[l++]=arr1[i];
            }
        }
        for(i=0;i<l;i++)
        {
            System.out.print(arr2[i]+" ");
        }
    }
}