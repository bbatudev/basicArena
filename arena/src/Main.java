public class Main {
    public static void main(String[] args) {

        savascilar bos = new savascilar();
        savascilar oyuncubir = null;
        savascilar oyuncuiki = null;
         bos.savasakimbaslayacak(); // Hangi oyuncunun başlayacağını belirle

        if (bos.gethangisi() == 1) {
            oyuncubir = new sovalye(70, 8, 40, 0, 0);
            oyuncuiki = new muhafiz(90, 5, 50, 0, 0);
        } else {
            oyuncubir = new muhafiz(90, 5, 50, 0, 0);
            oyuncuiki = new sovalye(70, 8, 40, 0, 0);
        }

        while (oyuncubir.getCan() > 0 && oyuncuiki.getCan() > 0) {
            // Sıradaki oyuncu saldırı yapar
            oyuncubir.saldiridavurulanhasar();
            int iletilecekhasar = oyuncubir.alinanhasar;
            oyuncuiki.defanshareketleri(iletilecekhasar);


            if (oyuncuiki.getCan() <= 0) {
                break;
            }
             oyuncuiki.saldiridavurulanhasar();
            int iletilecekhasar2 = oyuncuiki.alinanhasar;
            oyuncubir.defanshareketleri(iletilecekhasar2);

            if (oyuncubir.getCan() <= 0) {
                break;
            }
// şö
        }

        // Oyun bittiğinde kazananı belirle
        if (oyuncubir.getCan() > 0) {
            System.out.println("Şovalye kazandı!");
        } else if (oyuncuiki.getCan() > 0) {
            System.out.println("Muhafız kazandı!");
        } else {
            System.out.println("Berabere!");
        }
    }
}



