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
        // 1. On crée la fenêtre
        presentationMenu = new PresentationJFrameMenuConnecter();
        
        // (Lien avec le dialog à faire si tu as un setDialog dans ta présentation)
        // presentationMenu.setDialog(this);
        
        // 2. On initialise les modèles des listes
        presentationMenu.initFrame();
        
        // 3. ON RÉCUPÈRE LES DONNÉES DU CONTRÔLEUR
        String[] resasAvenir = controlMenu.getTextesReservationsAvenir();
        String[] resasPassees = controlMenu.getTextesReservationsPassees();
        
        // 4. ON DONNE L'ORDRE DE REMPLIR LES LISTES
        presentationMenu.peuplerListeFutur(resasAvenir);
        presentationMenu.peuplerListePasser(resasPassees);
        
        // 5. On affiche la fenêtre
        presentationMenu.setVisible(true);
    }
}
