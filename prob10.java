public class prob10{
	static public void main(String []args){
		double totalSellingPrice = 15600.0; 
		double profitPercentage = 20.0; 
		int totalItems = 15;
		double totalCostPrice = totalSellingPrice / (1 + profitPercentage / 100.0);
		double costPrice = totalCostPrice / totalItems;
		System.out.println("The cost price of one item is " + " " + costPrice);
	}
}