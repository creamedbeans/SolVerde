/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package solverde;

import java.util.Random;
import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author jamie
 */
public class CostPlanGUI extends javax.swing.JFrame {
    private List<String> calculationHistory = new ArrayList<>(); // stores results from calculation to be displayed/deleted
    /**
     * Creates new form CostPlanGUI
     */
    public CostPlanGUI() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        AnnualRadioButton = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CostInput = new javax.swing.JTextField();
        CalculateButton = new javax.swing.JButton();
        SolarCalcTitle = new javax.swing.JLabel();
        HomePage = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        InfoBox = new javax.swing.JTextArea();
        DailyRadioButton = new javax.swing.JRadioButton();
        WeeklyRadioButton = new javax.swing.JRadioButton();
        MonthlyRadioButton = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        CostOutput = new javax.swing.JTextArea();
        AddButton = new javax.swing.JButton();
        DisplayButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(76, 181, 181));
        setForeground(new java.awt.Color(76, 181, 181));
        setPreferredSize(new java.awt.Dimension(421, 626));

        jPanel1.setBackground(new java.awt.Color(76, 181, 181));

        buttonGroup1.add(AnnualRadioButton);
        AnnualRadioButton.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 0, 24)); // NOI18N
        AnnualRadioButton.setText("Annually");

        jLabel1.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 0, 24)); // NOI18N
        jLabel1.setText("Please Enter amount in euros you would like to calcuate into small box");

        jLabel2.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 0, 24)); // NOI18N
        jLabel2.setText("aswell as over what period of time");

        CalculateButton.setBackground(new java.awt.Color(72, 211, 156));
        CalculateButton.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 0, 48)); // NOI18N
        CalculateButton.setText("CALCULATE");
        CalculateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculateButtonActionPerformed(evt);
            }
        });

        SolarCalcTitle.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 0, 48)); // NOI18N
        SolarCalcTitle.setForeground(new java.awt.Color(255, 153, 51));
        SolarCalcTitle.setText("Cost PLanner");

        HomePage.setBackground(new java.awt.Color(72, 211, 156));
        HomePage.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 0, 30)); // NOI18N
        HomePage.setText("Home Page");
        HomePage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomePageActionPerformed(evt);
            }
        });

        InfoBox.setEditable(false);
        InfoBox.setColumns(20);
        InfoBox.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 0, 24)); // NOI18N
        InfoBox.setRows(5);
        InfoBox.setText("On this page, you can calcuate your average savings\nwhen you switch to solar energy!\nsimply pick what time period you wish to calculate\nenter your amount in euros, and hit calculate\nyour result will appear in the text field below!\n");
        jScrollPane1.setViewportView(InfoBox);

        buttonGroup1.add(DailyRadioButton);
        DailyRadioButton.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 0, 24)); // NOI18N
        DailyRadioButton.setText("Daily");
        DailyRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DailyRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(WeeklyRadioButton);
        WeeklyRadioButton.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 0, 24)); // NOI18N
        WeeklyRadioButton.setText("Weekly");

        buttonGroup1.add(MonthlyRadioButton);
        MonthlyRadioButton.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 0, 24)); // NOI18N
        MonthlyRadioButton.setText("Monthly");
        MonthlyRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MonthlyRadioButtonActionPerformed(evt);
            }
        });

        CostOutput.setEditable(false);
        CostOutput.setColumns(20);
        CostOutput.setRows(5);
        jScrollPane2.setViewportView(CostOutput);

        AddButton.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 0, 18)); // NOI18N
        AddButton.setText("Add");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        DisplayButton.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 0, 18)); // NOI18N
        DisplayButton.setText("Display");
        DisplayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayButtonActionPerformed(evt);
            }
        });

        DeleteButton.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 0, 18)); // NOI18N
        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(SolarCalcTitle)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(AnnualRadioButton)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(WeeklyRadioButton)
                                    .addComponent(MonthlyRadioButton)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(DailyRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(AddButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(DisplayButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DeleteButton)
                                .addGap(18, 18, 18)
                                .addComponent(HomePage))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(CostInput, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(CalculateButton))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(SolarCalcTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DailyRadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(WeeklyRadioButton))
                            .addComponent(CalculateButton, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(CostInput, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(MonthlyRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AnnualRadioButton))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HomePage)
                    .addComponent(AddButton)
                    .addComponent(DisplayButton)
                    .addComponent(DeleteButton))
                .addGap(191, 191, 191))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HomePageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomePageActionPerformed
        //Adds the function to the home button to bring the user to the home page//
        mainGUI MainPageGUI = new mainGUI();
        MainPageGUI.setVisible(true);
        //closes the current page//
        this.dispose();
    }//GEN-LAST:event_HomePageActionPerformed

    private void MonthlyRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MonthlyRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MonthlyRadioButtonActionPerformed

    private void CalculateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculateButtonActionPerformed
        try{
            //read Input cost from CostInput textarea
            String inputText = CostInput.getText();
            double currentCost = Double.parseDouble(inputText);
            
            //determine which calculator to use based on which radiotoggle is picked
            CostCalculator calculator = null;
            if(DailyRadioButton.isSelected()){
                calculator = new DailyCalculator();
            } else if (WeeklyRadioButton.isSelected()){
                calculator = new WeeklyCalculator();
            } else if (MonthlyRadioButton.isSelected()){
                calculator = new MonthlyCalculator();
            } else if (AnnualRadioButton.isSelected()){
                calculator = new AnnualCalculator();
            } else{
                JOptionPane.showMessageDialog(this,"No Radio button slected");
            }
            
            //perform the calculation
            double solarCost = calculator.calculate(currentCost);
            
            //calculate the amount saved 
            double savings = currentCost - solarCost;
            
            // generate an array of objects of random quotes
            RandomQuotes[] quotes = {
                new RandomQuotes("By Switching to solar energy, you could go from spending"),
                new RandomQuotes("Your total eletricity costs could go from"),
                new RandomQuotes("Switch to solar energy today and your spendings will go from"),
                new RandomQuotes("With our calculation you could go from spending")
            };
            
            //Randomly Select a Object from the Array
            Random random = new Random();
            RandomQuotes selectedQuote = quotes[random.nextInt(quotes.length)];
            
            //get the division percentage from the selected calculator
            double divisionPercentage = calculator.percentage;
            
            //Build the Final Message, showing the random quote, the price entered vs the price recieved, the amount saved, and the percentage saved
            String resultMessage = selectedQuote.getQuote() + "\n" +
                    "Current Cost: " +String.format("€%.2f", currentCost) + " to " +
                    String.format("€%.2f", solarCost) + "\n" +
                    "Savings: " + String.format("€%.2f", savings) + "\n" +
                    "You save " +(int)(divisionPercentage * 100) + "% by switching to solar energy!" + "\n"+
                    "Start Saving today by Switching to solar energy!";
            
            //set the result in the CostOutput text area
            CostOutput.setText(resultMessage);
        }catch (NumberFormatException ex){
            // handle wrong input
            JOptionPane.showMessageDialog(this,"Please enter a valid number");
        }
    }//GEN-LAST:event_CalculateButtonActionPerformed

    private void DailyRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DailyRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DailyRadioButtonActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        // function to add the last entry shown to a list
        String calcResult = CostOutput.getText();
        if(!calcResult.isEmpty()){
            calculationHistory.add(calcResult);
            JOptionPane.showMessageDialog(this,"Result added to History!");
            } else {
            JOptionPane.showMessageDialog(this,"no result to add, please perform a calculation");
        }
    }//GEN-LAST:event_AddButtonActionPerformed

    private void DisplayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayButtonActionPerformed
        // displays the list from the ADD button 
        if(calculationHistory.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No Results Saved");
        } else {
            StringBuilder history = new StringBuilder("Calculation History \n");
            for (String result : calculationHistory){
                history.append(result).append("\n");   
            }
            JOptionPane.showMessageDialog(this, history.toString());
            
            
    }//GEN-LAST:event_DisplayButtonActionPerformed
  }
    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        //deletes the last entry in the list 
        if (calculationHistory.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No Results Saved");
             } else {
                calculationHistory.remove(calculationHistory.size() - 1);
                JOptionPane.showMessageDialog(this,"Last saved result Deleted");
        }
    }//GEN-LAST:event_DeleteButtonActionPerformed

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
            java.util.logging.Logger.getLogger(CostPlanGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CostPlanGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CostPlanGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CostPlanGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CostPlanGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JRadioButton AnnualRadioButton;
    private javax.swing.JButton CalculateButton;
    private javax.swing.JTextField CostInput;
    private javax.swing.JTextArea CostOutput;
    private javax.swing.JRadioButton DailyRadioButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton DisplayButton;
    private javax.swing.JButton HomePage;
    private javax.swing.JTextArea InfoBox;
    private javax.swing.JRadioButton MonthlyRadioButton;
    private javax.swing.JLabel SolarCalcTitle;
    private javax.swing.JRadioButton WeeklyRadioButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
