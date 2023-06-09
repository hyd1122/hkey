package com05jdbc.Dao;

import com05jdbc.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class BookDaoImpl implements BookDao{

    @Autowired
    public JdbcTemplate jdbcTemplate;
//添加
    @Override
    public void add(Book book) {

        String sql = "insert into t_book values(?,?,?)";

        Object[] args = {book.getUserId(), book.getUsername(), book.getUstayus()};
        int update = jdbcTemplate.update(sql,args);
        System.out.println(update);
    }
//删除
    @Override
    public void deleteBook(String id) {
        String sql = "delete from t_book where user_id=?";

        int update = jdbcTemplate.update(sql, id);
        System.out.println(update);
    }
//修改
    @Override
    public void updateBook(Book book) {
        String sql = "update t_book set username=? , ustayus=? where user_id=?";

        Object[] args = {book.getUsername(),book.getUstayus(),book.getUserId()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);
    }
//查询表记录数
    @Override
    public int selectCount() {
        String sql = "select count(*) from t_book";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        return count;
    }
//查询返回对象
    @Override
    public Book findBookInfo(String id) {
        String sql = "select * from t_book where user_id=?";
        Book book = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Book>(Book.class), id);
        return book;
    }
//查询返回集合
    @Override
    public List<Book> findAllBook() {
        String sql = "select * from t_book";
        List<Book> bookList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Book>(Book.class));
        return bookList;
    }
//批量添加
    @Override
    public void batchAddBook(List<Object[]> batchArgs) {
        String sql = "insert into t_book values(?,?,?)";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));
    }
//批量修改
    @Override
    public void batchUpdate(List<Object[]> batchArgs) {
        String sql = "update t_book set username=?,ustayus=? where user_id=?";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));
    }
//批量删除
    @Override
    public void atchDelete(List<Object[]> batchArgs) {
        String sql = "delete from t_book where user_id=?";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));
    }


}
