package com.company;

public class Tree {
    double circumference;
    static int numberOfTrees = 0;

    Tree(double circumference) {
        this.circumference = circumference;
        numberOfTrees = numberOfTrees + 1;

    }

    double getRadius() {
        return circumference / (2 * Math.PI);

    }

    static int getNumberOfTrees() {
        return numberOfTrees;
    }
}
