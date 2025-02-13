// import java.util.Scanner;

class ObjCount {

    private
    static int count = 0;

    public ObjCount() {
        count++;
    }

    // Static method to get the count of objects created
    public static int getCount() {
        return count;
    }
}

public class b6_CountNew {
    public static void main(String[] args) {
        // // @SuppressWarnings("unused")
        // ObjCount obj1 = new ObjCount();
        // // @SuppressWarnings("unused")
        // ObjCount obj2 = new ObjCount();
        // // @SuppressWarnings("unused")
        // ObjCount obj3 = new ObjCount();
        
        System.out.println("Number of objects created: " + ObjCount.getCount());
    }
}