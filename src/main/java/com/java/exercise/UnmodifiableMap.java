package com.java.exercise;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

//https://writer.blog.csdn.net/article/details/129093071
//49、怎么确保一个集合不能被修改？

public class UnmodifiableMap {
    public static void main(String[] args) {
        System.out.println(3);
        System.out.println(0.1);
        System.out.println((float)(3*0.1));

        float F = 0.3f;
        System.out.println((float)(3*0.1)==(float)0.3);
        System.out.println((float)(3*0.1)==0.3f);
        System.out.println(3*0.1f==0.3f);

        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("1", "ZhangSan");
        hashMap.put("2", "LiSi");
        hashMap.put("1", "WangWu");
        System.out.println(hashMap);

        Map<String, String> hashMap2 = Collections.unmodifiableMap(hashMap);
        hashMap2.put("3", "ZL");
        System.out.println(hashMap2);


    }

}
