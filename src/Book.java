public class Book {
    private String bookName;
    private float bookPrice;
    private String bookSort;
    private int bookNumber;
    private float bookDiscount;

    public Book(String bookName, float bookPrice, String bookSort, int bookNumber){
        this.bookName=bookName;
        this.bookSort=bookSort;
        this.bookPrice=bookPrice;
        this.bookNumber=bookNumber;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookPrice(float bookPrice) {
        this.bookPrice = bookPrice;
    }

    public float getBookPrice() {
        return bookPrice;
    }

    public void setBookSort(String bookSort) {
        this.bookSort = bookSort;
    }

    public String getBookSort() {
        return bookSort;
    }

    public void setBookNumber(int bookNumber) {
        this.bookNumber = bookNumber;
    }

    public int getBookNumber() {
        return bookNumber;
    }

    public void setBookDiscount(float bookDiscount) {
        this.bookDiscount = bookDiscount;
    }

    public float getBookDiscount() {
        return bookDiscount;
    }
}
