import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b)
        {
            System.out.println("-1");
        }
        else{
            int count=1,d=0;
            while(true)
            {
                
                if(d%2==0)
                {
                    a=a+c;
                }
                else
                {
                    b=b+c;
                }
                if(b>a)
                {
                    System.out.println(count);
                    break;
                }
                    count+=1;
                    d+=1;
                }
            }
    }
}