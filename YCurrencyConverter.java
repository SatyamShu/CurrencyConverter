/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Y_Currency_Converter;

/**
 *
 * @author pc
 */
public class YCurrencyConverter extends javax.swing.JFrame {
    double Afghani = 89.8278;
double Lek = 119.064;
double Algerian_Dinar = 171.788;               
double Euro = 1.18550;
double US_Dollar = 1.26864;
double Indian_Rupee = 106.039;
    
    
    
    String[] currencyUnits={
"units",
"Afghani",
"Lek",
"Algerian Dinar",                
"Euro",
"US Dollar",
"Indian Rupee",
    };
    /**
     * Creates new form YCurrencyConverter
     */
public YCurrencyConverter() {
       initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        firstCountry = new javax.swing.JComboBox<String>();
        secondCountry = new javax.swing.JComboBox<String>();
        t2 = new javax.swing.JTextField();
        t1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        firstCurrencyUnit = new javax.swing.JLabel();
        secondCurrencyUnit = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(51, 255, 51)));
        jPanel1.setToolTipText("");
        jPanel1.setAutoscrolls(true);
        jPanel1.setInheritsPopupMenu(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("CURRENCY CONVERTER");

        firstCountry.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        firstCountry.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose one...", "Afghanistan", "Albania", "Algeria", "Andorra", "USA", "India" }));
        firstCountry.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                firstCountryItemStateChanged(evt);
            }
        });
        firstCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstCountryActionPerformed(evt);
            }
        });

        secondCountry.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        secondCountry.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose one...", "Afghanistan", "Albania", "Algeria", "Andorra", "USA", "India" }));
        secondCountry.setAutoscrolls(true);
        secondCountry.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                secondCountryItemStateChanged(evt);
            }
        });

        t2.setEditable(false);
        t2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });

        t1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("From Currency");
        jLabel2.setAutoscrolls(true);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("To Currency");
        jLabel3.setAutoscrolls(true);

        firstCurrencyUnit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        firstCurrencyUnit.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        firstCurrencyUnit.setText("UNITS");
        firstCurrencyUnit.setAutoscrolls(true);

        secondCurrencyUnit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        secondCurrencyUnit.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        secondCurrencyUnit.setText("UNITS");
        secondCurrencyUnit.setAutoscrolls(true);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("CONVERT CURRENCY");
        jButton1.setAutoscrolls(true);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("RESET");
        jButton2.setAutoscrolls(true);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("EXIT");
        jButton3.setAutoscrolls(true);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(t1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(firstCurrencyUnit, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                    .addComponent(firstCountry, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(secondCurrencyUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(secondCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(88, 88, 88))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jButton1)
                        .addGap(70, 70, 70)
                        .addComponent(jButton2)
                        .addGap(103, 103, 103)
                        .addComponent(jButton3)))
                .addContainerGap(260, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(secondCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstCountry))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(firstCurrencyUnit, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                            .addComponent(secondCurrencyUnit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(220, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton1)
                            .addComponent(jButton3))
                        .addGap(107, 107, 107))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void firstCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstCountryActionPerformed
             // TODO add your handling code here:
    }//GEN-LAST:event_firstCountryActionPerformed

    private void firstCountryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_firstCountryItemStateChanged
      firstCurrencyUnit.setText(currencyUnits[firstCountry.getSelectedIndex()]);    
        
    }//GEN-LAST:event_firstCountryItemStateChanged

    private void secondCountryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_secondCountryItemStateChanged
       
         secondCurrencyUnit.setText(currencyUnits[secondCountry.getSelectedIndex()]);

    }//GEN-LAST:event_secondCountryItemStateChanged

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        double amountToChange = Double.parseDouble(t1.getText());
        
        double amountInPounds = 0.0;
        
        double amountChanged = 0.0 ;
        
        switch(firstCountry.getSelectedItem().toString())
        {
        case "Afghanistan": amountInPounds = amountToChange / Afghani;break;
        case "Albania": amountInPounds = amountToChange / Lek;break;
        case "Algeria": amountInPounds = amountToChange / Algerian_Dinar;break;
        case "Aldorra": amountInPounds = amountToChange / Euro;break;
        case "USA": amountInPounds = amountToChange / US_Dollar;break;   
        case "India": amountInPounds = amountToChange / Indian_Rupee;break; 
        default : amountInPounds = 0.0;   
            
    }
      
      switch(secondCountry.getSelectedItem().toString())
      {
           case "Afghanistan": amountChanged = amountInPounds *Afghani;break;
           case "Albania": amountChanged = amountInPounds *Lek;break;    
           case "Algeria": amountChanged = amountInPounds *Algerian_Dinar;break;   
           case "Aldorra": amountChanged = amountInPounds *Euro;break;  
           case "USA": amountChanged = amountInPounds *US_Dollar;break; 
           case "India": amountChanged = amountInPounds *Indian_Rupee;break; 
           default : amountChanged = amountInPounds * 0.0;   
      } 
      
       String value = String.format("%.2f", amountChanged);
      t2.setText(value);
       //CONVERT CURRENCY
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
         //EXIT
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        firstCountry.setSelectedIndex(0);
        secondCountry.setSelectedIndex(0);
        t1.setText("");
        t2.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed
    
        
        
    
    
   
       
        
        
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(YCurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(YCurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(YCurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(YCurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new YCurrencyConverter().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> firstCountry;
    private javax.swing.JLabel firstCurrencyUnit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JComboBox<String> secondCountry;
    private javax.swing.JLabel secondCurrencyUnit;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    // End of variables declaration//GEN-END:variables
}
