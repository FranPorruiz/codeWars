/*You are going to be given an array of integers. 
Your job is to take that array and find an index 
N where the sum of the integers to the left of N 
is equal to the sum of the integers to the right of N.
 If there is no index that would make this happen, return -1.
For example:
Let's say you are given the array {1,2,3,4,3,2,1}:
Your function will return the index 3, because at the 3rd position of the array,
 the sum of left side of the index ({1,2,3}) and the sum of the right side of the index ({3,2,1}) both equal 6. 
 https://www.codewars.com/kata/5679aa472b8f57fb8c000047/java  */
public class Kata {
    public static int findEvenIndex(int[] arr) {

        int[] right = new int[arr.length];
        int[] left = new int[arr.length];
        int rSum = 0, lSum = 0;

        // we create an array for the additions of the numbers from left to right
        for (int i = 0; i < arr.length; i++) {
            rSum += arr[i];
            right[i] = rSum;
        }

        // now, we make an array fo the additions fom right to left
        for (int j = arr.length - 1; j >= 0; j--) {
            lSum += arr[j];
            left[j] = lSum;
        }

        // the index where the right and the left arrays are equals is the position what
        // we are looking for
        for (int i = 0; i < arr.length; i++) {
            if (right[i] == left[i]) {
                return i;
            }
        }

        return -1;
    }
}