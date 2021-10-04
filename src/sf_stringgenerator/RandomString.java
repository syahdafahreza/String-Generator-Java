/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sf_stringgenerator;
import sf_stringgenerator.VariableModule;
import sf_stringgenerator.StringGeneratorUI;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.lang.Thread.State;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Entahlah
 */

// Java program generate a random AlphaNumeric String
// using Math.random() method
public class RandomString {
     // function to generate a random string of length n
    static String getAlphaNumericString(int n)
    {
        //String initialization
        String strnumber = "01234567890";
        String stralphaup = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String stralphadw = "abcdefghijklmnopqrstuvxyz";
        String AlphaNumericString= "";
                
if(StringGeneratorUI.chkNmDigit.isSelected()&&!StringGeneratorUI.chkUpLetter.isSelected()&&!StringGeneratorUI.chkLoLetter.isSelected()) {
  //chkbox 1 is selected
  AlphaNumericString= ""+strnumber;
} 
else if (!StringGeneratorUI.chkNmDigit.isSelected()&&StringGeneratorUI.chkUpLetter.isSelected()&&!StringGeneratorUI.chkLoLetter.isSelected()) {
  //chkbox 2 is selected
  AlphaNumericString= ""+stralphaup;
} 
else if (!StringGeneratorUI.chkNmDigit.isSelected()&&!StringGeneratorUI.chkUpLetter.isSelected()&&StringGeneratorUI.chkLoLetter.isSelected()) {
  //chkbox 3 is selected
  AlphaNumericString= ""+stralphadw;
} 
else if (StringGeneratorUI.chkNmDigit.isSelected()&&StringGeneratorUI.chkUpLetter.isSelected()&&!StringGeneratorUI.chkLoLetter.isSelected()) {
  //chkbox 2 is selected
  AlphaNumericString= ""+strnumber+stralphaup;
}
else if (StringGeneratorUI.chkNmDigit.isSelected()&&!StringGeneratorUI.chkUpLetter.isSelected()&&StringGeneratorUI.chkLoLetter.isSelected()) {
  //chkbox 2 is selected
  AlphaNumericString= ""+strnumber+stralphadw;
}
else if (!StringGeneratorUI.chkNmDigit.isSelected()&&!StringGeneratorUI.chkUpLetter.isSelected()&&!StringGeneratorUI.chkLoLetter.isSelected()) {
  //chkbox 2 is selected
  AlphaNumericString= "";
}
else {
  //no one is selected
    AlphaNumericString= ""+strnumber+stralphaup+stralphadw;
}
  String newAlphaNumericString="";
        // chose a Character random from this String
        
        // create StringBuffer size of AlphaNumericString
        StringBuilder sb = new StringBuilder(n);
  
        for (int i = 0; i < n; i++) {
  
            // generate a random number between
            // 0 to AlphaNumericString variable length
            int index
                = (int)(AlphaNumericString.length()
                        * Math.random());
  
            // add Character one by one in end of sb
            sb.append(AlphaNumericString
                          .charAt(index));
        }
  
        return sb.toString();
    }
  
    public static void main(String[] args)
    {
  
        // Get the size n
        int n = VariableModule.lgChar;
  
        // Get and display the alphanumeric string
        System.out.println(RandomString
                               .getAlphaNumericString(n));
    }
}
