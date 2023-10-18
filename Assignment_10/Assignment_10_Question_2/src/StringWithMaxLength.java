import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class StringWithMaxLength{
	
	public static int maxLength(Collection<String> str)
	{
		Iterator<String> itr=str.iterator();
		int max=0;
		while(itr.hasNext())
		{
			String str1=itr.next();
			if(str1!=null)
			{
				int length=str1.length();
				if(length>max)
				{
					max=length;
				}
			}
		}
		return max;
		
	}

	public static void main(String[] args) {
       
		List<String> string = new ArrayList<String>();
		string.add("Saurabh");
		string.add("Zeus");
		string.add("Sameer");
		string.add("Hanu");
		string.add("Rahul");
		string.add("Ronit");
		string.add("Ester");
		
//		String st = Collections.max(string);
		
        int result=maxLength(string);
        for(String st:string)
        {
        	if(result==st.length())
        		System.out.println(st);
        }

	}
	}

