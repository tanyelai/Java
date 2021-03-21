public class Beyblade {
    private String sahip;
    private int donus_hizi;
    private int saldiri_gucu;


    public Beyblade(String sahip, int donus_hizi, int saldiri_gucu){
        this.sahip = sahip;
        this.donus_hizi = donus_hizi;
        this.saldiri_gucu = saldiri_gucu;
    }

    public String getSahip(){
        return sahip;
    }
    public void setSahip(String sahip){
        this.sahip = sahip;
    }

    public int getDonus_hizi(){
        return donus_hizi;
    }
    public void setDonus_hizi(int donus_hizi){
        this.donus_hizi = donus_hizi;
    }

    public int getSaldiri_gucu(){
        return saldiri_gucu;
    }
    public void setSaldiri_gucu(int saldiri_gucu){
        this.saldiri_gucu = saldiri_gucu;
    }

    public void Saldiri(){
        System.out.println(sahip + " " + saldiri_gucu + " saldiri gucu ve " + donus_hizi + " donus hizi ile saldiriyor...");
    }

    public void kutsalCanavarOrtayaCikar(){
        System.out.println("Bu beyblade'in kutsal canavari yok");
    }

    public void bilgileriGoster(){
        System.out.println("Beyblade sahibi: " + sahip);
        System.out.println("Beyblade hizi: " + donus_hizi);
        System.out.println("Saldiri gucu: " + saldiri_gucu);
    }







}
