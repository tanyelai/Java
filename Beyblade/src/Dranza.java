
public class Dranza extends Beyblade {
    private String kutsalCanavar;

    public Dranza(String sahip, int donus_hizi, int saldiri_gucu, String kutsalCanavar){
        super(sahip,donus_hizi,saldiri_gucu);
        this.kutsalCanavar = kutsalCanavar;
    }


    //Override
    public void Saldiri(){
        super.Saldiri();
    }
    //Override
    public void kutsalCanavarOrtayaCikar(){
        System.out.println(getSahip() + " " + kutsalCanavar + "nu ortaya cikariyor...");
        System.out.println(kutsalCanavar + "nun saldirisi Alev Kilici...");
    }
    //Override
    public void bilgileriGoster(String kutsalCanavar){
        super.bilgileriGoster();
        System.out.println("Kutsal canavar adi: " + kutsalCanavar);
    }

}
