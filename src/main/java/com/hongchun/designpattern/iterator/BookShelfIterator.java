package com.hongchun.designpattern.iterator;

import java.util.Iterator;

/**
 * @author hongchun
 * @description BookShelfIterator
 * @date 2023/5/1 22:15
 */
public class BookShelfIterator implements Iterator<Book> {
    private final BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < bookShelf.getLength();
    }

    @Override
    public Book next() {
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
