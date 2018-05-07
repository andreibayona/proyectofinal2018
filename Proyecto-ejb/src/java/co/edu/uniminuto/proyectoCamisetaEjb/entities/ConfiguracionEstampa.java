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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "configuracion_estampa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ConfiguracionEstampa.findAll", query = "SELECT c FROM ConfiguracionEstampa c")
    , @NamedQuery(name = "ConfiguracionEstampa.findByIdConfiguracion", query = "SELECT c FROM ConfiguracionEstampa c WHERE c.idConfiguracion = :idConfiguracion")
    , @NamedQuery(name = "ConfiguracionEstampa.findByCalificacion", query = "SELECT c FROM ConfiguracionEstampa c WHERE c.calificacion = :calificacion")
    , @NamedQuery(name = "ConfiguracionEstampa.findByUbicacion", query = "SELECT c FROM ConfiguracionEstampa c WHERE c.ubicacion = :ubicacion")})
public class ConfiguracionEstampa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_configuracion")
    private Integer idConfiguracion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "calificacion")
    private String calificacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "ubicacion")
    private String ubicacion;
    @JoinColumn(name = "id_camiseta", referencedColumnName = "id_camiseta")
    @ManyToOne(optional = false)
    private Camiseta idCamiseta;
    @JoinColumn(name = "id_texto", referencedColumnName = "id_texto")
    @ManyToOne(optional = false)
    private Texto idTexto;
    @JoinColumn(name = "id_catalogo", referencedColumnName = "id_estampa")
    @ManyToOne(optional = false)
    private CatalogoEstampas idCatalogo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idConfguracion")
    private Collection<CarroCompras> carroComprasCollection;

    public ConfiguracionEstampa() {
    }

    public ConfiguracionEstampa(Integer idConfiguracion) {
        this.idConfiguracion = idConfiguracion;
    }

    public ConfiguracionEstampa(Integer idConfiguracion, String calificacion, String ubicacion) {
        this.idConfiguracion = idConfiguracion;
        this.calificacion = calificacion;
        this.ubicacion = ubicacion;
    }

    public Integer getIdConfiguracion() {
        return idConfiguracion;
    }

    public void setIdConfiguracion(Integer idConfiguracion) {
        this.idConfiguracion = idConfiguracion;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Camiseta getIdCamiseta() {
        return idCamiseta;
    }

    public void setIdCamiseta(Camiseta idCamiseta) {
        this.idCamiseta = idCamiseta;
    }

    public Texto getIdTexto() {
        return idTexto;
    }

    public void setIdTexto(Texto idTexto) {
        this.idTexto = idTexto;
    }

    public CatalogoEstampas getIdCatalogo() {
        return idCatalogo;
    }

    public void setIdCatalogo(CatalogoEstampas idCatalogo) {
        this.idCatalogo = idCatalogo;
    }

    @XmlTransient
    public Collection<CarroCompras> getCarroComprasCollection() {
        return carroComprasCollection;
    }

    public void setCarroComprasCollection(Collection<CarroCompras> carroComprasCollection) {
        this.carroComprasCollection = carroComprasCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idConfiguracion != null ? idConfiguracion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ConfiguracionEstampa)) {
            return false;
        }
        ConfiguracionEstampa other = (ConfiguracionEstampa) object;
        if ((this.idConfiguracion == null && other.idConfiguracion != null) || (this.idConfiguracion != null && !this.idConfiguracion.equals(other.idConfiguracion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.uniminuto.proyectoCamisetaEjb.entities.ConfiguracionEstampa[ idConfiguracion=" + idConfiguracion + " ]";
    }
    
}
