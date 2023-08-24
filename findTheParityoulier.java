/*You are given an array 
(which will have a length of at least 3, but could be very large) 
containing integers. The array is either entirely comprised of odd integers or entirely 
comprised of even integers except for a single integer N. Write a method that takes 
the array as an argument and returns this "outlier" N. */

import java.util.ArrayList; // import the ArrayList class

public class FindOutlier {
    static int find(int[] integers) {
        int solution = 0;
        // Two array list to divide the numbes between odds an even
        ArrayList<Integer> odds = new ArrayList<Integer>();
        ArrayList<Integer> even = new ArrayList<Integer>();

        // we made the classification
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] % 2 == 0) {
                even.add(integers[i]);
            } else {
                odds.add(integers[i]);
            }
        }

        // there only one number that can be odd or even, so if the array contains one
        // number, that our solution
        if (even.size() == 1) {
            solution = even.get(0);
        } else {
            solution = odds.get(0);
        }
        return solution;
    }
}