interface Shape {
    void getArea();
}

class Rectangle implements Shape{
    public void getArea() {
        System.out.println("Area of Rectangle: Length * Breadth");
    }
}

class Circle implements Shape{
    public void getArea() {
        System.out.println("Area of Circle: Pi * Radius * Radius");
    }
}

class Triangle implements Shape{
    public void getArea() {
        System.out.println("Area of TRiangle: 1/2 * Base * Height");
    }
}

public class a5_Shapes {
    
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
    Circle c = new Circle();
    Triangle t= new Triangle();
    
    r.getArea();
    c.getArea();
    t.getArea();
    }

}
