package com.company;

public class Main {
        int key;
        Object value;
        Main next;
        public Main(int key, Object value) {
            this.key=key;
            this.value=value;
            next = null;

        }
        public Main () {
            next = null;
        }

    public int getKey() {
        return key;
    }
    public Object getValue(){
            return value;
    }
}
