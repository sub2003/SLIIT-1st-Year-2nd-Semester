package Q2;

public class Product {
    private int productId;
    private String productName;
    private double price;
    private int quantity;

    public Product() {
        this.price = 0;
        this.productName="";
        this.productId=123;
        this.quantity=0;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
        else{
            System.out.println("Price should always be greater than 0.");
        }
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity>0) {
            this.quantity = quantity;
        }
        else {
            System.out.println("Quantity should not be negative.");
        }
    }

    public double calculateTotal(){
        return price*quantity;
    }
    public void displayDetails(){
        System.out.println("-----Product details-----");
        System.out.println("Product name : "+getProductName());
        System.out.println("Product ID : "+getProductId());
        System.out.println("Product price : "+getPrice());
        System.out.println("Product quantity : "+getQuantity());
        System.out.println();
        System.out.println("The total value of the stock : "+calculateTotal());
    }

}
