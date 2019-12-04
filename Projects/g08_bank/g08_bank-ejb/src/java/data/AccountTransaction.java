
package data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "AccountTransaction")
@NamedQueries({
    @NamedQuery(name = "AccountTransaction.findAll", query = "SELECT a FROM AccountTransaction a")
    , @NamedQuery(name = "AccountTransaction.findByAccountId", query = "SELECT a FROM AccountTransaction a WHERE a.accountTransactionPK.accountId = :accountId")
    , @NamedQuery(name = "AccountTransaction.findByTransactionTypeId", query = "SELECT a FROM AccountTransaction a WHERE a.accountTransactionPK.transactionTypeId = :transactionTypeId")
    , @NamedQuery(name = "AccountTransaction.findByValue", query = "SELECT a FROM AccountTransaction a WHERE a.value = :value")
    , @NamedQuery(name = "AccountTransaction.findByAccountTransactionId", query = "SELECT a FROM AccountTransaction a WHERE a.accountTransactionPK.accountTransactionId = :accountTransactionId")
    , @NamedQuery(name = "AccountTransaction.findByDate", query = "SELECT a FROM AccountTransaction a WHERE a.date = :date")})
public class AccountTransaction implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AccountTransactionPK accountTransactionPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "value")
    private BigDecimal value;
    @Basic(optional = false)
    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;
    @JoinColumn(name = "accountId", referencedColumnName = "accountId", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Account account;
    @JoinColumn(name = "transactionTypeId", referencedColumnName = "transactionTypeId", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private TransactionType transactionType;

    public AccountTransaction() {
    }

    public AccountTransaction(AccountTransactionPK accountTransactionPK) {
        this.accountTransactionPK = accountTransactionPK;
    }

    public AccountTransaction(AccountTransactionPK accountTransactionPK, Date date) {
        this.accountTransactionPK = accountTransactionPK;
        this.date = date;
    }

    public AccountTransaction(int accountId, int transactionTypeId, int accountTransactionId) {
        this.accountTransactionPK = new AccountTransactionPK(accountId, transactionTypeId, accountTransactionId);
    }

    public AccountTransactionPK getAccountTransactionPK() {
        return accountTransactionPK;
    }

    public void setAccountTransactionPK(AccountTransactionPK accountTransactionPK) {
        this.accountTransactionPK = accountTransactionPK;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (accountTransactionPK != null ? accountTransactionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object.getClass() != AccountTransaction.class)) {
            return false;
        }
        AccountTransaction other = (AccountTransaction) object;
        if ((this.accountTransactionPK == null && other.accountTransactionPK != null) || (this.accountTransactionPK != null && !this.accountTransactionPK.equals(other.accountTransactionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "data.AccountTransaction[ accountTransactionPK=" + accountTransactionPK + " ]";
    }
    
}
