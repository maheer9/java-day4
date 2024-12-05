import java.util.*;
public class odd
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int a=Sc.nextInt();
        for(int i=1; i<a; i+=2)
        {
            System.out.println(i);
        }    
    }
}