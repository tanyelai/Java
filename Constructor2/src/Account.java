
public class Account {

    private String hesapNo;
    private double bakiye;
    private String isim;
    private String email;
    private String telefonNo;


    public Account(){
        /*this.hesapNo = "Bilgi yok";
        this.bakiye = 0.0;
        this.isim = "Bilgi yok";
        this.email = "Bilgi yok";
        this.telefonNo = "Bilgi yok"; */
        this("Bilgi Yok",0.0,"Bilgi Yok","Bilgi Yok","Bilgi Yok");
    }

    public Account(String isim, String email, String telefonNo){
        /*this.isim = isim;
        this.email = email;
        this.telefonNo = telefonNo;
        */
        this("Bilgi yok", 0.0, isim,email,telefonNo);
    }



    public Account(String hesapNo, double bakiye, String isim, String email, String telefonNo){
        this.hesapNo = hesapNo;
        this.bakiye = bakiye;
        this.isim = isim;
        this.email = email;
        this.telefonNo = telefonNo;

    }


    public void paraYatir(double miktar){
        bakiye += miktar;
        System.out.println("Yeni bakiye: " + bakiye);
    }
    public void paraCek(double miktar){
        if(miktar > 1500){
            System.out.println("Bir günde 1500TL'den fazla para çekemezsiniz.");
        }
        else if(miktar > bakiye){
            System.out.println("Yetersiz bakiye..Güncel bakiye: " + bakiye);
        }
        else{
            bakiye -= miktar;
            System.out.println("Yeni bakiye: " + bakiye);
        }
    }

    ////////////////////////////
    public String getHesapNo() {
        return hesapNo;
    }

    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefonNo() {
        return telefonNo;
    }

    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }
}
