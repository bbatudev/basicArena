import java.util.Random;

public class sovalye extends savascilar{
int hasaryaz;
    public sovalye(int can, int tabanhasar, int tabanzirh, int tabancancalma, int tabankritikvurusdegeri) {
        super(can, tabanhasar, tabanzirh, tabancancalma, tabankritikvurusdegeri);
    }
        void saldiridavurulanhasar(){
            Random rastgele = new Random();
            int rastgelesayi = rastgele.nextInt(100)+1;

            if(rastgelesayi >=1 && rastgelesayi <=55){
                //normal saldırı gerçekleşir
                hasar = tabanhasar*2;
                System.out.println("ŞÖVALYE :::: Normal saldiri yapildi! " +hasar+ " vuruldu.");
                setalinanhasar();

            }
            if(rastgelesayi>55 && rastgelesayi <=85){
                //güçlü saldırı gerçekleşir
                hasar = tabanhasar*3;
                System.out.println("ŞÖVALYE :::: Güclü saldiri yapildi! " +hasar+ " vuruldu.");
                setalinanhasar();

            }
            if(rastgelesayi >85 && rastgelesayi <=100){
                //ulti saldırı gerçekleşir
                hasar = tabanhasar*4;
                System.out.println("ŞÖVALYE :::: Ulti saldiri yapildi! " +hasar+ " vuruldu.");
                setalinanhasar();

            }
        }

        void defanshareketleri(int degisikhasar){
            Random rastgele2 = new Random();
            int rastgelesayimiz = rastgele2.nextInt(100)+1;

            if(rastgelesayimiz<=50){
                degisikhasar = degisikhasar-2;
                System.out.println("ŞÖVALYE :::: Bir savurma hamlesi " + degisikhasar + " Bu değeri hasar olarak aldınız");
                can = can-degisikhasar;
                System.out.println("Canınız bu kadar kaldı = " + can);

            }
            if(rastgelesayimiz>50 && rastgelesayimiz <=70){
                degisikhasar = 0;
                System.out.println("ŞÖVALYE :::: Kaçış hamlesini başarıyla tamamladınız, hiç hasar almadınız. ");

                can = can-degisikhasar;
                System.out.println("Canınız bu kadar kaldı = " + can);



            }
            if(rastgelesayimiz>70 && rastgelesayimiz <=100){
                System.out.println("ŞÖVALYE :::: Maalesef, tüm hasarı aldınız." + degisikhasar +  " Bu değeri ");

                can = can-degisikhasar;
                System.out.println("Canınız bu kadar kaldı = " + can);


            }
    }

    void hasarhesabi(){
        can = can-getdegisikhasar();
        System.out.println("Canınız bu kadar kaldı = " + can);
    }

}




