
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @@author Vansh Cahawla
 */

public class JFrameGenralInformation extends javax.swing.JFrame {

    /**
     * Creates new form jFrame5
     */
    public JFrameGenralInformation() throws FileNotFoundException {
        initComponents();
        ItemArray iArr = new ItemArray(); // creates a new ItemArray objects
        TextFieldTotalCost.setText("" + iArr.totalCost()); // displays the total cost value in the text field 
        TextFieldProfitMade.setText("" + iArr.totalProfit()); // displays the total profit value in the text field
        jTextAreaRunningLow.setText("" + iArr.runningLow()); // displays the list of items running low in the text area

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblGeneralInformation = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButtonHelp = new javax.swing.JButton();
        jButtonNext = new javax.swing.JButton();
        TextFieldTotalCost = new javax.swing.JTextField();
        TextFieldProfitMade = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaRunningLow = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 153));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblGeneralInformation.setFont(new java.awt.Font("Britannic Bold", 1, 24)); // NOI18N
        lblGeneralInformation.setText("General information about all the stock");
        getContentPane().add(lblGeneralInformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 480, -1));

        jLabel2.setFont(new java.awt.Font("Britannic Bold", 1, 18)); // NOI18N
        jLabel2.setText("Total cost of all stock in the past month: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 51, -1, -1));

        jLabel3.setFont(new java.awt.Font("Britannic Bold", 1, 18)); // NOI18N
        jLabel3.setText("Total Profit made in the past month: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 95, -1, -1));

        jLabel4.setFont(new java.awt.Font("Britannic Bold", 1, 18)); // NOI18N
        jLabel4.setText("Items running low on stock:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 128, -1, 20));

        jButtonHelp.setFont(new java.awt.Font("Britannic Bold", 1, 24)); // NOI18N
        jButtonHelp.setText("Help");
        jButtonHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHelpActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonHelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 100, 40));

        jButtonNext.setFont(new java.awt.Font("Britannic Bold", 1, 24)); // NOI18N
        jButtonNext.setText("Next");
        jButtonNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNextActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, 90, 40));

        TextFieldTotalCost.setFont(new java.awt.Font("Britannic Bold", 1, 18)); // NOI18N
        getContentPane().add(TextFieldTotalCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 90, 40));

        TextFieldProfitMade.setFont(new java.awt.Font("Britannic Bold", 1, 18)); // NOI18N
        getContentPane().add(TextFieldProfitMade, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 90, 40));

        jTextAreaRunningLow.setColumns(20);
        jTextAreaRunningLow.setFont(new java.awt.Font("Britannic Bold", 1, 18)); // NOI18N
        jTextAreaRunningLow.setRows(5);
        jScrollPane1.setViewportView(jTextAreaRunningLow);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 450, 200));

        jButton1.setText("Graph");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 80, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JButtonNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonNextActionPerformed

       

    }//GEN-LAST:event_JButtonNextActionPerformed

    private void JButtonHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonHelpActionPerformed
      
    }//GEN-LAST:event_JButtonHelpActionPerformed

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
         this.hide();// hides this jFrame
        JFrameMainMenu p = new JFrameMainMenu();// creates a new main menu jFrame
        p.show(); // diaplays the main menu
    }//GEN-LAST:event_jButtonNextActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 // Create a dataset from the text area content
        CategoryDataset dataset = createDataset();

        // Create a bar chart using JFreeChart
        JFreeChart barChart = ChartFactory.createBarChart(
                "Items Running Low on Stock", // Chart Title
                "Item", // Category Axis Label
                "Quantity", // Value Axis Label
                dataset, // Dataset
                PlotOrientation.VERTICAL,
                true, true, false
        );
         ChartPanel chartPanel = new ChartPanel(barChart);
        chartPanel.setPreferredSize(new java.awt.Dimension(560, 370));

        // Create a new JFrame to display the chart
        JFrame chartFrame = new JFrame("Bar Chart");
        chartFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        chartFrame.getContentPane().add(chartPanel);
        chartFrame.pack();
        chartFrame.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
private CategoryDataset createDataset() {
    DefaultCategoryDataset dataset = new DefaultCategoryDataset();

    // Parse the text area content and add data to the dataset
    String textAreaContent = jTextAreaRunningLow.getText().trim();
    //String stock = getStockLeft();
    //JOptionPane.showMessageDialog(this, textAreaContent);
    
    
    // Check if the text area is not empty
    if (!textAreaContent.isEmpty()) {
        String[] lines = textAreaContent.split("\n");
        
        for (String line : lines) {
            String[] parts = line.split(":");
            if (parts.length == 2) {
                String itemName = parts[0].trim();
                try {
                    int quantity = Integer.parseInt(parts[1].trim());
                    dataset.addValue(quantity, "Quantity", getStockLeft());
                } catch (NumberFormatException e) {
                    // Handle the case where the quantity is not a valid integer
                    System.err.println("Invalid quantity for item: " + itemName);
                }
            } else {
                // Handle the case where the line does not have the expected format
                System.err.println("Invalid line format: " + line);
            }
        }
    }
    return dataset;
}

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
            java.util.logging.Logger.getLogger(JFrameGenralInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameGenralInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameGenralInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameGenralInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new JFrameGenralInformation().setVisible(true);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(JFrameGenralInformation.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextFieldProfitMade;
    private javax.swing.JTextField TextFieldTotalCost;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonHelp;
    private javax.swing.JButton jButtonNext;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaRunningLow;
    private javax.swing.JLabel lblGeneralInformation;
    // End of variables declaration//GEN-END:variables

    private Comparable getStockLeft() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
