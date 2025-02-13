class ThisKeyword {

    private
    int inst;
    static int stat;

    public ThisKeyword(int inst, int stat) {
        this.inst = inst;
        // this.stat = stat;          //error
        ThisKeyword.stat = stat;
    }

    public void display() {
        System.out.println("Instance Variable: " + this.inst);
        
        // System.out.println("Static Variable: " + this.stat); //Error

        System.out.println("Static Variable" + stat);
    }
}


public class c7_This {
    public static void main(String[] args) {

        ThisKeyword obj1 = new ThisKeyword(10,20);
        obj1.display();
    }
}
