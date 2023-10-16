
public class ExceptionLineTooLong extends Exception{
	
 String message;
 
 ExceptionLineTooLong()
 {

 }

public ExceptionLineTooLong(String message) {
    this.message=message;
}

@Override
public String toString() {
	return "ExceptionLineTooLong [message=" + message + "]";
}



 


 

}
