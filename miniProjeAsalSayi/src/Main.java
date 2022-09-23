public class Main {

    public static void main(String[] args) {
        int number = 1;
        int remainder;
if(number==1){
    System.out.println("Sayi Asal Degildir");
    return;
}
        if (number<1){
    System.out.println("Gecersiz Sayi");
}
        boolean isPrime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }

        }
if (isPrime==true){
    System.out.println("Sayi Asaldir");
}else {
    System.out.println("Sayi Asal Degildir");
}

    }


}

