package home.work;

public class Library {
public String addBook(String bookTitle) {
	System.out.println("Book added successfully");
	System.out.println( "Book Name :  "+bookTitle);
	return bookTitle;
}
public void issueBook() {
	System.out.println("Book issued successfully");
}
public static void main(String[] args) {
	Library li = new Library();
	li.addBook("Karthick Story");
	li.issueBook();
}
}
