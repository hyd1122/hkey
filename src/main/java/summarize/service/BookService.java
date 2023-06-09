package summarize.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import summarize.dao.BookDao;

//@Service
public class BookService {
//    @Autowired
    private BookDao bookDao;

    public BookService(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public BookDao getBookDao() {
        return bookDao;
    }

//    public void setBookDao(BookDao bookDao) {
//        this.bookDao = bookDao;
//    }

    public void add(){
        System.out.println("add......");
        bookDao.buy();
    }
}
