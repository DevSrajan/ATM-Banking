package app;
import DB.DBConnection;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class ChangePin extends javax.swing.JFrame {
    public ChangePin() {
        initComponents();
        setLocation(250,75);
    }
    String acno;
     public ChangePin(String ac) {
        initComponents();
        acno=ac;
        setLocation(230,75);
      }
 @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jPasswordField3 = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setMaximumSize(new java.awt.Dimension(778, 575));
        jPanel1.setMinimumSize(new java.awt.Dimension(778, 575));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 48)); // NOI18N
        jLabel2.setText("My Metro");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 32, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/black atm.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 48)); // NOI18N
        jLabel3.setText("ATM");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(478, 32, -1, -1));

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel7.setText("SUBMIT");
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
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 0, -1, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 510, 180, 50));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel1.setText("Enter the Current Pin");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel5.setText("Enter the New Pin");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel6.setText("Confirm the New Pin");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        jPasswordField1.setFont(new java.awt.Font("Century Gothic", 0, 48)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(204, 204, 204));
        jPasswordField1.setText("****");
        jPasswordField1.setBorder(null);
        jPasswordField1.setOpaque(false);
        jPasswordField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordField1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPasswordField1MouseEntered(evt);
            }
        });
        jPanel3.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, 120, 70));

        jPasswordField2.setFont(new java.awt.Font("Century Gothic", 0, 48)); // NOI18N
        jPasswordField2.setForeground(new java.awt.Color(204, 204, 204));
        jPasswordField2.setText("****");
        jPasswordField2.setBorder(null);
        jPasswordField2.setOpaque(false);
        jPasswordField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordField2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPasswordField2MouseEntered(evt);
            }
        });
        jPanel3.add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, 120, 70));

        jPasswordField3.setFont(new java.awt.Font("Century Gothic", 0, 48)); // NOI18N
        jPasswordField3.setForeground(new java.awt.Color(204, 204, 204));
        jPasswordField3.setText("****");
        jPasswordField3.setBorder(null);
        jPasswordField3.setOpaque(false);
        jPasswordField3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordField3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPasswordField3MouseEntered(evt);
            }
        });
        jPanel3.add(jPasswordField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, 120, 70));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, 160, 20));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 160, 20));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 160, 20));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 740, 360));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/nyc_central_park_infrared_4k-2560x1440.jpg"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 778, 575));

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

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0),1,true));       
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
jPanel2.setBorder(null);
    }//GEN-LAST:event_jLabel7MouseExited

    private void jPasswordField1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField1MouseEntered

    }//GEN-LAST:event_jPasswordField1MouseEntered

    private void jPasswordField2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField2MouseEntered

    }//GEN-LAST:event_jPasswordField2MouseEntered

    private void jPasswordField3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField3MouseEntered

    }//GEN-LAST:event_jPasswordField3MouseEntered

    private void jPasswordField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField1MouseClicked
jPasswordField1.setText("");
jPasswordField1.setForeground(Color.black);       // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1MouseClicked

    private void jPasswordField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField2MouseClicked
jPasswordField2.setText("");
jPasswordField2.setForeground(Color.black);   // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField2MouseClicked

    private void jPasswordField3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField3MouseClicked
jPasswordField3.setText("");
jPasswordField3.setForeground(Color.black);       // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField3MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
try
{  
    String curp=jPasswordField1.getText();
    String newp=jPasswordField2.getText();
    String conp=jPasswordField3.getText();
    DBConnection db=new DBConnection();
    db.pstmt=db.con.prepareStatement("select passwd from open_account_table where ac_no=?");
    db.pstmt.setString(1,acno);
    db.rst=db.pstmt.executeQuery();
    if(db.rst.next())
    {
      String dbcurp=db.rst.getString(1);
      if(curp.equals(dbcurp))
      {
          if(newp.equals(conp))
          {
            
            db.pstmt=db.con.prepareStatement("update open_account_table set passwd=? where ac_no=?");
            db.pstmt.setString(1,conp);
            db.pstmt.setString(2,acno);
            int i=db.pstmt.executeUpdate();
            if(i>0)
            {
               ImageIcon icon1=new ImageIcon("PSWDCHNGSCC.png");
          JOptionPane.showMessageDialog(null,null,null,JOptionPane.WARNING_MESSAGE,icon1) ;
             jPasswordField1.setText("");
             jPasswordField2.setText("");
             jPasswordField3.setText("");
             new Last(acno).setVisible(true);
             this.setVisible(false);
            }
            else
               try{
                       ImageIcon icon2=new ImageIcon("PSWDCHNGNOT.png");
          JOptionPane.showMessageDialog(null,null,null,JOptionPane.WARNING_MESSAGE,icon2) ;
                       }catch(Exception e)
                               {
                               
                               }
          }
          else
                try{
                       ImageIcon icon2=new ImageIcon("NPCPDNM.png");
          JOptionPane.showMessageDialog(null,null,null,JOptionPane.WARNING_MESSAGE,icon2) ;
                       }catch(Exception e)
                               {
                               
                               }
      }
      else
      {
         try{
                       ImageIcon icon2=new ImageIcon("INCPSWD.png");
          JOptionPane.showMessageDialog(null,null,null,JOptionPane.WARNING_MESSAGE,icon2) ;
                       }catch(Exception e)
                               {
                               
                               }
      }
    }
    else{
        JOptionPane.showMessageDialog(this,"ERROR...!!! please try again Later..");
        this.setVisible(false);
        new Last(acno).setVisible(true);
    }
    
}
catch(Exception e)
{
    e.printStackTrace();
}
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseClicked

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
