public class Book02 {
    public String isbn;
    public String title;

    public Book02() {
        
    }
    public Book02(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }
    
    public String toString() {
        return " ISBN: " + this.isbn + " Title: " + this.title;
    }
}
