import java.util.Scanner;
class Vowel
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuffer s1=new StringBuffer();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U')
            {
                s1.append('V');
            }
            else
            {
                s1.append('C');
            }
        }
        int k=1;
        while(k!=0)
        {
            int l=0;
            for(int i=0;i<s1.length()-1;i++)
            {
                if(s1.charAt(i)==s1.charAt(i+1))
                {
                    s1.setCharAt(i+1,'[');
                    l+=1;
                }
            }
            if(l==0)
            {
                k=0;
            }
        }
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)!='[')
            {
                System.out.print(s1.charAt(i));
            }
        }
    }
}