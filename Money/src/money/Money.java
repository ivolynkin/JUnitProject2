/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package money;

/**
 *
 * @author Ivan
 */
public class Money {
    private int fAmount;
    private String fCurrency;
    public Money(int amount, String currency) {
        fAmount= amount;
        fCurrency= currency;
    }

    public int amount() {
        return fAmount;
    }

    public String currency() {
        return fCurrency;
    }
    
    
    public Money add(Money m) {
      System.out.println("Amount1: " + amount());
      System.out.println("Amount2: " + m.amount());
       Money aMoney = new Money(amount()+m.amount(), currency());
        return aMoney;
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
