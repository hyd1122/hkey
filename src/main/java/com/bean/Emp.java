package com.bean;

public class Emp {
    private String ename;
    private String gendr;
    private Dept dept;
//添加dept的get方法
    public Dept getDept() {
        return dept;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setGendr(String gendr) {
        this.gendr = gendr;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void empAdd(){
        System.out.println(ename+'\n'+gendr+'\n'+dept);
    }
}
