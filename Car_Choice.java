import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int z=sc.nextInt();
        for(int i=0;i<z;i++)
        {
            double x1=sc.nextInt();
            double x2=sc.nextInt();
            double y1=sc.nextInt();
            double y2=sc.nextInt();
            double c1=y1/x1;
            double c2=y2/x2;
            if(c1<c2)
            {
                System.out.println("-1");
            }
            else if(c1==c2)
            {
                System.out.println("0");
            }
            else
            {
                System.out.println("1");
            }
        }
    }
}