/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.BYUIDO.control;

import byui.cit260.BYUIDO.enumer.Girl;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Scotty
 */
public class GirlControl {

    //throw excetption if there in no person
    public static Girl[] doInsertionSort(Girl[] list) {

        for (int i = 1; i < list.length; i++) {
            for (int j = i; j > 0; j--) {
                if (list[j].getName().compareTo(list[j - 1].getName()) < 0) {
                    Girl temp = list[j];
                    list[j] = list[j - 1];
                    list[j - 1] = temp;
                }
            }

        }
        return list;
    }

    public static void PrintGirlReport(String outputLocation) {
        Girl[] girls = Girl.values();
        
        try (PrintWriter out = new PrintWriter(outputLocation)) {

            out.println("\n\n         Girl List Report         ");
            out.printf("%n%-20s%10s", "Name", "Location");
            out.printf("%n%-20s%10s", "-----------", "--------");
            for (Girl girl : girls) {
                out.printf("%n%-20s%10s", girl.getName(), girl.getCoordinates());

            }
        } catch (IOException ex) {
            System.out.println("I/O Error: " + ex.getMessage());
        }
    }
}
