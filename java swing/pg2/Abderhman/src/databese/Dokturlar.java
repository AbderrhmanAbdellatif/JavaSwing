/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databese;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author R. TAHA
 */
@Entity
@Table(name = "DOKTURLAR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Dokturlar.findAll", query = "SELECT d FROM Dokturlar d"),
    @NamedQuery(name = "Dokturlar.findById", query = "SELECT d FROM Dokturlar d WHERE d.id = :id"),
    @NamedQuery(name = "Dokturlar.findByHastalik", query = "SELECT d FROM Dokturlar d WHERE d.hastalik = :hastalik"),
    @NamedQuery(name = "Dokturlar.findByAdi", query = "SELECT d FROM Dokturlar d WHERE d.adi = :adi")})
public class Dokturlar implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "HASTALIK")
    private String hastalik;
    @Column(name = "ADI")
    private String adi;

    public Dokturlar() {
    }

    public Dokturlar(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHastalik() {
        return hastalik;
    }

    public void setHastalik(String hastalik) {
        this.hastalik = hastalik;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dokturlar)) {
            return false;
        }
        Dokturlar other = (Dokturlar) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "databese.Dokturlar[ id=" + id + " ]";
    }
    
}
