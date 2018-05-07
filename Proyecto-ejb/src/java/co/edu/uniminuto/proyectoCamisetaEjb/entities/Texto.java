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
@Table(name = "texto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Texto.findAll", query = "SELECT t FROM Texto t")
    , @NamedQuery(name = "Texto.findByIdTexto", query = "SELECT t FROM Texto t WHERE t.idTexto = :idTexto")
    , @NamedQuery(name = "Texto.findByNombre", query = "SELECT t FROM Texto t WHERE t.nombre = :nombre")
    , @NamedQuery(name = "Texto.findByTama\u00f1o", query = "SELECT t FROM Texto t WHERE t.tama\u00f1o = :tama\u00f1o")
    , @NamedQuery(name = "Texto.findByPrecio", query = "SELECT t FROM Texto t WHERE t.precio = :precio")})
public class Texto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_texto")
    private Integer idTexto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "tama\u00f1o")
    private String tamaño;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "precio")
    private String precio;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTexto")
    private Collection<ConfiguracionEstampa> configuracionEstampaCollection;

    public Texto() {
    }

    public Texto(Integer idTexto) {
        this.idTexto = idTexto;
    }

    public Texto(Integer idTexto, String nombre, String tamaño, String precio) {
        this.idTexto = idTexto;
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.precio = precio;
    }

    public Integer getIdTexto() {
        return idTexto;
    }

    public void setIdTexto(Integer idTexto) {
        this.idTexto = idTexto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    @XmlTransient
    public Collection<ConfiguracionEstampa> getConfiguracionEstampaCollection() {
        return configuracionEstampaCollection;
    }

    public void setConfiguracionEstampaCollection(Collection<ConfiguracionEstampa> configuracionEstampaCollection) {
        this.configuracionEstampaCollection = configuracionEstampaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTexto != null ? idTexto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Texto)) {
            return false;
        }
        Texto other = (Texto) object;
        if ((this.idTexto == null && other.idTexto != null) || (this.idTexto != null && !this.idTexto.equals(other.idTexto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.uniminuto.proyectoCamisetaEjb.entities.Texto[ idTexto=" + idTexto + " ]";
    }
    
}
