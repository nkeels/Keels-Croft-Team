/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citybyui.cit260.byuido.view;

import byui.pkgdo.BYUIDo;
import java.io.PrintWriter;

/**
 *
 * @author Scotty
 */
public class ErrorView {
    private static final PrintWriter errorFile = BYUIDo.getOutFile();
    private static final PrintWriter logFile = BYUIDo.getLogFile();
    public static void display(String className, String errorMessage) {
        
        errorFile.println(
                    "----------------------------------------------"
                  + "\n- Error - " + errorMessage  
                  + "----------------------------------------------");
          
                logFile.println(className + " - " + errorMessage);
        
    }
}
