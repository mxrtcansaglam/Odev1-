//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        System.out.println("ortalamanız"+ortalamaHesapla(85,45,89,85));

    }

    public static double ortalamaHesapla(double turkce,double matematik,double fen,double sosyal)
    {
        double ortalama=(turkce+matematik+fen+sosyal)/4;
        if (ortalama<60){
            System.out.println("kaldınız");
        }
        else
            System.out.println("geçtiniz");
        return ortalama;

    }

}