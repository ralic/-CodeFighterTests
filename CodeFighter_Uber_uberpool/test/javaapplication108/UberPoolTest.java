/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication108;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author raliclo
 */
public class UberPoolTest {

    public UberPoolTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of uberPool method, of class UberPool.
     */
    @Test
    public void testUberPool1() {
        System.out.println("uberPool");
        //Input
        //[[-88,26],[20,-14],[-16,-9],[14,90],[-98,-62]]
        //Expected Output
        //-1
        int[] A = {-88, 26};
        int[] B = {20, -14};
        int[] C = {-16, -9};
        int[] X = {14, 90};
        int[] Y = {-98, -62};
        int expResult = -1;
        int result = UberPool.uberPool(A, B, C, X, Y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testUberPool2() {
        System.out.println("uberPool");
//Input
//[[-76,-37],[79,35],[55,10],[-98,-75],[-86,-47]]
//Expected Output
//-1
        int[] A = {-76, -37};
        int[] B = {79, 35};
        int[] C = {55, 10};
        int[] X = {-98, -75};
        int[] Y = {-86, -47};
        int expResult = -1;
        int result = UberPool.uberPool(A, B, C, X, Y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testUberPool3() {
        System.out.println("uberPool");
//        Input[[0,0],[3,3],[3,1],[5,0],[2,2]]

//        Expected Output
//        2
        int[] A = {0, 0};
        int[] B = {3, 3};
        int[] C = {3, 1};
        int[] X = {5, 0};
        int[] Y = {2, 2};
        int expResult = 2;
        int result = UberPool.uberPool(A, B, C, X, Y);
        assertEquals(expResult, result);
    }

    @Test
    public void testUberPool4() {
        System.out.println("uberPool");
//        Input
//        [[-90,91],[18,-48],[-62,-32],[39,-62],[58,85]]
//        Expected Output
//        1
        int[] A = {-90, 91};
        int[] B = {18, -48};
        int[] C = {-62, -32};
        int[] X = {39, -62};
        int[] Y = {58, 85};
        int expResult = 1;
        int result = UberPool.uberPool(A, B, C, X, Y);
        assertEquals(expResult, result);
    }

    @Test
    public void testUberPool5() {
        System.out.println("uberPool");
        //        [[-88,26],[20,-14],[-16,-9],[14,90],[-98,-62]]
        int[] A = {-88, 26};
        int[] B = {20, -14};
        int[] C = {-16, -9};
        int[] X = {14, 90};
        int[] Y = {-98, -62};
        int expResult = -1;
        int result = UberPool.uberPool(A, B, C, X, Y);
        assertEquals(expResult, result);
    }

}
