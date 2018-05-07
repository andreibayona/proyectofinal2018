/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniminuto.proyectoCamisetaEjb.entities;

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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author andre
 */
@Entity
@Table(name = "targeta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Targeta.findAll", query = "SELECT t FROM Targeta t")
    , @NamedQuery(name = "Targeta.findByIdTargeta", query = "SELECT t FROM Targeta t WHERE t.idTargeta = :idTargeta")
    , @NamedQuery(name = "Targeta.findByNombreBanco", query = "SELECT t FROM Targeta t WHERE t.nombreBanco = :nombreBanco")
    , @NamedQuery(name = "Targeta.findByTipoTargeta", query = "SELECT t FROM Targeta t WHERE t.tipoTargeta = :tipoTargeta")
    , @NamedQuery(name = "Targeta.findByFranquicia", query = "SELECT t FROM Targeta t WHERE t.franquicia = :franquicia")})
public class Targeta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_targeta")
    private Integer idTargeta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "nombreBanco")
    private String nombreBanco;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "tipoTargeta")
    private String tipoTargeta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "franquicia")
    private String franquicia;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTargeta")
    private Collection<FormaPago> formaPagoCollection;

    public Targeta() {
    }

    public Targeta(Integer idTargeta) {
        this.idTargeta = idTargeta;
    }

    public Targeta(Integer idTargeta, String nombreBanco, String tipoTargeta, String franquicia) {
        this.idTargeta = idTargeta;
        this.nombreBanco = nombreBanco;
        this.tipoTargeta = tipoTargeta;
        this.franquicia = franquicia;
    }

    public Integer getIdTargeta() {
        return idTargeta;
    }

    public void setIdTargeta(Integer idTargeta) {
        this.idTargeta = idTargeta;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    public String getTipoTargeta() {
        return tipoTargeta;
    }

    public void setTipoTargeta(String tipoTargeta) {
        this.tipoTargeta = tipoTargeta;
    }

    public String getFranquicia() {
        return franquicia;
    }

    public void setFranquicia(String franquicia) {
        this.franquicia = franquicia;
    }

    @XmlTransient
    public Collection<FormaPago> getFormaPagoCollection() {
        return formaPagoCollection;
    }

    public void setFormaPagoCollection(Collection<FormaPago> formaPagoCollection) {
        this.formaPagoCollection = formaPagoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTargeta != null ? idTargeta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Targeta)) {
            return false;
        }
        Targeta other = (Targeta) object;
        if ((this.idTargeta == null && other.idTargeta != null) || (this.idTargeta != null && !this.idTargeta.equals(other.idTargeta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.uniminuto.proyectoCamisetaEjb.entities.Targeta[ idTargeta=" + idTargeta + " ]";
    }
    
}
