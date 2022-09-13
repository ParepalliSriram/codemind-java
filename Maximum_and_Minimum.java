import java.util.Scanner;
class First
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] arr1=new int[a];
        int[] arr2=new int[100];
        int[] arr3=new int[100];
        int i,j,k,l,m=0,n=0,count=0,p=0,q=0,min,max;
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
            if(count==arr2[k])
            {
                arr3[p++]=arr2[k];
                n+=1;
            }
            count=0;
        }
        if(n==0)
        {
            System.out.print("-1");
        }
        else
        {
            min=arr3[0];
            max=arr3[0];
            for(i=0;i<p;i++)
            {
                if(arr3[i]<min)
                {
                    min=arr3[i];
                    n+=1;
                }
                if(arr3[i]>max)
                {
                    max=arr3[i];
                }
            }
            System.out.print(min+" "+max);
        }
    }
}
