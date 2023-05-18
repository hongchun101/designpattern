package com.hongchun.designpattern.iterator;

import java.util.Iterator;

/**
 * @author hongchun
 * @description 迭代器模式
 * @date 2023/5/2 9:22
 */
public class Main {

    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        bookShelf.appendBook(new Book("Around the World in 80 days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));
        Iterator<Book> it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = it.next();
            System.out.println(book.getName());
        }
    }
}
