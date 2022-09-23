import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> sehirler = new ArrayList<String>();
        sehirler.add("Ankara");
        sehirler.add("İstanbul");
        sehirler.add("İzmir");
        sehirler.add("Aydın");

        sehirler.remove(1); //or sehirler.remove("İstanbul") şeklide de yazılabilir.
        Collections.sort(sehirler);
        for (String sehir :sehirler){

            System.out.println(sehir);
        }


    }
}
