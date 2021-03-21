
public class Main {
    public static void main(String[] args){

        Hesap hesap = new Hesap("Toygar Tanyel","toygarttt",100);
        ATM atm = new ATM();
        atm.calistir(hesap);
        System.out.println("Programdan çıkılıyor...");

    }
}
