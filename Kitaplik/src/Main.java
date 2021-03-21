import java.util.Scanner;

public class Main {
     public static void main(String[] args){
            int rafSayisi = 5;

            Kitaplik kitaplik = new Kitaplik(rafSayisi);

            Kitap k1,k2,k3;

            k1 = new Kitap("Ali Veli Cilveli", "Ahmet Dayi","2112321321",3,5);
            k2 = new Kitap("Ali Veli Cilveli", "Ahmet Dayi","2112321321",2,4);
            k3 = new Kitap("Ali Veli Cilveli", "Ahmet Dayi","2112321321",3,3);


            kitaplik.kitapEkle(k1);
            kitaplik.kitapEkle(k2);
            kitaplik.kitapEkle(k3);

            kitaplik.gosterRaf(3);
            kitaplik.gosterRaf(4);
            kitaplik.gosterRaf(2);
            kitaplik.kitapSil(k2);
            kitaplik.gosterRaf(2);

         Scanner in = new Scanner(System.in);
         int no;
         do{
             System.out.println("Raf numaras� giriniz: ");
             no = in.nextInt();
         }while(!kitaplik.rafKontrol(no));

         kitaplik.gosterRaf(no);

         in.close();

     }

}
