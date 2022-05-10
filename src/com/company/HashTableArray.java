package com.company;

public class HashTableArray<T> {
    Main [] arrayHash;
    int size;
    public HashTableArray(int size) {
    this.size=size;
        arrayHash = new Main[size];
        for (int i=0;i<size;i++)
            arrayHash [i]= new Main();
    }
    int getHash (int key) {
        return key%size;
    }
    public void put(int key, Object value) {
        int HashIndex=getHash(key);
        Main ArrayValue = arrayHash[HashIndex];
        Main newItem=new Main(key,value);
        newItem.next=ArrayValue.next;
        ArrayValue.next=newItem;
    }
    public T get(int key){
        T value = null;
        int HashIndex=getHash(key);
        Main ArrayValue = arrayHash[HashIndex];
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
