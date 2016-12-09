/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.pkgdo;

import byui.cit260.BYUIDO.model.Game;
import byui.cit260.BYUIDO.model.Player;
import citybyui.cit260.byuido.view.StartProgramView;
import java.io.Serializable;

/**
 *
 * @author Scotty
 */
public class BYUIDo implements Serializable {

    private static Game currentGame = null;
    private static Player player = null;

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

    public static void main(String[] args) {

        StartProgramView startProgramView = new StartProgramView();
        try {
            startProgramView.display();

        } catch (Throwable te) {
            System.out.println(te.getMessage());
            te.printStackTrace();
            startProgramView.display();
        }

    }
}
