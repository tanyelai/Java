
public class Monitor {

    private String model;
    private String supplier;
    private String width;
    private Resolution resolution;

    public Monitor(String model, String supplier, String width, Resolution resolution) {
        this.model = model;
        this.supplier = supplier;
        this.width = width;
        this.resolution = resolution;
    }
    public void close_monitor(){
        System.out.println("Monitor's closing");
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

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }
}
