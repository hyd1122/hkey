package com02.demo02;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Stu {
//    数组类型
    private String[] courses;
//list集合
    private List<String> list;
    private Map<String,String> maps;
    private Set<String> sets;
    private List<Course> course;

    public void setCourse(List<Course> course) {
        this.course = course;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    public  void arradd(){
        System.out.println(Arrays.toString(courses));
        System.out.println(list);
        System.out.println(maps);
        System.out.println(sets);
        System.out.println(course);
    }
}
