import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList sayilar= new ArrayList();
        sayilar.add(23.4);
        sayilar.add("Mardin");
        sayilar.add(31);
        sayilar.add(10);

       // sayilar.set(0,"Muğla");

      //  sayilar.remove(1);      //1.index "Mardin" silindi.Yerine sonraki indexteki sayı geçti

        // System.out.println(sayilar.size());
        // System.out.println(sayilar.get(1));

         for(Object i:sayilar){
             System.out.println(i);
         }




    }
}
