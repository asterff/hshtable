package com.company;

public class HashTableArray<T> {
    Entry[] arrayHash;
    int size;
    public HashTableArray(int size) {
    this.size=size;
        arrayHash = new Entry[size];
        for (int i=0;i<size;i++)
            arrayHash [i]= new Entry();
    }
    int getHash (int key) {
        return key%size;
    }
    public void put(int key, Object value) {
        int HashIndex=getHash(key);
        Entry ArrayValue = arrayHash[HashIndex];
        Entry newItem=new Entry(key,value);
        newItem.next=ArrayValue.next;
        ArrayValue.next=newItem;
    }
    public T get(int key){
        T value = null;
        int HashIndex=getHash(key);
        Entry ArrayValue = arrayHash[HashIndex];
        while (ArrayValue != null){
            if(ArrayValue.getKey()==key){
                value=(T) ArrayValue.getValue();
                break;
            }
            ArrayValue=ArrayValue.next;
        }
        return value;
    }
}
