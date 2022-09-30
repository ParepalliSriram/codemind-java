import java.util.Scanner;
class java
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        int s=0;
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)==' ')
            {
                s+=1;
            }
        }
        System.out.print(s+1);
    }
}