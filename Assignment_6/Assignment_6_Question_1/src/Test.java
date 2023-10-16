

import java.util.Scanner;
public class Test {
	

	public static void main(String[] args) {
		
		MsgReciever t1 = new MsgReciever();
		
		try
		{
			t1.acceptMsg();
			t1.displayMsg();
			
		}
		catch(ExceptionLineTooLong exception)
		{
			exception.printStackTrace();
		}
		
		
		

	}

}
