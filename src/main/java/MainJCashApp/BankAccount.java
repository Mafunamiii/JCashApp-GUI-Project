

/* 
  @author "Jahnreil J. Amarillento"
  CS128-8L : FOPI01
  Activity name:
  Date:
*/

package MainJCashApp;


public class BankAccount {
    private String acctFName, acctLName;
    private int acctNumber,acctPIN;
    private double savings;

    public BankAccount(String acctFName, String acctLName, int acctNum, int acctPIN, double savings) {
        this.acctFName = acctFName;
        this.acctLName = acctLName;
        this.acctNumber = acctNum;
        this.acctPIN = acctPIN;
        this.savings = savings;
    }

    public double getSavings() {
        return savings;
    }

    public void setSavings(double savings) {
        this.savings = savings;
    }
      
    public Boolean verifyAcct(int acctNum, int acctPinNum) {
        if (acctNum == acctNumber) {
            if (acctPinNum == (acctPIN)) {
                return true;
            }
        }
        return false;
    }
    
}
