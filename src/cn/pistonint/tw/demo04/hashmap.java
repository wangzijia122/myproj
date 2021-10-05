package cn.pistonint.tw.demo04;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("A",1);
        map.put("B",2);
        System.out.println(map);
        map.put("A",5);
        System.out.println(map.get("A"));
        System.out.println(map.values());
        System.out.println(map.keySet());
        System.out.println(map.entrySet());
        System.out.println(map.replace("A",5,3));
        System.out.println(map.entrySet());

    }
}
