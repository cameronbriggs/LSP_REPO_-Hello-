package org.howard.edu.lsp.assignment5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The IntegerSet class provides a collection of unique integers
 * and various set operations like union, intersection, and difference
 */
public class IntegerSet {
    private List<Integer> set = new ArrayList<Integer>();

    /**
     * Default Constructor
     * Initializes an empty set.
     */
    public IntegerSet() {
    }

    /**
     * Constructor to initialize the set with a list of integers.
     * @param set ArrayList of integers to initialize the set with.
     */
    public IntegerSet(ArrayList<Integer> set) {
        this.set = new ArrayList<>(set);
    }

    /**
     * Clears the internal representation of the set.
     */
    public void clear() {
        set.clear();
    }

    /**
     * Returns the length of the set.
     * @return The number of elements in the set.
     */
    public int length() {
        return set.size();
    }

    /**
     * Compares this set with another set for equality.
     * @param o The object to be compared.
     * @return True if the sets contain all the same values, false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IntegerSet intSet = (IntegerSet) o;
        return set.containsAll(intSet.set) && intSet.set.containsAll(set);
    }

    /**
     * Checks if the set contains a specific value.
     * @param value The value to check for.
     * @return True if the value is in the set, false otherwise.
     */
    public boolean contains(int value) {
        return set.contains(value);
    }

    /**
     * Returns the largest item in the set.
     * @return The largest value in the set.
     * @throws IllegalStateException if the set is empty.
     */
    public int largest() {
        if (set.isEmpty()) throw new IllegalStateException("Set is empty");
        return Collections.max(set);
    }

    /**
     * Returns the smallest item in the set.
     * @return The smallest value in the set.
     * @throws IllegalStateException if the set is empty.
     */
    public int smallest() {
        if (set.isEmpty()) throw new IllegalStateException("Set is empty");
        return Collections.min(set);
    }

    /**
     * Adds an item to the set if it is not already present.
     * @param item The item to add.
     */
    public void add(int item) {
        if (!set.contains(item)) {
            set.add(item);
        }
    }

    /**
     * Removes an item from the set if it is present.
     * @param item The item to remove.
     */
    public void remove(int item) {
        set.remove(Integer.valueOf(item));
    }

    /**
     * Performs the union of this set with another set.
     * @param intSetb The other set to perform the union with.
     */
    public void union(IntegerSet intSetb) {
        for (int item : intSetb.set) {
            if (!set.contains(item)) {
                set.add(item);
            }
        }
    }

    /**
     * Performs the intersection of this set with another set.
     * @param intSetb The other set to perform the intersection with.
     * @return A new IntegerSet that contains the intersection of the two sets.
     */
    public IntegerSet intersect(IntegerSet intSetb) {
        IntegerSet resultSet = new IntegerSet();
        for (int item : set) {
            if (intSetb.contains(item)) {
                resultSet.add(item);
            }
        }
        return resultSet;
    }

    /**
     * Performs the difference of this set with another set.
     * @param intSetb The other set to perform the difference with.
     */
    public void diff(IntegerSet intSetb) {
        set.removeAll(intSetb.set);
    }

    /**
     * Performs the complement of this set with another set.
     * @param intSetb The other set to find elements not in this set.
     */
    public void complement(IntegerSet intSetb) {
        List<Integer> complementSet = new ArrayList<>();
        for (int item : intSetb.set) {
            if (!set.contains(item)) {
                complementSet.add(item);
            }
        }
        set = complementSet;
    }

    /**
     * Checks if the set is empty.
     * @return True if the set is empty, false otherwise.
     */
    public boolean isEmpty() {
        return set.isEmpty();
    }

    /**
     * Returns a string representation of the set.
     * @return A string representing the elements of the set.
     */
    @Override
    public String toString() {
        return set.toString();
    }
}