public class InheritanceConcepts {

    //Base class for Animals
        private String name;
        private int weight;
        private int body;
        private int size;

    public InheritanceConcepts(String name, int weight, int body, int size){
        this.name = name;
        this.weight = weight;
        this.body = body;
        this.size = size;

    }

    public void eat(){
        System.out.println("From Animals!");

    }

    public void move(int speed){
        System.out.println("Animal is moving at the speed of: " + speed);

    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }
}
