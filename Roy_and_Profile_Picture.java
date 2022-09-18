import java.util.Scanner;
class First
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int i,j,k=0,l=0;
        for(i=0;i<b;i++)
        {
            int c=sc.nextInt();
            int d=sc.nextInt();
            if(c<a || d<a)
            {
                System.out.println("UPLOAD ANOTHER");
            }
            else if(c==d)
            {
                System.out.println("ACCEPTED");
            }
            else
            {
                System.out.println("CROP IT");
            }
        }
    }
}