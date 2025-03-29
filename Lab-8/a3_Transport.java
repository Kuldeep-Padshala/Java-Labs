interface Transport{
    void deliver();
}

abstract class Animal{
    
}

class Tiger extends Animal{

}
class Camel extends Animal implements Transport {
    public void deliver(){
        System.out.println("Delivery done by Camel");
    }
}
class Deer extends Animal{
    
}
class Donkey extends Animal implements Transport{
    public void deliver(){
        System.out.println("Delivery done by Donkey");
    }
}

public class a3_Transport {
    public static void main(String[] args) {

        Animal[] arr = new Animal[4];
        arr[0] = new Tiger();
        arr[1] = new Camel();
        arr[2] = new Deer();
        arr[3] = new Donkey();

        for(int i=0;i<4;i++){

            if(arr[i] instanceof Transport){
                Transport t = (Transport)arr[i];
                t.deliver();
            }
            else{
                System.out.println("Animal cannot deliver");
            }
        }

    }
}