abstract class Vegetable{
    String colour;
    public abstract String toString();
}

class Potato extends Vegetable{
    Potato(){
        colour = "yellow";
    }
    public String toString(){
        return ("Vegetable: Potato\nColour: "+this.colour);
    }
}
class Brinjal extends Vegetable{
    Brinjal(){
        colour = "purple";
    }
     public String toString(){
        return ("Vegetable: Brinjal\nColour: "+this.colour);
    }
}
class Tomato extends Vegetable{
    Tomato(){
        colour = "red";
    }
    public String toString(){
        return ("Vegetable: Tomato\nColour: "+this.colour);
    }
}

public class a1_Vegetables {
    public static void main(String[] args) {

        Potato obj1 = new Potato();
        Brinjal obj3 = new Brinjal();
        Tomato obj2 = new Tomato();
        String s1 = obj1.toString();
        System.out.println(s1);
        String s2 = obj2.toString();
        System.out.println(s2);
        String s3 = obj3.toString();
        System.out.println(s3);
        


    }
}