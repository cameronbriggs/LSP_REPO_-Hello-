package org.howard.edu.lsp.assignment5;

public class Driver {
    public static void main(String[] args) {
        IntegerSet set1 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        System.out.println("Value of Set1 is: " + set1.toString());
        System.out.println("Smallest value in Set1 is: " + set1.smallest());
        System.out.println("Largest value in Set1 is: " + set1.largest());

        IntegerSet set2 = new IntegerSet();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        System.out.println("\nValue of Set2 is: " + set2.toString());

        System.out.println("\nUnion of Set1 and Set2");
        set1.union(set2);
        System.out.println("Result of union of Set1 and Set2: " + set1.toString());

        System.out.println("\nIntersection of Set1 and Set2");
        IntegerSet resultSet = set1.intersect(set2);
        System.out.println("Result of intersection of Set1 and Set2: " + resultSet.toString());

        System.out.println("\nDifference of Set1 and Set2");
        set1.diff(set2);
        System.out.println("Result of difference of Set1 and Set2: " + set1.toString());

        System.out.println("\nComplement of Set1 with Set2");
        set1.complement(set2);
        System.out.println("Result of complement of Set1 with Set2: " + set1.toString());

        System.out.println("\nTesting clear method on Set1");
        set1.clear();
        System.out.println("Value of Set1 after clear: " + set1.toString());

        System.out.println("\nTesting isEmpty method on Set1");
        System.out.println("Is Set1 empty? " + set1.isEmpty());

        System.out.println("\nTesting add and remove methods on Set1");
        set1.add(10);
        set1.add(20);
        System.out.println("Value of Set1 after adding 10 and 20: " + set1.toString());
        set1.remove(10);
        System.out.println("Value of Set1 after removing 10: " + set1.toString());

        System.out.println("\nTesting length method on Set1");
        System.out.println("Length of Set1 is: " + set1.length());

        System.out.println("\nTesting contains method on Set1");
        System.out.println("Does Set1 contain 20? " + set1.contains(20));
        System.out.println("Does Set1 contain 10? " + set1.contains(10));

        System.out.println("\nTesting equals method between Set1 and Set2");
        set2.clear();
        set2.add(20);
        System.out.println("Value of Set1: " + set1.toString());
        System.out.println("Value of Set2: " + set2.toString());
        System.out.println("Are Set1 and Set2 equal? " + set1.equals(set2));
    }
}
