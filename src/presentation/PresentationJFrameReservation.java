/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentation;

import com.github.lgooddatepicker.optionalusertools.DateChangeListener;
import com.github.lgooddatepicker.zinternaltools.DateChangeEvent;
import dialog.DialogReservation;

@SuppressWarnings("serial")
public class PresentationJFrameReservation extends javax.swing.JFrame {

    private DialogReservation dialog;
    private javax.swing.JLabel[] pinTables;
    
    public PresentationJFrameReservation() {
    }

    public void initFrame() {
        initComponents();
        hourPicker.setEnabled(false);
        titre2.setEnabled(false);
        numberPicker.setEnabled(false);
        titre3.setEnabled(false);
        //nombrePersonnesSelecteur.setEnabled(false);
        //tableSelection.setEnabled(false);
        titre4.setEnabled(false);
        tableauDesTables.setEnabled(false);
        listeTable.setEnabled(false);
        
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
    
    public void afficherPinTable(int numTable) {
        for (int i = 0; i < pinTables.length; i++) {
            pinTables[i].setVisible(false);
        }
        
        if (numTable >= 1 && numTable <= pinTables.length) {
            pinTables[numTable - 1].setVisible(true);
        }
    }
    
    public void enable(String item){
        switch (item) {
            case "hour":
                hourPicker.setEnabled(true);
                titre2.setEnabled(true);
                break;
            case "number":
                //nombrePersonnesSelecteur.setEnabled(true);
                numberPicker.setEnabled(true);
                titre3.setEnabled(true);
                break;
            case "table":
                //tableSelection.setEnabled(true);
                tableauDesTables.setEnabled(true);
                titre4.setEnabled(true);
                listeTable.setEnabled(true);
                

                for (int i = 0; i < pinTables.length; i++) {
                    pinTables[i].setEnabled(true);
                }
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

        dateHoureSelection = new javax.swing.JPanel();
        titre1 = new javax.swing.JLabel();
        datePicker = new com.github.lgooddatepicker.components.DatePicker();
        datePicker.addDateChangeListener(new DateChangeListener(){
            public void dateChanged(DateChangeEvent dateEvent) {
                datePickerDateChanged(dateEvent);
            }
        });
        nombrePersonnesSelecteur = new javax.swing.JPanel();
        titre3 = new javax.swing.JLabel();
        numberPicker = new javax.swing.JComboBox<>();
        tableSelection = new javax.swing.JPanel();
        titre4 = new javax.swing.JLabel();
        tableauDesTables = new javax.swing.JScrollPane();
        listeTable = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        titrePage = new javax.swing.JLabel();
        finalOperations = new javax.swing.JPanel();
        validationButton = new javax.swing.JButton();
        annulationButton = new javax.swing.JButton();
        nombrePersonnesSelecteur1 = new javax.swing.JPanel();
        titre2 = new javax.swing.JLabel();
        hourPicker = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dateHoureSelection.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        dateHoureSelection.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        titre1.setText("1.Choisissez une date");
        titre1.setFont(new java.awt.Font("Liberation Sans", 0, 17)); // NOI18N

        javax.swing.GroupLayout dateHoureSelectionLayout = new javax.swing.GroupLayout(dateHoureSelection);
        dateHoureSelection.setLayout(dateHoureSelectionLayout);
        dateHoureSelectionLayout.setHorizontalGroup(
            dateHoureSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dateHoureSelectionLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(dateHoureSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titre1)
                    .addComponent(datePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dateHoureSelectionLayout.setVerticalGroup(
            dateHoureSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dateHoureSelectionLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(titre1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(datePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        nombrePersonnesSelecteur.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        titre3.setText("3.Indiquez le nombre de personnes");
        titre3.setFont(new java.awt.Font("Liberation Sans", 0, 17)); // NOI18N

        numberPicker.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4", "5", "6", "7", "8", "" }));
        numberPicker.setSelectedIndex(7);
        numberPicker.setBackground(new java.awt.Color(200, 200, 200));
        numberPicker.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        numberPicker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberPickerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout nombrePersonnesSelecteurLayout = new javax.swing.GroupLayout(nombrePersonnesSelecteur);
        nombrePersonnesSelecteur.setLayout(nombrePersonnesSelecteurLayout);
        nombrePersonnesSelecteurLayout.setHorizontalGroup(
            nombrePersonnesSelecteurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nombrePersonnesSelecteurLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(nombrePersonnesSelecteurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titre3)
                    .addComponent(numberPicker, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        nombrePersonnesSelecteurLayout.setVerticalGroup(
            nombrePersonnesSelecteurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nombrePersonnesSelecteurLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(titre3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numberPicker, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        tableSelection.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tableSelection.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titre4.setText("4.Choisissez votre table");
        titre4.setFont(new java.awt.Font("Liberation Sans", 0, 17)); // NOI18N
        tableSelection.add(titre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 12, -1, -1));

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Plan_tables.JPG"))); // NOI18N
        tableSelection.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

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
                .addContainerGap(18, Short.MAX_VALUE))
        );

        nombrePersonnesSelecteur1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        titre2.setText("2.Choisissez l'heure");
        titre2.setFont(new java.awt.Font("Liberation Sans", 0, 17)); // NOI18N

        hourPicker.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "11h30", "12h00", "12h30", "13h00", "13h30", "" }));
        hourPicker.setSelectedIndex(5);
        hourPicker.setBackground(new java.awt.Color(200, 200, 200));
        hourPicker.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hourPicker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hourPickerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout nombrePersonnesSelecteur1Layout = new javax.swing.GroupLayout(nombrePersonnesSelecteur1);
        nombrePersonnesSelecteur1.setLayout(nombrePersonnesSelecteur1Layout);
        nombrePersonnesSelecteur1Layout.setHorizontalGroup(
            nombrePersonnesSelecteur1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nombrePersonnesSelecteur1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(nombrePersonnesSelecteur1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(nombrePersonnesSelecteur1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(hourPicker, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(titre2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        nombrePersonnesSelecteur1Layout.setVerticalGroup(
            nombrePersonnesSelecteur1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nombrePersonnesSelecteur1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(titre2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hourPicker, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateHoureSelection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nombrePersonnesSelecteur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tableSelection, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titrePage)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(finalOperations, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nombrePersonnesSelecteur1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titrePage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dateHoureSelection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(nombrePersonnesSelecteur1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nombrePersonnesSelecteur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            afficherPinTable(value);
        }
        //dialog.handleTableSelectedEvent(value);
    }//GEN-LAST:event_listeTableMouseClicked

    private void numberPickerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberPickerActionPerformed
        int valeur = Integer.parseInt(numberPicker.getSelectedItem().toString());
        //dialog.handleNumOfPersonsSelectedEvent(valeur);
    }//GEN-LAST:event_numberPickerActionPerformed

    private void hourPickerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hourPickerActionPerformed
        String valeur = hourPicker.getSelectedItem().toString();
       //dialog.handleTimeSelectedEvent(valeur);

    }//GEN-LAST:event_hourPickerActionPerformed

    public void datePickerDateChanged(DateChangeEvent dateEvent) {
        //dialog.handleDateSelectedEvent(dateEvent.getNewDate());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton annulationButton;
    private javax.swing.JPanel dateHoureSelection;
    private com.github.lgooddatepicker.components.DatePicker datePicker;
    private javax.swing.JPanel finalOperations;
    private javax.swing.JComboBox<String> hourPicker;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> listeTable;
    private javax.swing.JPanel nombrePersonnesSelecteur;
    private javax.swing.JPanel nombrePersonnesSelecteur1;
    private javax.swing.JComboBox<String> numberPicker;
    private javax.swing.JPanel tableSelection;
    private javax.swing.JScrollPane tableauDesTables;
    private javax.swing.JLabel titre1;
    private javax.swing.JLabel titre2;
    private javax.swing.JLabel titre3;
    private javax.swing.JLabel titre4;
    private javax.swing.JLabel titrePage;
    private javax.swing.JButton validationButton;
    // End of variables declaration//GEN-END:variables

}
