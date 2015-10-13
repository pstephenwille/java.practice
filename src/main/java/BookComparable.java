class BookComparable implements Comparable<BookComparable>{
    String title;

    public BookComparable(String title) {
        this.title = title;
    }

    public boolean equals(BookComparable aBook) {
//        BookComparable b  = (BookComparable) aBook;
        return (this.title.equals(aBook.title));
    }

    public int hashCode() {
        return this.title.hashCode();
    }


    @Override /* comparable */
    public int compareTo(BookComparable o) {
        System.out.println("comparable");
        return this.title.compareTo(o.title);
    }

//    @Override /* comparator */
//    public int compare(BookComparable o1, BookComparator o2) {
//        return o1.title.compareTo(o2.title);
//    }


}


