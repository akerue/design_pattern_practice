package iterator;

public class Main {

	public static void main(String[] args) {
		ExtendedBookShelf bookShelf = new ExtendedBookShelf();
		bookShelf.appendBook(new Book("One Peace"));
		bookShelf.appendBook(new Book("Naruto"));
		bookShelf.appendBook(new Book("Design Pattern"));
		bookShelf.appendBook(new Book("zero"));
		Iterator it = bookShelf.iterator();
		while (it.hasNext()) {
			Book book = (Book)it.next();
			System.out.println(book.getName());
		}
	}
}
