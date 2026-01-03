package methods;

public class CircleArea {
	
	public static void circleArea() {
		int r=7;
		double area=3.14*r*r;
		System.out.println("Area of Cirle is : "+area);
	}
	
	public static void triangleArea() {
        double a = 7;
        double b = 8;
        double c = 9;
        double s = (a+b+c)/2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));

        System.out.printf("Area of Triangle is : %.2f\n", area);
        
    }
	
	
	public static void squareArea() {
		int side=10;
		double area=4*side;
		System.out.println("Area of Square is : "+area);
	}
	
public static void main(String args[]) {
	circleArea();
	triangleArea();
	squareArea();
}
}
