import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Beyblade uretme ve kapistirma programina hosgelmissiniz");
        System.out.println("-Cikis icin Q'ya basiniz-");

        while(true){

            System.out.println("Hangi beyblade'i uretmek istersiniz ?: ");

            Scanner input = new Scanner(System.in);
            String islem = input.nextLine();

            if (islem.equals("Q")){
                System.out.println("Programdan cikiliyor");
                break;
            }
            else {
                BeybladeFabrika fabrika = new BeybladeFabrika();
                Beyblade beyblade = fabrika.beybladeUret(islem);

                if ( beyblade == null ){
                    System.out.println("Lutfen gecerli bir beyblade ismi girin");
                }
                else {
                    beyblade.bilgileriGoster();
                    beyblade.kutsalCanavarOrtayaCikar();
                    beyblade.Saldiri();

                }



            }


        }




    }
}
