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
@Table(name = "carro_compras")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CarroCompras.findAll", query = "SELECT c FROM CarroCompras c")
    , @NamedQuery(name = "CarroCompras.findByIdCarro", query = "SELECT c FROM CarroCompras c WHERE c.idCarro = :idCarro")
    , @NamedQuery(name = "CarroCompras.findByPrecioTotal", query = "SELECT c FROM CarroCompras c WHERE c.precioTotal = :precioTotal")})
public class CarroCompras implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_carro")
    private Integer idCarro;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "precioTotal")
    private String precioTotal;
    @JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente")
    @ManyToOne(optional = false)
    private Cliente idCliente;
    @JoinColumn(name = "id_confguracion", referencedColumnName = "id_configuracion")
    @ManyToOne(optional = false)
    private ConfiguracionEstampa idConfguracion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCarrito")
    private Collection<Registro> registroCollection;

    public CarroCompras() {
    }

    public CarroCompras(Integer idCarro) {
        this.idCarro = idCarro;
    }

    public CarroCompras(Integer idCarro, String precioTotal) {
        this.idCarro = idCarro;
        this.precioTotal = precioTotal;
    }

    public Integer getIdCarro() {
        return idCarro;
    }

    public void setIdCarro(Integer idCarro) {
        this.idCarro = idCarro;
    }

    public String getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(String precioTotal) {
        this.precioTotal = precioTotal;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }

    public ConfiguracionEstampa getIdConfguracion() {
        return idConfguracion;
    }

    public void setIdConfguracion(ConfiguracionEstampa idConfguracion) {
        this.idConfguracion = idConfguracion;
    }

    @XmlTransient
    public Collection<Registro> getRegistroCollection() {
        return registroCollection;
    }

    public void setRegistroCollection(Collection<Registro> registroCollection) {
        this.registroCollection = registroCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCarro != null ? idCarro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CarroCompras)) {
            return false;
        }
        CarroCompras other = (CarroCompras) object;
        if ((this.idCarro == null && other.idCarro != null) || (this.idCarro != null && !this.idCarro.equals(other.idCarro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.uniminuto.proyectoCamisetaEjb.entities.CarroCompras[ idCarro=" + idCarro + " ]";
    }
    
}
