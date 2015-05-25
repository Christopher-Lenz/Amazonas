package View;

import DBService.ArtikelHelper;
import DBService.MyDatabaseConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Artikel;

/**
 *
 * @author fixch
 */
public class ArtikelForm extends javax.swing.JFrame {

    private static final MyDatabaseConnection dbVerbindung = new MyDatabaseConnection();

    enum FormState {

        ERSTELLEN,
        BEARBEITEN
    }
    FormState state = FormState.ERSTELLEN;

    HashMap<Integer, Integer> mehrwertsteuersaetze;
    HashMap<Integer, String> kategorien;

    private Artikel artikel;

    /**
     * Creates new form UserAnlegen
     */
    public ArtikelForm() throws SQLException {
        state = FormState.ERSTELLEN;
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        fillComboboxen();
        this.CheckBox_Aktiv.setSelected(true);
        this.LB_Aktion.setText("Artikel anlegen");
        this.BT_OK.setText("Artikel anlegen");
    }

    public ArtikelForm(Artikel artikel) throws SQLException {
        state = FormState.BEARBEITEN;
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        fillComboboxen();
        this.CheckBox_Aktiv.setSelected(true);
        this.LB_Aktion.setText("Artikel bearbeiten");
        this.BT_OK.setText("Artikel speichern");

        this.artikel = artikel;
        this.TB_Name.setText(artikel.getName());
        this.TF_Beschreibung.setText(artikel.getBeschreibung());
        StringBuilder sb = new StringBuilder();
        sb.append(artikel.getNettopreis());
        this.TB_Nettopreis.setText(sb.toString());

        // mehrwertsteuer
        StringBuilder sb2 = new StringBuilder();
        sb2.append(artikel.getMehrwertsteuer()); //artikel.getMehrwertsteuer()
        sb2.append("%");
        System.out.println(sb2);
        this.CB_Mehrwertsteuersatz.setEditable(true);
        this.CB_Mehrwertsteuersatz.setSelectedItem(sb2);

        // kategorie
        StringBuilder sb3 = new StringBuilder();
        sb3.append(artikel.getKategorie()); //artikel.getMehrwertsteuer()        
        System.out.println(sb3);
        this.CB_Kategorie.setEditable(true);
        this.CB_Kategorie.setSelectedItem(sb3);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LB_Name = new javax.swing.JLabel();
        TB_Name = new javax.swing.JTextField();
        LB_Aktion = new javax.swing.JLabel();
        LB_Beschreibung = new javax.swing.JLabel();
        TF_Beschreibung = new javax.swing.JTextField();
        LB_Nettopreis = new javax.swing.JLabel();
        TB_Nettopreis = new javax.swing.JTextField();
        LB_Mehrwertsteuersatz = new javax.swing.JLabel();
        CB_Mehrwertsteuersatz = new javax.swing.JComboBox();
        LB_Kategorie = new javax.swing.JLabel();
        CB_Kategorie = new javax.swing.JComboBox();
        LB_Aktiv = new javax.swing.JLabel();
        CheckBox_Aktiv = new javax.swing.JCheckBox();
        BT_OK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LB_Name.setText("Artikelname: *");

        LB_Aktion.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        LB_Aktion.setText("Artikel anlegen/bearbeiten");
        LB_Aktion.setName(""); // NOI18N

        LB_Beschreibung.setText("Beschreibung:");

        LB_Nettopreis.setText("Nettopreis: (in Cent) *");

        LB_Mehrwertsteuersatz.setText("Mehrwertsteuer: *");

        LB_Kategorie.setText("Kategorie: *");

        LB_Aktiv.setText("aktiv *");

        CheckBox_Aktiv.setSelected(true);

        BT_OK.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        BT_OK.setText("Anlegen/Bearbeiten");
        BT_OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_OKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LB_Kategorie)
                            .addComponent(LB_Aktiv))
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CB_Kategorie, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CheckBox_Aktiv)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LB_Beschreibung)
                            .addComponent(LB_Nettopreis)
                            .addComponent(LB_Name)
                            .addComponent(LB_Mehrwertsteuersatz))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CB_Mehrwertsteuersatz, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TB_Name)
                            .addComponent(TF_Beschreibung)
                            .addComponent(TB_Nettopreis)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LB_Aktion)
                            .addComponent(BT_OK))
                        .addGap(0, 175, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LB_Aktion)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LB_Name)
                    .addComponent(TB_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LB_Beschreibung)
                    .addComponent(TF_Beschreibung, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LB_Nettopreis)
                    .addComponent(TB_Nettopreis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(LB_Mehrwertsteuersatz))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CB_Mehrwertsteuersatz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CB_Kategorie, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LB_Kategorie))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CheckBox_Aktiv)
                    .addComponent(LB_Aktiv))
                .addGap(18, 18, 18)
                .addComponent(BT_OK)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BT_OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_OKActionPerformed
        if (state == FormState.ERSTELLEN) {
            erstelleArtikel();
        } else {
            try {
                bearbeiteArtikel();
            } catch (SQLException ex) {
                Logger.getLogger(ArtikelForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_BT_OKActionPerformed

    private void erstelleArtikel() {
        boolean aktiv = false;
        String name = "";
        String beschreibung = "";
        int nettoPreis = 0;
        int mehrwertsteuerID = 0;
        int kategorieID = 0;
        String fehlermeldung = "";

        if (this.CheckBox_Aktiv.isSelected()) {
            aktiv = true;
        }

        if (!"".equals(this.TB_Name.getText().trim())) {
            name = this.TB_Name.getText();
        } else {
            fehlermeldung += "Bitte geben Sie einen Artikelnamen ein\n";
        }

        beschreibung = this.TF_Beschreibung.getText(); //optionales Feld

        if (!"".equals(this.TB_Nettopreis.getText().trim())) {
            try {
                nettoPreis = Integer.parseInt(this.TB_Nettopreis.getText());
            } catch (Exception ex) {
            }
            if (nettoPreis == 0) //kein Integer eingegeben
            {
                fehlermeldung += "Ungültiger Nettopreis eingegeben (Hinweis: Preis in Cent angeben)\n";
            }
        } else {
            fehlermeldung += "Bitte geben Sie einen Nettopreis ein\n";
        }

        mehrwertsteuerID = getMehrwertsteuerIDFromForm();
        if (mehrwertsteuerID == 0) {
            fehlermeldung += "Fehler beim Auslesen des Mehrwertsteuersatzes\n";
        }

        kategorieID = getKategorieIDFromForm();
        if (kategorieID == 0) {
            fehlermeldung += "Fehler beim Auslesen der Kategorie\n";
        }

        if (!"".equals(fehlermeldung)) {
            JOptionPane.showMessageDialog(this, fehlermeldung);
        } else {
            try {
                if (ArtikelHelper.insertArticle(name, beschreibung, nettoPreis, mehrwertsteuerID, kategorieID, aktiv)) {
                    JOptionPane.showMessageDialog(this, "Artikel erfolgreich angelegt");
                    this.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(this, "Fehler beim Anlegen des Artikels");
                }
            } catch (SQLException ex) {
                Logger.getLogger(ArtikelForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void bearbeiteArtikel() throws SQLException {
        System.out.println("bearbeiten");
        int id = artikel.getId();
        String name = this.TB_Name.getText();
        String beschreibung = this.TF_Beschreibung.getText();
        int nettopreis = Integer.parseInt(this.TB_Nettopreis.getText());
        int mehrwertsteuerID = 1; //TODO: Integer.parseInt(this.CB_Mehrwertsteuersatz.getSelectedItem().toString());
        int kategorieID = 1; //TODO: 
        boolean aktiv = true;

        if (ArtikelHelper.updateArticle(name, beschreibung, nettopreis, mehrwertsteuerID, kategorieID, aktiv, id)) {
            JOptionPane.showMessageDialog(this, "Artikel erfolgreich gespeichert");
            this.setVisible(false);

        } else {
            JOptionPane.showMessageDialog(this, "Fehler: Artikel konnte nicht gespeichert werden");
        }
    }

    //Füllt die Comboboxen mit Werten
    private void fillComboboxen() throws SQLException {
        //Mehrwertsteuersätze
        this.mehrwertsteuersaetze = getMehrwertsteuersaetzeFromDB();
        ArrayList<Integer> alleIDsMehrwertsteuer = new ArrayList<>();
        alleIDsMehrwertsteuer.addAll(this.mehrwertsteuersaetze.keySet());
        for (int i = 0; i < alleIDsMehrwertsteuer.size(); i++) {
            this.CB_Mehrwertsteuersatz.addItem(this.mehrwertsteuersaetze.get(alleIDsMehrwertsteuer.get(i)) + "%");
        }

        //Kategorien
        this.kategorien = getKategorienFromDB();
        ArrayList<Integer> alleIDsKategorien = new ArrayList<>();
        alleIDsKategorien.addAll(this.kategorien.keySet());
        for (int i = 0; i < alleIDsKategorien.size(); i++) {
            this.CB_Kategorie.addItem(this.kategorien.get(alleIDsKategorien.get(i)));
        }
    }

    //Gibt die MehrwertsteuerID für den Wert aus dem Formular zurück
    private int getMehrwertsteuerIDFromForm() {
        String eingabe = (String) this.CB_Mehrwertsteuersatz.getSelectedItem();
        if (eingabe.endsWith("%")) {
            eingabe = eingabe.substring(0, eingabe.length() - 1);
        }
        int cbValue = 0;
        try {
            cbValue = Integer.parseInt(eingabe);
        } catch (Exception ex) {
        }
        if (cbValue != 0) //Eingabe ist in Integer umwandelbar
        {
            int i = 0;
            for (int wert : this.mehrwertsteuersaetze.values()) {
                if (wert == cbValue) {
                    Set alleIDs = this.mehrwertsteuersaetze.keySet();
                    return (int) alleIDs.toArray()[i];
                }
                i++;
            }
        }
        return 0; //Fehler
    }

    //Gibt die KategorieID für den Wert aus dem Formular zurück
    private int getKategorieIDFromForm() {
        String eingabe = (String) this.CB_Kategorie.getSelectedItem();
        int i = 0;
        if (!"".equals(eingabe.trim())) {
            for (String wert : this.kategorien.values()) {
                if (wert.equals(eingabe)) {
                    Set alleIDs = this.kategorien.keySet();
                    return (int) alleIDs.toArray()[i];
                }
                i++;
            }
        }
        return 0; //Fehler
    }

    //Gibt eine HashMap mit Key: MehrwertsteuerID und Value: Mehrwertsteuersatz zurück
    private HashMap<Integer, Integer> getMehrwertsteuersaetzeFromDB() throws SQLException {
        String sql;
        sql = "SELECT * FROM \"Mehrwertsteuer\"";
        ResultSet res = ArtikelForm.dbVerbindung.executeQuery(sql);
        HashMap<Integer, Integer> mehrwertsteuersaetze = new HashMap<>();
        int id = 0;
        int mehrwertsteuersatz = 0;
        while (res.next()) {
            id = Integer.parseInt(res.getString("id"));
            mehrwertsteuersatz = Integer.parseInt(res.getString("mehrwertsteuersatz"));
            if (id != 0 && mehrwertsteuersatz != 0) {
                mehrwertsteuersaetze.put(id, mehrwertsteuersatz);
            }
        }
        return mehrwertsteuersaetze;
    }

    //Gibt eine HashMap mit Key: KatergorieID und Value: Katoegoriename zurück
    private HashMap<Integer, String> getKategorienFromDB() throws SQLException {
        String sql;
        sql = "SELECT * FROM \"Kategorie\"";
        ResultSet res = ArtikelForm.dbVerbindung.executeQuery(sql);
        HashMap<Integer, String> alleKategorien = new HashMap<>();
        int id = 0;
        String kategorie = "";
        while (res.next()) {
            id = Integer.parseInt(res.getString("id"));
            kategorie = res.getString("name");
            if (id != 0 && !"".equals(kategorie)) {
                alleKategorien.put(id, kategorie);
            }
        }
        return alleKategorien;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_OK;
    private javax.swing.JComboBox CB_Kategorie;
    private javax.swing.JComboBox CB_Mehrwertsteuersatz;
    private javax.swing.JCheckBox CheckBox_Aktiv;
    private javax.swing.JLabel LB_Aktion;
    private javax.swing.JLabel LB_Aktiv;
    private javax.swing.JLabel LB_Beschreibung;
    private javax.swing.JLabel LB_Kategorie;
    private javax.swing.JLabel LB_Mehrwertsteuersatz;
    private javax.swing.JLabel LB_Name;
    private javax.swing.JLabel LB_Nettopreis;
    private javax.swing.JTextField TB_Name;
    private javax.swing.JTextField TB_Nettopreis;
    private javax.swing.JTextField TF_Beschreibung;
    // End of variables declaration//GEN-END:variables
}
