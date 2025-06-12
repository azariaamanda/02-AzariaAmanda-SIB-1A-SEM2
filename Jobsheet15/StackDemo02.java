import java.util.Stack;
public class StackDemo02 {
    public static void main(String[] args) {

        Book02 book1 = new Book02("1234", "Dasar Pemrograman");
        Book02 book2 = new Book02("7145", "Hafalan Shalat Delisa");
        Book02 book3 = new Book02("3562", "Muhammad Al-Fatih");

        Stack<Book02> books = new Stack<>();
        books.push(book1);
        books.push(book2);
        books.push(book3);

        Book02 temp = books.peek();

        if (temp != null) {
            System.out.println(temp.toString());
        }

        Book02 temp2 = books.pop();

        if (temp2 != null) {
            System.out.println(temp2.toString());
        }

        for (Book02 book : books) {
            System.out.println(book.toString());
        }
        System.out.println("\nAlternatif Tampilan Lainnya");
        System.out.println(books);

        int index = books.search(book2);
        System.out.println("\nIndex book2 dari atas: " + index);
    }
}
