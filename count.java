import java.util.*;
public class count
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int b=Sc.nextInt();
        for(int i=0; i<b; i++)
        {
            int n=Sc.nextInt();
            for(int j=1; j<=n; j++)
            {
                if(n%j==0)
                System.out.println(j+ ""); 
           }
           System.out.println();
        }
    }
}
