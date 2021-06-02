
package client;

import java.text.SimpleDateFormat;

import java.util.Locale;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author kvnk1
 */
public class Borrow extends javax.swing.JInternalFrame {

    /** Creates new form Borrow */
    public Borrow() {
        initComponents();
         String date = new SimpleDateFormat("dd/MM/yy", Locale.getDefault()).format(new java.util.Date());
        currentdate.setText(date);
    }
   
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {//GEN-BEGIN:initComponents

        BORROWBOOK = new javax.swing.JPanel();
        BOOKID = new javax.swing.JLabel();
        bookid = new javax.swing.JTextField();
        memberid = new javax.swing.JTextField();
        MEMBERID = new javax.swing.JLabel();
        CURRENTDATE = new javax.swing.JLabel();
        currentdate = new javax.swing.JTextField();
        RETURNDATE = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        returndate = new javax.swing.JFormattedTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Borrow Book");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Export24.gif"))); // NOI18N

        BORROWBOOK.setBorder(javax.swing.BorderFactory.createTitledBorder("Borrow Book"));

        BOOKID.setText("BOOK ID :");

        MEMBERID.setText("MEMBER ID :");

        CURRENTDATE.setText("Current Date :");

        currentdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currentdateActionPerformed(evt);
            }
        });

        RETURNDATE.setText("Return Date:");

        jButton1.setText("Borrow");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        returndate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        javax.swing.GroupLayout BORROWBOOKLayout = new javax.swing.GroupLayout(BORROWBOOK);
        BORROWBOOK.setLayout(BORROWBOOKLayout);
        BORROWBOOKLayout.setHorizontalGroup(
            BORROWBOOKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BORROWBOOKLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BORROWBOOKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BOOKID)
                    .addComponent(MEMBERID)
                    .addComponent(CURRENTDATE)
                    .addComponent(RETURNDATE))
                .addGap(44, 44, 44)
                .addGroup(BORROWBOOKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(memberid)
                    .addComponent(bookid)
                    .addComponent(currentdate)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(returndate, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        BORROWBOOKLayout.setVerticalGroup(
            BORROWBOOKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BORROWBOOKLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BORROWBOOKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BOOKID)
                    .addComponent(bookid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(BORROWBOOKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(memberid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MEMBERID))
                .addGap(18, 18, 18)
                .addGroup(BORROWBOOKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CURRENTDATE)
                    .addComponent(currentdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(BORROWBOOKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RETURNDATE)
                    .addComponent(returndate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BORROWBOOK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BORROWBOOK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }//GEN-END:initComponents

    private void currentdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currentdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_currentdateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         String BOOKID=bookid.getText();
        String MEMBERID=memberid.getText();
        String CURRENTDATE=currentdate.getText();
        String RETURNDATE=returndate.getText();
       
            
        if(BooksDB.validate(BOOKID)){
            if(MembersDB.validate(MEMBERID)){
            
                int i = BorrowDB.save(BOOKID,MEMBERID,CURRENTDATE,RETURNDATE);
    
                if(i>0){
                                                JOptionPane.showMessageDialog(Borrow.this,"Book Issued successfully!");
                                            bookid.setText("");
                                                memberid.setText("");
                                                 returndate.setText("");
                                                
                                        }else{
                                                JOptionPane.showMessageDialog(Borrow.this,"Sorry, unable to Issue Book!");
                                        }     
            }else{
                    JOptionPane.showMessageDialog(Borrow.this, "Member is Not present","Login Error!", JOptionPane.ERROR_MESSAGE);
                    bookid.setText("");
                    
            } 
        }else{
                JOptionPane.showMessageDialog(Borrow.this, "Book is Not present","Login Error!", JOptionPane.ERROR_MESSAGE);
                bookid.setText("");
                
        } 
         // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BOOKID;
    private javax.swing.JPanel BORROWBOOK;
    private javax.swing.JLabel CURRENTDATE;
    private javax.swing.JLabel MEMBERID;
    private javax.swing.JLabel RETURNDATE;
    private javax.swing.JTextField bookid;
    private javax.swing.JTextField currentdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField memberid;
    private javax.swing.JFormattedTextField returndate;
    // End of variables declaration//GEN-END:variables

}
