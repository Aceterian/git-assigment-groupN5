public class main {
    public static void main(String[] args) {
        Bird bird1 = new Bird();
        bird1.fly();

        bird1.color = "Black";
        bird1.type = "Crow";
    }

}

class Bird{

    String color, type;


    public Bird(){
        System.out.println("check");
    }

    public void fly() {
        System.out.println("The bird is flying!");
    }

}