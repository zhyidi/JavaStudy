package com.zhyidi.spring5.collectionType;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @Description:
 * @Author zhyidi
 * @Date: 2022/5/11 15:34
 * @Version 1.0
 */
public class Stu {
    private String[] courses;
    private List<String> list;
    private Map<String,String> maps;
    private Set<String> set;

    private  List<Course> list_C;

    public List<Course> getList_C() {
        return list_C;
    }

    public void setList_C(List<Course> list_C) {
        this.list_C = list_C;
    }

    public String[] getCourses() {
        return courses;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Map<String, String> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }


    public void test(){
        System.out.println(Arrays.toString(courses));
        System.out.println(list);
        System.out.println(maps);
        System.out.println(set);
        System.out.println(list_C);
    }
}
