
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books= new ArrayList<>();
        while(true) {
        System.out.println("Input the name of the book, empty stops:");
        String title =scanner.nextLine();
        if(title.equals("")) {
            break;
        }
        System.out.println("Input the age recommendation:");
        int age= Integer.valueOf(scanner.nextLine());
        Book book= new Book(title, age);
        books.add(book);
        }

        System.out.println(books.size()+" books in total.");
        Comparator<Book> comparator = Comparator
                        .comparing(Book::getRecAge)
                        .thenComparing(Book::getTitle);
        Collections.sort(books,comparator);
        for(Book b:books){
            System.out.println(b);
        }

    }

}
