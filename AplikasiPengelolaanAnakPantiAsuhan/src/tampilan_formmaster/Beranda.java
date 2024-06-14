/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tampilan_formmaster;
import javax.swing.border.*;
import javax.swing.plaf.basic.BasicBorders;
import tampilan_formtransaksi.FormAdopsi;
import tampilan_formtransaksi.FormDonasi;
import tampilan_formtransaksi.FormPemasukan;
import tampilan_formtransaksi.FormPengeluaran;
/**
 *
 * @author Raihan
 */
public class Beranda extends javax.swing.JFrame {

    /**
     * Creates new form Beranda
     */
    public Beranda() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnback = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        bortuadopsi = new rojerusan.RSMaterialButtonRectangle();
        banak = new rojerusan.RSMaterialButtonRectangle();
        bpengeluaran = new rojerusan.RSMaterialButtonRectangle();
        badopsi = new rojerusan.RSMaterialButtonRectangle();
        bdonasi = new rojerusan.RSMaterialButtonRectangle();
        bmasukan = new rojerusan.RSMaterialButtonRectangle();
        bdonatur1 = new rojerusan.RSMaterialButtonRectangle();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(16, 150, 72));

        jLabel1.setBackground(new java.awt.Color(247, 240, 240));
        jLabel1.setFont(new java.awt.Font("Poppins ExtraBold", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(247, 240, 240));
        jLabel1.setText("Panti App");

        btnback.setBackground(new java.awt.Color(24, 169, 153));
        btnback.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnbackMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnbackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnbackMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnbackMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnbackMouseReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(247, 240, 240));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/arrow-left.png"))); // NOI18N

        javax.swing.GroupLayout btnbackLayout = new javax.swing.GroupLayout(btnback);
        btnback.setLayout(btnbackLayout);
        btnbackLayout.setHorizontalGroup(
            btnbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnbackLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnbackLayout.setVerticalGroup(
            btnbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnbackLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bortuadopsi.setBackground(new java.awt.Color(24, 169, 153));
        bortuadopsi.setText("FORM ORTU ADOPSI");
        bortuadopsi.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        bortuadopsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bortuadopsiActionPerformed(evt);
            }
        });

        banak.setBackground(new java.awt.Color(24, 169, 153));
        banak.setText("Form  Anak Asuh");
        banak.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        banak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                banakActionPerformed(evt);
            }
        });

        bpengeluaran.setBackground(new java.awt.Color(24, 169, 153));
        bpengeluaran.setText("FORM PENGELUARAN");
        bpengeluaran.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        bpengeluaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bpengeluaranActionPerformed(evt);
            }
        });

        badopsi.setBackground(new java.awt.Color(24, 169, 153));
        badopsi.setText("FORM ADOPSI");
        badopsi.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        badopsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                badopsiActionPerformed(evt);
            }
        });

        bdonasi.setBackground(new java.awt.Color(24, 169, 153));
        bdonasi.setText("FORM DONASI");
        bdonasi.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        bdonasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdonasiActionPerformed(evt);
            }
        });

        bmasukan.setBackground(new java.awt.Color(24, 169, 153));
        bmasukan.setText("FORM PEMASUKAN");
        bmasukan.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        bmasukan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmasukanActionPerformed(evt);
            }
        });

        bdonatur1.setBackground(new java.awt.Color(24, 169, 153));
        bdonatur1.setText("FORM DONATUR");
        bdonatur1.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        bdonatur1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdonatur1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(247, 240, 240));
        jLabel2.setText("FORM TRANSAKSI");

        jLabel3.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(247, 240, 240));
        jLabel3.setText("FORM INPUT");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(bortuadopsi, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(banak, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bdonatur1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel2)
                            .addComponent(badopsi, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bdonasi, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bmasukan, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bpengeluaran, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(160, 160, 160)
                        .addComponent(jLabel1)))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bortuadopsi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(badopsi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(banak, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bdonasi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bdonatur1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bmasukan, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(bpengeluaran, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel2.getAccessibleContext().setAccessibleName("");
        jLabel3.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbackMouseClicked
        // TODO add your handling code here:
        this.hide();
        new FormLogin().setVisible(true);
    }//GEN-LAST:event_btnbackMouseClicked

    private void btnbackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbackMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnbackMouseEntered

    private void btnbackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbackMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnbackMouseExited

    private void btnbackMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbackMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnbackMousePressed

    private void btnbackMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbackMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnbackMouseReleased

    private void bortuadopsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bortuadopsiActionPerformed
        // TODO add your handling code here:
         this.hide();        
        new FormOrtuAdopsi().setVisible(true);
    }//GEN-LAST:event_bortuadopsiActionPerformed

    private void banakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_banakActionPerformed
        // TODO add your handling code here:
          this.hide();
        new FormAnakAsuh().setVisible(true);
    }//GEN-LAST:event_banakActionPerformed

    private void bpengeluaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bpengeluaranActionPerformed
        // TODO add your handling code here:
        this.hide();        
        new FormPengeluaran().setVisible(true);
    }//GEN-LAST:event_bpengeluaranActionPerformed

    private void badopsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_badopsiActionPerformed
        // TODO add your handling code here:
        this.hide();        
        new FormAdopsi().setVisible(true);
    }//GEN-LAST:event_badopsiActionPerformed

    private void bdonasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdonasiActionPerformed
        // TODO add your handling code here:
        this.hide();        
        new FormDonasi().setVisible(true);
    }//GEN-LAST:event_bdonasiActionPerformed

    private void bmasukanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmasukanActionPerformed
        // TODO add your handling code here:
        this.hide();        
        new FormPemasukan().setVisible(true);
    }//GEN-LAST:event_bmasukanActionPerformed

    private void bdonatur1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdonatur1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bdonatur1ActionPerformed

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
            java.util.logging.Logger.getLogger(Beranda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Beranda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Beranda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Beranda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Beranda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle badopsi;
    private rojerusan.RSMaterialButtonRectangle banak;
    private rojerusan.RSMaterialButtonRectangle bdonasi;
    private rojerusan.RSMaterialButtonRectangle bdonatur1;
    private rojerusan.RSMaterialButtonRectangle bmasukan;
    private rojerusan.RSMaterialButtonRectangle bortuadopsi;
    private rojerusan.RSMaterialButtonRectangle bpengeluaran;
    private javax.swing.JPanel btnback;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
