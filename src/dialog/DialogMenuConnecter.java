/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package dialog;

import control.ControlMenuConnecter;
import presentation.PresentationJFrameMenuConnecter;

public class DialogMenuConnecter {
    
    private ControlMenuConnecter controlMenu;
    private PresentationJFrameMenuConnecter presentationMenu;

    public DialogMenuConnecter(ControlMenuConnecter controlMenu) {
        this.controlMenu = controlMenu;
    }

    public void init() {
        presentationMenu = new PresentationJFrameMenuConnecter();
        presentationMenu.setDialog(this);
        presentationMenu.initFrame();
        
        String[] resasAvenir = controlMenu.getTextesReservationsAvenir();
        String[] resasPassees = controlMenu.getTextesReservationsPassees();
        
        presentationMenu.peuplerListeFutur(resasAvenir);
        presentationMenu.peuplerListePasser(resasPassees);
        
        presentationMenu.setVisible(true);
    }
    
    public String getNomClient(){
        return controlMenu.getNomClient();
    }
    
    public String getPrenomClient(){
        return controlMenu.getPrenomClient();
    }
    
    public String getMailClient(){
        return controlMenu.getMailClient();
    }
}
