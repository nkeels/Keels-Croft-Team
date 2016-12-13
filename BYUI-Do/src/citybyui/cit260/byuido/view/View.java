/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citybyui.cit260.byuido.view;

import byui.pkgdo.BYUIDo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Scotty
 */
public abstract class View implements ViewInterface {

    protected String displayMessage;
    
    protected final BufferedReader keyboard = BYUIDo.getInFile();
    
    protected final PrintWriter console = BYUIDo.getOutFile();

    public View() {
    }

    public View(String message) {
        this.displayMessage = message;
    }

    @Override
    public void display() {
        boolean done = false;
        do {
            this.console.println(this.displayMessage);
            String value = this.getInput();
            if (value.toUpperCase().equals("Q")) {
                return;
            }

            done = this.doAction(value);
        } while (!done);
    }

    @Override
    public String getInput() {
      
        String value = "";
        boolean valid = false;

        while (!valid) {
            this.console.println("\n" + this.displayMessage);

            try { // does this go here based on page
                value = this.keyboard.readLine();
            } catch (IOException ex) {
                Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
            }
            value = value.trim();

            if (value.length() < 1) {
                ErrorView.display(this.getClass().getName(), 
                                "\nInvalid value: value cannot be blank");
                continue;
            }
            break;
        }
        return value;
    }

}
