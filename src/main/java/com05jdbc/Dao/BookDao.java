package com05jdbc.Dao;

import com05jdbc.entity.Book;

import java.util.List;

public interface BookDao {

    void add(Book book);

    void deleteBook(String id);

    void updateBook(Book book);

    int selectCount();

    Book findBookInfo(String id);

    List<Book> findAllBook();


    void batchAddBook(List<Object[]> batchArgs);

    void batchUpdate(List<Object[]> batchArgs);

    void atchDelete(List<Object[]> batchArgs);
}
