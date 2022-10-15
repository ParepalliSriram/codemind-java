import java.util.Scanner;
class sc
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        if(a.charAt(0)=='0' || a.length()!=10)
        {
            System.out.print("Invalid");
        }
        else
        {
            System.out.print("Valid");
        }
    }
}