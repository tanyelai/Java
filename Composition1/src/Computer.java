
public class Computer {

    private Monitor monitor;
    private Case c_case;
    private Mainboard mainboard;

    public Computer(Monitor monitor, Case c_case, Mainboard mainboard) {
        this.monitor = monitor;
        this.c_case = c_case;
        this.mainboard = mainboard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Case getC_case() {
        return c_case;
    }

    public void setC_case(Case c_case) {
        this.c_case = c_case;
    }

    public Mainboard getMainboard() {
        return mainboard;
    }

    public void setMainboard(Mainboard mainboard) {
        this.mainboard = mainboard;
    }

}
