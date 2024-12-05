import java.util.*;
public class multiple
{
    public static void main(String arga[])
    {
        Scanner Sc=new Scanner(System.in);
        int t=Sc.nextInt();
        for(int i=0; i<t; i++)
        {
            int n=Sc.nextInt();
            if((n&7)==0)
            {
                System.out.println("Multiple of 8");
            }
            else
            {
                System.out.println("Not a Multiple of 8");
            }
        }
    }
}