import java.util.Random;

public class abstractClasses{

    public static void main(String[] args) {

        Random rastgele = new Random();
        int sayi, sayac;

        for(int i = 0; i < 30; i++)
        {
            sayi = 1 + rastgele.nextInt(100);
            sayac = 0;
            for(int j = 2; j < sayi; j++)
            {
                if(sayi % j == 0) {
                    sayac++;
                }
            }
            if(sayac == 0) {
                System.out.println("Asal sayi = " + sayi);
            }
            if(sayi % 2 == 0) {
                System.out.println("Çift sayılar = " + sayi);
            }
        }
    }
}