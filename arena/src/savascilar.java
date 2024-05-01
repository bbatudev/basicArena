import java.util.Random;
import java.util.Scanner;

public class savascilar {

    //savascilar sınıfında tüm savascılarin sahi olduğu ozellikleri yazmamız lazım
    // her savaşcının canı mutlaka olmalıdır. kritik vuruş ve can çalma ihtimalleri de olmalıdır.
    // taban vuruş gücü değeri gibi hamleler de olabilir ancak bunları koymicam onu nyerine
    // her savaşçının mesela bir saldırı gücüne sahip olmaısnı koyabiliriz
    protected int can;
    protected int tabanhasar;
    protected int tabanzirh;
    protected int tabancancalma;
    protected int tabankritikvurusdegeri;
    protected int rastgelesayi;
    protected int hasar;
    protected int alinanhasar;

    protected int hangisi = 0;
    protected int degisikhasar;
    protected int verilenhasar;

    Scanner scan = new Scanner(System.in);

public savascilar(){

}
    public savascilar(int can,int tabanhasar, int tabanzirh,int tabancancalma,int tabankritikvurusdegeri){
        // bu constructor ile bir baslangıc degerleri olusturulabilir bunu karakterimiz için yapcaz
        this.can = can;
        this.tabanhasar = tabanhasar;
        this.tabanzirh = tabanzirh;
        this.tabancancalma = tabancancalma;
        this.tabankritikvurusdegeri = tabankritikvurusdegeri;
    }
    void savasakimbaslayacak(){ //burada 1 ve 2 bastırmaya çalışıcaz olmadığı sürece ekran tekrardan gelecek

        System.out.println("Savasa kimin baslayacaginiz secebilirsin.");
        System.out.println("Birinci karakter sovalye icin 1 ikinci karakter muhafiz icin 2 tusuna basin");
        hangisi = scan.nextInt();
        while (hangisi != 1 && hangisi != 2) {

            System.out.println("Gecersiz bir sayi girdiniz, bu halde oyun baslamayacak lütfen yalnızca 1 veya 2 rakamlarından birine basiniz.");
            hangisi = scan.nextInt();
        }
         if(hangisi ==1){
            System.out.println("Savasa sovalye baslayacak!");

        }
      else if(hangisi ==2){
            System.out.println("Savasa muhafiz baslayacak!");
        }


    }

 int gethangisi(){
    return hangisi;
 }
 int getCan() {
        return can;
    }

    void hasarhesabi(){
        can = can-alinanhasar;
        System.out.println("Canınız bu kadar kaldı = " + can);
    }

    public int getdegisikhasar(){
        return verilenhasar;

    }
    public void setdegisikhasar(){
        verilenhasar = degisikhasar;

    }
    public void setalinanhasar(){
        alinanhasar = hasar;
    }
   public int  getalinanhasar(){
        return alinanhasar;
    }



    void saldiridavurulanhasar(){
        //bu bizim temel saldırı hareketimiz olacak. bu hareket sırayla yapıldığı için herkeste var olmalıdır.
         //şöyle bir olay yapalım. 3 tür saldırımız olsun %55 normal %30 güçlü %15 ulti saldırsısı olsun


Random rastgele = new Random();
int rastgelesayi = rastgele.nextInt(100)+1;
if(rastgelesayi >=1 && rastgelesayi <=55){
    //normal saldırı gerçekleşir
    hasar = tabanhasar;
    System.out.println("Normal saldiri yapildi! "+hasar+" vuruldu.");
}
    if(rastgelesayi>55 && rastgelesayi <=85){
        //güçlü saldırı gerçekleşir
        hasar = tabanhasar*2;
        System.out.println("Güclü saldiri yapildi! "+hasar+" vuruldu.");
    }
        if(rastgelesayi >85 && rastgelesayi <=100){
            //ulti saldırı gerçekleşir
            hasar = tabanhasar*3;
            System.out.println("Ulti saldiri yapildi! "+hasar+" vuruldu.");
        }
    }

     void defanshareketleri(int degisikhasar){
    Random rastgele2 = new Random();
    int rastgelesayimiz = rastgele2.nextInt(100)+1;
    if(rastgelesayimiz<=50){

    }
   if(rastgelesayimiz>50 && rastgelesayimiz <=70){
       // Normal dodge: Tüm hasardan kaçılır
       hasar = 0;
    }
    else {
            // Tüm hasarı almak
            System.out.println("Maalesef, tüm hasarı aldınız.");
        }
    }

}


