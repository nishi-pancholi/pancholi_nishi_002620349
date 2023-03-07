/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.AdminWorkArea;

import AppSystem.ApplicationSystem;
import LibrarianArea.Branch;
import LibrarianArea.Employee;
import LibrarianArea.EmployeeDirectory;
import LibrarianArea.UserAccount;
import LibrarianArea.UserDirectory;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nishipancholi
 */
public class EmployeeJPanel extends javax.swing.JPanel {

    private UserAccount useraccount;
    private ApplicationSystem system;
    DefaultTableModel tableModel;
    /**
     * Creates new form EmployeeJPanel
     */
    public EmployeeJPanel() {
        initComponents();
    }

    EmployeeJPanel(ApplicationSystem system, UserAccount useraccount) {
       initComponents();
       this.system = system;
       this.useraccount = useraccount;
       this.tableModel = (DefaultTableModel) empTable.getModel();
        populate();
        populateDropdown();
    }

    public void populate() {
        
        tableModel.setRowCount(0);
        for(Branch b: this.system.getBranchList()) {
            ArrayList<Employee> empList= b.getLibrary().getEmployeeDirectory().getEmployeeList();
            for(Employee emp: empList) {
            Object[] row = new Object[6];
            
            row[0] = b.getLibrary().getLibraryName();
            row[1] = emp.getPersonID();
            row[2] = emp.getName();
            row[3] = emp.getAge();
            row[4] = emp.getExperience();
            row[5] = emp.getDesignation();
            
            tableModel.addRow(row);
            }
        }
        
    }
    
    public void populateDropdown(){
        
        ArrayList<Branch> branchDetail= this.system.getBranchList();
        
        for(Branch b:branchDetail){
            libComboBox.addItem(b);
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

        libComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        addBranchManagerBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        empTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        fieldLibExp = new javax.swing.JTextField();
        fieldManagerName = new javax.swing.JTextField();
        fieldManagerAge = new javax.swing.JTextField();
        fieldManagerExp = new javax.swing.JTextField();
        fieldLibName = new javax.swing.JTextField();
        fieldLibAge = new javax.swing.JTextField();
        fieldLibPassword = new javax.swing.JTextField();
        fieldLibUsername = new javax.swing.JTextField();
        fieldManagerUsername = new javax.swing.JTextField();
        fieldManagerPassword = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add(libComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 250, -1));

        jLabel1.setText("Select the Branch:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        jLabel2.setText("Branch Manager");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));

        jLabel3.setText("Librarian");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, -1, -1));

        addBranchManagerBtn.setText("Add Branch Manager");
        addBranchManagerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBranchManagerBtnActionPerformed(evt);
            }
        });
        add(addBranchManagerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, -1));

        jButton1.setText("Add Librarian");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, 190, -1));

        empTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Branch Name", "Employee Id", "Employee Name", "Age", "Experience", "Designation"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(empTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 330, 550, 170));

        jLabel4.setText("Name");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, -1, -1));

        jLabel5.setText("Age");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, -1, -1));

        jLabel6.setText("Experience");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, -1, -1));

        jLabel7.setText("UserName");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, -1, -1));

        jLabel8.setText("Age");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel9.setText("Experience");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));
        add(fieldLibExp, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, 230, -1));
        add(fieldManagerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 230, -1));
        add(fieldManagerAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 230, -1));
        add(fieldManagerExp, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 230, -1));
        add(fieldLibName, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 230, -1));
        add(fieldLibAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, 230, -1));
        add(fieldLibPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, 230, -1));
        add(fieldLibUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 230, -1));
        add(fieldManagerUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 230, -1));
        add(fieldManagerPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 230, -1));

        jLabel10.setText("Name");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel11.setText("Password");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, -1, -1));

        jLabel12.setText("UserName");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel13.setText("Password");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void addBranchManagerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBranchManagerBtnActionPerformed
        // TODO add your handling code here:
        Branch branchDetails =(Branch) libComboBox.getSelectedItem();
        
        String managerName=fieldManagerName.getText();
        String managerAge=fieldManagerAge.getText();
        String managerExp=fieldManagerExp.getText();
        
        UserDirectory ua = this.system.getUserAccountDirectory();

        if(ua.accountExists(fieldManagerUsername.getText(), fieldManagerPassword.getText(), "branch manager")) {
            JOptionPane.showMessageDialog(null, "Sorry credentials are taken.");
        }
        else {
            ArrayList<Employee> empList=branchDetails.getLibrary().getEmployeeDirectory().getEmployeeList();
            System.out.println(empList.isEmpty());
            if(empList.isEmpty()){
                UserAccount user = this.system.getUserAccountDirectory().createUserAccount(fieldManagerUsername.getText(), fieldManagerPassword.getText(), "branch manager");
                branchDetails.getLibrary().getEmployeeDirectory().createEmployee(fieldManagerUsername.getText(),managerName, managerAge, Float.valueOf(managerExp), "branch manager");
                JOptionPane.showMessageDialog(null,"Manager Added");
                populate();
            }
            else{
                boolean ismanagerPresent=false;
                for(Employee emp:empList){
                    System.out.println(emp.getDesignation());
                    if(emp.getDesignation()=="branch manager"){
                       ismanagerPresent=true;
                       break;
                    }
                    else{
                        ismanagerPresent=false;
                    }
                }
                if(ismanagerPresent){
                       JOptionPane.showMessageDialog(null,"Only one manager can be added per branch"); 
                }
                else{
                        branchDetails.getLibrary().getEmployeeDirectory().createEmployee(fieldManagerUsername.getText(),managerName, managerAge, Float.valueOf(managerExp), "branch manager");
                        UserAccount user = this.system.getUserAccountDirectory().createUserAccount(fieldManagerUsername.getText(), fieldManagerPassword.getText(), "branch manager");
                        JOptionPane.showMessageDialog(null,"Manager Added");

                        populate();
                }
            }
            
        }
        
    }//GEN-LAST:event_addBranchManagerBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Branch branchDetails =(Branch) libComboBox.getSelectedItem();
        
        String libName=fieldLibName.getText();
        String libAge=fieldLibAge.getText();
        String libExp=fieldLibExp.getText();
        
        UserDirectory ua = this.system.getUserAccountDirectory();

        if(ua.accountExists(fieldLibUsername.getText(), fieldLibPassword.getText(), "librarian")) {
            JOptionPane.showMessageDialog(null, "Sorry credentials are taken.");
        }
        else {
            ArrayList<Employee> empList=branchDetails.getLibrary().getEmployeeDirectory().getEmployeeList();
            System.out.println(empList.isEmpty());
            if(empList.isEmpty()){    
                UserAccount user = this.system.getUserAccountDirectory().createUserAccount(fieldLibUsername.getText(), fieldLibPassword.getText(), "librarian");
                branchDetails.getLibrary().getEmployeeDirectory().createEmployee(fieldLibUsername.getText(),libName, libAge, Float.valueOf(libExp), "librarian");
                JOptionPane.showMessageDialog(null,"Librarian Added");
                populate();
            }
            else{
                boolean islibrarianPresent=false;
                for(Employee emp:empList){
                    System.out.println(emp.getDesignation());
                    if(emp.getDesignation()=="librarian"){
                       islibrarianPresent=true;
                       break;
                    }
                    else{
                        islibrarianPresent=false;
                    }
                }
                if(islibrarianPresent){
                       JOptionPane.showMessageDialog(null,"Only one librarian can be added per branch"); 
                }
                else{
                        branchDetails.getLibrary().getEmployeeDirectory().createEmployee(fieldLibUsername.getText(),libName, libAge, Float.valueOf(libExp), "librarian");
                        UserAccount user = this.system.getUserAccountDirectory().createUserAccount(fieldLibUsername.getText(), fieldLibPassword.getText(), "librarian");
                        JOptionPane.showMessageDialog(null,"Librarian Added");

                        populate();
                }

            }
            
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBranchManagerBtn;
    private javax.swing.JTable empTable;
    private javax.swing.JTextField fieldLibAge;
    private javax.swing.JTextField fieldLibExp;
    private javax.swing.JTextField fieldLibName;
    private javax.swing.JTextField fieldLibPassword;
    private javax.swing.JTextField fieldLibUsername;
    private javax.swing.JTextField fieldManagerAge;
    private javax.swing.JTextField fieldManagerExp;
    private javax.swing.JTextField fieldManagerName;
    private javax.swing.JTextField fieldManagerPassword;
    private javax.swing.JTextField fieldManagerUsername;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox libComboBox;
    // End of variables declaration//GEN-END:variables
}
