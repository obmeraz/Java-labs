package com.labs.bsu.entity;

import java.util.List;
import java.util.Objects;

public class Book {
    private int id;
    private String name;
    private List<String> authors;
    private String publishing;
    private int publishingYear;
    private int pageCount;
    private double price;
    private CoverType coverType;

    public Book() {
    }

    public Book(int id, String name, List<String> authors, String publishing, int publishingYear, int pageCount,
                double price, CoverType coverType) {
        this.id = id;
        this.name = name;
        this.authors = authors;
        this.publishing = publishing;
        this.publishingYear = publishingYear;
        this.pageCount = pageCount;
        this.price = price;
        this.coverType = coverType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public String getPublishing() {
        return publishing;
    }

    public void setPublishing(String publishing) {
        this.publishing = publishing;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public CoverType getCoverType() {
        return coverType;
    }

    public void setCoverType(CoverType coverType) {
        this.coverType = coverType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishingYear == book.publishingYear &&
                pageCount == book.pageCount &&
                Double.compare(book.price, price) == 0 &&
                Objects.equals(name, book.name) &&
                Objects.equals(authors, book.authors) &&
                Objects.equals(publishing, book.publishing) &&
                coverType == book.coverType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, authors, publishing, publishingYear, pageCount, price, coverType);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", authors=" + authors +
                ", publishing='" + publishing + '\'' +
                ", publishingYear=" + publishingYear +
                ", pageCount=" + pageCount +
                ", price=" + price +
                ", coverType=" + coverType +
                '}';
    }
}
