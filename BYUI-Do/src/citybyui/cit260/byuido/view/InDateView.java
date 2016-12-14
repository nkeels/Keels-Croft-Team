/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citybyui.cit260.byuido.view;

/**
 *
 * @author Scotty
 */
public class InDateView extends View {
    //seem reasonable?
    public InDateView (){
    super("\nWhat will you do on your date?"
      + "\n----------------------------------------------------"
      + "\n|I - Interact                                |"
      + "\n|E - Eat                      |"
      + "\n|H - Get help on how to play the game              |"
      + "\n|S - Save game                                     |"
      + "\n|Q - Quit                                          |"
     + "\n----------------------------------------------------");
    
    }
    
    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase();

        switch (choice) {
            case "I":
                this.interact();
                break;
            case "E":
                this.eat();
                break;
            case "H":
                HelpMenuView helpMenu = new HelpMenuView();
                helpMenu.display();
                break;
             case "S":
                SaveGameView saveGame = new SaveGameView();
                saveGame.display();
                break;
            default:
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid Selection *** Try Again");
                break;

        }
        this.console.println("Your date and you return home after having spent time together, feeling very comfortable with each other.");
        
        ActionMenuView action = new ActionMenuView();
        action.display();
        
        return false;
    }

    private void interact() {
        this.console.println("You have some fun with the attractions with your date.");
        //function to calculate the addition of stats.
        
    }

    private void eat() {
        this.console.println("You and your date enjoy a meal together, talking about various topics of conversation.");
        //function to add stats.
    }

}
