/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codefighter_uber_closetlocation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author raliclo
 */
public class CodeFighter_Uber_closetLocation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String address = "Cat";
        int[][] objects = {{-2, 0}, {1, 2}, {2, 1, 2, 4}, {-3, -1, 4, -1}};
        String[] names = {"Bat building", "Cast exhibition", "At street", "Cat avenue"};
        long speedX = System.currentTimeMillis();
        System.out.println(closestLocation(address, objects, names));
        System.out.println("Time spent :" + (System.currentTimeMillis() - speedX));
    }

    public static String closestLocation(String address, int[][] objects, String[] names) {
        int i = 0;
        for (String x : names) {
            Matcher m = Pattern.compile(address).matcher(x);
            if (m.find() == true) {
                break;
            }
            i++;
        }
        return names[i];
    }
}
/*
The Uber app has an integrated map that simplifies selecting a destination. To make it even better, Uber guesses the location even if there is a typo in the inputted address.

Consider a map with streets and buildings located on the Cartesian plane with integer coordinates. The distances on this map are calculated as follows:

The distance between two points is the length of the segment connecting them.
The distance between a segment and a point is defined as the shortest distance between the given point and any point on the segment.
A user has started to type in their destination, and it's your task to guess what they are looking for.

Let the rider's position be at [0, 0]. Given the positions of some objects around them, and the address they have already typed in, find out what their destination is. To do this, find the object closest to the rider with a name that has a prefix which is similar to the text that's already entered. Since it's possible that there is a typo in the input, let similar mean one of the following:

the typed in address is identical to the prefix of the object's address;
they differ only by one symbol;
user's input has one extra symbol;
user's input has one missing symbol.
Note that the comparison should be case-insensitive.

For example, if the user typed in "Cat", the following can be suggested: "Cat street", "Bat building", "_At avenue" (the first letter is deleted), and "Cast exhibition".

Example

For address = "Cat", objects = [[-2, 0], [1, 2], [2, 1, 2, 4], [-3, -1, 4, -1]],
names = ["Bat building", "Cast exhibition", "At street", "Cat avenue"]

the answer should be "Cat avenue", since all the names are similar to what the user has typed, and the distances to them are respectively 2, √5, √5 and 1 (see the picture below for better understanding).



[input] string address

The partial address the user has typed already.
[input] array.array.integer objects

objects[i] corresponds to the ith object. There are two type of objects:
a building, which is represented as an array of two elements with x and y coordinates;
a street, which is represented as an array of four elements with x and y coordinates at its start, and x and y coordinates at its end.
It is guaranteed that each street is parallel to one of the axes.

[input] array.string names

The ith element is the name of the ith object.
[output] string

Return the name of the object the user supposedly chose as their destination. It should be the name of the closest object that is similar to the typed text. If there are several such objects, return the one that appears first in the provided list.
It is guaranteed that at least one object's name is similar to the typed text.
 */
