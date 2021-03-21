
public class BeybladeFabrika{

    public Beyblade beybladeUret(String beybladeCinsi) {

        if (beybladeCinsi.equals("Dragon")){
            return new Dragon("Takao", 800, 500, "Mavi Ejderha","Yargi Atesi");
        }
        else if (beybladeCinsi.equals("Draciel")){
            return new Draciel("Max", 200, 1000, "Kara Kaplumbaga");
        }
        else if (beybladeCinsi.equals("Drayga")){
            return new Drayga("Rei", 700, 500, "Beyaz Kaplan");
        }
        else if (beybladeCinsi.equals("Dranza")){
            return new Dranza("Kai", 1000, 450, "Kirmizi Anka Kusu");
        }
        else {
            return null;
        }

    }




}
