/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codefighter_happynumber;

import java.util.ArrayList;

/**
 *
 * @author raliclo
 */
public class CodeFighter_HappyNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        // TODO code application logic here'
        int[] test = HappyNumbers(10000);
        for (int i = 0; i < test.length; i++) {
            System.out.println(test[i]);
        }

//        System.out.println(HappyNumber(1903));
    }

    public static int[] HappyNumbers(int Range) {
        int i = 0;
        ArrayList<Integer> store = new ArrayList();
        for (i = 1; i <= Range; i++) {
            if (isHappyNumber(i)) {
                store.add(i);
            }
        }

        int[] results = new int[store.size()];
        for (i = 0; results.length > i; i++) {
            results[i] = store.get(i);
        }
        return results;
    }

    public static int HappyNumber(int Range) {
        int output = 0;
        try {
            if (Range == 1) {
                return 0;
            }
            if (Range > 1) {
                if (Range < 10 && (Range == 1 || Range == 7)) {
                    return 0;
                }
                if (Range < 10 && !(Range == 1 || Range == 7)) {
                    return -1;
                }
                int rem = Range;
                ArrayList<Integer> test = new ArrayList();
                for (int i = 0; Range != 0; i++) {
                    rem %= 10;
                    Range = (Range - rem) / 10;
                    test.add(rem);
                    rem = Range;
                }
                int[] a = new int[test.size()];
                for (int i = 0; i < test.size(); i++) {
                    output += test.get(i) * test.get(i);
                }
                return HappyNumber(output);
            }
        } catch (StackOverflowError e) {
            return -1;
        }
        return -1;
    }

    public static boolean isHappyNumber(int b) {
        int a = HappyNumber(b);
        switch (a) {
            case 0:
                return true;
            case -1:
                return false;
            default:
                return false;
        }
    }
}
/*
Find All Happy Numbers in the Given Range

A happy number is a number defined by the following process:
Given a positive integer, replace it by the sum of the squares of its digits, and repeat the process until the number either equals 1 (it will not change any further), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers, while those that do not end in 1 are unhappy numbers (or sad numbers).

Find all happy numbers in the given range [1..Range], inclusive.

Example

70 -> 72 + 0 = 49
49 -> 42 + 92 = 16 + 81 = 97
97 -> 92 + 72 = 81 + 49 = 130
130 -> 12 + 32 + 0 = 1 + 9 = 10
10 -> 12 + 0 = 1

Hence 70 is a happy number.

[input] integer Range

Range ≤ 2000.
[output] array.integer

Happy numbers from the given range, returned in ascending order.
 */
