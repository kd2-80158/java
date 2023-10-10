import java.util.Scanner;

public class User {
	int totalMiles;
	double gasolineCost;
	int avgMiles;
	int parkingFee;
	int tollFee;
	public int getTotalMiles() {
		return totalMiles;
	}
	public void setTotalMiles(int totalMiles) {
		this.totalMiles = totalMiles;
	}
	public double getGasolineCost() {
		return gasolineCost;
	}
	public void setGasolineCost(double gasolineCost) {
		this.gasolineCost = gasolineCost;
	}
	public int getParkingFee() {
		return parkingFee;
	}
	public int getAvgMiles() {
		return avgMiles;
	}
	
	public void setParkingFee(int parkingFee) {
		this.parkingFee = parkingFee;
	}
	public int getTollFee() {
		return tollFee;
	}
	public void setTollFee(int tollFee) {
		this.tollFee = tollFee;
	}
	public void setAvgMiles(int avgMiles) {
		this.avgMiles = avgMiles;
	}
	public User()
	{
		this.totalMiles = 0;
		this.gasolineCost = 0;
		this.parkingFee = 0;
		this.tollFee = 0;
		this.avgMiles = 0;
	}
	public User(int totalMiles, double gasolineCost, int parkingFee, int tollFee,int avgMiles) {
		this.totalMiles = totalMiles;
		this.gasolineCost = gasolineCost;
		this.parkingFee = parkingFee;
		this.tollFee = tollFee;
		this.avgMiles = avgMiles;
	}
	Scanner sc = new Scanner(System.in);
	public void acceptData()
	{
		System.out.println("Enter totalmiles: ");
		totalMiles=sc.nextInt();
		System.out.println("Enter Gasoline Cost: ");
		gasolineCost=sc.nextDouble();
		System.out.println("Enter Average Miles: ");
		avgMiles=sc.nextInt();
		System.out.println("Enter Parking Fee: ");
		parkingFee=sc.nextInt();
		System.out.println("Enter Toll Fee: ");
		tollFee=sc.nextInt();	
	}
	public void calculate()
	{
		double cost=0;
		cost=(this.totalMiles/this.avgMiles)*this.gasolineCost;
		double result = cost+parkingFee+tollFee;
		System.out.println("Daily driving cost: "+result);
	}
//	public void displayData()
//	{
//		
//		
//	}
	
	

}
