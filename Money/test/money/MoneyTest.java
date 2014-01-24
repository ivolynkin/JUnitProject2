/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package money;

import junit.framework.Assert;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ivan
 */
public class MoneyTest {
    
    public MoneyTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of amount method, of class Money.
     */
    @Test
    public void testAmount() {
        System.out.println("amount");
       
    }

    /**
     * Test of currency method, of class Money.
     */
    @Test
    public void testCurrency() {
        System.out.println("currency");
        
    }
    
    @Test
    public void testAdd(){
            System.out.println("Add Money Test");
     
        Money m12CHF= new Money(12, "CHF");  // (1)
        Money m14CHF= new Money(14, "CHF");        
        Money expected= new Money(26, "CHF");
        Money result= m12CHF.add(m14CHF);    // (2)
        Assert.assertEquals(expected.amount(), result.amount());
        Assert.assertEquals(expected.currency(), result.currency() );
         Assert.assertEquals(m12CHF, new Money(12, "CHF"));
        //Assert.assertEquals(expected, result);
        // Assert.assertTrue(expected.equals(result)); 
       //Assert.assertTrue(true);
    }
    
    /**
     * Test of main method, of class Money.
     */
   
}