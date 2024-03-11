
public class Main {
    public static void main(String[] args)
    {
        mesajVer("mertcan");
        topla(8.5, 5);
        ikiSayininYuzdesi(10,25);



    }
    public static void mesajVer(String isim){
        System.out.println("merhaba"+" "+isim);
    }
    public static void hesapla(){
        System.out.println("hesaplandı");
    }
    public  static double topla(double a ,double b){

        return (a+b);

    }

    public static double ikiSayininYuzdesi(double a,double b){
        double toplam=topla(a,b);
        double sonuc=toplam*10/100;
        return sonuc;

    }

}