/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.Business;
import Model.InsurancePlans;
import Model.Validation;
import javax.swing.JOptionPane;

/**
 *
 * @author nishipancholi
 */
public class AddInsurancePlansJPanel extends javax.swing.JPanel {

    private Business business;
    private Validation validation;
    /**
     * Creates new form InsurancePlansJPanel
     */
    public AddInsurancePlansJPanel() {
        initComponents();
    }

    AddInsurancePlansJPanel(Business business) {
        initComponents();
        this.business=business;
        this.validation = new Validation();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        planIdLabel = new javax.swing.JLabel();
        planNameLabel = new javax.swing.JLabel();
        costPerMonthLabel = new javax.swing.JLabel();
        costperAnnumLabel = new javax.swing.JLabel();
        planIdfield = new javax.swing.JTextField();
        planNameField = new javax.swing.JTextField();
        costMonthField = new javax.swing.JTextField();
        costAnnualField = new javax.swing.JTextField();
        addInsPlanbtn = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        planIdLabel.setText("Plan Id");
        jPanel1.add(planIdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        planNameLabel.setText("Plan Name");
        jPanel1.add(planNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        costPerMonthLabel.setText("Cost Per Month");
        jPanel1.add(costPerMonthLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        costperAnnumLabel.setText("Cost Per Annum");
        jPanel1.add(costperAnnumLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));
        jPanel1.add(planIdfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 170, -1));
        jPanel1.add(planNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 170, -1));

        costMonthField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                costMonthFieldFocusLost(evt);
            }
        });
        jPanel1.add(costMonthField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 170, -1));

        costAnnualField.setEnabled(false);
        jPanel1.add(costAnnualField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 170, -1));

        addInsPlanbtn.setText("Add Insurance Plan");
        addInsPlanbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addInsPlanbtnActionPerformed(evt);
            }
        });
        jPanel1.add(addInsPlanbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, -1, -1));

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void addInsPlanbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addInsPlanbtnActionPerformed
        // TODO add your handling code here:
        InsurancePlans plan=this.business.getInsurancePlan();
        
        String id = planIdfield.getText();
        String name = planNameField.getText();
        String costPerMonth = costMonthField.getText();
        String costPerAnnum= costAnnualField.getText();
        
        boolean isIdNotNull = this.validation.checkNullEmpty(id);
        boolean isNameNotNull = this.validation.checkNullEmpty(name);
        boolean isMonthlyCostNotNull = this.validation.checkNullEmpty(costPerMonth);
        boolean isAnnualCostNotNull = this.validation.checkNullEmpty(costPerAnnum);
        if(isIdNotNull && isNameNotNull && isMonthlyCostNotNull && isAnnualCostNotNull){
            if(plan.checkIfPlanUnique(Integer.valueOf(id)))
            {
            plan.createInsurancePlan(Integer.valueOf(id), name, Float.valueOf(costPerMonth), Float.valueOf(costPerAnnum));
            JOptionPane.showMessageDialog(null,"Plan Added");
            }
            else{
                JOptionPane.showMessageDialog(null,"Id should be unique");
            }
        }
    }//GEN-LAST:event_addInsPlanbtnActionPerformed

    private void costMonthFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_costMonthFieldFocusLost
        // TODO add your handling code here:
        float costPerMonth = Float.valueOf(costMonthField.getText());
        float costPerAnnum = costPerMonth*12;
        costAnnualField.setText(String.valueOf((costPerAnnum)));
    }//GEN-LAST:event_costMonthFieldFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addInsPlanbtn;
    private javax.swing.JTextField costAnnualField;
    private javax.swing.JTextField costMonthField;
    private javax.swing.JLabel costPerMonthLabel;
    private javax.swing.JLabel costperAnnumLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel planIdLabel;
    private javax.swing.JTextField planIdfield;
    private javax.swing.JTextField planNameField;
    private javax.swing.JLabel planNameLabel;
    // End of variables declaration//GEN-END:variables
}
