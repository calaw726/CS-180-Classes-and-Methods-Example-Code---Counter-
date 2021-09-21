package com.company;

public class Main {
    static void display(String name, Counter c) {
        System.out.printf("%s: x = %d,  y = %d\n", name, c.x, c.y);
    }
    public static void main(String[] args) {
        Counter alice = new Counter(100);
        Counter jimmy = new Counter(500);

        display("alice", alice);
        display("jimmy", jimmy);

        alice.x++;
        alice.y++;
        jimmy.x++;
        jimmy.y++;

        display("alice", alice);
        display("jimmy", jimmy);
    }
}
