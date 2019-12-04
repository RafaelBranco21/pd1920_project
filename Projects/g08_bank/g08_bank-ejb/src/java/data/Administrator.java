
package data;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table(name = "Administrator")
@NamedQueries({
    @NamedQuery(name = "Administrator.findAll", query = "SELECT a FROM Administrator a")
    , @NamedQuery(name = "Administrator.findByName", query = "SELECT a FROM Administrator a WHERE a.name = :name")
    , @NamedQuery(name = "Administrator.findByAdministratorId", query = "SELECT a FROM Administrator a WHERE a.administratorId = :administratorId")
    , @NamedQuery(name = "Administrator.findByUsername", query = "SELECT a FROM Administrator a WHERE a.username = :username")
    , @NamedQuery(name = "Administrator.findByPassword", query = "SELECT a FROM Administrator a WHERE a.password = :password")})
public class Administrator implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "name")
    private String name;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "administratorId")
    private Integer administratorId;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;

    public Administrator() {
    }

    public Administrator(Integer administratorId) {
        this.administratorId = administratorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAdministratorId() {
        return administratorId;
    }

    public void setAdministratorId(Integer administratorId) {
        this.administratorId = administratorId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (administratorId != null ? administratorId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Administrator)) {
            return false;
        }
        Administrator other = (Administrator) object;
        if ((this.administratorId == null && other.administratorId != null) || (this.administratorId != null && !this.administratorId.equals(other.administratorId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "data.Administrator[ administratorId=" + administratorId + " ]";
    }
    
}
