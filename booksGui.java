/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package hammer.datastuctproject;

import java.util.HashSet;
import java.util.Set;
import javax.swing.JFrame;

/**
 *
 * @author User
 */
public class booksGui extends javax.swing.JDialog {

    /**
     * Creates new form booksGui
     */
    public int mode;
    public int pos;
    public booksGui(JFrame jFrame, boolean par) {
        initComponents();
        mode = 0;
        title.setVisible(true);
        updateFields();
    }
    
    public void updateFields(){
        handling handler = new handling();
        if(mode == 0){
            //do nothing
            bookIdInput.setVisible(false);
            bookNameInput.setVisible(false);
            bookGenreInput.setVisible(false);
            option1.setVisible(true);
            option2.setVisible(true);
            option3.setVisible(true);
            next.setVisible(false);
            prev.setVisible(false);
            showInfo.setVisible(false);
            option1.setText("book storage");
            option2.setText("return books storage");
            option3.setText("queue for computer");
            
        }
        if(mode == 1){
            //arraymode
            pos = 0;
            bookIdInput.setVisible(true);
            bookNameInput.setVisible(true);
            bookGenreInput.setVisible(true);
            option1.setVisible(true);
            option2.setVisible(false);
            option3.setVisible(true);
            next.setVisible(true);
            prev.setVisible(true);
            showInfo.setVisible(true);
            option1.setText("main menu");
            option2.setText("");
            option3.setText("add");
            String bookId = Integer.toString(handler.getBookIdArray(pos));
            String bookName = handler.getBookNameArray(pos);
            String bookGenre = handler.getBookGenreArray(pos);
            showInfo.setText("book Id:"+bookId+" book name:"+bookName+" book genre:"+bookGenre);
        }
        if(mode == 2){
            //stackmode
            bookIdInput.setVisible(true);
            bookNameInput.setVisible(true);
            bookGenreInput.setVisible(true);
            option1.setVisible(true);
            option2.setVisible(true);
            option3.setVisible(true);
            next.setVisible(true);
            prev.setVisible(true);
            showInfo.setVisible(true);
            option1.setText("main menu");
            option2.setText("add");
            option3.setText("remove");
            handler.holdBookStack();
            String bookId = Integer.toString(handler.heldBookId());
            String bookName = handler.heldBookName();
            String bookGenre = handler.heldBookGenre();
            handler.heldBookPutBack();
            showInfo.setText("book Id:"+bookId+" book name:"+bookName+" book genre:"+bookGenre);
        }
        if(mode == 3){
            //queuemode
            bookIdInput.setVisible(false);
            bookNameInput.setVisible(true);
            bookGenreInput.setVisible(false);
            option1.setVisible(true);
            option2.setVisible(true);
            option3.setVisible(true);
            next.setVisible(false);
            prev.setVisible(false);
            showInfo.setVisible(true);
            option1.setText("main menu");
            option2.setText("enqueue");
            option3.setText("dequeue");
            showInfo.setText("next person:"+handler.gettingFromQueue());
        }
    }
    public void setOption0(){
        mode = 0;
        updateFields();
    }
    public void setOption1(){
        mode = 1;
        updateFields();
    }
    public void setOption2(){
        mode = 2;
        updateFields();
    }
    public void setOption3(){
        mode = 3;
        updateFields();
    }
    public void addTo(){
        handling handler = new handling();
        int id = Integer.parseInt(bookIdInput.getText());
        String Name = bookNameInput.getText();
        String genre = bookGenreInput.getText();
        if(mode == 1){
            handler.addingToArray(id, Name, genre);
        }
        if(mode == 2){
            handler.addingToStack(id, Name, genre);
        }
        if(mode == 3){
            handler.AddingToQueue(Name);
        }
    }
    public void removeFromStack(){
        handling handler = new handling();
        handler.holdBookStack();
    }
    public void updateInfo(){
        handling handler = new handling();
        if(mode == 1){
            
            String bookId = Integer.toString(handler.getBookIdArray(pos));
            String bookName = handler.getBookNameArray(pos);
            String bookGenre = handler.getBookGenreArray(pos);
            showInfo.setText("book Id:"+bookId+" book name:"+bookName+" book genre:"+bookGenre);
        }
        if(mode == 2){
            handler.holdBookStack();
            String bookId = Integer.toString(handler.heldBookId());
            String bookName = handler.heldBookName();
            String bookGenre = handler.heldBookGenre();
            handler.heldBookPutBack();
            showInfo.setText("book Id:"+bookId+" book name:"+bookName+" book genre:"+bookGenre);
        }
        if(mode == 3){
            bookIdInput.setVisible(true);
            bookNameInput.setVisible(true);
            bookGenreInput.setVisible(true);
            option1.setVisible(true);
            option2.setVisible(true);
            option3.setVisible(true);
            next.setVisible(false);
            prev.setVisible(false);
            showInfo.setVisible(true);
            showInfo.setText("next person:"+handler.gettingFromQueue());
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

        option1 = new javax.swing.JButton();
        option2 = new javax.swing.JButton();
        option3 = new javax.swing.JButton();
        bookIdInput = new javax.swing.JTextField();
        bookNameInput = new javax.swing.JTextField();
        bookGenreInput = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        showInfo = new javax.swing.JTextArea();
        title = new javax.swing.JLabel();
        prev = new javax.swing.JButton();
        next = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        option1.setText("option1");
        option1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                option1ActionPerformed(evt);
            }
        });

        option2.setText("option2");
        option2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                option2ActionPerformed(evt);
            }
        });

        option3.setText("option3");
        option3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                option3ActionPerformed(evt);
            }
        });

        bookIdInput.setText("bookIdInput");
        bookIdInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookIdInputActionPerformed(evt);
            }
        });

        bookNameInput.setText("bookNameInput");

        bookGenreInput.setText("bookGenreInptut");

        showInfo.setColumns(20);
        showInfo.setRows(5);
        showInfo.setText("example\n");
        jScrollPane1.setViewportView(showInfo);

        title.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("title");

        prev.setText("prev");
        prev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevActionPerformed(evt);
            }
        });

        next.setText("next");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(bookGenreInput, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                            .addComponent(bookNameInput, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bookIdInput, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(option1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105)
                        .addComponent(option2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(option3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(120, Short.MAX_VALUE)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
            .addGroup(layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(prev)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(next)
                .addGap(179, 179, 179))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bookIdInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(bookNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(bookGenreInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prev)
                    .addComponent(next))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(option3, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(option2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(option1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bookIdInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookIdInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookIdInputActionPerformed

    private void option1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_option1ActionPerformed
        // TODO add your handling code here:
        if(mode == 0){
            setOption1();
            
        }else{
            setOption0();
        }
        
    }//GEN-LAST:event_option1ActionPerformed

    private void option2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_option2ActionPerformed
        // TODO add your handling code here:
        if(mode == 0){
            setOption2();
        }
        if(mode == 2){
            removeFromStack();
        }
        if(mode == 3){
            handling handler = new handling();
            handler.AddingToQueue(bookNameInput.getText());
        }
    }//GEN-LAST:event_option2ActionPerformed

    private void option3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_option3ActionPerformed
        // TODO add your handling code here:
        handling handler = new handling();
        if(mode == 0){
            setOption3();
        }else{
            addTo();
        }
    }//GEN-LAST:event_option3ActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        // TODO add your handling code here:
        pos = pos+1;
        updateInfo();
    }//GEN-LAST:event_nextActionPerformed

    private void prevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevActionPerformed
        // TODO add your handling code here:
        pos = pos-1;
        updateInfo();
    }//GEN-LAST:event_prevActionPerformed

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
            java.util.logging.Logger.getLogger(booksGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(booksGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(booksGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(booksGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                booksGui dialog = new booksGui(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bookGenreInput;
    private javax.swing.JTextField bookIdInput;
    private javax.swing.JTextField bookNameInput;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton next;
    private javax.swing.JButton option1;
    private javax.swing.JButton option2;
    private javax.swing.JButton option3;
    private javax.swing.JButton prev;
    private javax.swing.JTextArea showInfo;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
