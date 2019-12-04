package data;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable
public class AccountTransactionPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "accountId")
    private int accountId;
    @Basic(optional = false)
    @Column(name = "transactionTypeId")
    private int transactionTypeId;
    @Basic(optional = false)
    @Column(name = "accountTransactionId")
    private int accountTransactionId;

    public AccountTransactionPK() {
    }

    public AccountTransactionPK(int accountId, int transactionTypeId, int accountTransactionId) {
        this.accountId = accountId;
        this.transactionTypeId = transactionTypeId;
        this.accountTransactionId = accountTransactionId;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public int getTransactionTypeId() {
        return transactionTypeId;
    }

    public void setTransactionTypeId(int transactionTypeId) {
        this.transactionTypeId = transactionTypeId;
    }

    public int getAccountTransactionId() {
        return accountTransactionId;
    }

    public void setAccountTransactionId(int accountTransactionId) {
        this.accountTransactionId = accountTransactionId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) accountId;
        hash += (int) transactionTypeId;
        hash += (int) accountTransactionId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object.getClass() != AccountTransactionPK.class)) {
            return false;
        }
        AccountTransactionPK other = (AccountTransactionPK) object;
        if (this.accountId != other.accountId) {
            return false;
        }
        if (this.transactionTypeId != other.transactionTypeId) {
            return false;
        }
        if (this.accountTransactionId != other.accountTransactionId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "data.AccountTransactionPK[ accountId=" + accountId + ", transactionTypeId=" + transactionTypeId + ", accountTransactionId=" + accountTransactionId + " ]";
    }
    
}
