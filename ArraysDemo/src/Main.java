public class Main {

    public static void main(String[] args) {

        String[] ogrenciler = new String[3];
        ogrenciler[0]="Engin";
        ogrenciler[1]="Derin";
        ogrenciler[2]="Salih";
       // Yontem 1
        for(int i =0; i<ogrenciler.length;i++){
            System.out.println(ogrenciler[i]);

        }
        System.out.println("--------------------");
    // Yontem 2 (Sık kullanılan yöntem)
        for(String talebe:ogrenciler){
            System.out.println(talebe);


        }


    }

}
