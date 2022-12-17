import java.util.Scanner;
class Angle
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int a=(int)(s.charAt(0)-48);
        a=a*10+((int)(s.charAt(1)-48));
        int b=(int)(s.charAt(3)-48);
        b=b*10+((int)(s.charAt(4)-48));
        double hrs=0.5 * (a * 60 + b);
        double minute_angle = 6 * b;
        
        double angle = Math.abs(hrs - minute_angle);
        angle = Math.min(360 - angle, angle);
        System.out.println(angle);
    }
}