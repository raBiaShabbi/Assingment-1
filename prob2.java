public class prob2{
	static public void main (String []args){
		double km = 2614;
		double meters = 2614*1000;
		double cm = meters*100;
		double feet = km * 3280.84;
		double inch = km * 39370.1;
		System.out.println("Distance from km to m is" + " " + meters);
		System.out.println("Distance from km to cm is" + " " + cm);
		System.out.println("Distance from km to feet is" + " " + feet);
		System.out.println("Distance from km to inch is" + " " + inch);
	}
}