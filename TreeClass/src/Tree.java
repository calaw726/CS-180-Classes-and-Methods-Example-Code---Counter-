/**
 * Tree
 *
 * Defines characteriscs of a tree, including it's number, it's species, and it's circumference.
 *
 * @author Prof. Dunsmore, CS180
 *
 * @version 09/27/2021
 *
 */


public class Tree {
    private int serial;
    private double circumference;
    private String species;

    public Tree(int serial, double circumference, String species) {
        this.serial = serial;
        this.circumference = circumference;
        this.species = species;
    }

    public String describe() {
        return String.format("Tree number %d has a circumference of %.2f and is of species %s.", serial, circumference,
                species);
    }
    public double getDiameter() {
        return circumference / Math.PI;
    }

    public double getCircumference() {
        return circumference;
    }
}
