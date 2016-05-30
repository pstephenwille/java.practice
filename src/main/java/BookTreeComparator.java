import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BookTreeComparator {
    public static void main(String[] args) {
        new BookTreeComparator().go();
        Pattern p = Pattern.compile("\\d");
        Matcher m = p.matcher("abc123");
        Boolean b = m.matches();
        System.out.println();
        String str = "str";

    }

    private void go() {
        List<BookComparator> books = Arrays.asList(
                new BookComparator("4 Remix your body"),
                new BookComparator("1 how cats work"),
                new BookComparator("3 Finding Emo"),
                new BookComparator("3 Finding Emo") );

        TreeSet<BookComparator> tree = new TreeSet<>(new BookCompare());

        tree.addAll(books);

        tree.forEach((t) -> System.out.println(t.title));
    }


    class BookCompare implements Comparator<BookComparator> {
        @Override
        public int compare(BookComparator o1, BookComparator o2) {
            System.out.println("comarator");
            return o1.title.compareTo(o2.title);
        }
    }
}


