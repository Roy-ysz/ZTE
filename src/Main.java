import java.util.ArrayList;
import java.util.List;

/*
    老师抱歉，因为课题压力较重，还没来得及学习单元测试的内容，对这部分还不了解，所以没有写单元测试的相关代码，希望老师谅解
 */
public class Main {

    public static void main(String[] args) {
        float bookCost=0f;
        float totalCost=0f;
        List<Book> books=new ArrayList<Book>();
        Book book1 = new Book("aaa", 12.5f, "Normal", 1);
        Book book2 = new Book("bbb", 24f, "NewBook", 3);
        Book book3 = new Book("ccc", 30f, "UnSaleBook", 2);
        Book book4 = new Book("bbb", 12.5f, "Test", 3);
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        for (int i = 0; i <books.size() ; i++) {
            bookCost=calculateBookPrice(books.get(i));
            if(bookCost==0)
                continue;
            System.out.printf("BookName:%s  BookPrice:%s  BookDiscount:%s  BookNum:%d  BookCost:%s%n", books.get(i).getBookName(), books.get(i).getBookPrice(), books.get(i).getBookDiscount(), books.get(i).getBookNumber(), bookCost);
            totalCost+=bookCost;
        }
        System.out.printf("totalCost:%s%n", totalCost);
    }

    public static float calculateBookPrice(Book book) {
        if(book.getBookSort()=="NewBook"){
                book.setBookDiscount ((float) (1.2 * book.getBookPrice()));
            }
            else if(book.getBookSort()=="Normal"){
                book.setBookDiscount(book.getBookPrice());
            }
            else if(book.getBookSort()=="UnSaleBook"){
                book.setBookDiscount ((float) (0.6 * book.getBookPrice()));
            }
            else
                book.setBookDiscount(0f);
        return (book.getBookDiscount() * book.getBookNumber());
    }
}
