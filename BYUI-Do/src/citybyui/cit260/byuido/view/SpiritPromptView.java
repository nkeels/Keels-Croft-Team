/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citybyui.cit260.byuido.view;

import byui.cit260.BYUIDO.control.GirlControl;
import byui.cit260.BYUIDO.control.MapControl;
import byui.cit260.BYUIDO.enumer.Girl;

/**
 *
 * @author Scotty
 */
public class SpiritPromptView extends View {

    public String message;

    public SpiritPromptView() {
        super   ( "\n|------------------------------------------------------------------------------------|"
                + "\n|Welcome!!!                                                                          |"
                + "\n|------------------------------------------------------------------------------------|"
                + "\n|You wake up right when the teacher declares the end of your class on Marriage.      |"
                + "\n|You pack up your books and walk out of the classroom. totally set for grabbing      |"
                + "\n|some lunch at your apartment, you meet up with one of your roommates. Your roommate |"
                + "\n|starts talking about how his relationship with his girlfriend is going well and that|"
                + "\n|it'll be nice once they finally get engaged and married.                            |"
                + "\n|                                                                                    |"
                + "\n|\"It would be nice to find someone to settle down...\" your thoughts float in your  |"
                + "\n|Your roommate notices your glazed look and smirks. \"You know, I have a list cute   |"
                + "\n|girls who are available if you want to take a look...\".You think for a moment on   |"
                + "\n|whether or not to take a look at the list.                                          |"
                + "\n-------------------------------------------------------------------------------------|"
                + "\n|G - see the list of girls                                                           |"
                + "\n|I - Ignore his advice                                                               |"
                + "\n|Q - Quit                                                                            |"
                + "\n-------------------------------------------------------------------------------------|");

    }

    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase();

        switch (choice) {
            case "G":
                this.girlList();
                break;
            case "I":
                this.ignoreIt();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;

        }
        SelectLocationView searchLocation = new SelectLocationView();
        searchLocation.display();

        return true;
    }

    private void girlList() {
        Girl[] list = Girl.values();
        Girl[] list2 = GirlControl.doInsertionSort(list);
        for (Girl girl : list2) {
            System.out.println(girl.getDescription());
            
        }
    }

    private void ignoreIt() {
        System.out.println("\n You thank your friend but decline their offer for information,"
                + "\n instead deciding to go and look for yourself.");
    }
}
