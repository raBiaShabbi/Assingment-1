public class prob9{
	public static void main(String[] args) {
        
        int amountInHundreds = 870;
		
        int note100 = amountInHundreds / 100;
		System.out.println((note100) + " " + "notes of 100");
		amountInHundreds -= note100 * 100;
		 
        int note50 = amountInHundreds /50;
		System.out.println((note50) + " "  + "notes of 50");
		amountInHundreds -= note50 * 50;
		
        int note10 = amountInHundreds/10;
		System.out.println((note10) + " " + "notes of 10");
		
    }
}
