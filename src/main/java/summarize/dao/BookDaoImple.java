package summarize.dao;

import org.springframework.stereotype.Repository;

//@Repository
public class BookDaoImple implements BookDao{
    @Override
    public void buy() {
        System.out.println("buy......");
    }

    @Override
    public void sell() {
        System.out.println("sell......");
    }

    public void addbook(){
        System.out.println("买买买");
    }
}
