import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class StringWithMaxLength {

	public static void main(String[] args) {
       
		List<String> string = new ArrayList<String>();
		string.add("Saurabh");
		string.add("Sam");
		string.add("Sameer");
		string.add("Hanu");
		string.add("Rahul");
		string.add("Ronit");
		string.add("Ester");
		
		String st = Collections.max(string);
		
		System.out.print("String with maximum length is: ");
		System.out.println(st);

	}

}
