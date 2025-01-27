import java.util.*;

public class LibraryProject {
    public static void main(String[] args) {
        Book book1 = new Book("Effective Java", "Joshua Bloch", 45.99);
        System.out.println("--- Book Details ---");
        book1.displayDetails();
    }
}