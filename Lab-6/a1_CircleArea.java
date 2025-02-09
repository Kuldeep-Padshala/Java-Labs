import java.util.Scanner;

class Circle{
	double radius;

	Circle(double radius){
		this.radius=radius;
	}

	double findArea(){
		return Math.PI*radius*radius;
	}
};

public class a1_CircleArea{
	public static void main(String[] args){

		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		Circle c1 = new Circle(radius);
		
		// c1.Circle(sc.nextInt());

		System.out.print("Area is "+c1.findArea());
	}
};
