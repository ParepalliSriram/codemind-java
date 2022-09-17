import java.util.Scanner;
class First
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] arr=new int[a];
        int i,j,k=0,l,e=0,o=0;
        for(i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]%2==0)
            {
                e+=1;
            }
            else
            {
                o+=1;
            }
        }
        System.out.print(e+" "+o);
    }
}