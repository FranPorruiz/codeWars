import java.util.Map;
import java.util.TreeMap;

/*
 * The main idea is to count all the occurring characters in a string. 
 * If you have a string like aba, then the result should be {'a': 2, 'b': 1}.
    What if the string is empty? Then the result should be empty object literal, {}.
    https://www.codewars.com/kata/52efefcbcdf57161d4000091
 */

public class CountCharacatersInYourString {
    public static Map<Character, Integer> count(String str) {
        Map<Character, Integer> treeMap = new TreeMap<Character, Integer>(); // treemap
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();// array of the alphabet
        int sum = 0; // our counter fotr the characters
        // first, we run the aphabet
        for (char letter : alphabet) {
            // second, we run our arrys, (conevrted to char)
            for (char ch : str.toCharArray()) {
                // if the character has appeared before we mlook for the counter
                if (treeMap.get(ch) != null) {
                    sum = treeMap.get(ch);
                } else {
                    // otherwise, our counter is 0
                    sum = 0;
                }
                // now we cmake the comparison between the alphabet and the character of the
                // string
                if (ch == letter) {
                    sum++;
                    treeMap.put(ch, sum);// we put the character and the counter (key-value) un our TreeMap
                }
            }
        }
        return treeMap;
    }
}
