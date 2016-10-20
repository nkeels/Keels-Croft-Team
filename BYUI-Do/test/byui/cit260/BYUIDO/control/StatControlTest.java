/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.BYUIDO.control;

import org.junit.Test;
import static org.junit.Assert.*;

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
    public void testDateAgree() {
        System.out.println("dateAgree");
        
        System.out.println("\tTest Case 1");
        int stress = 5;
        int charisma = 3;
        int confide = 5;
        int expResult = 3;
        StatControl instance = new StatControl();
        
        int result = instance.dateAgree(stress, charisma, confide);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     
    
     System.out.println("\tTest Case 2");
        stress = -5;
        charisma = 3;
        confide = 2;
         expResult = -1;
               
        result = instance.dateAgree(stress, charisma, confide);
        assertEquals(expResult, result);
    
    System.out.println("\tTest Case 3");
        stress = 4;
        charisma = -3;
        confide = 5;
         expResult = -1;
               
        result = instance.dateAgree(stress, charisma, confide);
        assertEquals(expResult, result);

    System.out.println("\tTest Case 4");
        stress = 3;
        charisma = 6;
        confide = -2;
         expResult = -1;
               
        result = instance.dateAgree(stress, charisma, confide);
        assertEquals(expResult, result);

        System.out.println("\tTest Case 5");
        stress = 0;
        charisma = 0;
        confide = 0;
        expResult = 0;
               
        result = instance.dateAgree(stress, charisma, confide);
        assertEquals(expResult, result);
    }
}
    /**
     * Test of relationPoint method, of class StatControl.
     
    @Test
    public void testRelationPoint() {
        System.out.println("relationPoint");
        int fun = 0;
        int date = 0;
        int days = 0;
        StatControl instance = new StatControl();
        int expResult = 0;
        int result = instance.relationPoint(fun, date, days);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of proposal method, of class StatControl.
     
    @Test
    public void testProposal() {
        System.out.println("proposal");
        int points = 0;
        int trust = 0;
        int stress = 0;
        StatControl instance = new StatControl();
        int expResult = 0;
        int result = instance.proposal(points, trust, stress);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
*/