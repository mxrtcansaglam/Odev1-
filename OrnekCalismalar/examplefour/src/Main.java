//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        int[] sayilar=new int[]{1,2,3,4,5,6,};
        sayibul(sayilar,5);


    }
    public static boolean  sayibul(int[] dizi,int bul)
    {
        boolean varmi=false;
        for (int sayilar:dizi){
            if (sayilar==bul){
                varmi=true;
                break;
            }
        }
        if (varmi==true){
            System.out.println("sayı mevcutur");
        }
        else System.out.println("sayı yoktur");
        return varmi;
    }
    public static void sehirler1()
    {
        String[] sehirler=new String[]{"ankara","samsun","istanbul"};
        System.out.println(sehirler[1]);
        for (int i=0;i< sehirler.length;i++){
            System.out.println(sehirler[2]);
        }
        for (String sehir: sehirler){
            System.out.println(sehir);
        }
    }
}