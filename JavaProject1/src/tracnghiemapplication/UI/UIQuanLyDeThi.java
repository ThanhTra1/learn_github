/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tracnghiemapplication.UI;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import tracnghiemapplication.ClassesHandle.DeThi;
import tracnghiemapplication.ClassesHandle.MonHoc;

/**
 *
 * @author SON
 */
public class UIQuanLyDeThi extends javax.swing.JFrame {
    private MonHoc monHoc;
    private Map<String, ImageIcon> imageMap;
    private ArrayList<DeThi> deThi = new ArrayList<>();
    public static boolean isFocus = false;
    
    /**
     * Creates new form UIQuanLyDeThi
     */
    public UIQuanLyDeThi() {
        initComponents();
    }
    
    public void setMonHoc(MonHoc monHoc) {
        this.monHoc = monHoc;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnOK = new javax.swing.JButton();
        btnTaoDeThiMoi = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLDeThi = new javax.swing.JList<>(new DefaultListModel<String>());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Quản Lý Đề Thi");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Đề Thi Có Sẵn");

        btnOK.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        btnTaoDeThiMoi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnTaoDeThiMoi.setText("Tạo Đề Thi Mới");
        btnTaoDeThiMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoDeThiMoiActionPerformed(evt);
            }
        });

        jScrollPane1.setBorder(null);

        jLDeThi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLDeThi.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jLDeThi.setLayoutOrientation(javax.swing.JList.HORIZONTAL_WRAP);
        jLDeThi.setVisibleRowCount(-1);
        jScrollPane1.setViewportView(jLDeThi);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnTaoDeThiMoi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOK))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnOK, btnTaoDeThiMoi});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnOK)
                    .addComponent(btnTaoDeThiMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnOK, btnTaoDeThiMoi});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        ((DefaultListModel)jLDeThi.getModel()).removeAllElements();
        deThi.addAll(monHoc.getDeThi());
        for(DeThi dt : deThi) {
            ((DefaultListModel)jLDeThi.getModel()).addElement(dt.getTenDeThi());
        }
        imageMap = createImageMap(deThi);
        jLDeThi.setCellRenderer(new ListRenderer());
    }//GEN-LAST:event_formWindowOpened

    private void btnTaoDeThiMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoDeThiMoiActionPerformed
        // TODO add your handling code here:
        UILuaChonTaoDe luaChonTaoDe = new UILuaChonTaoDe();
        luaChonTaoDe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        luaChonTaoDe.setVisible(true);
        luaChonTaoDe.getBTNTuTaoDe().addActionListener((ActionEvent e) -> {
            UITuTaoDeThi tuTaoDeThi = new UITuTaoDeThi();
            tuTaoDeThi.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            tuTaoDeThi.setTrangThaiLuu(true);
            tuTaoDeThi.setMonHoc(getMonHoc());
            tuTaoDeThi.setVisible(true);
            luaChonTaoDe.dispose();
        });
        luaChonTaoDe.getBTNSinhDeTuDong().addActionListener((ActionEvent e) -> {
            UISinhDeTuDong sinhDeTuDong = new UISinhDeTuDong();
            sinhDeTuDong.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            sinhDeTuDong.setTrangThaiLuu(true);
            sinhDeTuDong.setMonHoc(getMonHoc());
            sinhDeTuDong.setVisible(true);
            luaChonTaoDe.dispose();
        });
    }//GEN-LAST:event_btnTaoDeThiMoiActionPerformed

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        // TODO add your handling code here:
        String itemSelected = jLDeThi.getSelectedValue();
        UITuTaoDeThi tuTaoDeThi = new UITuTaoDeThi();
        tuTaoDeThi.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        tuTaoDeThi.setTrangThaiLuu(false);
        tuTaoDeThi.setTenDeThi(itemSelected);
        tuTaoDeThi.setMonHoc(getMonHoc());
        tuTaoDeThi.setVisible(true);
    }//GEN-LAST:event_btnOKActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
        if(isFocus) {
            ((DefaultListModel)jLDeThi.getModel()).removeAllElements();
            deThi.clear();
            deThi.addAll(monHoc.getDeThi());
            for(DeThi dt : deThi) {
                ((DefaultListModel)jLDeThi.getModel()).addElement(dt.getTenDeThi());
            }
            imageMap = createImageMap(deThi);
            jLDeThi.setCellRenderer(new ListRenderer());
            isFocus = false;
        }
    }//GEN-LAST:event_formWindowGainedFocus
    
    private Map<String, ImageIcon> createImageMap(ArrayList<DeThi> deThi) {
        Map<String, ImageIcon> map = new HashMap<>();
        for(DeThi dt : deThi) {
            map.put(dt.getTenDeThi(), new ImageIcon(getClass().getResource("dethi2.png")));
        }
        return map;
    }

    public class ListRenderer extends DefaultListCellRenderer {
        @Override
        public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
            JLabel label = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            label.setIcon(imageMap.get((String) value));
            label.setVerticalTextPosition(JLabel.BOTTOM);
            label.setHorizontalTextPosition(JLabel.CENTER);
            
            return label;
        }
    }
    
    public MonHoc getMonHoc() {
        return this.monHoc;
    }
    
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
            java.util.logging.Logger.getLogger(UIQuanLyDeThi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UIQuanLyDeThi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UIQuanLyDeThi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UIQuanLyDeThi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new UIQuanLyDeThi().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOK;
    private javax.swing.JButton btnTaoDeThiMoi;
    private javax.swing.JList<String> jLDeThi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
