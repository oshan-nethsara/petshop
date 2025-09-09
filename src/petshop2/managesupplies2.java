package petshop2;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class managesupplies2 extends javax.swing.JFrame {


    public managesupplies2() {
        initComponents();
         try (BufferedReader reader = new BufferedReader(new FileReader("supplies.txt"))) {
    DefaultTableModel tblModel = (DefaultTableModel) suppliesone.getModel();
    String line;
    while ((line = reader.readLine()) != null) {
        String[] data = line.split(","); // Split the line by " | " separator
        tblModel.addRow(data); // Add each row to the table
    }
} catch (Exception e) {
    JOptionPane.showMessageDialog(rootPane, "Failed to load previous data");
}       
    }
    
    public void saveTableDataToFile() {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("supplies.txt"))) {
        DefaultTableModel tblModel = (DefaultTableModel) suppliesone.getModel();
        
        for (int i = 0; i < tblModel.getRowCount(); i++) {
            for (int j = 0; j < tblModel.getColumnCount(); j++) {
                writer.write(tblModel.getValueAt(i, j).toString());
                if (j < tblModel.getColumnCount() - 1) {
                    writer.write(","); // Separate values with commas
                }
            }
            writer.newLine(); // Move to the next line after each row
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
        jScrollPane1 = new javax.swing.JScrollPane();
        suppliesone = new javax.swing.JTable();
        deleterow = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        supplyname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        supplyid = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        supplycategory = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        supplyprice = new javax.swing.JTextField();
        addsupps1 = new javax.swing.JButton();
        updatetable = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        searchcategory = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("VIEW/ADD SUPPLIES");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supplies.png"))); // NOI18N

        suppliesone.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Supply ID", "Name", "Category", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        suppliesone.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                suppliesoneAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        suppliesone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                suppliesoneMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(suppliesone);

        deleterow.setBackground(new java.awt.Color(0, 0, 51));
        deleterow.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        deleterow.setForeground(new java.awt.Color(255, 255, 255));
        deleterow.setText("DELETE");
        deleterow.setBorderPainted(false);
        deleterow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleterowActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Supply Name");

        supplyname.setBackground(new java.awt.Color(0, 0, 51));
        supplyname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        supplyname.setForeground(new java.awt.Color(255, 255, 255));
        supplyname.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Supply ID");

        supplyid.setBackground(new java.awt.Color(0, 0, 51));
        supplyid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        supplyid.setForeground(new java.awt.Color(255, 255, 255));
        supplyid.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Category");

        supplycategory.setBackground(new java.awt.Color(0, 0, 51));
        supplycategory.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        supplycategory.setForeground(new java.awt.Color(255, 255, 255));
        supplycategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Pet Toys", "Colars", "Foods", "Grooming", "Cages" }));
        supplycategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplycategoryActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Price");

        supplyprice.setBackground(new java.awt.Color(0, 0, 51));
        supplyprice.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        supplyprice.setForeground(new java.awt.Color(255, 255, 255));
        supplyprice.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        supplyprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplypriceActionPerformed(evt);
            }
        });

        addsupps1.setBackground(new java.awt.Color(0, 0, 51));
        addsupps1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addsupps1.setForeground(new java.awt.Color(255, 255, 255));
        addsupps1.setText("ADD SUPPLIES");
        addsupps1.setBorderPainted(false);
        addsupps1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addsupps1ActionPerformed(evt);
            }
        });

        updatetable.setBackground(new java.awt.Color(0, 0, 51));
        updatetable.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        updatetable.setForeground(new java.awt.Color(255, 255, 255));
        updatetable.setText("UPDATE TABLE");
        updatetable.setBorderPainted(false);
        updatetable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatetableActionPerformed(evt);
            }
        });

        back.setBackground(new java.awt.Color(0, 0, 51));
        back.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("BACK");
        back.setBorderPainted(false);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Search Items by category");

        searchcategory.setBackground(new java.awt.Color(0, 0, 51));
        searchcategory.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        searchcategory.setForeground(new java.awt.Color(255, 255, 255));
        searchcategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Pet Toys", "Colars", "Foods", "Grooming", "Cages" }));
        searchcategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchcategoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(27, 27, 27))
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(supplyname)
                                    .addComponent(supplycategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(supplyid)
                                    .addComponent(supplyprice, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(108, 108, 108))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel1))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(addsupps1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(updatetable, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(searchcategory, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel7)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(134, 134, 134)
                                .addComponent(deleterow, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(440, 440, 440)
                        .addComponent(back)
                        .addGap(21, 21, 21))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(supplyid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(supplyname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(supplycategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(supplyprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addsupps1)
                            .addComponent(updatetable))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleterow)
                        .addGap(66, 66, 66)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchcategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(back)
                .addContainerGap(26, Short.MAX_VALUE))
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

    private void suppliesoneAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_suppliesoneAncestorAdded

    }//GEN-LAST:event_suppliesoneAncestorAdded

    private void deleterowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleterowActionPerformed
int selectedRow = suppliesone.getSelectedRow();
        if (selectedRow != -1) { // Check if a row is selected
            DefaultTableModel tblModel = (DefaultTableModel) suppliesone.getModel();
            
            // Remove the selected row from the model
            tblModel.removeRow(selectedRow);
            saveTableDataToFile();
            
            JOptionPane.showMessageDialog(rootPane, "Row deleted successfully!");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Please select a row to delete.");
        }
    }//GEN-LAST:event_deleterowActionPerformed

    private void supplycategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplycategoryActionPerformed
       
    }//GEN-LAST:event_supplycategoryActionPerformed

    private void supplypriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplypriceActionPerformed
        
    }//GEN-LAST:event_supplypriceActionPerformed

    private void addsupps1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addsupps1ActionPerformed
        String id = supplyid.getText().toString();
        String name = supplyname.getText().toString();
        String category = supplycategory.getSelectedItem().toString();
        String prices = supplyprice.getText().toString();
           
        String cashiers [] = {supplyid.getText(),supplyname.getText(),category,supplyprice.getText()};
        DefaultTableModel tblModel = (DefaultTableModel)suppliesone.getModel();
        tblModel.addRow(cashiers);    
        
        try {
            FileWriter writer = new FileWriter("supplies.txt", true);
            writer.write(id);  
            writer.write(",");
            writer.write(name);
            writer.write(",");
            writer.write(category);
            writer.write(",");
            writer.write(prices);        
            writer.write(System.getProperty("line.separator"));           
            
            writer.close();
        JOptionPane.showMessageDialog(rootPane, "SUCCESS");}
        
        catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "ERROR");
        }
    }//GEN-LAST:event_addsupps1ActionPerformed

    private void updatetableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatetableActionPerformed
        int selectedRow = suppliesone.getSelectedRow();
        if (selectedRow != -1) { // Check if a row is selected
            DefaultTableModel tblModel = (DefaultTableModel) suppliesone.getModel();
            
            // Update the selected row with new data from input fields
            tblModel.setValueAt(supplyid.getText(), selectedRow, 0);
            tblModel.setValueAt(supplyname.getText(), selectedRow, 1);
            tblModel.setValueAt(supplycategory.getSelectedItem().toString(), selectedRow, 2);
            tblModel.setValueAt(supplyprice.getText(), selectedRow, 3);
            
            saveTableDataToFile();
            
            JOptionPane.showMessageDialog(rootPane, "Row updated successfully!");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Please select a row to update.");
        }
    }//GEN-LAST:event_updatetableActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        cashiermenu HM = new cashiermenu();
        HM.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void suppliesoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suppliesoneMouseClicked
        int selectedRow = suppliesone.getSelectedRow();
        DefaultTableModel tblModel = (DefaultTableModel) suppliesone.getModel();
        
        // Populate input fields with selected row data
        supplyid.setText(tblModel.getValueAt(selectedRow, 0).toString());
        supplyname.setText(tblModel.getValueAt(selectedRow, 1).toString());
        supplycategory.setSelectedItem(tblModel.getValueAt(selectedRow, 2).toString());
        supplyprice.setText(tblModel.getValueAt(selectedRow, 3).toString());
    }//GEN-LAST:event_suppliesoneMouseClicked

    private void searchcategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchcategoryActionPerformed
        String searchSupply = (String) searchcategory.getSelectedItem();
        DefaultTableModel tblModel = (DefaultTableModel) suppliesone.getModel();
        List<Integer> matchedRows = new ArrayList<>(); // To store indices of matching rows
        boolean found = false;

        for (int i = 0; i < tblModel.getRowCount(); i++) {
            String supplyName = tblModel.getValueAt(i, 2).toString(); // Assuming supply name is in column 2
            if (supplyName.equalsIgnoreCase(searchSupply)) {
                // Add the matching row to the list
                matchedRows.add(i);
                found = true;
            }
        }

        if (found) {
            // Highlight all matching rows
            suppliesone.clearSelection(); // Clear previous selections
            for (int row : matchedRows) {
                suppliesone.addRowSelectionInterval(row, row);
                suppliesone.scrollRectToVisible(suppliesone.getCellRect(row, 0, true));
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Supply name not found in the table.");
        }
    }//GEN-LAST:event_searchcategoryActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new managesupplies2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addsupps1;
    private javax.swing.JButton back;
    private javax.swing.JButton deleterow;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> searchcategory;
    private static javax.swing.JTable suppliesone;
    private javax.swing.JComboBox<String> supplycategory;
    private javax.swing.JTextField supplyid;
    private javax.swing.JTextField supplyname;
    private javax.swing.JTextField supplyprice;
    private javax.swing.JButton updatetable;
    // End of variables declaration//GEN-END:variables
}
