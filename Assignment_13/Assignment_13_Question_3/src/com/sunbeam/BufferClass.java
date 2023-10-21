package com.sunbeam;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class BufferClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	   try(FileWriter fw = new FileWriter("data.txt"))
	   {
	   try(BufferedWriter bw = new BufferedWriter(fw))
	   {
	   System.out.println("Enter line: ");
	   for(int i =1; i<=4;i++)
	   {
		   
		   String line = sc.nextLine();
		   bw.write(line);
		   bw.newLine();
	   }
	   System.out.println("File Saved successfully");
	   }
	   catch(Exception e)
	   {
		   e.printStackTrace();
	   }

	}
	   catch(Exception e)
	   {
		   e.printStackTrace();
	   }
	}
}

