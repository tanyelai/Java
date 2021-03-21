import java.util.LinkedList;

public class Raf {
    public LinkedList<Kitap> kitap;

    public Raf(){
        this.kitap = new LinkedList<Kitap>();
    }

    public void kitapEkle(Kitap k1){
        this.kitap.add(k1);
    }

    public Kitap kitapSil(int index){
        Kitap kitap;
        kitap = this.kitap.remove(index);
        return kitap;
    }

}
