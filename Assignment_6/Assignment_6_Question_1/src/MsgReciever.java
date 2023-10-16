import java.util.Scanner;

public class MsgReciever {
	
	
String msg;
	
	Scanner sc = new Scanner(System.in);
	
	MsgReciever()
	{
		this.msg="";
	}
	
	MsgReciever(String msg)
	{
		this.msg=msg;
	}
	
	void acceptMsg()
	{
		System.out.println("Enter your message: ");
		msg=sc.nextLine();
	}
	
	@Override
	public String toString() {
		return "Test [msg=" + msg + ", sc=" + sc + "]";
	}
	
	
	void displayMsg() throws ExceptionLineTooLong
	{
		if(msg.length()>80)
		{
			throw new ExceptionLineTooLong("The string is too long");
		}
		else
			System.out.println("Your text: "+msg);

}
}
