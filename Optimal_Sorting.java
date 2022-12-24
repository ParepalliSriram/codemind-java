import java.util.*;
class A
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int z=sc.nextInt();
        for(int i=0;i<z;i++)
        {
            int a=sc.nextInt();
            ArrayList<Integer> arli=new ArrayList<Integer>();
            int[] arl=new int[a];
            int p=0;
            for(int k=0;k<a;k++)
            {
                int x=sc.nextInt();
                arli.add(x);
                arl[p++]=x;
            }
            Arrays.sort(arl);
            ArrayList<Integer> arlii=new ArrayList<Integer>();
            for(int l=0;l<a;l++)
            {
                arlii.add(arl[l]);
            }
            if(arli.equals(arlii))
            {
                System.out.println("0");
            }
            else
            {
                int m1=Collections.max(arli);
                int m2=Collections.min(arli);
                System.out.println(m1-m2);
            }
        }
    }
}