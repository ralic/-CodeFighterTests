package javaapplication108;

/**
 *
 * @author raliclo
 */
public class UberPool {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] A = {0, 0};
        int[] B = {3, 3};
        int[] C = {3, 1};
        int[] X = {5, 0};
        int[] Y = {2, 2};
        System.out.println(uberPool(A, B, C, X, Y));
        // TODO code application logic here
        long speedX = System.currentTimeMillis();
        System.out.println("Time spent :" + (System.currentTimeMillis() - speedX));
    }

    public static int uberPool(int[] A, int[] B, int[] C, int[] X, int[] Y) {

        int AC = Math.abs(A[0] - C[0]) + Math.abs(A[1] - C[1]);
        int CB = Math.abs(C[0] - B[0]) + Math.abs(C[1] - B[1]);
        int CY = Math.abs(C[0] - Y[0]) + Math.abs(C[1] - Y[1]);
        int YB = Math.abs(Y[0] - B[0]) + Math.abs(Y[1] - B[1]);
        int CX = Math.abs(C[0] - X[0]) + Math.abs(C[1] - X[1]);
        int XB = Math.abs(X[0] - B[0]) + Math.abs(X[1] - B[1]);
        int CYB = CY + YB;
        int CXB = CX + XB;
        int ACB = AC + CB;
        int[] key = {ACB, CXB, CYB};
        int min = key[0];
        for (int i = 0; i < key.length; i++) {
            if (key[i] < ACB) {
                min = key[i];
            }
        }
        if (min == ACB) {
            return -1;
        }
        if (min == CXB) {
            return 1;
        }
        if (min == CYB) {
            return 2;
        }
//        System.out.println(AC + " " + CB);
//        System.out.println(CY + " " + YB);
//        System.out.println(CX + " " + XB);
//        System.out.println(CXB + " " + CYB + " " + ACB + " " + CB);
//        if (ACB > CYB && ACB > CXB) {
//            return CXB <= CYB ? 1 : 2;
//        } else if (CB < CYB && CB < CXB) {
//            return -1;
//        }
        return 00;
    }
}
/*
Uber has introduced UberPool to make sure there are fewer cars on the road,
which means less traffic, faster travel times and cheaper rides.
Here is how UberPool works: it matches different riders heading in the same direction,
giving a driver two pick-up and two drop-off locations on the same trip.
UberPool is limited to two riders per trip, which means that sometimes a driver
has to choose which request to accept.

Consider a city represented as integer points on the Cartesian plane,
with roads parallel to the axes. There's a driver who picked up a passenger
at point A and is heading to point B with them, taking one of the shortest possible routes.

When the driver reaches point C, she receives two more requests:
one from a rider at point X, another from a rider at point Y.
Both riders are also going to point B.

Your task is to find out which additional rider should be picked up (if any),
taking into account that the final length of the trip can't be more than
two times longer than the length of the trip with no extra riders.

If both requests meet this condition, accept the one with the shortest route.
If the lengths of the routes are the same, accept the first request.

Example

For A = [0, 0], B = [3, 3], C = [3, 1], X = [5, 0] and Y = [2, 2] the answer should be 2.

The initial distance is 6, the route with the passenger at point X is of length 12,
the route with the passenger at point Y is of length 8. Both pick-ups are possible;
however, it's better to pick up the passenger at Y, since the route with him is shorter.

See the picture below for details.



[input] array.integer A

The departure point, represented as array of two integers - x and y coordinates.
[input] array.integer B

The destination point.
[input] array.integer C

The point at which two new requests came in.
[input] array.integer X

Coordinates of the first request.
[input] array.integer Y

Coordinates of the second request.
[output] integer

Return 1 if the passenger at point X should be picked up,
2 if the passenger at point Y should be picked up,
or -1 if it's impossible to accept any of the additional requests.
 */
