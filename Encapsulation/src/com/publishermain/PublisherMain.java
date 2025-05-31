package com.publishermain;
import com.publisher.Publisher;
import com.book.Book;

public class PublisherMain {

	public static void main(String[] args) {
		Publisher publisher=Publisher.getPublisherObject("Amber", "USA", "PUB34556");
		Book book=Book.getBookObject("Power", "Alex", publisher, 560);
		System.out.println(publisher);
		System.out.println();
		System.out.println("---Book Details---");
		System.out.println(book);
	}

}
