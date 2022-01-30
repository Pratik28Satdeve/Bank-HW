import java.io.*;
import java.util.*;
public class bank
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int age ,term;
        int pram;
        double roi,ap;
        
        System.out.println("Enter the age:");
        age = in.nextInt();
        System.out.println("Enter term :");
        term =in.nextInt();
        System.out.println("Enter principal amount :");
        pram = in.nextInt();
        
        if(age<=60)
        {
            if(term==1)
            {
                roi = 0.075*pram;
            }
            else if(term==2)
            {
                roi = 0.085*pram;
            }
             if(term==3)
            {
                roi = 0.095*pram;
            }
            else
            {
                roi = 0.10*pram;
            }
            
        }
        else
        {
            if(term==1)
            {
                roi = 0.08*pram;
            }
            else if(term==2)
            {
                roi = 0.09*pram;
            }
            else if(term==3)
            {
                roi = 0.10*pram;
            }
            else 
            {
                roi = 0.11*pram;
            }
            
        }
        ap = roi + pram;
        System.out.println("Amount paid = " +ap);
        
    }
}