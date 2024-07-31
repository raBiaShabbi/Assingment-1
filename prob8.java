public class prob8{
	static public void main(String []args){
		double percentageMen = 52;
		double percentageliteracy = 48;
		double percentageLiterateMen = 35;
		int totalPopulation = 80000;
		
		double totalMen = totalPopulation * percentageMen / 100;
		double totalWomen = totalPopulation - totalMen;
		
		double totalLiterateMen = totalPopulation * (percentageLiterateMen / 100.0);
		double totalIlliterateMen = totalMen - totalLiterateMen;
		
		double totalLiteratepeople = totalPopulation * percentageliteracy / 100;
		
		double totalLiteratewomen = totalLiteratepeople - totalLiterateMen;
		double totalIlliteratewomen = totalWomen - totalLiteratewomen;
		
		System.out.println("Number of illiterate men: " + totalIlliterateMen);
        System.out.println("Number of illiterate women: " + totalIlliteratewomen);
	}
}