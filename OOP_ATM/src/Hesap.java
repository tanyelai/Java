
public class Hesap {

    private String kullaniciAdi;
    private String parola;
    private int bakiye;

    public Hesap(String kullaniciAdi, String parola, int bakiye) {
        this.kullaniciAdi = kullaniciAdi;
        this.parola = parola;
        this.bakiye = bakiye;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public String getParola() {
        return parola;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }

    public void paraYatir(int tutar){
        bakiye += tutar;
        System.out.println("Yeni bakiye: " + bakiye);
    }

    public void paraCek(int tutar){
        if (tutar > bakiye){
            System.out.println("Yeterli bakiyeniz yok");
        }
        else{
            bakiye -= tutar;
            System.out.println("Yeni bakiyeniz: " + bakiye);
        }

    }


}
