package com.company;

public class Scope2 {
    int x;
    String name;

    Scope2(int x, String aName) {
        this.x = x;     //common style to initialize a field
        name = aName;   //alternative style that doesn't require "this"
    }

    void doit() {
        int x = 10;     // OK: hides field x

        this.x = x;     //allows access to hidden field x

    }

    public static void main(String[] args) {
        Scope2 sc1 = new Scope2(12, "Fred");
        Scope2 sc2 = new Scope2(25, "Ralph");
    }
}
