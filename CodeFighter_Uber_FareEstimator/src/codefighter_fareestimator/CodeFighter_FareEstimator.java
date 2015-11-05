/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codefighter_fareestimator;

/**
 *
 * @author raliclo
 */
public class CodeFighter_FareEstimator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long speedX = System.currentTimeMillis();
        System.out.println("Time spent :" + (System.currentTimeMillis() - speedX));
    }

    public static double[] fareEstimator(int ride_time, int ride_distance,
            double[] cost_per_minute, double[] cost_per_mile) {
        double[] result = new double[cost_per_minute.length];
        for (int i = 0; i < cost_per_minute.length; i++) {
            result[i] = cost_per_minute[i] * ride_time
                    + cost_per_mile[i] * ride_distance;
        }
        return result;
    }

}
/*
Uber is building a Fare Estimator that can tell you how much your ride will cost before you request it.
It works by passing approximated ride distance and ride time through this formula:

(Cost per minute * ride time) + (Cost per mile * ride distance)

where Cost per minute and Cost per mile depend on the car type.

You are one of the engineers building the Fare Estimator,
so knowing cost per minute and cost per mile for each car type,
as well as ride distance and ride time, return the fare estimates for all car types.

Example

fareEstimator(30, 7, [0.2, 0.35, 0.4, 0.45], [1.1, 1.8, 2.3, 3.5]) = [13.7, 23.1, 28.1, 38]
For ride_time = 30,
ride_distance = 7,
cost_per_minute = [0.2, 0.35, 0.4, 0.45]
and cost_per_mile = [1.1, 1.8, 2.3, 3.5]
the output should be [13.7, 23.1, 28.1, 38].

Since:

30 * 0.2 + 7 * 1.1 = 6 + 7.7 = 13.7
30 * 0.35 + 7 * 1.8 = 10.5 + 12.6 = 23.1
30 * 0.4 + 7 * 2.3 = 12 + 16.1 = 28.1
30 * 0.45 + 7 * 3.5 = 13.5 + 24.5 = 38
[input] integer ride_time

A positive integer, ride duration in minutes.
[input] integer ride_distance

A positive integer, ride distance in miles.
[input] array.float cost_per_minute

cost_per_minute[i] is a positive number denoting cost per minute for the ith car type. There are at least 4 car types in every city where Uber operates.
[input] array.float cost_per_mile

cost_per_mile[i] is a positive number denoting cost per mile for the ith car type. It is guaranteed that cost_per_minute and cost_per_mile have the same number of elements.
[output] array.float

An array of estimated fares for each car type.
 */
