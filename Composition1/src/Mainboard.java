
public class Mainboard {

    private String model;
    private String supplier;
    private int num_slots;
    private String operation_system;

    public Mainboard(String model, String supplier, int num_slots, String operation_system) {
        this.model = model;
        this.supplier = supplier;
        this.num_slots = num_slots;
        this.operation_system = operation_system;
    }

    public void download_op_sys(String operation_system){
        this.operation_system = operation_system;

        System.out.println("Operating system has downloaded: " + this.operation_system);
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

    public int getNum_slots() {
        return num_slots;
    }

    public void setNum_slots(int num_slots) {
        this.num_slots = num_slots;
    }

    public String getOperation_system() {
        return operation_system;
    }

    public void setOperation_system(String operation_system) {
        this.operation_system = operation_system;
    }


}