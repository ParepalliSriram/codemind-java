import java.util.Scanner;
class welcome
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] ar1=new int[a];
        for(int i=0;i<a;i++)
        {
            ar1[i]=sc.nextInt();
        }
        for(int i=0;i<a;i++)
        {
            int count=0;
            for(int k=0;k<a;k++)
            {
                if(ar1[k]==ar1[i])
                {
                    count+=1;
                }
            }
            if(count>1)
            {
                System.out.print(ar1[i]);
                break;
            }
        }
    }
}