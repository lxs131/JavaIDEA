package com.java.exercise;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.*;

//https://blog.csdn.net/weixin_64938628/article/details/125539448
//具有如下特点：
//    不允许出现重复因素；
//    允许插入Null值；
//    元素无序（添加顺序和遍历顺序不一致）；
//    线程不安全，若2个线程同时操作HashSet，必须通过代码实现同步；

public class HashSetDemo {

    private Set<Integer> set = new HashSet<>();

    @BeforeAll
    public void setup() {
        set.add(1);
        set.add(1);
        set.add(2);
        set.add(4);
        set.add(5);
        set.add(3);
    }

    //foreach
    @Test
    public void test02() {
        for(Integer e: set) {
            System.out.println(e);
        }
    }

    //使用迭代器
    @Test
    public void test03() {
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(1);
        set.add(2);
        set.add(4);
        set.add(5);
        set.add(3);
//        [1, 2, 3, 4, 5]
        System.out.println(set);


    }
}
