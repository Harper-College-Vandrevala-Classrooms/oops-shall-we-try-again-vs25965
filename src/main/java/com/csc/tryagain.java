package com.csc;
import java.util.Scanner;


public class tryagain {

   public static void main (String[] args)
   {
	   Scanner in = new Scanner(System.in);
	   Scanner on = new Scanner(System.in);

	   System.out.print("Welcome to the Oops! Shall We Try Again? Lab\nThis program will work with int values");
	   System.out.print("\nEnter a upper bounce: ");
	   int upperb = in.nextInt();
	   System.out.print("Enter a lower bounce: ");
	   int lowerb = in.nextInt();	
	   System.out.print("\nEnter an error message: ");
	   String errorm = on.nextLine();
	   System.out.print("Enter a promt message: ");
	   String promtm = on.nextLine();

	   System.out.println(promtm);
	   int datain = in.nextInt();
       
	   if (datain <= upperb & datain >= lowerb)
		{
		   System.out.println("Your valid entry is " + datain);
		}

		else
		{
			while ( datain < lowerb || datain > upperb)
			{
			   System.out.println(errorm + "\n" + promtm );
			   int ndata = in.nextInt();
			   
			   if (ndata < upperb & ndata > lowerb)
			   {
				System.out.println("Your valid entry is " + ndata);
				break;
			   }
			}
		}
	   

   }
}
