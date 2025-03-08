
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @@author Vansh Cahawla
 */
public class JFrameViewItem extends javax.swing.JFrame {

    Item temp = new Item(); // An object of the type Item to store the item that is to be displayed
    ItemArray iarray = new ItemArray(); // an object of the type ItemArray

    /**
     * Creates new form JFrame3
     */
    public JFrameViewItem() throws FileNotFoundException {
        initComponents();
        int input = -1; // Stores the itemNumber inputted by the user
        try {
            input = Integer.parseInt(JOptionPane.showInputDialog("Enter the itemNum")); // prompts the user to enter the itemNumber
        } catch (NumberFormatException e) {
            input = Integer.parseInt(JOptionPane.showInputDialog("Enter the correct itemNum"));
        }
        while (iarray.SearchItemNumber(input) == false) { // looks for the item Number in the array, while it is not found
            try {
                input = Integer.parseInt(JOptionPane.showInputDialog("Enter the itemNum")); // prompts the user to enter the itemNumber
            } catch (NumberFormatException e) {
                input = Integer.parseInt(JOptionPane.showInputDialog("Enter the correct itemNum"));
            } // The user is prompted to enter the itemNumber again
        }
        if (iarray.SearchItemNumber(input)) { //Looks for the ItemNumber in the array, and if it exists
            temp = iarray.SearchItem(input); // Stores the Item Found in the temp variable
            TextFieldItemNumber1.setText("" + temp.getItemNumber()); // Displays the Item Number of the item
            jTextFieldDescription.setText("" + temp.getDescription());// Displays the  description of the item
            TextFieldStockRemaining.setText("" + temp.getStockLeft());// Displays the numbrt of units left of the item
            TextFieldStockSold.setText("" + temp.getSoldMonthly());// Displays the number of units sold monthly of the item
            TextFieldStockCost.setText("" + temp.getCostPrice());// Displays the cost price of the item
            TextFieldDateOfNextOrder.setText("" + temp.getLastOrder());// Displays the date of last order of the item
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButtonHelp = new javax.swing.JButton();
        jButtonNext = new javax.swing.JButton();
        TextFieldItemNumber1 = new javax.swing.JTextField();
        jTextFieldDescription = new javax.swing.JTextField();
        TextFieldStockRemaining = new javax.swing.JTextField();
        TextFieldStockSold = new javax.swing.JTextField();
        TextFieldStockCost = new javax.swing.JTextField();
        TextFieldDateOfNextOrder = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Britannic Bold", 1, 18)); // NOI18N
        jLabel1.setText("Stock Remianing:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, 28));

        jLabel2.setFont(new java.awt.Font("Britannic Bold", 1, 18)); // NOI18N
        jLabel2.setText("Stock Sold: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 120, -1));

        jLabel3.setFont(new java.awt.Font("Britannic Bold", 1, 18)); // NOI18N
        jLabel3.setText("Cost for new Stock:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Britannic Bold", 1, 18)); // NOI18N
        jLabel4.setText("Item Number:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 140, 28));

        jLabel5.setFont(new java.awt.Font("Britannic Bold", 1, 18)); // NOI18N
        jLabel5.setText("Date of last order:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 170, 20));

        jLabel6.setFont(new java.awt.Font("Britannic Bold", 1, 18)); // NOI18N
        jLabel6.setText("Description: ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, -1));

        jButtonHelp.setFont(new java.awt.Font("Britannic Bold", 1, 24)); // NOI18N
        jButtonHelp.setText("Help");
        jButtonHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHelpActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonHelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 100, 50));

        jButtonNext.setFont(new java.awt.Font("Britannic Bold", 1, 24)); // NOI18N
        jButtonNext.setText("Next");
        jButtonNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNextActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 100, 50));

        TextFieldItemNumber1.setFont(new java.awt.Font("Britannic Bold", 1, 18)); // NOI18N
        TextFieldItemNumber1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldItemNumber1ActionPerformed(evt);
            }
        });
        getContentPane().add(TextFieldItemNumber1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 110, -1));

        jTextFieldDescription.setFont(new java.awt.Font("Britannic Bold", 1, 18)); // NOI18N
        jTextFieldDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDescriptionActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 110, -1));

        TextFieldStockRemaining.setFont(new java.awt.Font("Britannic Bold", 1, 18)); // NOI18N
        TextFieldStockRemaining.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldStockRemainingActionPerformed(evt);
            }
        });
        getContentPane().add(TextFieldStockRemaining, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 110, -1));

        TextFieldStockSold.setFont(new java.awt.Font("Britannic Bold", 1, 18)); // NOI18N
        TextFieldStockSold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldStockSoldActionPerformed(evt);
            }
        });
        getContentPane().add(TextFieldStockSold, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 112, 30));

        TextFieldStockCost.setFont(new java.awt.Font("Britannic Bold", 1, 18)); // NOI18N
        TextFieldStockCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldStockCostActionPerformed(evt);
            }
        });
        getContentPane().add(TextFieldStockCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 112, -1));

        TextFieldDateOfNextOrder.setFont(new java.awt.Font("Britannic Bold", 1, 18)); // NOI18N
        TextFieldDateOfNextOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldDateOfNextOrderActionPerformed(evt);
            }
        });
        getContentPane().add(TextFieldDateOfNextOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 112, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextFieldStockRemainingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldStockRemainingActionPerformed

    }//GEN-LAST:event_TextFieldStockRemainingActionPerformed

    private void JButtonNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonNextActionPerformed
       
    }//GEN-LAST:event_JButtonNextActionPerformed

    private void TextFieldItemNumber1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldItemNumber1ActionPerformed


    }//GEN-LAST:event_TextFieldItemNumber1ActionPerformed

    private void TextFieldStockSoldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldStockSoldActionPerformed

    }//GEN-LAST:event_TextFieldStockSoldActionPerformed

    private void TextFieldStockCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldStockCostActionPerformed

    }//GEN-LAST:event_TextFieldStockCostActionPerformed

    private void TextFieldDateOfNextOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldDateOfNextOrderActionPerformed

    }//GEN-LAST:event_TextFieldDateOfNextOrderActionPerformed

    private void jTextFieldDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDescriptionActionPerformed

    private void jButtonHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHelpActionPerformed
       if (Desktop.isDesktopSupported()) {
            try {
                File myFile = new File("HELP.pdf"); //Looks for the Help file 
                Desktop.getDesktop().open(myFile); //Opens up the help pdf file

            } catch (IOException ex) {
            }

        }
    }//GEN-LAST:event_jButtonHelpActionPerformed

    private void jButtonNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNextActionPerformed
        this.hide(); // Sets this frame to become invisible
        JFrameMainMenu p = new JFrameMainMenu(); // Creates a new Main Menu jFrame
        p.show(); // displays the new Main Menu jFrame
    }//GEN-LAST:event_jButtonNextActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new JFrameViewItem().setVisible(true);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(JFrameViewItem.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextFieldDateOfNextOrder;
    private javax.swing.JTextField TextFieldItemNumber1;
    private javax.swing.JTextField TextFieldStockCost;
    private javax.swing.JTextField TextFieldStockRemaining;
    private javax.swing.JTextField TextFieldStockSold;
    private javax.swing.JButton jButtonHelp;
    private javax.swing.JButton jButtonNext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextFieldDescription;
    // End of variables declaration//GEN-END:variables
}
