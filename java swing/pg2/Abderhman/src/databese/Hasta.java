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
@Table(name = "HASTA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Hasta.findAll", query = "SELECT h FROM Hasta h"),
    @NamedQuery(name = "Hasta.findById", query = "SELECT h FROM Hasta h WHERE h.id = :id"),
    @NamedQuery(name = "Hasta.findByAdi", query = "SELECT h FROM Hasta h WHERE h.adi = :adi"),
    @NamedQuery(name = "Hasta.findByHastalik", query = "SELECT h FROM Hasta h WHERE h.hastalik = :hastalik"),
    @NamedQuery(name = "Hasta.findByDoktor", query = "SELECT h FROM Hasta h WHERE h.doktor = :doktor")})
public class Hasta implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "ADI")
    private String adi;
    @Column(name = "HASTALIK")
    private String hastalik;
    @Column(name = "DOKTOR")
    private String doktor;

    public Hasta() {
    }

    public Hasta(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getHastalik() {
        return hastalik;
    }

    public void setHastalik(String hastalik) {
        this.hastalik = hastalik;
    }

    public String getDoktor() {
        return doktor;
    }

    public void setDoktor(String doktor) {
        this.doktor = doktor;
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
        if (!(object instanceof Hasta)) {
            return false;
        }
        Hasta other = (Hasta) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "databese.Hasta[ id=" + id + " ]";
    }
    
}
