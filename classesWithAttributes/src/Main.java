public class Main {

    public static void main(String[] args) {
        IbneFikret product = new IbneFikret();
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Asus Laptop");
        product.setPrice(5000.0);
        product.setStockAmount(3);


        ProductManager productManager= new ProductManager();
        productManager.Add(product);

        System.out.println(product.getKod());
    }
}
