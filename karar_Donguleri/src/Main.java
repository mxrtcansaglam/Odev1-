
public class Main {
    public static void main(String[] args)
    {
        int grade = 25;
        if (grade >= 50 && grade<=100) {
            System.out.println("Başarılı geçti");
        } else if (grade >= 40) {
            System.out.println("Bütünleme");
        } else {
            System.out.println("Kaldı");
        }
    }
}