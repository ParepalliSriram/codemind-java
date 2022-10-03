import java.util.Scanner;
class first
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        int a=0;
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)>=48 && s1.charAt(i)<=57)
            {
                a+=s1.charAt(i)-48;
            }
        }
        System.out.print(a);
    }
}