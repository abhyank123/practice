package assignement1;

import java.util.Scanner;

public class questionB
{
    public static void main (String args[])
    {
        float si,ci,p,r,n,t;
        Scanner scn = new Scanner(System.in);
        System.out.println("ENTER THE VALUE OF PRINCIPAL");
        p= scn.nextFloat();
        System.out.println("ENTER THE VALUE OF RATE");
        r= scn.nextFloat();
        System.out.println("ENTER THE VALUE OF NUMBER OF TIMES");
        n= scn.nextFloat();
        System.out.println("ENTER THE VALUE OF NUMBER OF TIME PERIOD");
        t= scn.nextFloat();

        si=p*r*t;
        ci=p*(1+(r/n));

        System.out.println(si+"\n"+ci);
    }
}
