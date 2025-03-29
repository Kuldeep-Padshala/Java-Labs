
interface A{
    int x = 10;
    void methodFrom_A();
}

interface A1 extends A{
    int x1 = 1;
    void methodFrom_A1();
}

interface A2 extends A{
    int x2 = 2;
    void methodFrom_A2();
}

interface A12 extends A1,A2{
    int x12 = 12;
    void methodFrom_A12();
}

class B implements A12{
    public void methodFrom_A(){
        System.out.println("x = "+x);
    }
    public void methodFrom_A1(){
        System.out.println("x1 = "+x1);
    }
    public void methodFrom_A2(){
        System.out.println("x2 = "+x2);
    }
    public void methodFrom_A12(){
        System.out.println("x12 = "+x12);
    }
}

public class a2_Interface {
    public static void main(String[] args) {

        B obj = new B();
        obj.methodFrom_A();
        obj.methodFrom_A1();
        obj.methodFrom_A2();
        obj.methodFrom_A12();

    }
}