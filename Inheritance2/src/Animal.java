
public class Animal {

    private String name;
    private int weight;
    private int height;
    private int legQ;

    public Animal(String name, int weight, int height, int legQ) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.legQ = legQ;
    }

    public void eat_sth(){
        System.out.println("Animal is eating now");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLegQ() {
        return legQ;
    }

    public void setLegQ(int legQ) {
        this.legQ = legQ;
    }
}
