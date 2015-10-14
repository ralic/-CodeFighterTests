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
        int[] test = HappyNumbers(10000000);
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
