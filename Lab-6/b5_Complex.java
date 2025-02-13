import java.util.Scanner;

class Complex {

    private
    double real;
    double img;

    public Complex(double real, double img) {
        this.real = real;
        this.img = img;
    }

    void getComplex(){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Real Part: ");
        this.real = sc.nextDouble();
        System.out.print("Enter img Part: ");
        this.img = sc.nextDouble();
    }
    

    public Complex add(Complex c2) {
        Complex temp = new Complex(this.real + c2.real, this.img + c2.img);
        return temp;
    }

    // Display method
    public void display() {
        System.out.print("Sum: ");
        System.out.println(this.real + " + " + this.img + "i");
    }
}


public class b5_Complex{
    public static void main(String[] args) {

        System.out.println("For first complex number");
        Complex c1 = new Complex(0,0);
        c1.getComplex();
        System.out.println("For second complex number");
        Complex c2 = new Complex(0,0);  // 1 + 2i
        c2.getComplex();
        
        Complex sum = c1.add(c2);
        
        sum.display();
    }
};