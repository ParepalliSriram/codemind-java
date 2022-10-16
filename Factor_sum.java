import java.util.*;
class num
{
    public static int Sum_of(int a)
    {
        int count=0;
        for(int i=1;i<=a;i++)
        {
            if(a%i==0)
            {
                count+=i;
            }
        }
        return count;
    }
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[100];
        int p=0;
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++)
        {
        	if(str.charAt(i)==',')
        	{
        		continue;
        	}
        	else
        	{
        		arr[p++]=(int)(str.charAt(i))-48;
        	}
        }
        int[] ar3=new int[100];
        int a=0;
        for(int i=0;i<p;i++)
        {
            int count=0;
        	int q=Sum_of(arr[i]);
        	for(int h=0;h<p;h++)
        	{
        	    if(arr[h]==q)
        	    {
        	        count+=1;
        	        break;
        	    }
        	}
        	if(count!=0)
        	{
        	    ar3[a++]=arr[i];
        	}
        }
        if(a==0)
        {
            System.out.print("-1");
        }
        else
        {
            
            Arrays.sort(ar3);
            for(int i=100-a;i<100;i++)
            {
                System.out.print(ar3[i]);
                if(i!=a-1)
                {
                    System.out.print(" ");
                }
            }
        }
        
    }
}