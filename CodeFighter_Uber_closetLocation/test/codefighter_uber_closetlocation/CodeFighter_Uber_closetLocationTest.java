/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codefighter_uber_closetlocation;

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
public class CodeFighter_Uber_closetLocationTest {

    public CodeFighter_Uber_closetLocationTest() {
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
     * Test of closestLocation method, of class CodeFighter_Uber_closetLocation.
     */
    @Test
    public void testClosestLocation() {
        System.out.println("closestLocation");
        String address = "Cat";
        int[][] objects = {{-2, 0}, {1, 2}, {2, 1, 2, 4}, {-3, -1, 4, -1}};
        String[] names = {"Bat building", "Cast exhibition", "At street", "Cat avenue"};
        String expResult = "Cat avenue";
        String result = CodeFighter_Uber_closetLocation.closestLocation(address, objects, names);
        assertEquals(expResult, result);
        /*
        For address = "Cat",
        objects = [[-2, 0], [1, 2], [2, 1, 2, 4], [-3, -1, 4, -1]],
        names = ["Bat building", "Cast exhibition", "At street", "Cat avenue"]
         */
    }

}
