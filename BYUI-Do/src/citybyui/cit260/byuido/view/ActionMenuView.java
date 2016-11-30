/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citybyui.cit260.byuido.view;

/**
 *
 * @author Nick
 */
public class ActionMenuView extends View {

    private String menu;

    public ActionMenuView() {
        super("\n                                                  "
                + "\n----------------------------------------------------"
                + "\n|What do you do?                                    |"
                + "\n----------------------------------------------------"
                + "\nT - Talk                                            |"
                + "\nF - Flirt                                           |"
                + "\nA - Ask for a date                                  |"
                + "\nK - Kiss                                            |"
                + "\nP - Propose                                         |"
                + "\nQ - Quit                                            |"
                + "\n----------------------------------------------------");

    }

    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase();

        switch (choice) {
            case "T":
                this.talkTo();
                break;
            case "F":
                this.flirtWith();
                break;
            case "A":
                this.askDate();
                break;
            case "K":
                this.kissGirl();
                break;
            case "P":
                this.proposeTo();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;

        }
        return false;
    }

    private void talkTo() {
        System.out.println("\n*** talkTo function called ***");
    }

    private void flirtWith() {
        System.out.println("\n*** flirtWith function called ***");
    }

    private void askDate() {
        System.out.println("\n*** askDate function called ***");
    }

    private void kissGirl() {
        System.out.println("\n*** kissGirl function called ***");
    }

    private void proposeTo() {
        System.out.println("\n*** proposeTo function called ***");
    }
}
