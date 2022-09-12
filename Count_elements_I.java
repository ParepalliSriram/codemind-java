import java.util.Scanner;
class First
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int[] arr1=new int[a];
        int[] arr2=new int[b];
        int[] arr3=new int[100];
        int[] arr4=new int[100];
        int i,j,k,l=0,m,n=0,count=0,cou=0;
        for(i=0;i<a;i++)
        {
            arr1[i]=sc.nextInt();
        }
        for(i=0;i<b;i++)
        {
            arr2[i]=sc.nextInt();
        }
        arr3[l++]=arr1[0];
        for(i=1;i<a;i++)
        {
            for(k=0;k<l;k++)
            {
                if(arr3[k]==arr1[i])
                {
                    count+=1;
                    break;
                }
            }
            if(count==0)
            {
                arr3[l++]=arr1[i];
            }
            count=0;
        }
        count=0;
        arr4[n++]=arr2[0];
        for(i=1;i<b;i++)
        {
            for(k=0;k<n;k++)
            {
                if(arr4[k]==arr2[i])
                {
                    count+=1;
                    break;
                }
            }
            if(count==0)
            {
                arr4[n++]=arr2[i];
            }
            count=0;
        }
        count=0;
        for(i=0;i<l;i++)
        {
            for(k=0;k<n;k++)
            {
                if(arr4[k]==arr3[i])
                {
                    count+=1;
                    break;
                }
            }
            if(count!=0)
            {
                cou+=1;
            }
            count=0;
        }
        System.out.println(cou);
    }
}