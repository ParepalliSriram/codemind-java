import java.util.Scanner;
class First
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] arr1=new int[a];
        int[] arr2=new int[100];
        int i,j,k,l,m=0,n=0,count=0;
        for(i=0;i<a;i++)
        {
            arr1[i]=sc.nextInt();
        }
        arr2[m++]=arr1[0];
        for(i=0;i<a;i++)
        {
            for(k=0;k<m;k++)
            {
                if(arr2[k]==arr1[i])
                {
                    count+=1;
                    break;
                }
            }
            if(count==0)
            {
                arr2[m++]=arr1[i];
            }
            count=0;
        }
        count=0;
        for(k=0;k<m;k++)
        {
            for(i=0;i<a;i++)
            {
                if(arr1[i]==arr2[k])
                {
                    count+=1;
                }
            }
            System.out.print(arr2[k]+" "+count+" ");
            count=0;
        }
    }
}
