package com.labs.bsu.starter;

import com.labs.bsu.action.BookAction;
import com.labs.bsu.creator.BookCreator;
import com.labs.bsu.entity.Book;

import java.util.List;

public class Starter {

    public static void main(String[] args) {
        List<Book> books = BookCreator.createBookList();
        List<Book> sortedBooksByAuthor = BookAction.getBooksByAuthor(books, "Rand");
        System.out.println(sortedBooksByAuthor);
        List<Book> sortedBooksByPublishing = BookAction.getBooksByPublishing(books, "Daily Publish");
        System.out.println(sortedBooksByPublishing);
        List<Book> sortedBooksByYear = BookAction.getBooksAfterSpecifiedYear(books, 2010);
        System.out.println(sortedBooksByYear);
    }
}
