package app;
import DB.DBConnection;
import java.awt.Color;
import java.util.Date;
import javax.swing.JOptionPane;
public class FastCash extends javax.swing.JFrame {
String acno;
    public FastCash(String ac) {
        initComponents();
        setLocation(200,80);
        acno=ac;
    }
    public FastCash() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setMaximumSize(new java.awt.Dimension(875, 593));
        jPanel1.setMinimumSize(new java.awt.Dimension(875, 593));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 48)); // NOI18N
        jLabel1.setText("My Metro ATM");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/ATM_100px.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 1, 1, new java.awt.Color(204, 204, 204)));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel12.setText("100");

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel13.setText("200");

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel14.setText("500");

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel15.setText("1000");

        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel16.setText("2000");

        jLabel17.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel17.setText("5000");

        jLabel18.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel18.setText("10000");

        jLabel19.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel19.setText("Other");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel19))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel16)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(375, 375, 375)
                                .addComponent(jLabel18)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel16))
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel17))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel18))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel14)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel15))
                .addGap(56, 56, 56))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 520, 390));

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel3MouseEntered(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel3.setText("CANCEL");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 530, -1, 40));

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel4.setText("<<<<");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 160, 102, -1));

        jPanel5.setBackground(new java.awt.Color(0, 153, 153));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel5.setText("<<<<");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(19, 19, 19))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 250, 102, 40));

        jPanel6.setBackground(new java.awt.Color(0, 153, 153));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel6.setText("<<<<");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel6)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 350, 102, 40));

        jPanel7.setBackground(new java.awt.Color(0, 153, 153));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel7.setText("<<<<");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(20, 20, 20))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 430, 100, 40));

        jPanel8.setBackground(new java.awt.Color(0, 153, 153));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel8.setText(">>>>");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(19, 19, 19))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 100, -1));

        jPanel9.setBackground(new java.awt.Color(0, 153, 153));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel9.setText(">>>>");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel9MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel9)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 100, -1));

        jPanel10.setBackground(new java.awt.Color(0, 153, 153));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel10.setText(">>>>");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel10MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel10)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 100, -1));

        jPanel11.setBackground(new java.awt.Color(0, 153, 153));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel11.setText(">>>>");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel11MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(19, 19, 19))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 100, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/sunset_France_promenade_des_anglais_south_east_4928x3264.jpg"))); // NOI18N
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
jLabel4.setForeground(Color.white); 
jLabel16.setForeground(new Color(0,153,153));
jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255,255,255),1,true));// TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
jLabel4.setForeground(Color.black);
jPanel4.setBorder(null);
jLabel16.setForeground(Color.black);
// TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
     jLabel5.setForeground(Color.white); 
     jLabel17.setForeground(new Color(0,153,153));
jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255,255,255),1,true));   // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
      jLabel5.setForeground(Color.black);
      jLabel17.setForeground(Color.black);
jPanel5.setBorder(null);  // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
         jLabel6.setForeground(Color.white); 
         jLabel18.setForeground(new Color(0,153,153));
jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255,255,255),1,true));   // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
       jLabel6.setForeground(Color.black);
jPanel6.setBorder(null);jLabel18.setForeground(Color.black);   // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
     jLabel7.setForeground(Color.white); 
     jLabel19.setForeground(new Color(0,153,153));
jPanel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255,255,255),1,true));     // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
 jLabel8.setForeground(Color.white);
jLabel12.setForeground(new Color(0,153,153)); 
jPanel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255,255,255),1,true));         // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseEntered

    private void jLabel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseEntered
 jLabel9.setForeground(Color.white);
jLabel13.setForeground(new Color(0,153,153)); 
jPanel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255,255,255),1,true));         // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseEntered

    private void jLabel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseEntered
 
        jLabel14.setForeground(new Color(0,153,153));jLabel10.setForeground(Color.white); 
jPanel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255,255,255),1,true));         // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseEntered

    private void jLabel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseEntered
 jLabel11.setForeground(Color.white); 
 jLabel15.setForeground(new Color(0,153,153));
jPanel11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255,255,255),1,true));         // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
    jLabel19.setForeground(Color.black);jLabel7.setForeground(Color.black);
jPanel7.setBorder(null);    // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseExited

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
jLabel8.setForeground(Color.black);
jLabel12.setForeground(Color.black);
jPanel8.setBorder(null);  
    }//GEN-LAST:event_jLabel8MouseExited

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited
jLabel9.setForeground(Color.black);
jPanel9.setBorder(null);
jLabel13.setForeground(Color.black);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseExited

    private void jLabel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseExited
jLabel10.setForeground(Color.black);
jPanel10.setBorder(null);
jLabel14.setForeground(Color.black);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseExited

    private void jLabel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseExited
jLabel11.setForeground(Color.black);
jPanel11.setBorder(null);
jLabel15.setForeground(Color.black);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel11MouseExited

    private void jPanel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseEntered
     
    }//GEN-LAST:event_jPanel3MouseEntered

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
    jLabel3.setForeground(Color.white); 
jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255,255,255),1,true));     // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
       jLabel3.setForeground(Color.black);
jPanel3.setBorder(null);  // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseExited

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
 try{
     int amt=2000;
     String d="Withdraw";
     DBConnection db=new DBConnection();
                db.pstmt=db.con.prepareStatement("select amount from open_account_table where ac_no=?");
                db.pstmt.setString(1, acno);
                db.rst=db.pstmt.executeQuery();
                if(db.rst.next())
                {
                    int amt1=Integer.parseInt(db.rst.getString(1));
                    if(amt>amt1)
                    {
                        JOptionPane.showMessageDialog(this,"Your account does not have Enough Money");
                        new Last(acno).setVisible(true);
                        this.setVisible(false);
                        JOptionPane.showMessageDialog(this,"Transaction Unsuccessful");
                        
                    }
                    else
                    {
                     String amt2=String.valueOf(amt1-amt);
                                       String amt3=String.valueOf(amt);
                    db.pstmt=db.con.prepareStatement("update open_account_table set amount=? where ac_no=?");
                    db.pstmt.setString(1,amt2);
                    db.pstmt.setString(2,acno);
                    int i=db.pstmt.executeUpdate();
                    if(i>0)
                    {
                        DBConnection db1=new DBConnection();
                        db1.pstmt=db1.con.prepareStatement("insert into transaction values(?,?,?,?,?)");
                        db1.pstmt.setString(1,acno);
                        db1.pstmt.setString(2,new Date().toString());
                        db1.pstmt.setString(3,amt3);
                        db1.pstmt.setString(4,d);
                        db1.pstmt.setString(5,amt2);
                        db1.pstmt.executeUpdate();
                        new Last(acno).setVisible(true);
                        this.setVisible(false);
                        new successful(acno).setVisible(true);
                    }}}}
 catch(Exception e)
 {
     e.printStackTrace();
 }
 
// TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
try{
     int amt=5000;
     String d="Withdraw";
     DBConnection db=new DBConnection();
                db.pstmt=db.con.prepareStatement("select amount from open_account_table where ac_no=?");
                db.pstmt.setString(1, acno);
                db.rst=db.pstmt.executeQuery();
                if(db.rst.next())
                {
                    int amt1=Integer.parseInt(db.rst.getString(1));
                    if(amt>amt1)
                    {
                        JOptionPane.showMessageDialog(this,"Your account does not have Enough Money");
                        new Last(acno).setVisible(true);
                        this.setVisible(false);
                        JOptionPane.showMessageDialog(this,"Transaction Unsuccessful");
                        
                    }
                    else
                    {
                     String amt2=String.valueOf(amt1-amt);
                                       String amt3=String.valueOf(amt);
                    db.pstmt=db.con.prepareStatement("update open_account_table set amount=? where ac_no=?");
                    db.pstmt.setString(1,amt2);
                    db.pstmt.setString(2,acno);
                    int i=db.pstmt.executeUpdate();
                    if(i>0)
                    {
                        DBConnection db1=new DBConnection();
                        db1.pstmt=db1.con.prepareStatement("insert into transaction values(?,?,?,?,?)");
                        db1.pstmt.setString(1,acno);
                        db1.pstmt.setString(2,new Date().toString());
                        db1.pstmt.setString(3,amt3);
                        db1.pstmt.setString(4,d);
                        db1.pstmt.setString(5,amt2);
                        db1.pstmt.executeUpdate();
                        new Last(acno).setVisible(true);
                        this.setVisible(false);
                        new successful(acno).setVisible(true);
                    }}}}
 catch(Exception e)
 {
     e.printStackTrace();
 }        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
try{
     int amt=10000;
     String d="Withdraw";
     DBConnection db=new DBConnection();
                db.pstmt=db.con.prepareStatement("select amount from open_account_table where ac_no=?");
                db.pstmt.setString(1, acno);
                db.rst=db.pstmt.executeQuery();
                if(db.rst.next())
                {
                    int amt1=Integer.parseInt(db.rst.getString(1));
                    if(amt>amt1)
                    {
                        JOptionPane.showMessageDialog(this,"Your account does not have Enough Money");
                        new Last(acno).setVisible(true);
                        this.setVisible(false);
                        JOptionPane.showMessageDialog(this,"Transaction Unsuccessful");
                        
                    }
                    else
                    {
                     String amt2=String.valueOf(amt1-amt);
                                       String amt3=String.valueOf(amt);
                    db.pstmt=db.con.prepareStatement("update open_account_table set amount=? where ac_no=?");
                    db.pstmt.setString(1,amt2);
                    db.pstmt.setString(2,acno);
                    int i=db.pstmt.executeUpdate();
                    if(i>0)
                    {
                        DBConnection db1=new DBConnection();
                        db1.pstmt=db1.con.prepareStatement("insert into transaction values(?,?,?,?,?)");
                        db1.pstmt.setString(1,acno);
                        db1.pstmt.setString(2,new Date().toString());
                        db1.pstmt.setString(3,amt3);
                        db1.pstmt.setString(4,d);
                        db1.pstmt.setString(5,amt2);
                        db1.pstmt.executeUpdate();
                        new Last(acno).setVisible(true);
                        this.setVisible(false);
                        new successful(acno).setVisible(true);
                    }}}}
 catch(Exception e)
 {
     e.printStackTrace();
 }        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
try{
     int amt=100;
     String d="Withdraw";
     DBConnection db=new DBConnection();
                db.pstmt=db.con.prepareStatement("select amount from open_account_table where ac_no=?");
                db.pstmt.setString(1, acno);
                db.rst=db.pstmt.executeQuery();
                if(db.rst.next())
                {
                    int amt1=Integer.parseInt(db.rst.getString(1));
                    if(amt>amt1)
                    {
                        JOptionPane.showMessageDialog(this,"Your account does not have Enough Money");
                        new Last(acno).setVisible(true);
                        this.setVisible(false);
                        JOptionPane.showMessageDialog(this,"Transaction Unsuccessful");
                        
                    }
                    else
                    {
                     String amt2=String.valueOf(amt1-amt);
                                       String amt3=String.valueOf(amt);
                    db.pstmt=db.con.prepareStatement("update open_account_table set amount=? where ac_no=?");
                    db.pstmt.setString(1,amt2);
                    db.pstmt.setString(2,acno);
                    int i=db.pstmt.executeUpdate();
                    if(i>0)
                    {
                        DBConnection db1=new DBConnection();
                        db1.pstmt=db1.con.prepareStatement("insert into transaction values(?,?,?,?,?)");
                        db1.pstmt.setString(1,acno);
                        db1.pstmt.setString(2,new Date().toString());
                        db1.pstmt.setString(3,amt3);
                        db1.pstmt.setString(4,d);
                        db1.pstmt.setString(5,amt2);
                        db1.pstmt.executeUpdate();
                        new Last(acno).setVisible(true);
                        this.setVisible(false);
                        new successful(acno).setVisible(true);
                    }}}}
 catch(Exception e)
 {
     e.printStackTrace();
 }        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
try{
     int amt=200;
     String d="Withdraw";
     DBConnection db=new DBConnection();
                db.pstmt=db.con.prepareStatement("select amount from open_account_table where ac_no=?");
                db.pstmt.setString(1, acno);
                db.rst=db.pstmt.executeQuery();
                if(db.rst.next())
                {
                    int amt1=Integer.parseInt(db.rst.getString(1));
                    if(amt>amt1)
                    {
                        JOptionPane.showMessageDialog(this,"Your account does not have Enough Money");
                        new Last(acno).setVisible(true);
                        this.setVisible(false);
                        JOptionPane.showMessageDialog(this,"Transaction Unsuccessful");
                        
                    }
                    else
                    {
                     String amt2=String.valueOf(amt1-amt);
                                       String amt3=String.valueOf(amt);
                    db.pstmt=db.con.prepareStatement("update open_account_table set amount=? where ac_no=?");
                    db.pstmt.setString(1,amt2);
                    db.pstmt.setString(2,acno);
                    int i=db.pstmt.executeUpdate();
                    if(i>0)
                    {
                        DBConnection db1=new DBConnection();
                        db1.pstmt=db1.con.prepareStatement("insert into transaction values(?,?,?,?,?)");
                        db1.pstmt.setString(1,acno);
                        db1.pstmt.setString(2,new Date().toString());
                        db1.pstmt.setString(3,amt3);
                        db1.pstmt.setString(4,d);
                        db1.pstmt.setString(5,amt2);
                        db1.pstmt.executeUpdate();
                        new Last(acno).setVisible(true);
                        this.setVisible(false);
                        new successful(acno).setVisible(true);
                    }}}}
 catch(Exception e)
 {
     e.printStackTrace();
 }        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
try{
     int amt=500;
     String d="Withdraw";
     DBConnection db=new DBConnection();
                db.pstmt=db.con.prepareStatement("select amount from open_account_table where ac_no=?");
                db.pstmt.setString(1, acno);
                db.rst=db.pstmt.executeQuery();
                if(db.rst.next())
                {
                    int amt1=Integer.parseInt(db.rst.getString(1));
                    if(amt>amt1)
                    {
                        JOptionPane.showMessageDialog(this,"Your account does not have Enough Money");
                        new Last(acno).setVisible(true);
                        this.setVisible(false);
                        JOptionPane.showMessageDialog(this,"Transaction Unsuccessful");
                        
                    }
                    else
                    {
                     String amt2=String.valueOf(amt1-amt);
                                       String amt3=String.valueOf(amt);
                    db.pstmt=db.con.prepareStatement("update open_account_table set amount=? where ac_no=?");
                    db.pstmt.setString(1,amt2);
                    db.pstmt.setString(2,acno);
                    int i=db.pstmt.executeUpdate();
                    if(i>0)
                    {
                        DBConnection db1=new DBConnection();
                        db1.pstmt=db1.con.prepareStatement("insert into transaction values(?,?,?,?,?)");
                        db1.pstmt.setString(1,acno);
                        db1.pstmt.setString(2,new Date().toString());
                        db1.pstmt.setString(3,amt3);
                        db1.pstmt.setString(4,d);
                        db1.pstmt.setString(5,amt2);
                        db1.pstmt.executeUpdate();
                        new Last(acno).setVisible(true);
                        this.setVisible(false);
                        new successful(acno).setVisible(true);
                    }}}}
 catch(Exception e)
 {
     e.printStackTrace();
 }        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
try{
     int amt=1000;
     String d="Withdraw";
     DBConnection db=new DBConnection();
                db.pstmt=db.con.prepareStatement("select amount from open_account_table where ac_no=?");
                db.pstmt.setString(1, acno);
                db.rst=db.pstmt.executeQuery();
                if(db.rst.next())
                {
                    int amt1=Integer.parseInt(db.rst.getString(1));
                    if(amt>amt1)
                    {
                        JOptionPane.showMessageDialog(this,"Your account does not have Enough Money");
                        new Last(acno).setVisible(true);
                        this.setVisible(false);
                        JOptionPane.showMessageDialog(this,"Transaction Unsuccessful");
                        
                    }
                    else
                    {
                     String amt2=String.valueOf(amt1-amt);
                                       String amt3=String.valueOf(amt);
                    db.pstmt=db.con.prepareStatement("update open_account_table set amount=? where ac_no=?");
                    db.pstmt.setString(1,amt2);
                    db.pstmt.setString(2,acno);
                    int i=db.pstmt.executeUpdate();
                    if(i>0)
                    {
                        DBConnection db1=new DBConnection();
                        db1.pstmt=db1.con.prepareStatement("insert into transaction values(?,?,?,?,?)");
                        db1.pstmt.setString(1,acno);
                        db1.pstmt.setString(2,new Date().toString());
                        db1.pstmt.setString(3,amt3);
                        db1.pstmt.setString(4,d);
                        db1.pstmt.setString(5,amt2);
                        db1.pstmt.executeUpdate();
                        new Last(acno).setVisible(true);
                        this.setVisible(false);
                        new successful(acno).setVisible(true);
                    }}}}
 catch(Exception e)
 {
     e.printStackTrace();
 }        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
   new Withdrawal(acno).setVisible(true);
   this.setVisible(false);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
new Menu(acno).setVisible(true);
this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
