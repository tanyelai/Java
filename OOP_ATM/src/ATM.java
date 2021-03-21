import java.util.Scanner;

public class ATM {
    public void calistir(Hesap hesap){
        Login login = new Login();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bankamiza Hos geldiniz..");
        System.out.println("*************************");
        System.out.println("Kullanici Girisi: ");
        System.out.println("*************************");

        int girisHakki = 3;

        while(true){
            if (login.login(hesap)){
                System.out.println("Giris basarili..");
                break;
            }
            else{
                System.out.println("Giris Basarisiz");
                girisHakki -= 1;
                System.out.println("Kalan Giris Hakki: " + girisHakki);
            }

            if (girisHakki == 0){
                return;
            }

        }


        System.out.println("********************");
        String islemler = "1) Bakiye goruntuleme: \n" + "2) Para yatirma: \n" + "3) Para Cekme: \n" + "4) Cikis";
        System.out.println(islemler);
        System.out.println("********************");

        while(true){
            System.out.println("Islemi seciniz: ");
            String islem = scanner.nextLine();

            if(islem.equals("4")){
                break;
            }
            else if(islem.equals("1")){
                System.out.println(hesap.getBakiye());
            }
            else if(islem.equals("2")){
                System.out.println("Yatirmak istediginiz tutar: ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraYatir(tutar);
            }
            else if(islem.equals("3")){
                System.out.println("Cekmek istediginiz tutar: ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraCek(tutar);
            }
            else{
                System.out.println("Gecersiz islem...");
            }



        }



    }


}
