/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.AdminWorkArea;

import AppSystem.ApplicationSystem;
import LibrarianArea.Branch;
import LibrarianArea.Employee;
import LibrarianArea.Library;
import LibrarianArea.UserAccount;
import LibrarianArea.UserDirectory;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nishipancholi
 */
public class BranchJPanel extends javax.swing.JPanel {

    private UserAccount useraccount;
    private ApplicationSystem system;
    DefaultTableModel tableModel;
    /**
     * Creates new form LibrarianJPanel
     */
    public BranchJPanel() {
        initComponents();
    }

    BranchJPanel(ApplicationSystem system, UserAccount useraccount) {
        initComponents();
        
        this.system = system;
        this.useraccount = useraccount;
        this.tableModel = (DefaultTableModel) branchTable.getModel();
        
        populate();
    }

    public void populate() {
        
        tableModel.setRowCount(0);
        for(Branch b: this.system.getBranchList()) {
            Library lib= b.getLibrary();
            
            Object[] row = new Object[6];
            
            row[0] = b;
            row[1] = b.getBranchID();
            row[2] = lib.getLibraryID();
            row[3] = lib.getLibraryName();
            row[4] = lib.getLocation();
            row[5] = lib.getBuildingNo();
            
            tableModel.addRow(row);
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

        fieldBranchName = new javax.swing.JTextField();
        fieldLibraryName = new javax.swing.JTextField();
        fieldBuildingNo = new javax.swing.JTextField();
        addBranch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        branchTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fieldLocation = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        deleteBranch = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(fieldBranchName, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 120, 30));
        add(fieldLibraryName, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 86, 120, 30));

        fieldBuildingNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldBuildingNoActionPerformed(evt);
            }
        });
        add(fieldBuildingNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 182, 120, 30));

        addBranch.setText("ADD BRANCH");
        addBranch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBranchActionPerformed(evt);
            }
        });
        add(addBranch, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        branchTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Branch Name", "Branch Id", "Library Id", "Library Name", "Location", "Building No"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(branchTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 0, -1, 253));

        jLabel1.setText("Location");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, -1, -1));

        jLabel2.setText("Branch Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        jLabel3.setText("Library Name");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, -1, -1));

        fieldLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldLocationActionPerformed(evt);
            }
        });
        add(fieldLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 134, 120, 30));

        jLabel4.setText("Building No");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, -1, -1));

        deleteBranch.setText("Delete Branch");
        deleteBranch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBranchActionPerformed(evt);
            }
        });
        add(deleteBranch, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 267, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void fieldBuildingNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldBuildingNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldBuildingNoActionPerformed

    private void addBranchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBranchActionPerformed
        // TODO add your handling code here:

        ArrayList<Branch> branchList= this.system.getBranchList();
        if(this.system.branchExists(fieldBranchName.getText())) {
            JOptionPane.showMessageDialog(null, "Sorry branch is already present.");
        }
        else {
            if(branchList.isEmpty()){
                Branch br= this.system.createBranch(fieldBranchName.getText());
                br.createLibrary(fieldLibraryName.getText(), fieldLocation.getText(), Integer.valueOf(fieldBuildingNo.getText()));
                populate();
            }
            else{
              for(Branch b:branchList){
                if(b.getLibrary().getLocation().equals(fieldLocation.getText())){
                   JOptionPane.showMessageDialog(null, "Sorry branch in this location is already present.");
                }
                else{
                    Branch br= this.system.createBranch(fieldBranchName.getText());
                    br.createLibrary(fieldLibraryName.getText(), fieldLocation.getText(), Integer.valueOf(fieldBuildingNo.getText()));
                    populate();
                }
              }
            }
            
            
        }
    }//GEN-LAST:event_addBranchActionPerformed

    private void fieldLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldLocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldLocationActionPerformed

    private void deleteBranchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBranchActionPerformed
        // TODO add your handling code here:
        int selectedRow= branchTable.getSelectedRow();
        if(selectedRow>=0){
            Branch b=(Branch) branchTable.getValueAt(selectedRow, 0);
            UserDirectory uaDir= this.system.getUserAccountDirectory();
            ArrayList<Employee> empList=b.getLibrary().getEmployeeDirectory().getEmployeeList();
            for(Employee emp:empList){
                System.out.println(emp.getUserName()+"empusername");
                UserAccount u=uaDir.findByUserName(emp.getUserName());
                System.out.println(u.getUsername()+"user");
                uaDir.removeUser(u);
            }
            this.system.removeBranch(b.getBranchName());
            JOptionPane.showMessageDialog(null,"Branch Deleted");
            populate();
        }
    }//GEN-LAST:event_deleteBranchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBranch;
    private javax.swing.JTable branchTable;
    private javax.swing.JButton deleteBranch;
    private javax.swing.JTextField fieldBranchName;
    private javax.swing.JTextField fieldBuildingNo;
    private javax.swing.JTextField fieldLibraryName;
    private javax.swing.JTextField fieldLocation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
