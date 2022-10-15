import java.util.Scanner;
class Triplets
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][] arr=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int k=0;k<n;k++)
            {
                arr[i][k]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            int ma=-1;
            for(int k=0;k<m;k++)
            {
                if(arr[k][i]>ma)
                {
                    ma=arr[k][i];
                }
            }
            System.out.println(ma);
        }
        
        
    }
}