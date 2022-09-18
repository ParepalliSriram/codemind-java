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
        int i,j,k=0,l=0,m,n=0;
        for(i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<a;i++)
        {
            if(arr[i]%2==0)
            {
                e[k++]=arr[i];
            }
            else
            {
                o[l++]=arr[i];
            }
        }
        if(k>l)
        {
            for(i=0;i<k;i++)
            {
                if(n<l)
                {
                    for(m=n;m<l;m++)
                    {
                        System.out.print(o[i]+" "+e[i]+" ");
                        break;
                    }
                    n+=1;
                }
                else
                {
                    for(m=i;m<k;m++)
                    {
                        System.out.print(e[m]+" ");
                    }
                    break;
                }
            }
        }
        else
        {
            for(i=0;i<l;i++)
            {
                if(n<k)
                {
                    for(m=n;m<k;m++)
                    {
                        System.out.print(o[i]+" "+e[i]+" ");
                        break;
                    }
                    n+=1;
                }
                else
                {
                    for(m=i;m<l;m++)
                    {
                        System.out.print(o[i]+" ");
                    }
                    break;
                }
            }
        }
        if(a%2!=0)
        {
            System.out.print("0");
        }
    }
}