interface Playable{
    void play();
}

class Football implements Playable{
    public void play(){
        System.out.println("Playing Football");
    }
}

class Volleyball implements Playable{
    public void play(){
        System.out.println("Playing Volleyball");
    }
}
class Basketball implements Playable{
    public void play(){
        System.out.println("Playing Basketball");
    }
}

public class a6_Playing {
    public static void main(String[] args) {
        Playable p1 = new Football();
        Playable p2 = new Volleyball();
        Playable p3 = new Basketball();

        p1.play();
        p2.play();
        p3.play();
    }
}