import java.util.Scanner;
class First
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int c=0;
        if(a%3==0)
        {
            c+=1;
            System.out.print("Pling");
        }
        if(a%5==0)
        {
            c+=1;
            System.out.print("Plang");
        }
        if(a%7==0)
        {
            c+=1;
            System.out.print("Plong");
        }
        if(c==0)
        {
            System.out.print(a);
        }
    }
}