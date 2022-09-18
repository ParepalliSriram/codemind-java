import java.util.Scanner;
class First
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] arr=new int[a];
        int[] e=new int[100];
        int[] o=new int[100];
        int[] arr2=new int[100];
        int i,j,k=0,l=0,m,n=0,p=0;
        for(i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<(a/2)+1;i++)
        {
            e[k++]=arr[i];
        }
        for(i=(a/2);i<a;i++)
        {
            o[l++]=arr[i];
        }
        for(i=0;i<k;i++)
        {
            for(m=l-1;m>=0;m--)
            {
                arr2[p++]=e[i];
                arr2[p++]=o[m];
                break;
            }
            l-=1;
        }
        if(a%2!=0)
        {
            for(i=0;i<p-1;i++)
            {
                System.out.print(arr2[i]+" ");
            }
            System.out.print("0");
        }
        else
        {
            for(i=0;i<p;i++)
            {
                System.out.print(arr2[i]+" ");
            }
        }
    }
}