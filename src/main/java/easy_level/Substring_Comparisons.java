package easy_level;

import java.util.*;

public class Substring_Comparisons {

    /*
    We define the following terms:

Lexicographical Order, also known as alphabetic or dictionary order, orders characters as follows:

A<B<...<T<Z<a<b<...<y<z

For example, ball <cat, dog <dorm, Happy<happy, Zoo<ball.

A substring of a string is a contiguous block of characters in the string. For example,
the substrings of abc are a, b, c, ab, bc, and abc

Given a string, s, and an integer, k, complete the function so that it finds the lexicographically
smallest and largest substrings of length k.

Function Description

Complete the getSmallestAndLargest function in the editor below.

getSmallest AndLargest has the following parameters:

string s: a string

int k the length of the substrings to find

Returns

string: the string ' + "\n" + 'where and are the two substrings

Input Format

The first line contains a string denoting s.

The second line contains an integer denoting k

Constraints

1≤|s|≤1000

s consists of English alphabetic letters only (i.e.. [a-zA-Z])

Sample Input O

welcometojava

3

Sample Output O

ava
wel

Explanation O

String s= "welcometojava" has the following lexicographically-ordered substrings of length k = 3:

["ava", "com", "elc", "eto", "jav", "lco", "met", "oja", "ome", "toj", "wel"]

The stub code in the editor then prints ave as our first line of output and wel as our second line of output

     */

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        smallest = s.substring(0, k);
        largest = s.substring(0, k);

        for (int i = 1; i <= s.length() - k; i++) {
            String substr = s.substring(i, i + k);
            if (substr.compareTo(smallest) < 0)
                smallest = substr;
            if (substr.compareTo(largest) > 0)
                largest = substr;
        }

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}