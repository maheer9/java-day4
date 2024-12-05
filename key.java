import java .util.*;
public class key{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int a=Sc.nextInt();
        int flag=0;
        if(a>=18)
        flag=1;
        switch(flag)
        {
            case 0:
                System.out.println("not eligible");
                break;
            case 1:
                System.out.println("eligible");
                break;    
        }
        }
}