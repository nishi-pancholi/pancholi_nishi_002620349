/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.BranchManagerWorkArea;

import AppSystem.ApplicationSystem;
import Customer.Customer;
import LibrarianArea.Library;
import LibrarianArea.UserAccount;
import Services.RentalRequest;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nishipancholi
 */
public class ViewRentalRequestJPanel extends javax.swing.JPanel {

    private UserAccount useraccount;
    private ApplicationSystem system;
    private Library lib;
    DefaultTableModel requestTableModel;
    private float sum=0;
    /**
     * Creates new form ViewRentalRequestJPanel
     */
    public ViewRentalRequestJPanel() {
        initComponents();
    }

    ViewRentalRequestJPanel(ApplicationSystem system, UserAccount useraccount, Library lib) {
       initComponents();
       this.system = system;
       this.useraccount = useraccount;
       this.lib=lib;
       this.requestTableModel = (DefaultTableModel) requestTable.getModel();
       
        populate();
    }
    
    public void populate() {
        requestTableModel.setRowCount(0);
            
            ArrayList<Customer> custList=this.system.getCustomerDirectory().getCustomerlist();
            for(Customer c: custList){
                    ArrayList<RentalRequest> reqList= c.getRentalRequestDirectory().getRequestlist();
                    for(RentalRequest req: reqList){
                        if(req.getLib()==this.lib){
                            Object[] row = new Object[8];

                            row[0] = req;
                            row[1] = req.getStatus();
                            row[2] = req.getDuration();
                            row[3] = req.getMaterialType();
                            row[4] = req.getMaterial().getName();
                            row[5]= req.getPrice();
                            row[6]= req.getCustomer().getName();
                            row[7]= req.getLib().getLibraryName();

                            requestTableModel.addRow(row);
                            sum=sum+req.getPrice();
                        }
                    }

            }
            
            revenueField.setText(String.valueOf(sum));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        requestTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        revenueField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        requestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request Id", "Status", "Duration", "Material Type", "Material Name", "Rental Price", "Customer Name", "Library Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(requestTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 690, 240));

        jLabel1.setText("VIEW RENTAL REQUESTS");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, -1));

        revenueField.setEnabled(false);
        add(revenueField, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 310, -1));

        jLabel2.setText("Total Revenue Generated:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable requestTable;
    private javax.swing.JTextField revenueField;
    // End of variables declaration//GEN-END:variables
}
