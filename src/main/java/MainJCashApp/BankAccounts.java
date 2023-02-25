

/* 
  @author "Jahnreil J. Amarillento"
  CS128-8L : FOPI01
  Activity name:
  Date:
*/

package MainJCashApp;

import java.awt.List;
import java.util.ArrayList;


public class BankAccounts {
    private BankAccount acct1 = new BankAccount("Jahnreil", "Amarillento", 123456789, 123456, 13500);
    private BankAccount acct2 = new BankAccount("Gwyneth Christamae", "Vicente", 987654321, 654321, 25590);

    public BankAccount getAcct1() {
        return acct1;
    }

    public void setAcct1(BankAccount acct1) {
        this.acct1 = acct1;
    }

    public BankAccount getAcct2() {
        return acct2;
    }

    public void setAcct2(BankAccount acct2) {
        this.acct2 = acct2;
    }
    

}
