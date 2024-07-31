public class prob1{
	static public void main (String []args){
		double basicSalary = 105000;
		double grossSalary;
	    double houseAllowance = basicSalary * 0.20;
		double dearnessAllowance = basicSalary * 0.40;
		grossSalary = basicSalary + houseAllowance + dearnessAllowance;
		System.out.println(grossSalary);
	}
}