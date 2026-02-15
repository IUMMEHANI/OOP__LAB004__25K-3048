package Task03;

public class Mobile {
    String brand;
    String model;
    int price;
    Mobile(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    Mobile(String brand, String model) {
        this(brand, model, 30000);
    }
    Mobile() {
        this("Samsung", "S10", 25000);
    }
    public void display() {
        System.out.println("Brand: " + brand + " Model: " + model + " Price: " + price);
    }
}
class MAIN {
    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile("Apple", "iPhone 13");
        Mobile m3 = new Mobile("Huawei", "P50", 45000);
        m1.display();
        m2.display();
        m3.display();
    }
}