package com.springtest01;

public class Book {
    /*
    *演示使用set方法进行注入属性
    * */
    private String bname;
    private String bauthor;
    private String address;

//    public Book() {
//
//    }

//    set方法注入

    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }

    public void setAddress(String address) {
        this.address = address;
    }
//    有参构造注入

    public Book(String bname, String bauthor,String address) {
        this.bname = bname;
        this.bauthor = bauthor;
        this.address = address;
    }

    public void testDemo(){
      System.out.println(bname+'\n'+bauthor+'\n'+address);
    };
}
