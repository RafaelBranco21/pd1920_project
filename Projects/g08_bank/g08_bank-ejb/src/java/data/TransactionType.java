
package data;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "TransactionType")
@NamedQueries({
    @NamedQuery(name = "TransactionType.findAll", query = "SELECT t FROM TransactionType t")
    , @NamedQuery(name = "TransactionType.findByTransactionTypeId", query = "SELECT t FROM TransactionType t WHERE t.transactionTypeId = :transactionTypeId")
    , @NamedQuery(name = "TransactionType.findByDescription", query = "SELECT t FROM TransactionType t WHERE t.description = :description")})
public class TransactionType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "transactionTypeId")
    private Integer transactionTypeId;
    @Column(name = "description")
    private String description;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "transactionType")
    private Collection<AccountTransaction> accountTransactionCollection;

    public TransactionType() {
    }

    public TransactionType(Integer transactionTypeId) {
        this.transactionTypeId = transactionTypeId;
    }

    public Integer getTransactionTypeId() {
        return transactionTypeId;
    }

    public void setTransactionTypeId(Integer transactionTypeId) {
        this.transactionTypeId = transactionTypeId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Collection<AccountTransaction> getAccountTransactionCollection() {
        return accountTransactionCollection;
    }

    public void setAccountTransactionCollection(Collection<AccountTransaction> accountTransactionCollection) {
        this.accountTransactionCollection = accountTransactionCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (transactionTypeId != null ? transactionTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
  if (!(object.getClass() != TransactionType.class)) {
            return false;
        }
        TransactionType other = (TransactionType) object;
        if ((this.transactionTypeId == null && other.transactionTypeId != null) || (this.transactionTypeId != null && !this.transactionTypeId.equals(other.transactionTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "data.TransactionType[ transactionTypeId=" + transactionTypeId + " ]";
    }
    
}
