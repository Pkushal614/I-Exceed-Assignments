class Book {
    public String title;             
    protected String author;         
    private int pages;               
    String genre;                   

    public Book(String title, String author, int pages, String genre) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.genre = genre;
    }

    public void showDetails() {
        System.out.println(title + " by " + author + " | Pages: " + pages + " | Genre: " + genre);
    }
}

public class Library {
    public static void main(String[] args) {
        Book b = new Book("IExceed", "Kushal Kumar", 100, "Technology");
        b.showDetails();
        System.out.println("Accessing public: " + b.title);
        System.out.println("Accessing default: " + b.genre);
        System.out.println("Accessing protected: " + b.author);
        //System.out.println("Accessing private: " + b.pages);
    }
}
