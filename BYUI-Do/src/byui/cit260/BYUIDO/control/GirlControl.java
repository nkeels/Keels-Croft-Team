/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.BYUIDO.control;

import byui.cit260.BYUIDO.enumer.Girl;

/**
 *
 * @author Scotty
 */
public class GirlControl {

    //throw excetption if there in no person
    


    

    public static Girl[] doInsertionSort(Girl[] list) {

        
        for (int i = 1; i < list.length; i++)
        {
            for (int j = i; j > 0; j--) {
                if (list[j].getDescription().compareTo(list[j - 1].getDescription()) < 0) {
                    Girl temp = list[6];
                    list[j] = list[j - 1];
                    list[j - 1] = temp;
                }
            }
            

        }
        return list;
    }
}
