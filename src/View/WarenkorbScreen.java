/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import DBService.ArtikelHelper;
import java.sql.SQLException;
import java.util.HashMap;
import model.Artikel;
import model.Warenkorb;
import model.WarenkorbTableModel;

/**
 *
 * @author fixch
 */
public class WarenkorbScreen extends javax.swing.JFrame {

    /**
     * Creates new form WarenkorbScreen
     * @throws java.sql.SQLException
     */
    public WarenkorbScreen() throws SQLException {
        initComponents();
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        
        HashMap<Integer, Integer> alleArtikelImWarenkorb = Warenkorb.GetInstance().getWarenkorbinhalt();
        this.TBL_Warenkorb.setModel(new WarenkorbTableModel(alleArtikelImWarenkorb));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LB_Warenkorb = new javax.swing.JLabel();
        PANEL_Gesamt = new javax.swing.JPanel();
        LB_SUM_Gesamtpreis = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBL_Warenkorb = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 769));

        LB_Warenkorb.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        LB_Warenkorb.setText("Warenkorb");

        javax.swing.GroupLayout PANEL_GesamtLayout = new javax.swing.GroupLayout(PANEL_Gesamt);
        PANEL_Gesamt.setLayout(PANEL_GesamtLayout);
        PANEL_GesamtLayout.setHorizontalGroup(
            PANEL_GesamtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PANEL_GesamtLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LB_SUM_Gesamtpreis, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PANEL_GesamtLayout.setVerticalGroup(
            PANEL_GesamtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL_GesamtLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(LB_SUM_Gesamtpreis, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TBL_Warenkorb.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TBL_Warenkorb);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(836, 836, 836)
                        .addComponent(PANEL_Gesamt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LB_Warenkorb)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 845, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LB_Warenkorb)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(PANEL_Gesamt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LB_SUM_Gesamtpreis;
    private javax.swing.JLabel LB_Warenkorb;
    private javax.swing.JPanel PANEL_Gesamt;
    private javax.swing.JTable TBL_Warenkorb;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
