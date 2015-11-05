/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codefighter_perfectcity;

/**
 *
 * @author raliclo
 */
public class CodeFighter_PerfectCity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long speedX = System.currentTimeMillis();
        double[] A = {0.4, 1};
        double[] B = {0.9, 3};
//
//        double[] A = {0, 0.4};
//        double[] B = {1, 0.6};
        System.out.println("Result:" + perfectCity(A, B));
        System.out.println("Time spent :" + (System.currentTimeMillis() - speedX));
    }

    public static double perfectCity(double[] departure, double[] destination) {

//        System.out.println(Math.round(departure[0]) - departure[0]);
//        System.out.println(Math.round(destination[0]) - destination[0]);
//        System.out.println(Math.abs(Math.floor(departure[0]) - departure[0]));
//        System.out.println(Math.abs(Math.floor(destination[0]) - destination[0]));
//        System.out.println(Math.abs(Math.floor(departure[0]) - Math.floor(destination[0])));
//        //
//        System.out.println(Math.abs(Math.ceil(departure[0]) - departure[0]));
//        System.out.println(Math.abs(Math.ceil(destination[0]) - destination[0]));
//        System.out.println(Math.abs(Math.ceil(departure[0]) - Math.ceil(destination[0])));
        double floorDistanceX
                = Math.abs(Math.floor(departure[0]) - departure[0])
                + Math.abs(Math.floor(destination[0]) - destination[0]);
        double ceilDistanceX
                = Math.abs(Math.ceil(departure[0]) - departure[0])
                + Math.abs(Math.ceil(destination[0]) - destination[0]);
        double floorDistanceY
                = Math.abs(Math.floor(departure[1]) - departure[1])
                + Math.abs(Math.floor(destination[1]) - destination[1]);
        double ceilDistanceY
                = Math.abs(Math.ceil(departure[1]) - departure[1])
                + Math.abs(Math.ceil(destination[1]) - destination[1]);
        double remainderX = 0.0;
        double remainderY = 0.0;
        remainderX += (floorDistanceX <= ceilDistanceX) ? floorDistanceX : ceilDistanceX;
        remainderY += (floorDistanceY <= ceilDistanceY) ? floorDistanceY : ceilDistanceY;
        System.out.println(remainderX + " " + remainderY);
        double distance
                = Math.abs(Math.floor(departure[0]) - Math.floor(destination[0]))
                + Math.abs(Math.floor(departure[1]) - Math.floor(destination[1]))
                + remainderX + remainderY;
        return distance;
    }

}
/*
Testcase:

Input
[[0.4,1],[0.9,3]]

Output
2.5

Expected Output
2.7


Input
[[0,0.4],[1,0.6]]

Output
1.2

Expected Output
2
 */

/*
Consider a city where the streets are perfectly laid out to form an infinite square grid.
In this city finding the shortest path between two given points (an origin and a destination)
is much easier than in other more complex cities.

As a new Uber developer, you are tasked to create an algorithm that does this calculation.

Given user's departure and destination coordinates, each of them located on some street,

find the length of the shortest route between them assuming that cars can only move along the streets.

Example

For departure = [0.4, 1] and destination = [0.9, 3] the answer should be 2.7.

[input] array.float departure

An array [x, y] of x and y coordinates.
It is guaranteed that at least one coordinate is integer.

[input] array.float destination

The destination is given the same way as the departure location.
[output] float

The shorted distance between two points along the streets.
 */
