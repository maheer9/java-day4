import java.util.*;
public class codechef
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int t=Sc.nextInt();
        for(int i=0; i<t; i++)
        {
            int a=Sc.nextInt();
            int b=Sc.nextInt();
            int c=(a/b)*(a/b);
            System.out.println(c);
        }
    }
}