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

    class SelectLocationView extends View{

        private String message;
        
    public SelectLocationView() {
         super      ("\n                                                    "
                  + "\n----------------------------------------------------"
                  + "\n|Where do you want to go?                          |"
                  + "\n----------------------------------------------------"
                  + "\n|PP - Porter Park                                  |"
                  + "\n|RI - The ridge                                    |"
                  + "\n|AV - Aspen Village                                |"
                  + "\n|TP - Tuscany Place                                |"
                  + "\n|WM - Windsor Manor                                |"
                  + "\n|NP - North Point                                  |"
                  + "\n|TW - The Willows                                  |"
                  + "\n|RB - The Ricks                                    |"
                  + "\n|TB - The Taylor                                   |"
                  + "\n|MC - The Manwaring Center                         |"
                  + "\n|RB - The Romney Building                          |"
                  + "\n|SB - The Spori Building                           |"
                  + "\n|Q - Go back a menu                                |"
                  + "\n----------------------------------------------------");
      
    }

        
         public SelectLocationView(String message) {
             
       
    }
    
    

    @Override
    public boolean doAction(String choice) {
            choice = choice.toUpperCase();
        
        switch (choice) {
            case "PP":
                this.porterPark();
                break;
            case "RI":
                this.theRidge();
                break;
            case "AV":
                this.aspenVillage();
                break;
            case "TP":
                this.tuscanyPlace();
                break;
            case "WM":
                this.windsorManor();
                break;
            case "NP":
                this.northPoint();
                break;
            case "TW":
                this.theWillows();
                break;
            case "RB":
                this.ricksBuilding();
                break;
            case "TB":
                this.taylorBuilding();
                break;
            case "MC":
                this.manwaringCenter();
                break;
            case "RM":
                this.romneyBuilding();
                break;
            case "SP":
                this.sporiBuilding();
                break;
            case "Q":
                this.goBack();
                break;    
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }
        return true;
    }   

    private void porterPark() {
        System.out.println("\nThis Works");
    }

    private void theRidge() {
        System.out.println("\nThis Works"); 
    }

    private void aspenVillage() {
        System.out.println("\nThis Works"); 
    }

    private void tuscanyPlace() {
        System.out.println("\nThis Works"); 
    }

    private void windsorManor() {
        System.out.println("\nThis Works");   
    }

    private void northPoint() {
        System.out.println("\nThis Works");   
    }

    private void theWillows() {
        System.out.println("\nThis Works");   
    }

    private void ricksBuilding() {
        System.out.println("\nThis works");    
    }

    private void taylorBuilding() {
        System.out.println("\nThis Works");  
    }

    private void manwaringCenter() {
        System.out.println("\nThis Works");    
    }

    private void romneyBuilding() {
        System.out.println("\nThis Works");   
    }

    private void sporiBuilding() {
       System.out.println("\nThis Works");   
    }

    private void goBack() {
        System.out.println("\nThis Works");   
    }
}

    
    

