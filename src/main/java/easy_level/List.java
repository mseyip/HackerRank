package easy_level;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class List {

    /*
For this problem, we have 2 types of queries you can perform on a List:

1) Insert y at index x:

Insert
x y
2) Delete the element at index x:

Delete
x
Given a list, L, of N integers, perform Q queries on the list. Once all queries are completed, print the modified list
as a single line of space-separated integers.

Input Format

The first line contains an integer, N (the initial number of elements in L).
The second line contains N space-separated integers describing L.
The third line contains an integer, Q (the number of queries).
The 2Q subsequent lines describe the queries, and each query is described over two lines:

If the first line of a query contains the String Insert, then the second line contains two space separated integers xy,
and the value y must be inserted into L at index x.
If the first line of a query contains the String Delete, then the second line contains index x, whose element must be deleted from L.

Constraints

1<=N<=4000
1<=Q<=4000

Each element in is a 32-bit integer.
Output Format

Print the updated list L as a single line of space-separated integers.

Sample Input

5
12 0 1 78 12
2
Insert
5 23
Delete
0
Sample Output

0 1 78 12 23
Explanation

L = [12,0,1,78,12]
Q0:Insert 23 at index 5
L0 = [12,0,1,78,12,23]
Q1:Delete the element at index 0
L1 = [0,1,78,12,23]

 Insert 23 at index .

 Delete the element at index .

Having performed all Q queries, we print  as a single line of space-separated integers.
     */

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            list.add(scan.nextInt());
        }
        int q = scan.nextInt();
        scan.nextLine();
        for (int j = 0; j < q; j++) {
            String operation = scan.nextLine();
            if (operation.equals("Insert")) {
                list.add(scan.nextInt(), scan.nextInt());
            }
            else if (operation.equals("Delete")) {
                list.remove(scan.nextInt());
            }
            if(j != q-1){
                scan.nextLine();
            }
        }

        // Printing the list
        for (int k = 0; k < list.size(); k++) {
            System.out.printf("%d ", list.get(k));
        }

        scan.close();
    }
}