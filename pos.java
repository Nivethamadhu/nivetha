import java.io.*;
import java.util.*;
public class pos
{
    public static void main(String args[])
    {
        int num;
        Scanner s=new Scanner(System.in);
        num=s.nextInt();
        if(num>0)
        {
            System.out.println("positive");
        }
        else if(num<0)
        {
            System.out.println("negative");
        }
        else
        {
            System.out.println("Zero");
        }
    }
}

