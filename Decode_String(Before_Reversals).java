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
            int b=sc.nextInt();
            sc.nextLine();
            String s1=sc.nextLine();
            StringBuffer s2=new StringBuffer(s1);
            while(b>1)
            {
                StringBuffer sct=new StringBuffer();
                for(int k=0;k<b;k++)
                {
                    sct.append(s2.charAt(k)+"");
                }
                sct.reverse();
                s2.replace(0,b,sct+"");
                b-=1;
            }
            
            System.out.println(s2);
        }
    }
}