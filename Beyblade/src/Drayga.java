
public class Drayga extends Beyblade {
    private String kutsalCanavar;


    public Drayga(String sahip, int donus_hizi, int saldiri_gucu, String kutsalCanavar) {
        super(sahip, donus_hizi, saldiri_gucu);
        this.kutsalCanavar = kutsalCanavar;
    }


    //Override

    @Override
    public void Saldiri() {
        super.Saldiri();
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kutsal canavar adi: " + kutsalCanavar);
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
        System.out.println(getSahip() + " " + kutsalCanavar + "ı ortaya cikariyor...");
        System.out.println( kutsalCanavar + "ın saldirisi Kaplan Pencesi...");
    }



}
