package Learning.Serialization.Sockets;

import java.io.Serial;
import java.io.Serializable;

public class Account implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    public static String accountType = "LOAN";

    private double loanBalance;
    private long accountNo;
    private String name;

    public Account (double loanBalance, long accountNo, String name){

        this.loanBalance = loanBalance;
        this.accountNo = accountNo;
        this.name = name;

    }

    @Override
    public String toString () {
        return String.format("{%s, %d, %s, %.1f}\n",
                accountType, accountNo, name, loanBalance);
    }




}
