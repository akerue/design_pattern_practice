package iterator;

import java.util.ArrayList;

public class ExtendedBookShelf extends BookShelf implements Aggregate {
	private ArrayList<Book> books;

	public ExtendedBookShelf() {
		this.books = new ArrayList<Book>();
	}
	public Book getBookAt(int index) {
		return books.get(index);
	}
	public void appendBook(Book book) {
		this.books.add(book);
	}
	public int getLength() {
		return this.books.size();
	}
	@Override
	public Iterator iterator() {
		return new BookShelfIterator(this);
	}
}
