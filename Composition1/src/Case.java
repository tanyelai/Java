
public class Case {

    private String model;
    private String supplier;
    private String material;

    public Case(String model, String supplier, String material) {
        this.model = model;
        this.supplier = supplier;
        this.material = material;
    }
    public void open_comp(){
        System.out.println("Computer is opening");
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
