package easy_level;

import java.util.*;

public class String_Reverse {

    /*
    A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.

Given a string A, print Yes if it is a palindrome, print No otherwise.

Constraints

A will consist at most 50 lower case english letters.
Sample Input

madam
Sample Output

Yes

     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();

        // String'i tersten yazmak için StringBuilder kullanalım
        String reversed = new StringBuilder(A).reverse().toString();

        // Tersine çevrilmiş hali ile orijinal metni karşılaştırarak palindrom olup olmadığını kontrol edelim
        if (A.equals(reversed)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}