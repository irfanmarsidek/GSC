/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gsc;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author lutfilhadi
 */
public class FNB_Staff extends javax.swing.JFrame {
    File f = null;
    String path = null;
    private ImageIcon format = null;
    String fname = null;
    int s = 0;
    byte[] pimage = null;

    /**
     * Creates new form imagetest
     */
    public FNB_Staff() {
        initComponents();
        Connect();
    }
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    public void Connect(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://database-1.c7pfl5eggbdk.us-east-2.rds.amazonaws.com:3306/GSC","admin","test");
                    } catch (ClassNotFoundException ex) {
            Logger.getLogger(FNB_Staff.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(FNB_Staff.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void LoadImage(){
        try {
            byte[] imgdata = rs.getBytes("imageFile");
            format  = new ImageIcon(imgdata);
            Image mm = format.getImage();
            Image img2 = mm.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
            ImageIcon image = new ImageIcon(img2);
            
            labelImage.setIcon(image);
        } catch (SQLException ex) {
            Logger.getLogger(FNB_Staff.class.getName()).log(Level.SEVERE, null, ex);
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

        jButton1 = new javax.swing.JButton();
        labelImage = new javax.swing.JLabel();
        imagePath = new javax.swing.JTextField();
        btnBrowse = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtProductName = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        txtUnitPrice = new javax.swing.JTextField();
        btnExit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtProductID = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelImage.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnBrowse.setText("Browse");
        btnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel1.setText("Product Name:");

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel2.setText("Quantity:");

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel3.setText("Unit Price(RM):");

        txtProductName.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        txtProductName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductNameActionPerformed(evt);
            }
        });

        txtQuantity.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N

        txtUnitPrice.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Name", "Quantity", "Unit Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table1);

        btnView.setText("View List");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel4.setText("Product ID:");

        txtProductID.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(imagePath)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBrowse))
                            .addComponent(labelImage, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBack, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtProductID, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUnitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnView, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnUpdate, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnDelete)
                                    .addComponent(btnSave)
                                    .addComponent(btnExit))))))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnView)
                    .addComponent(btnDelete)
                    .addComponent(imagePath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBrowse))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtProductID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtUnitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUpdate)
                            .addComponent(btnSave)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(labelImage, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit)
                    .addComponent(btnBack))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseActionPerformed
        // TODO add your handling code here:
        
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter fnwf = new FileNameExtensionFilter("PNG JPG AND JPEG", "png", "jpeg", "jpg");
        fileChooser.addChoosableFileFilter(fnwf);
        int load = fileChooser.showOpenDialog(null);
        
        if(load == fileChooser.APPROVE_OPTION){
            f = fileChooser.getSelectedFile();
            
            path = f.getAbsolutePath();
            imagePath.setText(path);
            ImageIcon imgicon = new ImageIcon(path);
            Image img = imgicon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
            labelImage.setIcon(new ImageIcon(img));
        }
    }//GEN-LAST:event_btnBrowseActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        
        System.out.print("Image Path - "+ path);
        System.out.print("Image Name - " + f.getName());
        File f = new File(path);
        
        int qty = Integer.parseInt(txtQuantity.getText());
        double unit_price = Double.parseDouble(txtUnitPrice.getText());
        
        try {
            InputStream is = new FileInputStream(f);
            
            pst = con.prepareStatement("INSERT INTO fnb_products (name,qty,unit_price,imageName,imagePath,imageFile)VALUES(?,?,?,?,?,?)");
            pst.setString(1, txtProductName.getText());
            pst.setInt(2, qty);
            pst.setDouble(3, unit_price);
            pst.setString(4,f.getName());
            pst.setString(5, path);
            pst.setBlob(6, is);
            
            int inserted = pst.executeUpdate();
            
            if(inserted > 0){
                JOptionPane.showMessageDialog(null,"Item Saved");
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FNB_Staff.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(FNB_Staff.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtProductNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductNameActionPerformed
private JFrame frame;
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit","MySQL Connector",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        try{
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM fnb_products");
            
            DefaultTableModel tblModel = (DefaultTableModel)table1.getModel();
            tblModel.getDataVector().removeAllElements();
            
            while(rs.next()){
                String id = String.valueOf(rs.getInt("product_id"));
                String name = rs.getString("name");
                String quantity = String.valueOf(rs.getInt("qty"));
                String unit_price = String.valueOf(rs.getDouble("unit_price"));
                
                String tableData[] = {id,name,quantity,unit_price};
                tblModel = (DefaultTableModel)table1.getModel();
                
                tblModel.addRow(tableData);
            }
            
        } catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        String id = txtProductID.getText();
        String name = txtProductName.getText();
        String quantity = txtQuantity.getText();
        String unit_price = txtUnitPrice.getText();
        
        try{
            pst = con.prepareStatement("UPDATE `GSC`.`fnb_products` SET `name` = '"+name+"', `qty` = '"+quantity+"', `unit_price` = "
                    + "'"+unit_price+"' WHERE product_id = '"+id+"'");
            pst.execute();
            
            DefaultTableModel tblModel = (DefaultTableModel)table1.getModel();
            tblModel.getDataVector().removeAllElements();
            
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM fnb_products");
            
            tblModel = (DefaultTableModel)table1.getModel();
            tblModel.getDataVector().removeAllElements();
            
            while(rs.next()){
                id = String.valueOf(rs.getInt("product_id"));
                name = rs.getString("name");
                quantity = String.valueOf(rs.getInt("qty"));
                unit_price = String.valueOf(rs.getDouble("unit_price"));
                
                String tableData[] = {id,name,quantity,unit_price};
                tblModel = (DefaultTableModel)table1.getModel();
                
                tblModel.addRow(tableData);
            }
            
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int row = table1.getSelectedRow();
        String cell = table1.getModel().getValueAt(row, 0).toString();
        
        try{
            pst = con.prepareStatement("DELETE FROM fnb_products where product_id = "+cell+"");
            pst.execute();
            JOptionPane.showMessageDialog(null, "Item Deleted");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
        // TODO add your handling code here:
        
        //display product info into text field and image display
        int row = table1.getSelectedRow();
        String cell = table1.getModel().getValueAt(row, 0).toString();
        
        try{
            pst = con.prepareStatement("SELECT * FROM fnb_products WHERE product_id = "+cell+"");
            rs = pst.executeQuery();
          
            
            if(rs.next()){
                String id = String.valueOf(rs.getInt("product_id"));
                txtProductID.setText(id);
                String name = rs.getString("name");
                txtProductName.setText(name);
                String qty = String.valueOf(rs.getInt("qty"));
                txtQuantity.setText(qty);
                String unit_price = String.valueOf(rs.getDouble("unit_price"));
                txtUnitPrice.setText(unit_price);
                LoadImage();
                
              
            }
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_table1MouseClicked

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        int select = JOptionPane.showConfirmDialog(this,"Do you want to go back?", "Confirm",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        
        if(select == JOptionPane.YES_OPTION){
            this.toBack();
        StaffMenu newframe = new StaffMenu();
        newframe.setVisible(true);
        dispose();
            
        }
        ;
        
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(FNB_Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FNB_Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FNB_Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FNB_Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FNB_Staff().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBrowse;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JTextField imagePath;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelImage;
    private javax.swing.JTable table1;
    private javax.swing.JTextField txtProductID;
    private javax.swing.JTextField txtProductName;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtUnitPrice;
    // End of variables declaration//GEN-END:variables
}
