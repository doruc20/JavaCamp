public class IbneFikret {

 public IbneFikret(){
  System.out.println("Yapıcı block calıştı");
 }




 //attribute | field

 private int id;
  private String name;
  private String description;
  private Double price;
  private int StockAmount;
 private String kod;


 //getter
 public int getId() {
  return id;
 }

 //setter
 public void setId(int id) {
  this.id = id;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public String getDescription() {
  return description;
 }

 public void setDescription(String description) {
  this.description = description;
 }

 public Double getPrice() {
  return price;
 }

 public void setPrice(Double price) {
  this.price = price;
 }

 public int getStockAmount() {
  return StockAmount;
 }

 public void setStockAmount(int stockAmount) {
  StockAmount = stockAmount;
 }

 public String getKod() {
  return this.name.substring(0,1) + id;
 }

}
