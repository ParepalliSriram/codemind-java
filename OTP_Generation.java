import java.util.Scanner;
class first
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)>=48 && s1.charAt(i)<=57)
            {
                int a=s1.charAt(i)-48;
                if(a%2!=0)
                {
                    System.out.print(a*a);
                }
            }
        }
    }
}