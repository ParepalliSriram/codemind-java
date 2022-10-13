import java.util.Scanner;
class digi
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='0' && s.charAt(i)<='9')
            {
                count+=1;
            }
        }
        if(count>0)
            System.out.print("Contains "+count+" digit");
        else
            System.out.print("Doesn't contain digit");
    }
}