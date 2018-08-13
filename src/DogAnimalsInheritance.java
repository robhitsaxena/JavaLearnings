public class DogAnimalsInheritance extends InheritanceConcepts {

    private int eyes;
    private int legs;
    private int tail;

    //Constructor
    public DogAnimalsInheritance(String name, int weight, /*int body,*/ int size,
                                 int eyes, int legs, int tail) {
        super(name, weight, 1, size);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
    }

    private void chew() {
        System.out.println("Dog.chew called");
    }

    //Method Override
    @Override
    public void eat() {
        System.out.println("Dog.eat called");
        chew();
        super.eat();
    }

    public void walk(){
        System.out.println("Dog walk");
        move(5);
    }

    public void run(){
        System.out.println("Dog run");
        move(10);
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog move is called");
        super.move(speed);
    }

    public int getEyes() {
        return eyes;
    }

    public int getLegs() {
        return legs;
    }

    public int getTail() {
        return tail;
    }
}


