import java.util.Scanner;
class Sample
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a<3)
        {
            System.out.println("0");
        }
        else
        {
            int an=((int)(Math.pow(3,(a-3))))*8*(a-2);
            an+=an/4;
            System.out.println(an);
        }
    }
}