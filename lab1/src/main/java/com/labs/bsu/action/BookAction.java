package com.labs.bsu.action;

import com.labs.bsu.entity.Book;

import java.util.List;
import java.util.stream.Collectors;

public class BookAction {

    public static List<Book> getBooksByAuthor(List<Book> books, String authorName) {
        return books.stream()
                .filter(book -> book.getAuthors().stream()
                        .anyMatch(authorName::equals))
                .collect(Collectors.toList());
    }

    public static List<Book> getBooksByPublishing(List<Book> books, String publishing) {
        return books.stream()
                .filter(book -> book.getPublishing().equals(publishing))
                .collect(Collectors.toList());
    }

    public static List<Book> getBooksAfterSpecifiedYear(List<Book> books, int year) {
        return books.stream()
                .filter(book -> book.getPublishingYear() > year)
                .collect(Collectors.toList());
    }
}
