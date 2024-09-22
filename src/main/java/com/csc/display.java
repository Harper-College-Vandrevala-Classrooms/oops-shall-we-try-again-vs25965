package com.csc;
import java.util.Scanner;


public class display {

    int _upperb;
    int _lowerb;
    String _errorm;
    String _promt;
    
    Scanner in = new Scanner(System.in);
    Scanner on = new Scanner(System.in);
    tryagain tryobject = new tryagain();
    
    public int upperbounce (String upchoice)
    {
        if (upchoice.equals("default"))
        {
         int upperb = 50;
          _upperb = upperb;
          return  _upperb;
        }
        else 
        {
         System.out.print("\nEnter an upper limit: ");
         int upperb = in.nextInt();
          _upperb = upperb;
          return  _upperb;
        }

    }
	public int lowerbounce (String lowchoice)
    {
 
        if (lowchoice.equals("me"))
        {
         System.out.print("\nEnter a lower limit: ");
         int lowerb = in.nextInt();
          _lowerb = lowerb;
         return _lowerb;
        }
        else 
        {
         int lowerb = 0;
         _lowerb = lowerb;
         return _lowerb;
        }

    }
    public String errormessage (String errchoice)
    {
        if (errchoice.equals("me"))
        {
         System.out.print("\nEnter an error message when values entered are out of bounce: ");
         String errorm = on.nextLine();
         _errorm = errorm;
         return _errorm;
        }
        else 
        {
         String errorm = "Your data enter is out of bounds";
         _errorm = errorm;
         return _errorm;
        }
    }

    public String promtmessage (String promtchoice)
    {
        if (promtchoice.equals("me"))
	   {
		System.out.print("\nEnter an promt message: ");
		String promtm = on.nextLine();
		_promt = promtm;
        return _promt;
	   }
	   else 
	   {
		String promtm = "Enter a value between 0 and 50";
		 _promt = promtm;
         return _promt;
	   }
     
    }

    
}
