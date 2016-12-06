/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.BYUIDO.control.test;

import org.junit.Test;
import static org.junit.Assert.*;
import byui.cit260.BYUIDO.control.StatControl;

/**
 *
 * @author Scotty
 */
public class StatControlTest {

    public StatControlTest() {
    }

    /**
     * Test of dateAgree method, of class StatControl.
     */
    @Test
//    public void testDateAgree() {
//        System.out.println("dateAgree");
//
//        System.out.println("\tTest Case 1");
//        int stress = 5;
//        int charisma = 3;
//        int confide = 5;
//        int expResult = 3;
//        StatControl instance = new StatControl();
//
//        int result = instance.dateAgree(stress, charisma, confide);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//
//        System.out.println("\tTest Case 2");
//        stress = -5;
//        charisma = 3;
//        confide = 2;
//        expResult = -1;
//
//        result = instance.dateAgree(stress, charisma, confide);
//        assertEquals(expResult, result);
//
//        System.out.println("\tTest Case 3");
//        stress = 4;
//        charisma = -3;
//        confide = 5;
//        expResult = -1;
//
//        result = instance.dateAgree(stress, charisma, confide);
//        assertEquals(expResult, result);
//
//        System.out.println("\tTest Case 4");
//        stress = 3;
//        charisma = 6;
//        confide = -2;
//        expResult = -1;
//
//        result = instance.dateAgree(stress, charisma, confide);
//        assertEquals(expResult, result);
//
//        System.out.println("\tTest Case 5");
//        stress = 0;
//        charisma = 0;
//        confide = 0;
//        expResult = 0;
//
//        result = instance.dateAgree(stress, charisma, confide);
//        assertEquals(expResult, result);
//    }

    /**
     * Test of relationPoint method, of class StatControl.
     */
//    @Test
    public void testRelationPoint() {
        System.out.println("relationPoint");
        System.out.println("\tTest Case 1");
        int fun = 1;
        int date = 4;
        int days = 8;
        int expResult = 12;
        StatControl instance = new StatControl();

       // int result = instance.relationPoint(fun, date, days);
    //    assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

        System.out.println("\tTest Case 2");
        fun = -1;
        date = 3;
        days = 2;
        expResult = -1;
//        result = instance.relationPoint(fun, date, days);
//        assertEquals(expResult, result);

        System.out.println("\tTest Case 3");
        fun = 0;
        date = -3;
        days = 3;
        expResult = -1;
//        result = instance.relationPoint(fun, date, days);
//        assertEquals(expResult, result);

        System.out.println("\tTest Case 4");
        fun = 1;
        date = 3;
        days = -5;
        expResult = -1;
//        result = instance.relationPoint(fun, date, days);
//        assertEquals(expResult, result);

        System.out.println("\tTest Case 5");
        fun = 0;
        date = 0;
        days = 0;
        expResult = 0;
//        result = instance.relationPoint(fun, date, days);
//        assertEquals(expResult, result);
    }

    /**
     * Test of proposal method, of class StatControl.
     */
    // @Test
    public void testProposal() {
        //test 1
        System.out.println("\nTest 1");
        int points = 7;
        int trust = 5;
        int stress = 2;
        StatControl instance = new StatControl();
        int expResult = 8;

//        int result = instance.proposal(points, trust, stress);
//        assertEquals(expResult, result);

        // TODO review the generated test code and remove the default call to fail
        System.out.println("\nTest Case 2");
        points = -1;
        trust = 5;
        stress = 4;
        expResult = -1;
//        result = instance.proposal(points, trust, stress);
//        assertEquals(expResult, result);

        System.out.println("\nTest Case 3");
        points = 1;
        trust = -7;
        stress = 4;
        expResult = -1;
//        result = instance.proposal(points, trust, stress);
//        assertEquals(expResult, result);

        System.out.println("\nTest Case 4");
        points = -1;
        trust = 5;
        stress = 4;
        expResult = -1;
//        result = instance.proposal(points, trust, stress);
//        assertEquals(expResult, result);

        System.out.println("\n Test Case 5");
        points = 0;
        trust = 0;
        stress = 0;
        expResult = 0;
//        result = instance.proposal(points, trust, stress);
//        assertEquals(expResult, result);

    }
}
