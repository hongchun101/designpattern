package com.hongchun.designpattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author hongchun
 * @description BookShelf
 * @date 2023/5/1 22:12
 */
public class BookShelf implements Iterable<Book> {

    private final List<Book> books = new ArrayList<>();

    private int last = 0;

    public BookShelf() {
    }

    public Book getBookAt(int index) {
        return books.get(index);
    }

    public void appendBook(Book book) {
        books.add(book);
        last++;
    }

    public int getLength() {
        return last;
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }
}
