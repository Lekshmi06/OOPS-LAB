class Product{
    int pcode;
    String pname;
    double price;

    Product(int pcode, String pname, double price){
        this.pcode = pcode;
        this.pname = pname;
        this.price = price;
    }
}


public class Main {

    public static void main(String[] args) {
        Product p1 = new Product(1, "Product 1", 100.0);
        Product p2 = new Product(2, "Product 2", 200.0);
        Product p3 = new Product(3, "Product 3", 300.0);

        if(p1.price < p2.price && p1.price < p3.price){
            System.out.println("Product 1 has the lowest price");
        }else if(p2.price < p1.price && p2.price < p3.price){
            System.out.println("Product 2 has the lowest price");
        }else{
            System.out.println("Product 3 has the lowest price");
        }
    }
}