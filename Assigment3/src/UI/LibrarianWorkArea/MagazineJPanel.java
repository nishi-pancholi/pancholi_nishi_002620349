/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.LibrarianWorkArea;

import AppSystem.ApplicationSystem;
import General.Magazine;
import LibrarianArea.Branch;
import LibrarianArea.UserAccount;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nishipancholi
 */
public class MagazineJPanel extends javax.swing.JPanel {
       private UserAccount useraccount;
       private ApplicationSystem system;
       DefaultTableModel tableModel;
    /**
     * Creates new form MagazineJPanel
     */
    public MagazineJPanel() {
        initComponents();
    }

    MagazineJPanel(ApplicationSystem system, UserAccount useraccount) {
        initComponents();
        this.system = system;
        this.useraccount = useraccount;
        this.tableModel = (DefaultTableModel) magTable.getModel();
        
        populate();
    }
    
    public void populate() {
        tableModel.setRowCount(0);
        ArrayList<Branch> branchList = this.system.getBranchList();
        for(Branch branch: branchList){
            ArrayList<Magazine> magazineList=branch.getLibrary().getMagazineDirectory().getMagazinelist();
            for(Magazine mag: magazineList){
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String date = sdf.format(mag.getRegistrationDate());
                Object[] row = new Object[6];
            
                row[0] = mag.getSerialNumber();
                row[1] = mag.getName();
                row[2] = date;
                row[3] = mag.getCompanyName();
                row[4] = mag.getIssueType();
                row[5] = mag.isIsAvailable();
                
                tableModel.addRow(row);
            }
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

        fieldMagName = new javax.swing.JTextField();
        fieldMagCompanyName = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        issueTypeComboBox = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        magTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(fieldMagName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 260, -1));
        add(fieldMagCompanyName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 260, -1));
        add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 260, -1));

        jLabel1.setText("Add Magazine");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        jLabel2.setText("Issue Type:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, 20));

        jLabel3.setText("Magazine Name:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jLabel4.setText("Registration Date:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, 20));

        jLabel5.setText("Company Name:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, 20));

        issueTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "weekly", "fortnightly", "mothly", "quaterly" }));
        add(issueTypeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 260, -1));

        jButton1.setText("Add Magazine");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, -1, -1));

        magTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Serial Number", "Magazine Name", "Registration Date", "Company Name", "Issue Type", "isAvailable"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(magTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 560, 200));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        String magName= fieldMagName.getText();
        String magCompanyName= fieldMagCompanyName.getText();
        Date registrationDate= jDateChooser1.getDate();
        String issueTypeDetails =(String) issueTypeComboBox.getSelectedItem();
        
        ArrayList<Branch> branchList = this.system.getBranchList();
        for(Branch branch: branchList){
            branch.getLibrary().getMagazineDirectory().createMagazine(magName, registrationDate, true, magCompanyName, issueTypeDetails);
            JOptionPane.showMessageDialog(null, "Magazine Created.");
            populate();    
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fieldMagCompanyName;
    private javax.swing.JTextField fieldMagName;
    private javax.swing.JComboBox<String> issueTypeComboBox;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable magTable;
    // End of variables declaration//GEN-END:variables
}
