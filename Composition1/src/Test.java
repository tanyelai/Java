
public class Test {

    public static void main(String[] args) {

        Resolution resolution = new Resolution(1920,1080);
        Monitor monitor = new Monitor("VS197DE","ASUS","18.5",resolution);

        Case c_case = new Case("Shadow Blade","Shadow","Temperli Cam");

        Mainboard mainboard = new Mainboard("B250-PRO","ASUS", 10,"Windows10");

        Computer computer = new Computer(monitor,c_case,mainboard);

        computer.getC_case().open_comp();
        computer.getMonitor().close_monitor();
        computer.getMainboard().download_op_sys("Windows8");
    }
}
