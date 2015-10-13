import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class BookTreeComparable {
    public static void main(String[] args) {
        new BookTreeComparable().go();
    }

    private void go() {
        List<BookComparable> books = Arrays.asList(
                new BookComparable("1 how cats work"),
                new BookComparable("4 Remix your body"),
                new BookComparable("3 Finding Emo"),
                new BookComparable("3 Finding Emo") );

        TreeSet<BookComparable> tree = new TreeSet<>();

        tree.addAll(books);

        tree.forEach((t) -> System.out.println(t.title));
    }

}

