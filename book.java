class Book extends LibraryItem {
    private double price;
    public Book(String title, String author, double price) {
        super(title, author);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public void displayDetails() {
        System.out.println("Book Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Price: $" + price);
    }
}