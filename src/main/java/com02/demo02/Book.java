package com02.demo02;

import java.util.List;

public class Book {
    private List<String> bname;

    public void setBname(List<String> bname) {
        this.bname = bname;
    }

    public void bookAdd(){
        System.out.println(bname);
    }
}
