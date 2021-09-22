package com.company;
/**
 * Tree creator and Tracker
 *
 * This program creates trees with varying sizes and records how many trees are created
 *
 * @author Professor Dunsmore
 *
 * @version 09/22/2021
 *
 */
public class Main {

    public static void main(String[] args) {
	while (Math.random() < 0.9) {
	    Tree t = new Tree(Math.random() * 100);
        System.out.printf("tree has radius %.3f\n", t.getRadius());

    }
        System.out.printf("created %d trees \n", Tree.getNumberOfTrees());
    }
}
