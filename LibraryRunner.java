
/*
 * Activity 3.7.5
 */
import java.util.ArrayList;

public class LibraryRunner {
  public static void main(String[] arg) {
    Library library = new Library();
    ArrayList<Book> childrensBooks = library.getChildrensBooks();

    String authorToFind = "L. Frank Baum";

    System.out.println("Books im finding");

    for (Book b : childrensBooks) {
      if (b.getAuthor().equals(authorToFind)) {
        System.out.print(b.getTitle() + ", ");
      }
    }

    System.out.println(" ");

    String bookToFind = "Sky Island";
    double minimumRating = 0.0;

    for (Book b : childrensBooks) {
      if (b.getTitle().equals(bookToFind)) {
        minimumRating = b.getRating();
      }
    }

    System.out.println(minimumRating);

    for (Book b : childrensBooks) {
      if (b.getRating() == minimumRating) {
        System.out.print(b.getTitle() + ", ");
      }
    }

    // change one of for loops to while
    System.out.println(" ");

    int i = 0;
    while (i < childrensBooks.size()) {
      if (childrensBooks.get(i).getRating() == minimumRating) {
        System.out.print(childrensBooks.get(i).getTitle() + ", ");
      }
      i++;
    }
  }
}