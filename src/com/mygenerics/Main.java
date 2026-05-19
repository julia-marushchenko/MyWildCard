/**
 *  Java program to wildcard instead of specific type.
 */

package com.mygenerics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Creating lists with different types.
        ArrayList<String> stringList = new ArrayList<>(Arrays.asList("alpa", "beta", "gamma"));
        ArrayList<Integer> integerList = new ArrayList<>(Arrays.asList(1, 2, 3));

        // Calling method wildCardDemo() for two lists.
        wildCardDemo(stringList);
        wildCardDemo(integerList);
    }

    // Method to print elements of lists with wildcard type.
    static void wildCardDemo(List<?> list) {
        for (Object o : list) {
            System.out.println("The item is: " + o);
        }
    }
}
