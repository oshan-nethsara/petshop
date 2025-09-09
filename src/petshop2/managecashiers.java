package petshop2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class managecashiers extends javax.swing.JFrame {
   
public managecashiers() {
        initComponents();
         try (BufferedReader reader = new BufferedReader(new FileReader("cashiers.txt"))) {
    DefaultTableModel tblModel = (DefaultTableModel) cashierss.getModel();
    String line;
    while ((line = reader.readLine()) != null) {
        String[] cashiers = line.split(","); 
        tblModel.addRow(cashiers); 
    }
} catch (Exception e) {
    JOptionPane.showMessageDialog(rootPane, "Failed to load previous data");
}       
    }

public void saveTableData() {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("cashiers.txt"))) {
        DefaultTableModel tblModel = (DefaultTableModel) cashierss.getModel();
        
        for (int i = 0; i < tblModel.getRowCount(); i++) {
            for (int j = 0; j < tblModel.getColumnCount(); j++) {
                writer.write(tblModel.getValueAt(i, j).toString());
                if (j < tblModel.getColumnCount() - 1) {
                    writer.write(","); 
                }
            }
            writer.newLine();
        }
        
        writer.flush();
        JOptionPane.showMessageDialog(rootPane, "File updated successfully!");
    } catch (IOException e) {
        JOptionPane.showMessageDialog(rootPane, "Error updating file: " + e.getMessage());
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        mmenu = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cashiername = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cashierpass = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cashierid = new javax.swing.JTextField();
        addcashier = new javax.swing.JButton();
        updatetable2 = new javax.swing.JButton();
        deletecashier = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        searchcashier = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        cashierss = new javax.swing.JTable();
        cashiermail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        gender = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));
        jPanel1.setForeground(new java.awt.Color(102, 59, 196));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MANAGE CASHIERS");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/managecashier.png"))); // NOI18N

        mmenu.setBackground(new java.awt.Color(0, 0, 51));
        mmenu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mmenu.setForeground(new java.awt.Color(255, 255, 255));
        mmenu.setText("BACK");
        mmenu.setBorderPainted(false);
        mmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmenuActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cashier Username");

        cashiername.setBackground(new java.awt.Color(0, 0, 51));
        cashiername.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cashiername.setForeground(new java.awt.Color(255, 255, 255));
        cashiername.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cashier Password");

        cashierpass.setBackground(new java.awt.Color(0, 0, 51));
        cashierpass.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cashierpass.setForeground(new java.awt.Color(255, 255, 255));
        cashierpass.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cashier ID");

        cashierid.setBackground(new java.awt.Color(0, 0, 51));
        cashierid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cashierid.setForeground(new java.awt.Color(255, 255, 255));
        cashierid.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cashierid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashieridActionPerformed(evt);
            }
        });

        addcashier.setBackground(new java.awt.Color(0, 0, 51));
        addcashier.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addcashier.setForeground(new java.awt.Color(255, 255, 255));
        addcashier.setText("ADD CASHIER");
        addcashier.setBorderPainted(false);
        addcashier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addcashierActionPerformed(evt);
            }
        });

        updatetable2.setBackground(new java.awt.Color(0, 0, 51));
        updatetable2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        updatetable2.setForeground(new java.awt.Color(255, 255, 255));
        updatetable2.setText("UPDATE TABLE");
        updatetable2.setBorderPainted(false);
        updatetable2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatetable2ActionPerformed(evt);
            }
        });

        deletecashier.setBackground(new java.awt.Color(0, 0, 51));
        deletecashier.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        deletecashier.setForeground(new java.awt.Color(255, 255, 255));
        deletecashier.setText("DELETE");
        deletecashier.setBorderPainted(false);
        deletecashier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletecashierActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Highlight Cashier details ");

        searchcashier.setBackground(new java.awt.Color(0, 0, 51));
        searchcashier.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        searchcashier.setForeground(new java.awt.Color(255, 255, 255));
        searchcashier.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        searchcashier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchcashierActionPerformed(evt);
            }
        });

        cashierss.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cashier ID", "Name", "Email", "Gender", "Pass"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        cashierss.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                cashierssAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        cashierss.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cashierssMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(cashierss);

        cashiermail.setBackground(new java.awt.Color(0, 0, 51));
        cashiermail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cashiermail.setForeground(new java.awt.Color(255, 255, 255));
        cashiermail.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cashiermail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashiermailActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Email");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Gender");

        gender.setBackground(new java.awt.Color(0, 0, 51));
        gender.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        gender.setForeground(new java.awt.Color(255, 255, 255));
        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Male", "Female", "Other" }));
        gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Enter Cashier Name to highlight :- ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mmenu)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(searchcashier, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel10))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(92, 92, 92)
                                        .addComponent(deletecashier, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(addcashier, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(updatetable2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(43, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addGap(39, 39, 39))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(47, 47, 47)
                                        .addComponent(gender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cashiermail, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cashierid)
                                            .addComponent(cashiername, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cashierpass, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(61, 61, 61)))))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cashierid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cashiername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cashiermail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cashierpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addcashier)
                    .addComponent(updatetable2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deletecashier)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchcashier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addComponent(mmenu)
                .addGap(20, 20, 20))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmenuActionPerformed
        managermenu MMENU = new managermenu();
        MMENU.show();
        dispose();
    }//GEN-LAST:event_mmenuActionPerformed

    private void cashieridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashieridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cashieridActionPerformed

    private void addcashierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addcashierActionPerformed
        String id = cashierid.getText().toString();
        String name = cashiername.getText().toString();
        String mail = cashiermail.getText().toString();
        String gen = gender.getSelectedItem().toString();
        String pass = cashierpass.getText().toString();
           
        String cashiers [] = {cashierid.getText(),cashiername.getText(),cashiermail.getText(),gen,cashierpass.getText()};
        DefaultTableModel tblModel = (DefaultTableModel)cashierss.getModel();
        tblModel.addRow(cashiers);    
        
        try {
            FileWriter writer = new FileWriter("cashiers.txt", true);
            writer.write(id);  
            writer.write(",");
            writer.write(name);
            writer.write(",");
            writer.write(mail);
            writer.write(",");
            writer.write(gen);   
            writer.write(",");
            writer.write(pass);      
            writer.write(System.getProperty("line.separator"));           
            
            writer.close();
        JOptionPane.showMessageDialog(rootPane, "SUCCESS");}
        
        catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "ERROR");
        }
    }//GEN-LAST:event_addcashierActionPerformed

    private void updatetable2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatetable2ActionPerformed
        int selectedRow = cashierss.getSelectedRow();
        if (selectedRow != -1) { // Check if a row is selected
            DefaultTableModel tblModel = (DefaultTableModel) cashierss.getModel();
            
            // Update the selected row with new data from input fields
            tblModel.setValueAt(cashierid.getText(), selectedRow, 0);
            tblModel.setValueAt(cashiername.getText(), selectedRow, 1);
            tblModel.setValueAt(cashiermail.getText(), selectedRow, 2);
            tblModel.setValueAt(gender.getSelectedItem().toString(), selectedRow, 3);
            tblModel.setValueAt(cashierpass.getText(), selectedRow, 4);
            
            
            saveTableData();
            
            JOptionPane.showMessageDialog(rootPane, "Row updated successfully!");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Please select a row to update.");
        }
    }//GEN-LAST:event_updatetable2ActionPerformed

    private void deletecashierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletecashierActionPerformed
        int selectedRow = cashierss.getSelectedRow();
        if (selectedRow != -1) { // Check if a row is selected
            DefaultTableModel tblModel = (DefaultTableModel) cashierss.getModel();
            
            // Remove the selected row from the model
            tblModel.removeRow(selectedRow);
            saveTableData();
            
            JOptionPane.showMessageDialog(rootPane, "Row deleted successfully!");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Please select a row to delete.");
        }
    }//GEN-LAST:event_deletecashierActionPerformed

    private void cashierssAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_cashierssAncestorAdded

    }//GEN-LAST:event_cashierssAncestorAdded

    private void cashiermailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashiermailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cashiermailActionPerformed

    private void genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderActionPerformed

    private void searchcashierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchcashierActionPerformed
      String searchc = searchcashier.getText().trim();
        DefaultTableModel tblModel = (DefaultTableModel) cashierss.getModel();
        boolean found = false;

        for (int i = 0; i < tblModel.getRowCount(); i++) {
            String CName = tblModel.getValueAt(i, 1).toString(); // Assuming supply name is in column 1
            if (CName.equalsIgnoreCase(searchc)) {
                // Select the matching row
                cashierss.setRowSelectionInterval(i, i);
                cashierss.scrollRectToVisible(cashierss.getCellRect(i, 0, true));
                
                
                found = true;
                break;
            }
        }

        if (!found) {
            JOptionPane.showMessageDialog(rootPane, "Supply name not found in the table.");
        }
    }//GEN-LAST:event_searchcashierActionPerformed

    private void cashierssMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cashierssMouseClicked
        int selectedRow = cashierss.getSelectedRow();
        DefaultTableModel tblModel = (DefaultTableModel) cashierss.getModel();
        
        // Populate input fields with selected row data
        cashierid.setText(tblModel.getValueAt(selectedRow, 0).toString());
        cashiername.setText(tblModel.getValueAt(selectedRow, 1).toString());
        cashiermail.setText(tblModel.getValueAt(selectedRow, 2).toString());
        gender.setSelectedItem(tblModel.getValueAt(selectedRow, 3).toString());
        cashierpass.setText(tblModel.getValueAt(selectedRow, 4).toString());
    }//GEN-LAST:event_cashierssMouseClicked

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
            java.util.logging.Logger.getLogger(managecashiers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(managecashiers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(managecashiers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(managecashiers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new managecashiers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addcashier;
    private javax.swing.JTextField cashierid;
    private javax.swing.JTextField cashiermail;
    private javax.swing.JTextField cashiername;
    private javax.swing.JTextField cashierpass;
    private javax.swing.JTable cashierss;
    private javax.swing.JButton deletecashier;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mmenu;
    private javax.swing.JTextField searchcashier;
    private javax.swing.JButton updatetable2;
    // End of variables declaration//GEN-END:variables
}
