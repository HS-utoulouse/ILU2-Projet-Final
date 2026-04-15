/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test_fonctionnel;

import presentation.PresentationJFrameCreationClient;
import control.ControlCreerClient;
import model.CarnetClientele;
import dialog.DialogAjoutClient;

public class TestCreerClientGraphique {
    
    public static void main(String[] args) {
        
        CarnetClientele carnet = new CarnetClientele();
        PresentationJFrameCreationClient framPresentation = new PresentationJFrameCreationClient(); 
        ControlCreerClient control = new ControlCreerClient(carnet);
        DialogAjoutClient dialog = new DialogAjoutClient();
        
        dialog.initDialog();
        
    }
}
