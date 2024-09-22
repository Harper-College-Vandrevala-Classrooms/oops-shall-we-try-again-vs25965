package com.csc;
import java.util.Scanner;


public class tryagain {
   
   public static void main (String[] args)
   {
	  
	   Scanner in = new Scanner(System.in);
	  
	   display disobject = new display();
	   
	  

	   System.out.print("Welcome to the Oops! Shall We Try Again? Lab\r\nThis program will work with int values");
	   System.out.print("\nEnter a the word - default - to use the default value of 50 as upper limit ");
	   System.out.print("\r\nOR the letter - m - to type your own upper bound: ");
	   Scanner on = new Scanner(System.in);
	   String upchoice = on.nextLine();
	   
	   int nup = disobject.upperbounce(upchoice);

	   System.out.print("\nEnter a the word - default - to use the default value of 0 as lower limit ");
	   System.out.print("\r\nOR the letter - me - to type your own lower bound: ");
	   String lowchoice = on.nextLine();

       
	   int ndw = disobject.lowerbounce(lowchoice);

	   System.out.print("\nEnter a the word - default - to use the default error message ");
	   System.out.print("\r\nOR the word - me - to type your own error message: ");
	   String errchoice = on.nextLine();
	   
	   String nerr = disobject.errormessage(errchoice);


	   System.out.print("\nEnter a the word - default - to use the default promt message ");
	   System.out.print("\r\nOR the word - me - to type your own promt message: ");
	   String promtchoice = on.nextLine();

	   String nprt = disobject.promtmessage(promtchoice);
       
       System.out.println(nprt);
	   int datain = in.nextInt();


	   if (datain <= nup  && datain >= ndw)
	   {
		  System.out.println("Your valid entry is " + datain);
	   }

	   else
	   {
		   while ( datain < ndw || datain > nup)
		   {
			  System.out.println(nerr + "\n" + nprt );
			  int ndata = in.nextInt();
			  
			  if (ndata <= nup && ndata >= ndw)
			  {
			   System.out.println("Your valid entry is " + ndata);
			   break;
			  }
		   }
	   } 
	   


		in.close(); 
		on.close();
   }

 
   

}








