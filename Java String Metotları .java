/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package denemler;
import java.util.Arrays;
import java.util.ArrayList;

/**
 *
 * @author qwerty
 */
public class Denemler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String takım = "fenerbahce";
        
        System.out.println("fenerbahce karakterinin uzunlugu :"+ takım.length());
        
        System.out.println("indisi 5 olan karakter :"+ takım.charAt(5));
        
        System.out.println(takım.substring(5,9));
        
        System.out.println("e karakterinin ilk pozisyonu yada indisi : "+ takım.indexOf('e'));
        
        System.out.println("e karakterinin 2. indisten sonraki pozisyonu : "+ takım.indexOf('e',2));
        
        
        int son = takım.lastIndexOf('e');
        System.out.println("son : "+ son);
        
        System.out.println("f ile ş harflerinin yerlerini değiştirelim."+ takım.replace("f", "ş"));
        
        
        System.out.println("bütün harfleri büyük yapalım. " + takım.toUpperCase() );
        
        
        String  takım2 = "1907";
        System.out.println(" double türüne donüştürelim."+ Double.parseDouble(takım2));
        
        System.out.println("integer tipine donüştürelim."+ Integer.valueOf(takım2));
        
        
        
    }
    
}
