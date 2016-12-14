/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.pkgdo;

import byui.cit260.BYUIDO.model.Game;
import byui.cit260.BYUIDO.model.Player;
import citybyui.cit260.byuido.view.ErrorView;
import citybyui.cit260.byuido.view.StartProgramView;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Scotty
 */
public class BYUIDo implements Serializable {

    private static Game currentGame = null;
    private static Player player = null;
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    private static PrintWriter logFile = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        BYUIDo.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        BYUIDo.player = player;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        BYUIDo.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        BYUIDo.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        BYUIDo.logFile = logFile;
    }

    public static void main(String[] args) throws FileNotFoundException {
        
        try {
//open character stream files for end user input/output
            BYUIDo.inFile = new BufferedReader(new InputStreamReader(System.in));
            BYUIDo.outFile = new PrintWriter(System.out, true);
            
            String filePath = "log.txt";
            BYUIDo.logFile = new PrintWriter(filePath);

            StartProgramView startProgramView = new StartProgramView();
            startProgramView.display();
            
            
        

        } catch (Throwable e) {
            
            System.out.println("Exception: " + e.toString() +
                              "\nCause: " + e.getCause() +
                              "\nMessage: " + e.getMessage());
            e.printStackTrace();
        
//            ErrorView.display("BYUIDo", te.getMessage());
//            te.printStackTrace();
//            startProgramView.display();
        } finally {
            try {
                if (BYUIDo.inFile != null) {
                    BYUIDo.inFile.close();
                }

                if (BYUIDo.outFile != null) {
                    BYUIDo.outFile.close();
                }

                if (BYUIDo.logFile != null) {
                    BYUIDo.logFile.close();
                }

            } catch (IOException ex) {
                ErrorView.display("BYUIDo",
                        "\nError closing files");
                return;
            }

        }
    }
}
