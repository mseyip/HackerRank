package easy_level;

import java.util.*;

public class BigInteger {

    /*
In this problem, you have to add and multiply huge numbers! These numbers are so big that you can't contain them in
any ordinary data types like a long integer.

Use the power of Java's BigInteger class and solve this problem.

Input Format

There will be two lines containing two numbers, a and b.

Constraints

a and b are non-negative integers and can have maximum 200 digits.

Output Format

Output two lines. The first line should contain a+b, and the second line should contain axb. Don't print any leading zeros.

Sample Input

1234
20

Sample Output

1254
24680

Explanation
1234+20=1254
1234*20=24680

     */

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scanner = new Scanner(System.in);

        // Input
        BigInteger a = new BigInteger(scanner.nextLine());
        BigInteger b = new BigInteger(scanner.nextLine());

        // Sum
        BigInteger sum = a.add(b);
        System.out.println(sum.toString());

        // Product
        BigInteger product = a.multiply(b);
        System.out.println(product.toString());

        scanner.close();
    }
}