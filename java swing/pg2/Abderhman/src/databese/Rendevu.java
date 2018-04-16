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
@Table(name = "RENDEVU")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Rendevu.findAll", query = "SELECT r FROM Rendevu r"),
    @NamedQuery(name = "Rendevu.findById", query = "SELECT r FROM Rendevu r WHERE r.id = :id"),
    @NamedQuery(name = "Rendevu.findByName", query = "SELECT r FROM Rendevu r WHERE r.name = :name"),
    @NamedQuery(name = "Rendevu.findBySurname", query = "SELECT r FROM Rendevu r WHERE r.surname = :surname"),
    @NamedQuery(name = "Rendevu.findByDays", query = "SELECT r FROM Rendevu r WHERE r.days = :days"),
    @NamedQuery(name = "Rendevu.findByDoktor", query = "SELECT r FROM Rendevu r WHERE r.doktor = :doktor"),
    @NamedQuery(name = "Rendevu.findByGender", query = "SELECT r FROM Rendevu r WHERE r.gender = :gender"),
    @NamedQuery(name = "Rendevu.findByHorus", query = "SELECT r FROM Rendevu r WHERE r.horus = :horus")})
public class Rendevu implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "NAME")
    private String name;
    @Basic(optional = false)
    @Column(name = "SURNAME")
    private String surname;
    @Basic(optional = false)
    @Column(name = "DAYS")
    private String days;
    @Basic(optional = false)
    @Column(name = "DOKTOR")
    private String doktor;
    @Column(name = "GENDER")
    private String gender;
    @Column(name = "HORUS")
    private String horus;

    public Rendevu() {
    }

    public Rendevu(Integer id) {
        this.id = id;
    }

    public Rendevu(Integer id, String name, String surname, String days, String doktor) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.days = days;
        this.doktor = doktor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public String getDoktor() {
        return doktor;
    }

    public void setDoktor(String doktor) {
        this.doktor = doktor;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHorus() {
        return horus;
    }

    public void setHorus(String horus) {
        this.horus = horus;
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
        if (!(object instanceof Rendevu)) {
            return false;
        }
        Rendevu other = (Rendevu) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "databese.Rendevu[ id=" + id + " ]";
    }
    
}
