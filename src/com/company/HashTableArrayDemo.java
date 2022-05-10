package com.company;

public class HashTableArrayDemo {
    public static void main(String[] args) {
        HashTableArray<String> hm = new HashTableArray<String>(10);
        hm.put(11,"gulnaz");
        hm.put(12, "gul");
        hm.put(13, "naz");
        System.out.println(hm.get(13));
    }
}
