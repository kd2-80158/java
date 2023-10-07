import java.util.Scanner;

public class Restaurant {
	
	
	public static int menu() {
		
		int choice;
    	
		System.out.println("**********************");
		System.out.println("0. Exit");
		System.out.println("1. Dosa(Rs 50)");
		System.out.println("2. Samosa(Rs 10)");
		System.out.println("3. Idli(Rs 20)");
		System.out.println("4. Chole Bhature(Rs 100)");
		System.out.println("5. Medu Vada(Rs 40)");
		System.out.println("6. Pizza(Rs 150)");
		System.out.println("7. Ice Cream(Rs 30)");
		System.out.println("8. Hot Chocolate(Rs 70)");
		System.out.println("9. Soft Drinks(Rs 40)");
		System.out.println("10. Generate Bill");
		System.out.println("***********************");
		System.out.println("Enter your choice");
		System.out.println("-----------------------");
		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();
		return choice;
		
	}

	public static void main(String[] args) {
		
		   int ch;
           Scanner sc = new Scanner(System.in);
			
           int calculateBill=0;

            while((ch=menu())!=0)
            {
            
			switch(ch)
			{
			
			case 1:
				System.out.print("Enter quantity: ");
				int a=sc.nextInt();
				calculateBill=calculateBill+50*a;
//				System.out.println("Bill"+calculateBill);
				
				break;
			case 2:
				System.out.println("Enter quantity: ");
				int b=sc.nextInt();
				calculateBill=calculateBill+10*b;
				break;
			case 3:
				System.out.println("Enter quantity: ");
				int c=sc.nextInt();
				calculateBill=calculateBill+20*c;
				break;
			case 4:
				System.out.println("Enter quantity: ");
				int d=sc.nextInt();
				calculateBill=calculateBill+100*d;
				break;
			case 5:
				System.out.println("Enter quantity: ");
				int e=sc.nextInt();
				calculateBill=calculateBill+40*e;
				break;
			case 6:
				System.out.println("Enter quantity: ");
				int f=sc.nextInt();
				calculateBill=calculateBill+150*f;
				break;
			case 7:
				System.out.println("Enter quantity: ");
				int g=sc.nextInt();
				calculateBill=calculateBill+30*g;
				break;
			case 8:
				System.out.println("Enter quantity: ");
				int h=sc.nextInt();
				calculateBill=calculateBill+70*h;
				break;
			case 9:
				System.out.println("Enter quantity: ");
				int i=sc.nextInt();
				calculateBill=calculateBill+40*i;
				break;
			case 10:
				System.out.println("Total bill is: "+calculateBill);
				break;
			default:
				System.out.println("Wrong choice entered!!!!!");
				break;
				
			}
//			sc.close();
            }
            System.out.println("Thanks for using our app!!!!!!!!!");
	
	}
	
}
