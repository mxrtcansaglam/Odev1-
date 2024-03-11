
public class Main {
    public static void main(String[] args)
    {
        System.out.println(KdvHesapla(100));

    }
    public static double KdvHesapla(double fiyat)
    {
        double tutar;
        if (fiyat>500){
            tutar=fiyat+(fiyat*8/100);
        }
        else
            tutar=fiyat+(fiyat*20/100);
        return tutar;
    }
}