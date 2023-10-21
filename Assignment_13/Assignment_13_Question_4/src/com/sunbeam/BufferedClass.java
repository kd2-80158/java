package com.sunbeam;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedClass {

	public static void main(String[] args) {
	
		   
		   try(FileReader fr1 = new FileReader("text.txt"))
		   {
           try(BufferedReader br1 = new BufferedReader(fr1))
           {
 
        	   String line;
        	   while((line = br1.readLine())!=null)
        	   {
        	   System.out.println(line);
        	   }
           }
           catch(Exception e)
		   {
			   e.printStackTrace();
		   }    	   
		   } catch (FileNotFoundException e1) {
		} catch (IOException e1) {

		}
           
 

}
}
