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
@Table(name = "camiseta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Camiseta.findAll", query = "SELECT c FROM Camiseta c")
    , @NamedQuery(name = "Camiseta.findByIdCamiseta", query = "SELECT c FROM Camiseta c WHERE c.idCamiseta = :idCamiseta")
    , @NamedQuery(name = "Camiseta.findByNombre", query = "SELECT c FROM Camiseta c WHERE c.nombre = :nombre")
    , @NamedQuery(name = "Camiseta.findByColor", query = "SELECT c FROM Camiseta c WHERE c.color = :color")
    , @NamedQuery(name = "Camiseta.findByTalla", query = "SELECT c FROM Camiseta c WHERE c.talla = :talla")
    , @NamedQuery(name = "Camiseta.findByEstilo", query = "SELECT c FROM Camiseta c WHERE c.estilo = :estilo")
    , @NamedQuery(name = "Camiseta.findByMaterial", query = "SELECT c FROM Camiseta c WHERE c.material = :material")
    , @NamedQuery(name = "Camiseta.findByPrecio", query = "SELECT c FROM Camiseta c WHERE c.precio = :precio")})
public class Camiseta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_camiseta")
    private Integer idCamiseta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "nombre")
    private int nombre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "color")
    private int color;
    @Basic(optional = false)
    @NotNull
    @Column(name = "talla")
    private int talla;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "estilo")
    private String estilo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "material")
    private String material;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "precio")
    private String precio;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCamiseta")
    private Collection<ConfiguracionEstampa> configuracionEstampaCollection;

    public Camiseta() {
    }

    public Camiseta(Integer idCamiseta) {
        this.idCamiseta = idCamiseta;
    }

    public Camiseta(Integer idCamiseta, int nombre, int color, int talla, String estilo, String material, String precio) {
        this.idCamiseta = idCamiseta;
        this.nombre = nombre;
        this.color = color;
        this.talla = talla;
        this.estilo = estilo;
        this.material = material;
        this.precio = precio;
    }

    public Integer getIdCamiseta() {
        return idCamiseta;
    }

    public void setIdCamiseta(Integer idCamiseta) {
        this.idCamiseta = idCamiseta;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
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
        hash += (idCamiseta != null ? idCamiseta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Camiseta)) {
            return false;
        }
        Camiseta other = (Camiseta) object;
        if ((this.idCamiseta == null && other.idCamiseta != null) || (this.idCamiseta != null && !this.idCamiseta.equals(other.idCamiseta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.uniminuto.proyectoCamisetaEjb.entities.Camiseta[ idCamiseta=" + idCamiseta + " ]";
    }
    
}
