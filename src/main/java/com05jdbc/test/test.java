package com05jdbc.test;

import com05jdbc.Service.BookService;
import com05jdbc.entity.Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class test {

    @Test
    public void testJdbcTemplate(){
        ApplicationContext context = new ClassPathXmlApplicationContext("until/Applicationjdbc.xml");

        BookService bookService = context.getBean("bookService", BookService.class);
//添加
//        Book book = new Book();
//
//        book.setUserId("1");
//        book.setUsername("java");
//        book.getUstayus("a");
//        bookService.addBook(book);
//      修改
//
//        Book book = new Book();
//        book.setUserId("1");
//        book.setUsername("javaupup");
//        book.setUstayus("bbbbb");
//        bookService.updateBook(book);

//        删除
//        bookService.delete("1");
//        查询表记录数
//        int count = bookService.selectCount();
//        System.out.println(count);
//        查询返回对象
//        Book one = bookService.findOne("1");
//        System.out.println(one);
//查询返回集合
//        List<Book> all = bookService.findAll();
//        System.out.println(all);
//        批量添加
//        List<Object[]> batchArgs = new ArrayList<>();
//        Object[] o1 = {"2","jdk","a"};
//        Object[] o2 = {"3","mysql","b"};
//        Object[] o3 = {"4","springboot","c"};
//        batchArgs.add(o1);
//        batchArgs.add(o2);
//        batchArgs.add(o3);
//        bookService.batchAdd(batchArgs);
//        批量修改
//        List<Object[]> batchArgs = new ArrayList<>();
//        Object[] o1 = {"jk","xjj","2"};
//        Object[] o2 = {"asd","nhao","3"};
//        Object[] o3 = {"hello","baibai","4"};
//        batchArgs.add(o1);
//        batchArgs.add(o2);
//        batchArgs.add(o3);
//        bookService.batchUpdata(batchArgs);

//        批量删除
        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = {"2"};
        Object[] o2 = {"3"};
        Object[] o3 = {"4"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);
        bookService.batchDelete(batchArgs);
     }
}
