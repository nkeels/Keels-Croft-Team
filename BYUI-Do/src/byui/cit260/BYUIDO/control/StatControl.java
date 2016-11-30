/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.BYUIDO.control;

import citbyui.cit260.BYUIDO.exceptions.StatControlException;

/**
 *
 * @author Nick
 */
public class StatControl {
    
    public int dateAgree(int stress,int charisma,int confide) throws StatControlException {
        

    if (stress < 0) {
            throw new StatControlException("invalid stat number");
        }
    else if (confide < 0) {
            throw new StatControlException("invalid stat number");
        }
    else if (charisma < 0) {
            throw new StatControlException("invalid stat number");
    }
    
    int decision = charisma + confide - stress;
    
    return decision;
}   

public int relationPoint(int fun,int date,int days) throws StatControlException {
     if (fun < 0) {
            throw new StatControlException("invalid stat number");
        }
    if (date < 0) {
            throw new StatControlException("invalid stat number");
        }
    if (days < 0) {
            throw new StatControlException("invalid stat number");
    }
    
    int points = ((fun * date)+ days);
    return points;
    }


    public int proposal(int points, int trust, int stress) throws StatControlException {
        if (points < 0) {
            throw new StatControlException("Invalid Points Value");
        }
        if (trust < 0) {
            throw new StatControlException("Invalid Trust Value");
        }
        if (stress < 0) {
            throw new StatControlException("Invalid Stress Value");
        }

        int response = (int) ((points * trust) / Math.pow(stress, 2));
        return response;
    }
}
