package bookstore;
 
public class Books {

    int Books_id;
    String Books_name;
    String Books_author;
    double Price;
    int Sales = 0;
    int Inventory;

    public Books() {
    }

    public Books(int books_id, String books_name, String books_author, double price, int inventory) {
        Books_id = books_id;
        Books_name = books_name;
        Books_author = books_author;
        Price = price;
        Inventory = inventory;
    }
    public void showBooks()
    {
        System.out.println(Books_id);
        System.out.println(Books_name);
        System.out.println(Books_author);
        System.out.println(Price);
        System.out.println(Sales);
        System.out.println(Inventory);
    }

    public int getBooks_id() {
        return Books_id;
    }

    public void setBooks_id(int books_id) {
        Books_id = books_id;
    }

    public String getBooks_name() {
        return Books_name;
    }

    public void setBooks_name(String books_name) {
        Books_name = books_name;
    }

    public String getBooks_author() {
        return Books_author;
    }

    public void setBooks_author(String books_author) {
        Books_author = books_author;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public int getSales() {
        return Sales;
    }

    public void setSales(int sales) {
        Sales = sales;
    }

    public int getInventory() {
        return Inventory;
    }

    public void setInventory(int inventory) {
        Inventory = inventory;
    }
}
