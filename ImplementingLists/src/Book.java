public class Book {

    public String t;
    public String a;
    public double p;

    public Book(String title, String author, double price) {
        t = title;
        a = author;
        p = price;
    }

    @Override
    public String toString() {
        return "Book name: " + t+ "Author: " + a +" Price: "+ p;
    }

}
