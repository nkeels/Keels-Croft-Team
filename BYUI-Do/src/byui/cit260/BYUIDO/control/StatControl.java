/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.BYUIDO.control;

import static jdk.nashorn.internal.objects.NativeMath.exp;

/**
 *
 * @author Nick
 */
public class StatControl {
    
    public int dateAgree(int stress,int charisma,int confide) {
        
//        if (stress < 0)
//            return -1
//                    if (confide < 0)
//            return -1
//                    if (charisma < 0)
//            return -1
//            result = (charisma + confide - stress)
//            return result;

    if (stress < 0) {
            return -1;
        }
    if (confide < 0) {
            return -1;
        }
    if (charisma < 0) {
            return -1;
    }
    
    int decision = charisma + confide - stress;
    
    return decision;
}   

public int relationPoint(int fun,int date,int days) {
     if (fun < 0) {
            return -1;
        }
    if (date < 0) {
            return -1;
        }
    if (days < 0) {
            return -1;
    }
    
    int points = ((fun * date)+ days);
    return points;
    }

public int proposal(int points, int trust, int stress) {
    if (points < 0) {
            return -1;
    }
    if (trust < 0) {
        return -1;
    }
    if (stress < 0) {
        return -1;
    }
    
    int response = (int)((points * trust)/Math.pow(stress, 2));
    return response;
}    
}
