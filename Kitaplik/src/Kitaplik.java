
public class Kitaplik {

    Raf raf[];

    public Kitaplik(int rafSayi){
        raf = new Raf[rafSayi];
        for (int i = 0; i < raf.length; i++){
            raf[i] = new Raf();
        }
    }

    public void kitapEkle(Kitap k){
        raf[k.getRafNo()].kitapEkle(k);
    }

    public Kitap kitapSil(Kitap k2){
        return raf[k2.getRafNo()].kitapSil(raf[k2.getRafNo()].kitap.indexOf(k2));
    }

    public Kitap kitapAra(String kitapAdi ){
        for (int i=0; i< raf.length; i++){
            for (Kitap kitap:raf[i].kitap) {
                if(kitap.getKitapAd().compareTo(kitapAdi) == 0);
                    return kitap;
            }
        }
        return null;

    }

    public boolean rafKontrol(int rafNo ){
        if (raf[rafNo] == null)
            return false;
        else
            return true;
    }

    public void gosterRaf(int rafNo){
        System.out.println(rafNo + ". Raftaki Kitaplar...\nKitap Ad�\t\t\tYazar\t\tISBN");
        for(int i = 0; i < raf[rafNo].kitap.size(); i++){
            System.out.println(raf[rafNo].kitap.get(i).getKitapAd() +
                    "\t" + raf[rafNo].kitap.get(i).getYazar() + "\t" +
                    raf[rafNo].kitap.get(i).getISBN());
        }
        System.out.println("\n\n");


    }



}
