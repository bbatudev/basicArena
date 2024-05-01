import java.util.Random;

public class muhafiz extends savascilar{
int hasaryaz;
    public muhafiz(int can, int tabanhasar, int tabanzirh, int tabancancalma, int tabankritikvurusdegeri) {
        super(can, tabanhasar, tabanzirh, tabancancalma, tabankritikvurusdegeri);
    }
        void saldiridavurulanhasar(){
            Random rastgele = new Random();
            int rastgelesayi = rastgele.nextInt(100)+1;
            if(rastgelesayi >=1 && rastgelesayi <=55){
                hasar = tabanhasar*1;
                System.out.println("MUHAFIZ ::::Normal saldiri yapildi! " +hasar+ " vuruldu.");
                setalinanhasar();

            }

            if(rastgelesayi>55 && rastgelesayi <=85){
                hasar = tabanhasar*2;
                System.out.println("MUHAFIZ ::::Güclü saldiri yapildi! " +hasar+ " vuruldu.");
                setalinanhasar();

            }
            if(rastgelesayi >85 && rastgelesayi <=100){
                hasar = tabanhasar*3;
                System.out.println("MUHAFIZ ::::Ulti saldiri yapildi! " +hasar+ " vuruldu.");
                setalinanhasar();

            }

        }

    void defanshareketleri(int degisikhasar){
        Random rastgele2 = new Random();
        int rastgelesayimiz = rastgele2.nextInt(100)+1;
        if(rastgelesayimiz<=60){
            degisikhasar = degisikhasar-2;
            System.out.println("MUHAFIZ ::::Bir savurma hamlesi " + degisikhasar + " Bu değeri hasar olarak aldınız");
            can = can-degisikhasar;
            System.out.println("Canınız bu kadar kaldı = " + can);

        }

        if(rastgelesayimiz>60 && rastgelesayimiz <=80){
            degisikhasar = 0;
            System.out.println("MUHAFIZ ::::Kaçış hamlesini başarıyla tamamladınız, hiç hasar almadınız. ");
            can = can-degisikhasar;
            System.out.println("Canınız bu kadar kaldı = " + can);


        }

        if(rastgelesayimiz>80 && rastgelesayimiz <=100){
            System.out.println("MUHAFIZ ::::Maalesef, tüm hasarı aldınız. " + degisikhasar +  " Bu değeri ");
            can = can-degisikhasar;
            System.out.println("Canınız bu kadar kaldı = " + can);

        }
    }

    void hasarhesabi(){
        can = can-getdegisikhasar();
        System.out.println("Canınız bu kadar kaldı = " + can);
        System.out.println("Canınız bu kadar kaldı = " + can);

    }
}