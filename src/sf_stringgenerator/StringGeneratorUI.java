package sf_stringgenerator;
import sf_stringgenerator.VariableModule.*;
import java.awt.*;
import java.net.*;
import javax.swing.*;
import javax.swing.text.*;
import java.lang.Thread.State;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
class CustomDocumentFilter extends DocumentFilter
{
    @Override public void replace (FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
        String textAfterReplacement = new StringBuilder (fb.getDocument ().getText (0, fb.getDocument ().getLength ())).replace (offset, offset + length, text).toString ();
        try {
            int value = Integer.parseInt (textAfterReplacement);
            if (value < 1 ) value = 1;
            else if (value > 10) value = 10;
            super.replace (fb, 0, fb.getDocument ().getLength (), String.valueOf (value), attrs);
        }
        catch (NumberFormatException e) {
            // Handle exception ...

        }
    }
}
class CustomDocumentFilter2 extends DocumentFilter
{
    @Override public void replace (FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
        String textAfterReplacement = new StringBuilder (fb.getDocument ().getText (0, fb.getDocument ().getLength ())).replace (offset, offset + length, text).toString ();
        try {
            int value = Integer.parseInt (textAfterReplacement);
            if (value < 1) value = 1;
            else if (value > 25) value = 25;
            super.replace (fb, 0, fb.getDocument ().getLength (), String.valueOf (value), attrs);
        }
        catch (NumberFormatException e) {
            // Handle exception ...
        }
    }
}
/**
 *
 * @author Entahlah
 */
public class StringGeneratorUI extends javax.swing.JFrame {

    /**
     * Creates new form StringGeneratorUI
     */
    public StringGeneratorUI() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        chkNmDigit = new javax.swing.JCheckBox();
        chkUpLetter = new javax.swing.JCheckBox();
        chkLoLetter = new javax.swing.JCheckBox();
        btnGetString = new javax.swing.JButton();
        btnResetForm = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        aboutBtn = new javax.swing.JButton();
        spnGenCharField = new javax.swing.JSpinner();
        spnLongCharField = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("String Generator 1.0");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Generate");

        jLabel2.setText("random strings. (max 10)");

        jLabel3.setText("Each string should be");

        jLabel4.setText("characters long. (max 25)");

        jLabel5.setText("Which characters are allowed to occur in the strings?");

        chkNmDigit.setSelected(true);
        chkNmDigit.setText("Numeric digits (0-9)");

        chkUpLetter.setText("Uppercase letters (A-Z)");

        chkLoLetter.setText("Lowercase letters (a-z)");

        btnGetString.setText("Get Strings");
        btnGetString.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetStringActionPerformed(evt);
            }
        });

        btnResetForm.setText("Reset Form");
        btnResetForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetFormActionPerformed(evt);
            }
        });

        aboutBtn.setText("About");
        aboutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutBtnActionPerformed(evt);
            }
        });

        spnGenCharField.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));

        spnLongCharField.setModel(new javax.swing.SpinnerNumberModel(10, 1, 25, 1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(spnGenCharField, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(spnLongCharField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel5)
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(chkNmDigit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(chkUpLetter, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGetString, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(chkLoLetter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnResetForm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(aboutBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(spnGenCharField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(spnLongCharField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkNmDigit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkUpLetter)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkLoLetter)
                    .addComponent(btnResetForm, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGetString, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aboutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void btnResetFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetFormActionPerformed
        // TODO add your handling code here:
        spnGenCharField.setValue(Integer.parseInt("1"));
        spnLongCharField.setValue(Integer.parseInt("10"));
        chkNmDigit.setSelected(true);
        chkUpLetter.setSelected(false);
        chkLoLetter.setSelected(false);
    }//GEN-LAST:event_btnResetFormActionPerformed

    private void btnGetStringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetStringActionPerformed
        // TODO add your handling code here:
        VariableModule.lgChar = Integer.parseInt(spnLongCharField.getValue().toString());
        VariableModule.genChar = Integer.parseInt(spnGenCharField.getValue().toString());
        
        int aa;
        aa = Integer.parseInt(spnGenCharField.getValue().toString());
        
        if (String.valueOf(aa).length() < 1 ) {
            JOptionPane.showMessageDialog(this, "You must select at least one character option!", "Required" , JOptionPane.WARNING_MESSAGE);
            System.exit(1);
        }
        else {
            System.out.println("Proceed");
        }
        
        if(chkNmDigit.isSelected() && !chkUpLetter.isSelected() && !chkLoLetter.isSelected()){
            //Select first checkbox
                    int gc = VariableModule.genChar;
                    switch (gc){
                        case 1:
                            if(spnGenCharField.getValue().toString().isEmpty()){
                            //error
                            System.out.println("ERROR!");
                            JOptionPane.showMessageDialog(this, "You must generate at least one string!", "Required" , JOptionPane.WARNING_MESSAGE);
                    } 
                            else  //every thing is fine, you can continue.
                            System.out.println("every thing is fine, you can continue.");
                            new StringResult1().setVisible(true);
                            this.setVisible(false);
                            break;
                            case 2:
                            if(spnGenCharField.getValue().toString().isEmpty()){
                            //error
                            System.out.println("ERROR!");
                            JOptionPane.showMessageDialog(this, "You must generate at least one string!", "Required" , JOptionPane.WARNING_MESSAGE);
                    } 
                            else  //every thing is fine, you can continue.
                            System.out.println("every thing is fine, you can continue.");
                            new StringResult2().setVisible(true);
                            this.setVisible(false);
                            break;
                            case 3:
                            if(spnGenCharField.getValue().toString().isEmpty()){
                            //error
                            System.out.println("ERROR!");
                            JOptionPane.showMessageDialog(this, "You must generate at least one string!", "Required" , JOptionPane.WARNING_MESSAGE);
                    } 
                            else  //every thing is fine, you can continue.
                            System.out.println("every thing is fine, you can continue.");
                            new StringResult3().setVisible(true);
                            this.setVisible(false);
                            break;
                            case 4:
                            if(spnGenCharField.getValue().toString().isEmpty()){
                            //error
                            System.out.println("ERROR!");
                            JOptionPane.showMessageDialog(this, "You must generate at least one string!", "Required" , JOptionPane.WARNING_MESSAGE);
                    } 
                            else  //every thing is fine, you can continue.
                            System.out.println("every thing is fine, you can continue.");
                            new StringResult4().setVisible(true);
                            this.setVisible(false);
                            break;
                            case 5:
                            if(spnGenCharField.getValue().toString().isEmpty()){
                            //error
                            System.out.println("ERROR!");
                            JOptionPane.showMessageDialog(this, "You must generate at least one string!", "Required" , JOptionPane.WARNING_MESSAGE);
                    } 
                            else  //every thing is fine, you can continue.
                            System.out.println("every thing is fine, you can continue.");
                            new StringResult5().setVisible(true);
                            this.setVisible(false);
                            break;
                        default:
                            JOptionPane.showMessageDialog(this, "You must generate at least one string!", "Required" , JOptionPane.WARNING_MESSAGE);
                            break;
                    }
                    
                }
        else if(!chkNmDigit.isSelected() && chkUpLetter.isSelected() && !chkLoLetter.isSelected()){
            //Select second checkbox
                    new StringResult().setVisible(true);
                    this.setVisible(false);
                }
        else if(!chkNmDigit.isSelected() && !chkUpLetter.isSelected() && chkLoLetter.isSelected()){
            //Select third checkbox
                    new StringResult().setVisible(true);
                    this.setVisible(false);
                }
        else if(chkNmDigit.isSelected() && chkUpLetter.isSelected() && !chkLoLetter.isSelected()){
            //Select fist and second checkbox
                    new StringResult().setVisible(true);
                    this.setVisible(false);
                }
        else if(chkNmDigit.isSelected() && !chkUpLetter.isSelected() && chkLoLetter.isSelected()){
            //Select first and third checkbox        
                    new StringResult().setVisible(true);
                    this.setVisible(false);
                }
        else if(!chkNmDigit.isSelected() && chkUpLetter.isSelected() && chkLoLetter.isSelected()){
            //Select second and third checkbox        
                    new StringResult().setVisible(true);
                    this.setVisible(false);
                }
        else if(!chkNmDigit.isSelected() && !chkUpLetter.isSelected() && !chkLoLetter.isSelected()){
            //No checkbox selected
            //JOptionPane.showMessageDialog(this, "You must select at least one string option!", "Error", JOptionPane.ERROR_MESSAGE);
                    JOptionPane.showMessageDialog(this, "You must select at least one character option!", "Required" , JOptionPane.WARNING_MESSAGE);
                }
        else{
            //Select all checkbox
                    new StringResult().setVisible(true);
                    this.setVisible(false);
                }
        
        
    }//GEN-LAST:event_btnGetStringActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        int k = 12;
        ((DefaultFormatter)((JSpinner.NumberEditor)spnGenCharField.getEditor()).getTextField().getFormatter()).setAllowsInvalid(false);
        ((DefaultFormatter)((JSpinner.NumberEditor)spnLongCharField.getEditor()).getTextField().getFormatter()).setAllowsInvalid(false);
    }//GEN-LAST:event_formWindowOpened

    private void aboutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutBtnActionPerformed
        // TODO add your handling code here:
        new AboutUI().setVisible(true);
    }//GEN-LAST:event_aboutBtnActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StringGeneratorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StringGeneratorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StringGeneratorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StringGeneratorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StringGeneratorUI().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aboutBtn;
    private javax.swing.JButton btnGetString;
    private javax.swing.JButton btnResetForm;
    public static javax.swing.JCheckBox chkLoLetter;
    public static javax.swing.JCheckBox chkNmDigit;
    public static javax.swing.JCheckBox chkUpLetter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner spnGenCharField;
    private javax.swing.JSpinner spnLongCharField;
    // End of variables declaration//GEN-END:variables
}
