package com.sunbeam;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

public class MainClass {
	
	static Date parseDate(String str)
	{
		try {
			SimpleDateFormat sdf = new SimpleDateFormat();
			java.util.Date date = sdf.parse(str);
			return new Date(date.getTime());
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
	
	public static int menu()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("************************************");
		System.out.println("0. Exit");
		System.out.println("1. Add Candidate");
		System.out.println("2. Delete Candidate");
		System.out.println("3. Update Candidate");
		System.out.println("4. Get All Candidates");
		System.out.println("*************************************");
		System.out.print("Enter your choice: ");
		int choice = sc.nextInt(); 
		return choice;
	}


	public static void main(String[] args) {
		
       int ch;
       
       Scanner sc = new Scanner(System.in);
       
       while((ch=menu())!=0)
       {
    	   switch(ch)
    	   {
    	   case 1:
    		   try(UserDAO user = new UserDAO())
    		   {
    			   System.out.println("Enter first name: ");
    			   String fname = sc.next();
    			   System.out.println("Enter last name: ");
    			   String lname = sc.next();
    			   System.out.println("Enter email: ");
    			   String email = sc.next();
    			   System.out.println("Enter password: ");
    			   String pass = sc.next();
    			   System.out.println("Enter date of birth: ");
    			   String dob = sc.next();
    			   System.out.println("Enter status: ");
    			   Boolean status = sc.nextBoolean();
    			   System.out.println("Enter role: ");
    			   String role = sc.next();
    			 
    			   int cnt=user.addUser(new User(0,fname,lname,email,pass,dob,status,role));
    			   System.out.println("User added: "+cnt);
    		   }
    		   catch(Exception e)
    		   {
    			   e.printStackTrace();
    		   }
    		   break;
    	   case 2:
    		   try(UserDAO user = new UserDAO())
    		   {
    			   System.out.println("Enter user id to delete: ");
    			   int id = sc.nextInt();
    			   int cnt = user.deleteUser(id);
    			   System.out.println("User deleted: "+cnt);
    		   }
    		   catch(Exception e)
    		   {
    			   e.printStackTrace();
    		   }
    		   break;
    	   case 3:
    		   try(UserDAO user = new UserDAO())
    		   {
    			   System.out.println("Enter id to update: "); 
    			   int id = sc.nextInt();
    			   System.out.println("Enter first name: ");
    			   String fname = sc.next();
    			   System.out.println("Enter last name: ");
    			   String lname = sc.next();
    			   System.out.println("Enter email: ");
    			   String email = sc.next();
    			   System.out.println("Enter password: ");
    			   String pass = sc.next();
    			   System.out.println("Enter date of birth: ");
    			   String dob = sc.next();
    			   System.out.println("Enter status: ");
    			   Boolean status = sc.nextBoolean();
    			   System.out.println("Enter role: ");
    			   String role = sc.next();
    			   
    			   int cnt = user.updateUser(new User(id,fname,lname,email,pass,dob,status,role));
    			   System.out.println("Row affected: "+cnt);
    			   
    		   }
    		   catch(Exception e)
    		   {
    			   e.printStackTrace();
    		   }
    		   break;
    	   case 4:
    		   try(UserDAO user = new UserDAO())
    		   {
    			   List<User> list = user.displayUser();
    			   list.forEach(x ->System.out.println(x));
    		   }
    		   catch(Exception e)
    		   {
    			   e.printStackTrace();
    		   }
    		   break;
    	   default:
    		   break;
    		
    	   }
       }
		
		
		
	}

}
