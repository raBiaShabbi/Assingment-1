public class prob5{
	static public void main(String []args){
		
		double l = 36.0;
		double b = 36.0;
		double r = 36.0;
		double perimeter = l + l + b + b;
		double areaRectangle = l*b;
		double circleArea = (Math.PI) * Math.pow(r,2);
		double circumference = 2 * (Math.PI) * r;
		System.out.println("Perimeter of rectangle is" + " " + perimeter);
		System.out.println("Area of rectangle is" + " " + areaRectangle);
		System.out.println("Area of circle is" + " " + circleArea);
		System.out.print("Circumference of circle is" + " " + circumference);
	}
}