
public class Dog extends Animal {

    private int teeth_quantity;

    public Dog(String name,int weight, int height, int legQ, int teeth_quantity){

        super(name, weight, height, legQ);
        this.teeth_quantity = teeth_quantity;

    }

    public void start_move(int speed){
        System.out.println("Dog is moving with " + speed + "km/h");
    }

    public void run(int speed){
        System.out.println("Dog is running....");
        start_move(speed);
    }


    public int getTeeth_quantity() {
        return teeth_quantity;
    }

    public void setTeeth_quantity(int teeth_quantity) {
        this.teeth_quantity = teeth_quantity;
    }
}
