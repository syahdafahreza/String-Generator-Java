package sf_stringgenerator;
import java.awt.Frame;
import sf_stringgenerator.VariableModule;
import java.util.Random;
import javax.swing.JOptionPane;
import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Syahda Fahreza
 * https://syahdafahreza.my.id
 */
public class StringResult8 extends javax.swing.JFrame {

    /**
     * Creates new form StringResult
     */
    public StringResult8() {
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

        hasilField01 = new javax.swing.JTextField();
        hasilField02 = new javax.swing.JTextField();
        hasilField03 = new javax.swing.JTextField();
        hasilField04 = new javax.swing.JTextField();
        hasilField05 = new javax.swing.JTextField();
        hasilField06 = new javax.swing.JTextField();
        hasilField07 = new javax.swing.JTextField();
        hasilField08 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnCopy01 = new javax.swing.JButton();
        btnCopy02 = new javax.swing.JButton();
        btnCopy03 = new javax.swing.JButton();
        btnCopy04 = new javax.swing.JButton();
        btnCopy05 = new javax.swing.JButton();
        btnCopy06 = new javax.swing.JButton();
        btnCopy07 = new javax.swing.JButton();
        btnCopy08 = new javax.swing.JButton();
        btnGoBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("String Result");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(null);
        setIconImages(null);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        hasilField01.setEditable(false);
        hasilField01.setFocusable(false);

        hasilField02.setEditable(false);
        hasilField02.setFocusable(false);

        hasilField03.setEditable(false);
        hasilField03.setFocusable(false);

        hasilField04.setEditable(false);
        hasilField04.setFocusable(false);

        hasilField05.setEditable(false);
        hasilField05.setFocusable(false);

        hasilField06.setEditable(false);
        hasilField06.setFocusable(false);

        hasilField07.setEditable(false);
        hasilField07.setFocusable(false);

        hasilField08.setEditable(false);
        hasilField08.setFocusable(false);

        jButton1.setText("Generate more!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnCopy01.setText("Copy Text");
        btnCopy01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopy01ActionPerformed(evt);
            }
        });

        btnCopy02.setText("Copy Text");
        btnCopy02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopy02ActionPerformed(evt);
            }
        });

        btnCopy03.setText("Copy Text");
        btnCopy03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopy03ActionPerformed(evt);
            }
        });

        btnCopy04.setText("Copy Text");
        btnCopy04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopy04ActionPerformed(evt);
            }
        });

        btnCopy05.setText("Copy Text");
        btnCopy05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopy05ActionPerformed(evt);
            }
        });

        btnCopy06.setText("Copy Text");
        btnCopy06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopy06ActionPerformed(evt);
            }
        });

        btnCopy07.setText("Copy Text");
        btnCopy07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopy07ActionPerformed(evt);
            }
        });

        btnCopy08.setText("Copy Text");
        btnCopy08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopy08ActionPerformed(evt);
            }
        });

        btnGoBack.setText("Go Back");
        btnGoBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hasilField08)
                    .addComponent(hasilField06)
                    .addComponent(hasilField07, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(hasilField04)
                    .addComponent(hasilField05, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(hasilField01)
                    .addComponent(hasilField02, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(hasilField03, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCopy01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCopy02, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCopy03, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCopy04, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCopy05, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCopy06, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCopy07, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCopy08, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGoBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hasilField01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCopy01))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hasilField02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCopy02))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hasilField03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCopy03))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hasilField04, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCopy04))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hasilField05, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCopy05))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hasilField06, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCopy06))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hasilField07, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCopy07))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hasilField08, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCopy08))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGoBack, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        int n = VariableModule.lgChar;
        int g = VariableModule.genChar;
        int expression = g;
        String hasilFieldChk01;
        String hasilFieldChk02;
        String hasilFieldChk03;
        String hasilFieldChk04;
        String hasilFieldChk05;
        String hasilFieldChk06;
        String hasilFieldChk07;
        String hasilFieldChk08;
        
        hasilFieldChk01 = hasilField01.getText();
        hasilFieldChk02 = hasilField02.getText();
        hasilFieldChk03 = hasilField03.getText();
        hasilFieldChk04 = hasilField04.getText();
        hasilFieldChk05 = hasilField05.getText();
        hasilFieldChk06 = hasilField06.getText();
        hasilFieldChk07 = hasilField07.getText();
        hasilFieldChk08 = hasilField08.getText();
        
        // Switch Case
        switch(expression){
         case 1 :
             /* 
              * Pernyata ini akan di eksekusi jika value/nilai pada 
              * expression sama dengan nilai yang ada pada block pertama.
              */
             
             hasilField01.setText(RandomString.getAlphaNumericString(n));
             
             //If text field kosong button e gaiso dipenek
             if (hasilFieldChk02!= null)
{
  // block of code to be executed if the condition is true
  btnCopy02.setEnabled(false);
  btnCopy03.setEnabled(false);
  btnCopy04.setEnabled(false);
  btnCopy05.setEnabled(false);
  btnCopy06.setEnabled(false);
  btnCopy07.setEnabled(false);
  btnCopy08.setEnabled(false);
}
             break;

         case 2 :
             /* 
              * Pernyata ini akan di eksekusi jika value/nilai pada
              * expression sama dengan nilai yang ada pada block kedua.
              */
             hasilField01.setText(RandomString.getAlphaNumericString(n));
             hasilField02.setText(RandomString.getAlphaNumericString(n));
             
             //If text field kosong button e gaiso dipenek
             if (hasilFieldChk03!= null)
{
  // block of code to be executed if the condition is true
  btnCopy03.setEnabled(false);
  btnCopy04.setEnabled(false);
  btnCopy05.setEnabled(false);
  btnCopy06.setEnabled(false);
  btnCopy07.setEnabled(false);
  btnCopy08.setEnabled(false);
}
             break;

         case 3 :
             /* 
              * Pernyata ini akan di eksekusi jika value/nilai pada
              * expression sama dengan nilai yang ada pada block ketiga.
              */
             hasilField01.setText(RandomString.getAlphaNumericString(n));
             hasilField02.setText(RandomString.getAlphaNumericString(n));
             hasilField03.setText(RandomString.getAlphaNumericString(n));
             
             //If text field kosong button e gaiso dipenek
             if (hasilFieldChk04!= null)
{
  // block of code to be executed if the condition is true
  btnCopy04.setEnabled(false);
  btnCopy05.setEnabled(false);
  btnCopy06.setEnabled(false);
  btnCopy07.setEnabled(false);
  btnCopy08.setEnabled(false);
}
             break;

         case 4 :
             /* 
              * Pernyata ini akan di eksekusi jika value/nilai pada
              * expression sama dengan nilai yang ada pada block ketiga.
              */
             hasilField01.setText(RandomString.getAlphaNumericString(n));
             hasilField02.setText(RandomString.getAlphaNumericString(n));
             hasilField03.setText(RandomString.getAlphaNumericString(n));
             hasilField04.setText(RandomString.getAlphaNumericString(n));
             
             //If text field kosong button e gaiso dipenek
             if (hasilFieldChk05!= null)
{
  // block of code to be executed if the condition is true
  btnCopy05.setEnabled(false);
  btnCopy06.setEnabled(false);
  btnCopy07.setEnabled(false);
  btnCopy08.setEnabled(false);
}
             break;
             
         case 5 :
             /* 
              * Pernyata ini akan di eksekusi jika value/nilai pada
              * expression sama dengan nilai yang ada pada block ketiga.
              */
             hasilField01.setText(RandomString.getAlphaNumericString(n));
             hasilField02.setText(RandomString.getAlphaNumericString(n));
             hasilField03.setText(RandomString.getAlphaNumericString(n));
             hasilField04.setText(RandomString.getAlphaNumericString(n));
             hasilField05.setText(RandomString.getAlphaNumericString(n));
             
             //If text field kosong button e gaiso dipenek
             if (hasilFieldChk06!= null)
{
  // block of code to be executed if the condition is true
  btnCopy06.setEnabled(false);
  btnCopy07.setEnabled(false);
  btnCopy08.setEnabled(false);
}
             break;
             
         case 6 :
             /* 
              * Pernyata ini akan di eksekusi jika value/nilai pada
              * expression sama dengan nilai yang ada pada block ketiga.
              */
             hasilField01.setText(RandomString.getAlphaNumericString(n));
             hasilField02.setText(RandomString.getAlphaNumericString(n));
             hasilField03.setText(RandomString.getAlphaNumericString(n));
             hasilField04.setText(RandomString.getAlphaNumericString(n));
             hasilField05.setText(RandomString.getAlphaNumericString(n));
             hasilField06.setText(RandomString.getAlphaNumericString(n));
             //If text field kosong button e gaiso dipenek
             if (hasilFieldChk07!= null)
{
  // block of code to be executed if the condition is true
  btnCopy07.setEnabled(false);
  btnCopy08.setEnabled(false);
}
             break;
             
         case 7 :
             /* 
              * Pernyata ini akan di eksekusi jika value/nilai pada
              * expression sama dengan nilai yang ada pada block ketiga.
              */
             hasilField01.setText(RandomString.getAlphaNumericString(n));
             hasilField02.setText(RandomString.getAlphaNumericString(n));
             hasilField03.setText(RandomString.getAlphaNumericString(n));
             hasilField04.setText(RandomString.getAlphaNumericString(n));
             hasilField05.setText(RandomString.getAlphaNumericString(n));
             hasilField06.setText(RandomString.getAlphaNumericString(n));
             hasilField07.setText(RandomString.getAlphaNumericString(n));
             
             //If text field kosong button e gaiso dipenek
             if (hasilFieldChk08!= null)
{
  // block of code to be executed if the condition is true
  btnCopy08.setEnabled(false);
}
             break;
             
         case 8 :
             /* 
              * Pernyata ini akan di eksekusi jika value/nilai pada
              * expression sama dengan nilai yang ada pada block ketiga.
              */
             hasilField01.setText(RandomString.getAlphaNumericString(n));
             hasilField02.setText(RandomString.getAlphaNumericString(n));
             hasilField03.setText(RandomString.getAlphaNumericString(n));
             hasilField04.setText(RandomString.getAlphaNumericString(n));
             hasilField05.setText(RandomString.getAlphaNumericString(n));
             hasilField06.setText(RandomString.getAlphaNumericString(n));
             hasilField07.setText(RandomString.getAlphaNumericString(n));
             hasilField08.setText(RandomString.getAlphaNumericString(n));
             
             //If text field kosong button e gaiso dipenek

{
  // block of code to be executed if the condition is true

}
             break;
             
         default :
             /* 
              * Pernyata ini akan di eksekusi jika tidak ada 
              * kondisi atau expression yang memenuhi syarat
              */
             String noOptSelection;
             noOptSelection= "Test";
             JOptionPane.showMessageDialog(this, noOptSelection);
             
             break;
        }
        // Get and display the alphanumeric string
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int n = VariableModule.lgChar;
        int g = VariableModule.genChar;
        int expression = g;
        // Switch Case
        switch(expression){
         case 1 :
             /* 
              * Pernyata ini akan di eksekusi jika value/nilai pada 
              * expression sama dengan nilai yang ada pada block pertama.
              */
             hasilField01.setText(RandomString.getAlphaNumericString(n));
             break;

         case 2 :
             /* 
              * Pernyata ini akan di eksekusi jika value/nilai pada
              * expression sama dengan nilai yang ada pada block kedua.
              */
             hasilField01.setText(RandomString.getAlphaNumericString(n));
             hasilField02.setText(RandomString.getAlphaNumericString(n));
             break;

         case 3 :
             /* 
              * Pernyata ini akan di eksekusi jika value/nilai pada
              * expression sama dengan nilai yang ada pada block ketiga.
              */
             hasilField01.setText(RandomString.getAlphaNumericString(n));
             hasilField02.setText(RandomString.getAlphaNumericString(n));
             hasilField03.setText(RandomString.getAlphaNumericString(n));
             break;

         case 4 :
             /* 
              * Pernyata ini akan di eksekusi jika value/nilai pada
              * expression sama dengan nilai yang ada pada block ketiga.
              */
             hasilField01.setText(RandomString.getAlphaNumericString(n));
             hasilField02.setText(RandomString.getAlphaNumericString(n));
             hasilField03.setText(RandomString.getAlphaNumericString(n));
             hasilField04.setText(RandomString.getAlphaNumericString(n));
             break;
             
         case 5 :
             /* 
              * Pernyata ini akan di eksekusi jika value/nilai pada
              * expression sama dengan nilai yang ada pada block ketiga.
              */
             hasilField01.setText(RandomString.getAlphaNumericString(n));
             hasilField02.setText(RandomString.getAlphaNumericString(n));
             hasilField03.setText(RandomString.getAlphaNumericString(n));
             hasilField04.setText(RandomString.getAlphaNumericString(n));
             hasilField05.setText(RandomString.getAlphaNumericString(n));
             break;
             
         case 6 :
             /* 
              * Pernyata ini akan di eksekusi jika value/nilai pada
              * expression sama dengan nilai yang ada pada block ketiga.
              */
             hasilField01.setText(RandomString.getAlphaNumericString(n));
             hasilField02.setText(RandomString.getAlphaNumericString(n));
             hasilField03.setText(RandomString.getAlphaNumericString(n));
             hasilField04.setText(RandomString.getAlphaNumericString(n));
             hasilField05.setText(RandomString.getAlphaNumericString(n));
             hasilField06.setText(RandomString.getAlphaNumericString(n));
             break;
             
         case 7 :
             /* 
              * Pernyata ini akan di eksekusi jika value/nilai pada
              * expression sama dengan nilai yang ada pada block ketiga.
              */
             hasilField01.setText(RandomString.getAlphaNumericString(n));
             hasilField02.setText(RandomString.getAlphaNumericString(n));
             hasilField03.setText(RandomString.getAlphaNumericString(n));
             hasilField04.setText(RandomString.getAlphaNumericString(n));
             hasilField05.setText(RandomString.getAlphaNumericString(n));
             hasilField06.setText(RandomString.getAlphaNumericString(n));
             hasilField07.setText(RandomString.getAlphaNumericString(n));
             break;
             
         case 8 :
             /* 
              * Pernyata ini akan di eksekusi jika value/nilai pada
              * expression sama dengan nilai yang ada pada block ketiga.
              */
             hasilField01.setText(RandomString.getAlphaNumericString(n));
             hasilField02.setText(RandomString.getAlphaNumericString(n));
             hasilField03.setText(RandomString.getAlphaNumericString(n));
             hasilField04.setText(RandomString.getAlphaNumericString(n));
             hasilField05.setText(RandomString.getAlphaNumericString(n));
             hasilField06.setText(RandomString.getAlphaNumericString(n));
             hasilField07.setText(RandomString.getAlphaNumericString(n));
             hasilField08.setText(RandomString.getAlphaNumericString(n));
             break;
         default :
             /* 
              * Pernyata ini akan di eksekusi jika tidak ada 
              * kondisi atau expression yang memenuhi syarat
              */
             String noOptSelection;
             noOptSelection= "Test";
             JOptionPane.showMessageDialog(this, noOptSelection);
             
             break;
        }
        // Get and display the alphanumeric string
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnGoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoBackActionPerformed
        // TODO add your handling code here:
        Frame resultFrameUI = this;
        resultFrameUI.setVisible(false);
        new StringGeneratorUI().setVisible(true);
        
    }//GEN-LAST:event_btnGoBackActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        Frame resultFrameUI = this;
        resultFrameUI.setVisible(false);
        new StringGeneratorUI().setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void btnCopy01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopy01ActionPerformed
        // TODO add your handling code here:
        String hasilFieldChk01;
        hasilFieldChk01 = hasilField01.getText();
        StringSelection stringSelection = new StringSelection(hasilFieldChk01);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
    }//GEN-LAST:event_btnCopy01ActionPerformed

    private void btnCopy02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopy02ActionPerformed
        // TODO add your handling code here:
        String hasilFieldChk02;
        hasilFieldChk02 = hasilField02.getText();
        StringSelection stringSelection = new StringSelection(hasilFieldChk02);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
    }//GEN-LAST:event_btnCopy02ActionPerformed

    private void btnCopy03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopy03ActionPerformed
        // TODO add your handling code here:
        String hasilFieldChk03;
        hasilFieldChk03 = hasilField03.getText();
        StringSelection stringSelection = new StringSelection(hasilFieldChk03);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
    }//GEN-LAST:event_btnCopy03ActionPerformed

    private void btnCopy04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopy04ActionPerformed
        // TODO add your handling code here:
        String hasilFieldChk04;
        hasilFieldChk04 = hasilField04.getText();
        StringSelection stringSelection = new StringSelection(hasilFieldChk04);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
    }//GEN-LAST:event_btnCopy04ActionPerformed

    private void btnCopy05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopy05ActionPerformed
        // TODO add your handling code here:
        String hasilFieldChk05;
        hasilFieldChk05 = hasilField05.getText();
        StringSelection stringSelection = new StringSelection(hasilFieldChk05);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
    }//GEN-LAST:event_btnCopy05ActionPerformed

    private void btnCopy06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopy06ActionPerformed
        // TODO add your handling code here:
        String hasilFieldChk06;
        hasilFieldChk06 = hasilField06.getText();
        StringSelection stringSelection = new StringSelection(hasilFieldChk06);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
    }//GEN-LAST:event_btnCopy06ActionPerformed

    private void btnCopy07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopy07ActionPerformed
        // TODO add your handling code here:
        String hasilFieldChk07;
        hasilFieldChk07 = hasilField07.getText();
        StringSelection stringSelection = new StringSelection(hasilFieldChk07);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
    }//GEN-LAST:event_btnCopy07ActionPerformed

    private void btnCopy08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopy08ActionPerformed
        // TODO add your handling code here:
        String hasilFieldChk08;
        hasilFieldChk08 = hasilField08.getText();
        StringSelection stringSelection = new StringSelection(hasilFieldChk08);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
    }//GEN-LAST:event_btnCopy08ActionPerformed

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
            java.util.logging.Logger.getLogger(StringResult8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StringResult8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StringResult8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StringResult8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StringResult8().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCopy01;
    private javax.swing.JButton btnCopy02;
    private javax.swing.JButton btnCopy03;
    private javax.swing.JButton btnCopy04;
    private javax.swing.JButton btnCopy05;
    private javax.swing.JButton btnCopy06;
    private javax.swing.JButton btnCopy07;
    private javax.swing.JButton btnCopy08;
    private javax.swing.JButton btnGoBack;
    private javax.swing.JTextField hasilField01;
    private javax.swing.JTextField hasilField02;
    private javax.swing.JTextField hasilField03;
    private javax.swing.JTextField hasilField04;
    private javax.swing.JTextField hasilField05;
    private javax.swing.JTextField hasilField06;
    private javax.swing.JTextField hasilField07;
    private javax.swing.JTextField hasilField08;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}