
public class Draciel extends Beyblade {
    private String kutsalCanavar;


    public Draciel(String sahip, int donus_hizi, int saldiri_gucu, String kutsalCanavar) {
        super(sahip, donus_hizi, saldiri_gucu);
        this.kutsalCanavar = kutsalCanavar;
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
        System.out.println(getSahip() + " " + kutsalCanavar + "yı ortaya cikariyor...");
        System.out.println( kutsalCanavar + "nın savunmasi Kale Savunmasi...");
    }

    @Override
    public void Saldiri() {
        super.Saldiri();
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kutsal canavar adi: " + kutsalCanavar);
    }




}
