/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JOptionPane;
import model.Artikel;
import model.Warenkorb;

/**
 *
 * @author lenzch
 */
public class ArtikelDetails extends javax.swing.JFrame {

    private Artikel artikel;
         
    public ArtikelDetails(Artikel artikel) {
        initComponents();  
        
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        this.artikel = artikel;
        this.LB_ArtikelName.setText(artikel.getName());
        this.LB_ArtikelBeschreibung.setText(artikel.getBeschreibung());
        this.LB_ArtikelPreis.setText(String.valueOf(artikel.getBruttopreis()) + " €"); //zwei Nachkommstellen
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LB_ArtikelName = new javax.swing.JLabel();
        LB_ArtikelBeschreibung = new javax.swing.JLabel();
        TB_ArtikelMenge = new javax.swing.JTextField();
        LB_ArtikelPreis = new javax.swing.JLabel();
        BT_Warenkorb = new javax.swing.JButton();
        LB_X = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LB_ArtikelName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LB_ArtikelName.setText("Artikelname");

        LB_ArtikelBeschreibung.setText("Artikelbeschreibung");

        TB_ArtikelMenge.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TB_ArtikelMenge.setText("1");
        TB_ArtikelMenge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TB_ArtikelMengeActionPerformed(evt);
            }
        });
        TB_ArtikelMenge.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                TB_ArtikelMengeInputMethodTextChanged(evt);
            }
        });

        LB_ArtikelPreis.setText("Preis");

        BT_Warenkorb.setText("In den Warenkorb");
        BT_Warenkorb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_WarenkorbActionPerformed(evt);
            }
        });

        LB_X.setText("x");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(BT_Warenkorb)
                        .addComponent(LB_ArtikelBeschreibung)
                        .addComponent(LB_ArtikelName))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(TB_ArtikelMenge, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LB_X)
                        .addGap(18, 18, 18)
                        .addComponent(LB_ArtikelPreis)))
                .addContainerGap(188, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(LB_ArtikelName)
                .addGap(42, 42, 42)
                .addComponent(LB_ArtikelBeschreibung)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TB_ArtikelMenge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LB_ArtikelPreis)
                    .addComponent(LB_X))
                .addGap(37, 37, 37)
                .addComponent(BT_Warenkorb)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TB_ArtikelMengeInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_TB_ArtikelMengeInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_TB_ArtikelMengeInputMethodTextChanged

    private void BT_WarenkorbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_WarenkorbActionPerformed
        int anzahl = 0;
        try
        {
            anzahl = Integer.parseInt(this.TB_ArtikelMenge.getText());
        }
        catch(Exception ex)
        {
            
        }
        if(anzahl == 0)
        {
            JOptionPane.showMessageDialog(this, "Bitte geben Sie eine gültige Menge ein");
        }
        else
        {
            Warenkorb.GetInstance().addArtikel(this.artikel.getId(), anzahl);
            JOptionPane.showMessageDialog(this, anzahl + "x " + this.artikel.getName() + " zum Warenkorb hinzugefügt");
        }
        
        
        
    }//GEN-LAST:event_BT_WarenkorbActionPerformed

    private void TB_ArtikelMengeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TB_ArtikelMengeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TB_ArtikelMengeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_Warenkorb;
    private javax.swing.JLabel LB_ArtikelBeschreibung;
    private javax.swing.JLabel LB_ArtikelName;
    private javax.swing.JLabel LB_ArtikelPreis;
    private javax.swing.JLabel LB_X;
    private javax.swing.JTextField TB_ArtikelMenge;
    // End of variables declaration//GEN-END:variables
}
