package com.applications.generic4;

enum KeyType {
    PADLOCK(1024),
    BUTTON(10000),
    DIAL(30000),
    FINGER(1000000);

    int count;
    KeyType(int count) {
        // TODO Auto-generated constructor stub
        this.count = count;
    }

}


class StrongBox<T> {
    private KeyType keyType;
    private T data;
    private int count;
   
    public StrongBox(KeyType keyType) {
        this.keyType = keyType;
    }

    public KeyType getKeyType() {
        return keyType;
    }

    public void setKeyType(KeyType keyType) {
        this.keyType = keyType;
    }

    public T get() {
        if (count >= keyType.count) {
            return data;
        }
        
        count++;
        return null;
    }

    public void put(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "StrongBox [keyType=" + keyType + ", data=" + data + "]";
    }
}


public class Ex1 {
    public static void main(String[] args) {
        StrongBox<Integer> box = new StrongBox<>(KeyType.PADLOCK);
        box.put(1234);
        
        for (int i = 0; i < KeyType.PADLOCK.count; i++) {
            box.get();
        }
        
        System.out.println(box.get());

    }
}
