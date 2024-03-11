//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        System.out.println(ciftSayiBul(3));

    }
    public static int ciftSayiBul(int sayi)
    {
        int sayac=0;
        for (int i=1;i<sayi;i++){
           if (i%2==0){


                sayac++;

           }

        }
        return sayac;
    }
}