/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import DBService.BenutzerHelper;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.BenutzerTableModel;

/**
 *
 * @author Christopher
 */
public class CreateAccountScreen extends javax.swing.JFrame {

    HashMap<Integer, String> berechtigungen;
    
    /**
     * Creates new form CreateUserScreen
     */
    public CreateAccountScreen() throws SQLException {
        initComponents();        
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        this.TBL_Account.setModel(new BenutzerTableModel());
        fillComboboxen();
    }
    
    //Füllt die Comboboxen mit Werten
    private void fillComboboxen() throws SQLException {
        // Kategorien         
        this.berechtigungen = BenutzerHelper.getBerechtigungFromDB();
        ArrayList<Integer> alleIDsKategorien = new ArrayList<>();
        alleIDsKategorien.addAll(this.berechtigungen.keySet());
        for (int i = 0; i < alleIDsKategorien.size(); i++) {
            this.CB_Berechtigung.addItem(this.berechtigungen.get(alleIDsKategorien.get(i)));
        }        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TF_Name = new javax.swing.JTextField();
        LBL_Name = new javax.swing.JLabel();
        LBL_Berechtigung = new javax.swing.JLabel();
        CB_Berechtigung = new javax.swing.JComboBox();
        BT_Anlegen = new javax.swing.JButton();
        BT_Löschen = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBL_Account = new javax.swing.JTable();
        BT_Refresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TF_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_NameActionPerformed(evt);
            }
        });

        LBL_Name.setText("Name:");

        LBL_Berechtigung.setText("Titel:");

        BT_Anlegen.setText("Anlegen");
        BT_Anlegen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_AnlegenActionPerformed(evt);
            }
        });

        BT_Löschen.setText("Löschen");
        BT_Löschen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_LöschenActionPerformed(evt);
            }
        });

        TBL_Account.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TBL_Account.setEditingColumn(1);
        TBL_Account.setEditingRow(1);
        jScrollPane1.setViewportView(TBL_Account);

        BT_Refresh.setText("Neu Laden");
        BT_Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_RefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BT_Refresh)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LBL_Name)
                            .addComponent(TF_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LBL_Berechtigung)
                            .addComponent(CB_Berechtigung, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(BT_Anlegen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BT_Löschen)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LBL_Name)
                            .addComponent(LBL_Berechtigung))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CB_Berechtigung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BT_Anlegen)
                        .addComponent(BT_Löschen)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(BT_Refresh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TF_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_NameActionPerformed

    private void BT_AnlegenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_AnlegenActionPerformed
        // TODO add your handling code here:
        String name = TF_Name.getText();
        String passwort = "a";
        String berechtigung = CB_Berechtigung.getSelectedItem().toString();
        
        try {
            BenutzerHelper.insertBenutzer(name, passwort, berechtigung);
            refreshBenutzerTabelle();
        } catch (SQLException ex) {
            Logger.getLogger(CreateAccountScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BT_AnlegenActionPerformed

    private void BT_RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_RefreshActionPerformed
        refreshBenutzerTabelle();
    }//GEN-LAST:event_BT_RefreshActionPerformed

    private void refreshBenutzerTabelle() {
        try {
            this.TBL_Account.setModel(new BenutzerTableModel());
            //this.btnEdit.setEnabled(false);
        } catch (SQLException ex) {
            Logger.getLogger(HauptScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void BT_LöschenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_LöschenActionPerformed

        int selectedRowId = this.TBL_Account.getSelectedRow();
        int benutzerId = -1;
        if (selectedRowId != -1) {
            BT_Löschen.setEnabled(true);
            benutzerId = (int) this.TBL_Account.getModel().getValueAt(selectedRowId, 3);
            if (benutzerId != -1) {                
                BenutzerHelper.deleteBenutzer(benutzerId);
                refreshBenutzerTabelle();
            } else {
                JOptionPane.showMessageDialog(this, "Fehler: Der selektiere Benutzer konnte nicht in der Datenbank gefunden werden");
            }
        }
    }//GEN-LAST:event_BT_LöschenActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CreateAccountScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateAccountScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateAccountScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateAccountScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new CreateAccountScreen().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(CreateAccountScreen.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_Anlegen;
    private javax.swing.JButton BT_Löschen;
    private javax.swing.JButton BT_Refresh;
    private javax.swing.JComboBox CB_Berechtigung;
    private javax.swing.JLabel LBL_Berechtigung;
    private javax.swing.JLabel LBL_Name;
    private javax.swing.JTable TBL_Account;
    private javax.swing.JTextField TF_Name;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
