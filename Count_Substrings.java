import java.util.Scanner;
class A
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int z=sc.nextInt();
        for(int i=0;i<z;i++)
        {
            int a=sc.nextInt();
            sc.nextLine();
            String s=sc.nextLine();
            
            int count=0;
            for(int p=0;p<s.length();p++)
            {
                String s22="";
                for(int k=p;k<s.length();k++)
                {
                    s22+=s.charAt(k);
                    if(s22.startsWith("1"))
                    {
                        if(s22.endsWith("1"))
                        {
                            count+=1;
                        }
                    }
                }
            }
            System.out.println(count);
        }
    }
}