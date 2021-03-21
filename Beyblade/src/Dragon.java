
public class Dragon extends Beyblade {
    private String kutsalCanavar;
    private String gizliYetenek;

    public Dragon(String sahip, int donus_hizi, int saldiri_gucu, String kutsalCanavar, String gizliYetenek) {
        super(sahip, donus_hizi, saldiri_gucu);
        this.kutsalCanavar = kutsalCanavar;
        this.gizliYetenek = gizliYetenek;
    }

    @Override
    public void Saldiri() {
        super.Saldiri();
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kutsal canavar adi: " + kutsalCanavar);
        System.out.println("Gizli yetenek: " + gizliYetenek);
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
        System.out.println(getSahip() + " " + kutsalCanavar + "yı ortaya cikariyor...");
        System.out.println(getSahip() + " " + kutsalCanavar + "nın saldirisi Alev Kilici...");
    }



}
