/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package railway;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
import java.time.Instant;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static railway.Login.from;
import static railway.Login.station;
import static railway.Login.to;
/**
 *
 * @author recklaw07
 */
public class search extends javax.swing.JFrame {

    /**
     * Creates new form search
     */
    public search() {
        station.put("Ernakulam (ERS)", "ERS");
        station.put("Trivandrum (TVC)","TVC");
        station.put("Calicut (CLT)","CLT");
        station.put("Kannur (CAN)","CAN");
        station.put("Shornur (SRR)","SRR");
        station.put("Thrissur (TCR)","TCR");
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        froms = new javax.swing.JComboBox<>();
        tos = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        panel1 = new javax.swing.JPanel();
        but1 = new javax.swing.JButton();
        panel2 = new javax.swing.JPanel();
        but2 = new javax.swing.JButton();
        panel3 = new javax.swing.JPanel();
        but3 = new javax.swing.JButton();
        datec = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SEARCH");

        jLabel1.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 36)); // NOI18N
        jLabel1.setText("SEARCH");

        tab.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tab.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        tab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Number", "Name", "Time", "Seats"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tab.setShowGrid(true);
        jScrollPane1.setViewportView(tab);
        if (tab.getColumnModel().getColumnCount() > 0) {
            tab.getColumnModel().getColumn(0).setResizable(false);
            tab.getColumnModel().getColumn(0).setPreferredWidth(5);
            tab.getColumnModel().getColumn(1).setResizable(false);
            tab.getColumnModel().getColumn(2).setResizable(false);
            tab.getColumnModel().getColumn(2).setPreferredWidth(8);
            tab.getColumnModel().getColumn(3).setResizable(false);
            tab.getColumnModel().getColumn(3).setPreferredWidth(3);
        }
        tab.setRowHeight(tab.getRowHeight() + 15);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("From Station: ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("To Station: ");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Date: ");

        froms.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        froms.setMaximumRowCount(10);
        froms.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ernakulam (ERS)", "Trivandrum (TVC)", "Calicut (CLT)", "Kannur (CAN)", "Shornur (SRR)", "Thrissur (TCR)" }));
        froms.setToolTipText("");
        froms.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ernakulam (ERS)", "Trivandrum (TVC)", "Calicut (CLT)", "Kannur (CAN)", "Shornur (SRR)", "Thrissur (TCR)" }));

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        but1.setText("Book");
        but1.setEnabled(false);
        but1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(but1))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(but1))
        );

        but2.setText("Book");
        but2.setEnabled(false);
        but2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(but2))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(but2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        but3.setText("Book");
        but3.setEnabled(false);
        but3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(but3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addComponent(but3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(306, 306, 306)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(37, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(84, 84, 84))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(froms, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tos, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(66, 66, 66)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(datec, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(froms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jButton1)
                                .addGap(37, 37, 37)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(datec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(129, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String fro=(String) froms.getSelectedItem();
        String t=(String) tos.getSelectedItem();
        from=(String) station.get(fro);
        to=(String) station.get(t);
        Date date1=datec.getDate();
        if(from.equals(to)){
            JOptionPane.showMessageDialog(this,"Enter different stations");
        }
        else if(date1==null){
            JOptionPane.showMessageDialog(this,"Enter date");
        }
        else{
            Instant instt = date1.toInstant();
            String str=instt.toString();
            Login.date=str.substring(0,10);
            int i=0;
            try{  
            DefaultTableModel model = (DefaultTableModel) tab.getModel();
            model.setRowCount(0);
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/trains","root","password");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select distinct trno,time from stops where stop='"+from+"' and trno in(select distinct trno from stops where stop='"+to+"');");
            while(rs.next()){
                int tr=rs.getInt(1);
                String tim=rs.getString(2);
                Statement stmt1=con.createStatement();
                ResultSet rs1=stmt1.executeQuery("select name,sleft from trains where trno="+tr+";");
                String nam;
                int slef;
                while(rs1.next()){
                    nam=rs1.getString(1);
                    slef=rs1.getInt(2);
                    Object[] row = {tr,nam,tim,slef,"book"};
                    model.addRow(row);
                    i+=1;
                }
            }
            con.close();
        }catch(Exception e){ System.out.println(e);}  
            if(i==1)
                but1.setEnabled(true);
            else if(i==2){
                but2.setEnabled(true);
                but1.setEnabled(true);
            }
            else if(i==3){
                but1.setEnabled(true);
                but2.setEnabled(true);
                but3.setEnabled(true);
            }
                
            
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void but1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but1ActionPerformed
        Login.trainno=(int)tab.getModel().getValueAt(0,0);
        Login.trainname=(String)tab.getModel().getValueAt(0,1);
        dispose();
        new BookYourTrain().setVisible(true);
    }//GEN-LAST:event_but1ActionPerformed

    private void but2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but2ActionPerformed
        Login.trainno=(int)tab.getModel().getValueAt(1,0);
        Login.trainname=(String)tab.getModel().getValueAt(1,1);
        dispose();
        new BookYourTrain().setVisible(true);
    }//GEN-LAST:event_but2ActionPerformed

    private void but3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but3ActionPerformed
        Login.trainno=(int)tab.getModel().getValueAt(2,0);
        Login.trainname=(String)tab.getModel().getValueAt(2,1);
        dispose();
        new BookYourTrain().setVisible(true);
    }//GEN-LAST:event_but3ActionPerformed

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
            java.util.logging.Logger.getLogger(search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new search().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton but1;
    private javax.swing.JButton but2;
    private javax.swing.JButton but3;
    private com.toedter.calendar.JDateChooser datec;
    private javax.swing.JComboBox<String> froms;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panel3;
    private javax.swing.JTable tab;
    private javax.swing.JComboBox<String> tos;
    // End of variables declaration//GEN-END:variables
}
