package com.galvanize;

public class Math {
    public int a;
    public int b;
    public int result;

    public Math(int a, int b) {
        this.a = a;
        this.b = b;
        this.result = 0;
    }

    public int addition() {
        this.result = a + b;
        return result;
    }

}
