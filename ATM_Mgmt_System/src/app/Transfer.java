
package app;
import DB.DBConnection;
import java.awt.Color;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class Transfer extends javax.swing.JFrame {
    public Transfer() {
        initComponents();
    }
    String acno;
     public Transfer(String ac) {
        initComponents();
        acno=ac;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jTextField3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(155, 75));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setMaximumSize(new java.awt.Dimension(1080, 585));
        jPanel1.setMinimumSize(new java.awt.Dimension(1080, 585));
        jPanel1.setPreferredSize(new java.awt.Dimension(1080, 585));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("s Account No :");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 94, -1, -1));

        jTextField1.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(204, 204, 204));
        jTextField1.setText("00000000000");
        jTextField1.setBorder(null);
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jPanel3.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 94, 307, 45));

        jSeparator1.setBackground(new java.awt.Color(0, 153, 153));
        jSeparator1.setForeground(new java.awt.Color(0, 153, 153));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 145, 307, 10));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("unt No");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 202, -1, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setText(":");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 202, -1, -1));

        jTextField2.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(204, 204, 204));
        jTextField2.setText("00000000000");
        jTextField2.setBorder(null);
        jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField2MouseClicked(evt);
            }
        });
        jPanel3.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 202, 307, 45));

        jSeparator2.setBackground(new java.awt.Color(0, 153, 153));
        jSeparator2.setForeground(new java.awt.Color(0, 153, 153));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 253, 307, 10));

        jTextField3.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(204, 204, 204));
        jTextField3.setText("000000");
        jTextField3.setBorder(null);
        jTextField3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField3MouseEntered(evt);
            }
        });
        jPanel3.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 219, 40));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 153));
        jLabel9.setText("Amount Must Be In");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 314, -1, -1));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 153));
        jLabel10.setText("Multiples of 100");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 361, -1, -1));

        jSeparator3.setBackground(new java.awt.Color(0, 153, 153));
        jSeparator3.setForeground(new java.awt.Color(0, 153, 153));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 353, 219, 10));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 153));
        jLabel11.setText(":");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 302, -1, -1));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 153, 153));
        jLabel12.setText("NEXT");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel12MouseExited(evt);
            }
        });
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 408, -1, 49));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 580, 470));

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Enter the Receiver");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 23, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Confirm The Acco");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 131, -1, -1));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Enter the amount");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 236, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 970, 340));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/ATM_100px.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Transfer Money");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/fishing_at_dusk-2560x1600.jpg"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseEntered
jLabel12.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel12MouseEntered

    private void jLabel12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseExited
jLabel12.setForeground(new Color(0,153,153));        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel12MouseExited

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
jTextField1.setText("");
jTextField1.setForeground(new Color(0,153,153));// TODO add your handling code here:
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jTextField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MouseClicked
jTextField2.setText("");
jTextField2.setForeground(new Color(0,153,153));        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2MouseClicked

    private void jTextField3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField3MouseEntered
       // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3MouseEntered

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
try{

    
    String d="Transfer";
    String ac1=jTextField1.getText();
    String ac2=jTextField2.getText();
    String am=jTextField3.getText();
    int am1=Integer.parseInt(am);int amt7=0;
    if(am1%100==0)
    {
    DBConnection db=new DBConnection();
    db.pstmt=db.con.prepareStatement("select ac_no,amount from open_account_table where ac_no=?");
    db.pstmt.setString(1,ac1);
    db.rst=db.pstmt.executeQuery();
    if(db.rst.next())
    {
        String ac3=db.rst.getString(1);
        if(ac3.equals(ac1))
        {
            if(ac1.equals(ac2))
            {
             int amt=Integer.parseInt(db.rst.getString(2));
             String amt1=String.valueOf(amt+am1);
                   DBConnection db6=new DBConnection();
                            db6.pstmt=db6.con.prepareStatement("select amount from open_account_table where ac_no=?");
                            db6.pstmt.setString(1,acno);
                            db6.rst=db6.pstmt.executeQuery();
                            if(db6.rst.next())
                            {
                            amt7=Integer.parseInt(db6.rst.getString(1));
                            
                            if(am1>amt7){
                            try{
                       ImageIcon icon2=new ImageIcon("NEBTS.png");
          JOptionPane.showMessageDialog(null,null,null,JOptionPane.WARNING_MESSAGE,icon2) ;
                       }catch(Exception e)
                               {
                               
                               }
                           new Last(acno).setVisible(true);
                           this.setVisible(false);
                            }else
                            {
             DBConnection db1=new DBConnection();
             db1.pstmt=db1.con.prepareStatement("update open_account_table set amount=? where ac_no=?");
             db1.pstmt.setString(1,amt1);
             db1.pstmt.setString(2,ac3);
             int i=db1.pstmt.executeUpdate();
             if(i>0)
             {
                  DBConnection db2=new DBConnection();
                        db2.pstmt=db2.con.prepareStatement("insert into transaction values(?,?,?,?,?)");
                        db2.pstmt.setString(1,ac3);
                        db2.pstmt.setString(2,new Date().toString());
                        db2.pstmt.setString(3,am);
                        db2.pstmt.setString(4,d);
                        db2.pstmt.setString(5,amt1);
                        int j=db2.pstmt.executeUpdate();
                        if(j>0)
                        {
                            DBConnection db4=new DBConnection();
                            db4.pstmt=db4.con.prepareStatement("select name,amount from open_account_table where ac_no=?");
                            db4.pstmt.setString(1,acno);
                            db4.rst=db4.pstmt.executeQuery();
                            if(db4.rst.next())
                            {
                                String names=db4.rst.getString(1);
                                int amt5=Integer.parseInt(db4.rst.getString(2));
                                String amt6=String.valueOf(amt5-am1);
                              String d1="Send";
                            DBConnection db3=new DBConnection();
                        db3.pstmt=db3.con.prepareStatement("insert into transaction values(?,?,?,?,?)");
                        db3.pstmt.setString(1,acno);
                        db3.pstmt.setString(2,new Date().toString());
                        db3.pstmt.setString(3,am);
                        db3.pstmt.setString(4,d1);
                        db3.pstmt.setString(5,amt6);
                        int k=db3.pstmt.executeUpdate();
                        if(k>0)
                        {
                            DBConnection db5=new DBConnection();
                            db5.pstmt=db5.con.prepareStatement("update open_account_table set amount=? where ac_no=?");
                            db5.pstmt.setString(1, amt6);
                            db5.pstmt.setString(2, acno);
                            db5.pstmt.executeUpdate();
                        }
                        
                        new Last(acno).setVisible(true);
                        this.setVisible(false);
                        new successful(acno).setVisible(true);
             }}}}
            }
            
        }else
    {
  
              try{
                       ImageIcon icon2=new ImageIcon("MCA.png");
          JOptionPane.showMessageDialog(null,null,null,JOptionPane.WARNING_MESSAGE,icon2) ;
                       }catch(Exception e)
                               {
                               
                               }
        
    }
    



    }
    else
    {
  
            try{
                       ImageIcon icon2=new ImageIcon("INA.png");
          JOptionPane.showMessageDialog(null,null,null,JOptionPane.WARNING_MESSAGE,icon2) ;
                       }catch(Exception e)
                               {
                               
                               }
        
    }}else
    {
  
            try{
                       ImageIcon icon2=new ImageIcon("INA.png");
          JOptionPane.showMessageDialog(null,null,null,JOptionPane.WARNING_MESSAGE,icon2) ;
                       }catch(Exception e)
                               {
                               
                               }
        
        
    }}
else
    {
       jLabel9.setForeground(Color.red);
        jLabel10.setForeground(Color.red);
    }}
catch(Exception e)
{
    e.printStackTrace();
}
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jTextField3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField3MouseClicked
jTextField3.setText("");
jTextField3.setForeground(new Color(0,153,153));   
    }//GEN-LAST:event_jTextField3MouseClicked

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
