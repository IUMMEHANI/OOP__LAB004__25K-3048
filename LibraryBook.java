package Task01;

public class LibraryBook {
    String title;
    int price;
    LibraryBook() {
        this.title = "Unknown";
        this.price = 0;
    }
    LibraryBook(String title) {
        this.title = title;
        this.price = 500;
    }
    LibraryBook(String title, int price) {
        this.title = title;
        this.price = price;
    }
    public void display() {
        System.out.println("Book Title: " + title + " Price: " + price);
    }
}
class MAIN {
    public static void main(String[] args) {
        LibraryBook b1 = new LibraryBook();
        LibraryBook b2 = new LibraryBook("Harry Potter");
        LibraryBook b3 = new LibraryBook("Rich Dad Poor Dad", 800);
        b1.display();
        b2.display();
        b3.display();
    }
}
