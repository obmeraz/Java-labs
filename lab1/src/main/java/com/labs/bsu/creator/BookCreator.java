package com.labs.bsu.creator;

import com.labs.bsu.entity.Book;
import com.labs.bsu.entity.CoverType;

import java.util.ArrayList;
import java.util.List;

public class BookCreator {

    public static List<Book> createBookList() {
        List<String> book1Authors = new ArrayList<>();
        book1Authors.add("Bradberry");
        book1Authors.add("Oryell");
        Book book1 = new Book(1, "Book1", book1Authors, "Daily Publish", 2004, 250, 75, CoverType.COMPOSITE);
        List<String> book2Authors = new ArrayList<>();
        book2Authors.add("Roberts");
        Book book2 = new Book(2, "Book2", book2Authors, "Evening Minsk", 2018, 745, 128, CoverType.ENTIRE);
        List<String> book3Authors = new ArrayList<>();
        book3Authors.add("Bylgacov");
        book3Authors.add("Remark");
        book3Authors.add("Wilde");
        Book book3 = new Book(3, "Book3", book3Authors, "Mahoan", 2012, 211, 111, CoverType.ENTIRE);
        List<String> book4Authors = new ArrayList<>();
        book4Authors.add("Rand");
        Book book4 = new Book(4, "Book4", book4Authors, "Labyrinth", 2018, 652, 25, CoverType.ENTIRE);
        List<String> book5Authors = new ArrayList<>();
        book5Authors.add("Rand");
        Book book5 = new Book(5, "Book5", book5Authors, "Daily Publish", 2003, 1123, 157, CoverType.COMPOSITE);
        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        return books;
    }
}
