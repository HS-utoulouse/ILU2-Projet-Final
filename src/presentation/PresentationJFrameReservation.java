/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentation;

import com.github.lgooddatepicker.optionalusertools.DateChangeListener;
import com.github.lgooddatepicker.zinternaltools.DateChangeEvent;
import dialog.DialogReservation;
import java.time.LocalDate;

@SuppressWarnings("serial")
public class PresentationJFrameReservation extends javax.swing.JFrame {

    private DialogReservation dialog;
    private javax.swing.JLabel[] SelectedTable;
    public PresentationJFrameReservation() {
    }

    public void initFrame() {
        initComponents();
        selecteurHeure.setEnabled(false);
        titreHeure.setEnabled(false);
        selecteurAdultes.setEnabled(false);
        selecteurEnfants.setEnabled(false);
        titreNombrePersonnes.setEnabled(false);
        titreTable.setEnabled(false);
        tableauDesTables.setEnabled(false);
        listeTable.setEnabled(false);
        PlanTable.setEnabled(false);
        
        SelectedTable = new javax.swing.JLabel[]{
            SelectedTable1, SelectedTable2, SelectedTable3, 
            SelectedTable4, SelectedTable5, SelectedTable6
        };
        
        for (int i = 0; i < SelectedTable.length; i++) {
            SelectedTable[i].setVisible(false);
        }
        
    }
    
    public void mettreEnSurbrillanceTable(int numTable) {
        for (int i = 0; i < SelectedTable.length; i++) {
            SelectedTable[i].setVisible(false);
        }
        
        if (numTable >= 1 && numTable <= SelectedTable.length) {
            SelectedTable[numTable - 1].setVisible(true);
        }
    }
    
    public void mettreAjourListeTable(int nbPersonnes){
        
        javax.swing.DefaultListModel<String> modeleFiltre = new javax.swing.DefaultListModel<>();

        if (nbPersonnes <= 2) {
            modeleFiltre.addElement("Table 1");
            
        } 
        else if (nbPersonnes <= 4) {
            modeleFiltre.addElement("Table 2");
            modeleFiltre.addElement("Table 3");
            modeleFiltre.addElement("Table 4");
            modeleFiltre.addElement("Table 5");
        } 
        else {
            modeleFiltre.addElement("Table 6");
        }
        listeTable.setModel(modeleFiltre);
    }
    
    public void afficherPopUpConfirmation(String texte){
        javax.swing.JOptionPane.showMessageDialog(this, 
        texte, // Le message
        "Confirmation de réservation",                // Le titre de la fenêtre
        javax.swing.JOptionPane.INFORMATION_MESSAGE); // L'icône (i)
    }
    
    public void afficherPopUpImpossibleDeValider(String texte){
        javax.swing.JOptionPane.showMessageDialog(this, 
        texte, // Le message
        "Impossible de réserver",                // Le titre de la fenêtre
        javax.swing.JOptionPane.INFORMATION_MESSAGE); // L'icône (i)
    }

    public void setDialog(DialogReservation dialog) {
        this.dialog = dialog;
    }
    
    public void enable(String item){
        switch (item) {
            case "heure":
                selecteurHeure.setEnabled(true);
                titreHeure.setEnabled(true);
                break;
            case "nombre":
                //nombrePersonnesSelecteur.setEnabled(true);
                selecteurEnfants.setEnabled(true);
                selecteurAdultes.setEnabled(true);
                titreNombrePersonnes.setEnabled(true);
                break;
            case "table":
                //tableSelection.setEnabled(true);
                tableauDesTables.setEnabled(true);
                titreTable.setEnabled(true);
                listeTable.setEnabled(true);
                PlanTable.setEnabled(true);
                break;
            default:
                throw new AssertionError();
        }
        
    }
    
    // /!\ /!\ /!\ ATTENTION /!\ /!\ /!\
    // ce code est auto généré et ne doit PAS être modifié
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        zoneSelectionDate = new javax.swing.JPanel();
        titre1 = new javax.swing.JLabel();
        datePicker = new com.github.lgooddatepicker.components.DatePicker();
        datePicker.addDateChangeListener(new DateChangeListener(){
            public void dateChanged(DateChangeEvent dateEvent) {
                datePickerDateChanged(dateEvent);
            }
        });
        zoneSelecteurNbrPersonnes = new javax.swing.JPanel();
        titreNombrePersonnes = new javax.swing.JLabel();
        selecteurAdultes = new javax.swing.JComboBox<>();
        selecteurEnfants = new javax.swing.JComboBox<>();
        infoAdultes = new javax.swing.JLabel();
        infoEnfants = new javax.swing.JLabel();
        tableSelection = new javax.swing.JPanel();
        titreTable = new javax.swing.JLabel();
        tableauDesTables = new javax.swing.JScrollPane();
        listeTable = new javax.swing.JList<>();
        SelectedTable1 = new javax.swing.JLabel();
        SelectedTable2 = new javax.swing.JLabel();
        SelectedTable3 = new javax.swing.JLabel();
        SelectedTable4 = new javax.swing.JLabel();
        SelectedTable5 = new javax.swing.JLabel();
        SelectedTable6 = new javax.swing.JLabel();
        PlanTable = new javax.swing.JLabel();
        titrePage = new javax.swing.JLabel();
        finalOperations = new javax.swing.JPanel();
        validationButton = new javax.swing.JButton();
        annulationButton = new javax.swing.JButton();
        zoneSelecteurHeure = new javax.swing.JPanel();
        titreHeure = new javax.swing.JLabel();
        selecteurHeure = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        zoneSelectionDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        zoneSelectionDate.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        titre1.setText("1.Choisissez une date");
        titre1.setFont(new java.awt.Font("Liberation Sans", 0, 17)); // NOI18N

        javax.swing.GroupLayout zoneSelectionDateLayout = new javax.swing.GroupLayout(zoneSelectionDate);
        zoneSelectionDate.setLayout(zoneSelectionDateLayout);
        zoneSelectionDateLayout.setHorizontalGroup(
            zoneSelectionDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(zoneSelectionDateLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(zoneSelectionDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titre1)
                    .addComponent(datePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        zoneSelectionDateLayout.setVerticalGroup(
            zoneSelectionDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(zoneSelectionDateLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(titre1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(datePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        zoneSelecteurNbrPersonnes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        titreNombrePersonnes.setText("3.Indiquez le nombre de personnes");
        titreNombrePersonnes.setFont(new java.awt.Font("Liberation Sans", 0, 17)); // NOI18N

        selecteurAdultes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "" }));
        selecteurAdultes.setSelectedIndex(8);
        selecteurAdultes.setBackground(new java.awt.Color(200, 200, 200));
        selecteurAdultes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selecteurAdultes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecteurAdultesActionPerformed(evt);
            }
        });

        selecteurEnfants.setBackground(new java.awt.Color(200, 200, 200));
        selecteurEnfants.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "" }));
        selecteurEnfants.setSelectedIndex(7);
        selecteurEnfants.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selecteurEnfants.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecteurEnfantsActionPerformed(evt);
            }
        });

        infoAdultes.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        infoAdultes.setText("Adultes");

        infoEnfants.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        infoEnfants.setText("Enfants");

        javax.swing.GroupLayout zoneSelecteurNbrPersonnesLayout = new javax.swing.GroupLayout(zoneSelecteurNbrPersonnes);
        zoneSelecteurNbrPersonnes.setLayout(zoneSelecteurNbrPersonnesLayout);
        zoneSelecteurNbrPersonnesLayout.setHorizontalGroup(
            zoneSelecteurNbrPersonnesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(zoneSelecteurNbrPersonnesLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(zoneSelecteurNbrPersonnesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(zoneSelecteurNbrPersonnesLayout.createSequentialGroup()
                        .addComponent(titreNombrePersonnes)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(zoneSelecteurNbrPersonnesLayout.createSequentialGroup()
                        .addComponent(selecteurAdultes, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(infoAdultes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(selecteurEnfants, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(infoEnfants)
                        .addGap(19, 19, 19))))
        );
        zoneSelecteurNbrPersonnesLayout.setVerticalGroup(
            zoneSelecteurNbrPersonnesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(zoneSelecteurNbrPersonnesLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(titreNombrePersonnes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(zoneSelecteurNbrPersonnesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selecteurAdultes, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selecteurEnfants, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(infoAdultes)
                    .addComponent(infoEnfants))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        tableSelection.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tableSelection.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titreTable.setText("4.Choisissez votre table");
        titreTable.setFont(new java.awt.Font("Liberation Sans", 0, 17)); // NOI18N
        tableSelection.add(titreTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 12, -1, -1));

        tableauDesTables.setViewportBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        listeTable.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Table 1", "Table 2", "Table 3", "Table 4", "Table 5", "Table 6" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listeTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listeTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listeTableMouseClicked(evt);
            }
        });
        tableauDesTables.setViewportView(listeTable);

        tableSelection.add(tableauDesTables, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 190, 250));

        SelectedTable1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/SelectedTable1.png"))); // NOI18N
        tableSelection.add(SelectedTable1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        SelectedTable2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/SelectedTable2.png"))); // NOI18N
        tableSelection.add(SelectedTable2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        SelectedTable3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/SelectedTable3.png"))); // NOI18N
        tableSelection.add(SelectedTable3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        SelectedTable4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/SelectedTable4.png"))); // NOI18N
        tableSelection.add(SelectedTable4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        SelectedTable5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/SelectedTable5.png"))); // NOI18N
        tableSelection.add(SelectedTable5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        SelectedTable6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/SelectedTable6.png"))); // NOI18N
        tableSelection.add(SelectedTable6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        PlanTable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Plan_tables.JPG"))); // NOI18N
        tableSelection.add(PlanTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        titrePage.setText("Réservez une table");
        titrePage.setFont(new java.awt.Font("Liberation Sans", 0, 17)); // NOI18N

        validationButton.setText("Valider");
        validationButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        validationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validationButtonActionPerformed(evt);
            }
        });

        annulationButton.setText("Annuler");
        annulationButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        annulationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annulationButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout finalOperationsLayout = new javax.swing.GroupLayout(finalOperations);
        finalOperations.setLayout(finalOperationsLayout);
        finalOperationsLayout.setHorizontalGroup(
            finalOperationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, finalOperationsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(validationButton)
                .addGap(18, 18, 18)
                .addComponent(annulationButton)
                .addGap(17, 17, 17))
        );
        finalOperationsLayout.setVerticalGroup(
            finalOperationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(finalOperationsLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(finalOperationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(annulationButton)
                    .addComponent(validationButton))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        zoneSelecteurHeure.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        titreHeure.setText("2.Choisissez l'heure");
        titreHeure.setFont(new java.awt.Font("Liberation Sans", 0, 17)); // NOI18N

        selecteurHeure.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "11h30", "12h00", "12h30", "13h00", "13h30", "" }));
        selecteurHeure.setSelectedIndex(5);
        selecteurHeure.setBackground(new java.awt.Color(200, 200, 200));
        selecteurHeure.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selecteurHeure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecteurHeureActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout zoneSelecteurHeureLayout = new javax.swing.GroupLayout(zoneSelecteurHeure);
        zoneSelecteurHeure.setLayout(zoneSelecteurHeureLayout);
        zoneSelecteurHeureLayout.setHorizontalGroup(
            zoneSelecteurHeureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(zoneSelecteurHeureLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(zoneSelecteurHeureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(zoneSelecteurHeureLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(selecteurHeure, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(titreHeure, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        zoneSelecteurHeureLayout.setVerticalGroup(
            zoneSelecteurHeureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(zoneSelecteurHeureLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(titreHeure)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(selecteurHeure, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(zoneSelectionDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(zoneSelecteurNbrPersonnes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tableSelection, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titrePage)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(finalOperations, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(zoneSelecteurHeure, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titrePage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(zoneSelectionDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(zoneSelecteurHeure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(zoneSelecteurNbrPersonnes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tableSelection, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(finalOperations, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void validationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validationButtonActionPerformed
        //dialog.handleValidationEvent();
    }//GEN-LAST:event_validationButtonActionPerformed

    private void annulationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annulationButtonActionPerformed
        //dialog.handleCancelEvent();
    }//GEN-LAST:event_annulationButtonActionPerformed

    private void listeTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listeTableMouseClicked
        String tableSelectionnee = listeTable.getSelectedValue();
        int value = 0;
        
        switch (tableSelectionnee) {
            case "Table 1":
                value = 1;
                break;
            case "Table 2":
                value = 2;
                break;
            case "Table 3":
                value = 3;
                break;
            case "Table 4":
                value = 4;
                break;
            case "Table 5":
                value = 5;
                break;
            case "Table 6":
                value = 6;
                break;
            default:
                break;
        }
        
        if (value > 0) {
            mettreEnSurbrillanceTable(value);
        }
        dialog.handleTableSelectedEvent(value);
    }//GEN-LAST:event_listeTableMouseClicked

    private void selecteurAdultesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecteurAdultesActionPerformed
        int valeur = Integer.parseInt(selecteurAdultes.getSelectedItem().toString());
        dialog.handleNumAdulteSelectedEvent(valeur);
    }//GEN-LAST:event_selecteurAdultesActionPerformed

    private void selecteurHeureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecteurHeureActionPerformed
        String valeur = selecteurHeure.getSelectedItem().toString();
       dialog.handleHeureSelectedEvent(valeur);

    }//GEN-LAST:event_selecteurHeureActionPerformed

    private void selecteurEnfantsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecteurEnfantsActionPerformed
        int valeur = Integer.parseInt(selecteurEnfants.getSelectedItem().toString());
        dialog.handleNumEnfantSelectedEvent(valeur);
    }//GEN-LAST:event_selecteurEnfantsActionPerformed

    public void datePickerDateChanged(DateChangeEvent dateEvent) {
        dialog.handleDateSelectedEvent(dateEvent.getNewDate());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PlanTable;
    private javax.swing.JLabel SelectedTable1;
    private javax.swing.JLabel SelectedTable2;
    private javax.swing.JLabel SelectedTable3;
    private javax.swing.JLabel SelectedTable4;
    private javax.swing.JLabel SelectedTable5;
    private javax.swing.JLabel SelectedTable6;
    private javax.swing.JButton annulationButton;
    private com.github.lgooddatepicker.components.DatePicker datePicker;
    private javax.swing.JPanel finalOperations;
    private javax.swing.JLabel infoAdultes;
    private javax.swing.JLabel infoEnfants;
    private javax.swing.JList<String> listeTable;
    private javax.swing.JComboBox<String> selecteurAdultes;
    private javax.swing.JComboBox<String> selecteurEnfants;
    private javax.swing.JComboBox<String> selecteurHeure;
    private javax.swing.JPanel tableSelection;
    private javax.swing.JScrollPane tableauDesTables;
    private javax.swing.JLabel titre1;
    private javax.swing.JLabel titreHeure;
    private javax.swing.JLabel titreNombrePersonnes;
    private javax.swing.JLabel titrePage;
    private javax.swing.JLabel titreTable;
    private javax.swing.JButton validationButton;
    private javax.swing.JPanel zoneSelecteurHeure;
    private javax.swing.JPanel zoneSelecteurNbrPersonnes;
    private javax.swing.JPanel zoneSelectionDate;
    // End of variables declaration//GEN-END:variables

}
