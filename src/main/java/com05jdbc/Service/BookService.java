package com05jdbc.Service;

import com05jdbc.Dao.BookDao;
import com05jdbc.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookDao bookDao;
//添加
    public void addBook(Book book){
        bookDao.add(book);
    }
//修改
    public void updateBook(Book book){
        bookDao.updateBook(book);
    }
//删除
    public void delete(String id){
        bookDao.deleteBook(id);
    }
//查询表记录数
    public int selectCount(){
        return bookDao.selectCount();
    }
//查询返回对象
    public Book findOne(String id){
        return bookDao.findBookInfo(id);
    }

//    查询返回集合
    public List<Book> findAll(){
        return bookDao.findAllBook();
    }

//    批量添加
    public void batchAdd(List<Object[]> batchArgs){
        bookDao.batchAddBook(batchArgs);
    }
//    批量修改
    public void batchUpdata(List<Object[]> batchArgs){
        bookDao.batchUpdate(batchArgs);
    }
//批量删除
    public void batchDelete(List<Object[]> batchArgs){
        bookDao.atchDelete(batchArgs);
    }
}
