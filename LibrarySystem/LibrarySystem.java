class LibraryItem {
    private String title;
    private String author;
    private int id;

    public LibraryItem(String title, String author, int id) {
        this.title = title;
        this.author = author;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getId() {
        return id;
    }

    public void getInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ID: " + id);
    }
}

class Book extends LibraryItem {

    public Book(String title, String author, int id) {
        super(title, author, id);
    }

    @Override
    public void getInfo() {
        System.out.println("=== Book ===");
        super.getInfo();
    }
}

class Magazine extends LibraryItem {

    private int issueNumber;
    private String frequency;

    public Magazine(String title, String author, int id, int issueNumber, String frequency) {
        super(title, author, id);
        this.issueNumber = issueNumber;
        this.frequency = frequency;
    }

    @Override
    public void getInfo() {
        System.out.println("=== Magazine ===");
        super.getInfo();
        System.out.println("Issue Number: " + issueNumber);
        System.out.println("Frequency: " + frequency);
    }
}

class Newspaper extends LibraryItem {

    private String edition;

    public Newspaper(String title, String author, int id, String edition) {
        super(title, author, id);
        this.edition = edition;
    }

    @Override
    public void getInfo() {
        System.out.println("=== Newspaper ===");
        super.getInfo();
        System.out.println("Edition: " + edition);
    }
}

public class LibrarySystem {
    public static void main(String[] args) {

        LibraryItem[] items = {
                new Book("Harry Potter", "J.K. Rowling", 101),
                new Magazine("National Geographic", "Various", 102, 45, "Monthly"),
                new Newspaper("The Times", "Editorial Team", 103, "Morning Edition")
        };

        for (LibraryItem item : items) {
            item.getInfo();
            System.out.println();
        }
    }
}