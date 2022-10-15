import java.util.*;
class Merge
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int[] ar1=new int[a];
            int[] ar2=new int[b];
            for(int p=0;p<a;p++)
            {
                ar1[p]=sc.nextInt();
            }
            for(int p=0;p<b;p++)
            {
                ar2[p]=sc.nextInt();
            }
            Arrays.sort(ar1);
            Arrays.sort(ar2);
            int[] ar3=new int[a+b];
            int f=0;
            for(int p=0;p<a;p++)
            {
                ar3[f++]=ar1[p];
            }
            for(int p=0;p<b;p++)
            {
                ar3[f++]=ar2[p];
            }
            Arrays.sort(ar3);
            for(int p=0;p<f;p++)
            {
                System.out.print(ar3[p]);
                if(p!=f-1)
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
}