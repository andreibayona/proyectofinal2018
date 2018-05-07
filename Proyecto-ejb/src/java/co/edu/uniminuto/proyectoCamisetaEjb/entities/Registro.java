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
@Table(name = "registro")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Registro.findAll", query = "SELECT r FROM Registro r")
    , @NamedQuery(name = "Registro.findByIdRegistro", query = "SELECT r FROM Registro r WHERE r.idRegistro = :idRegistro")
    , @NamedQuery(name = "Registro.findByNombreEstampa", query = "SELECT r FROM Registro r WHERE r.nombreEstampa = :nombreEstampa")
    , @NamedQuery(name = "Registro.findByPrecio", query = "SELECT r FROM Registro r WHERE r.precio = :precio")
    , @NamedQuery(name = "Registro.findByTema", query = "SELECT r FROM Registro r WHERE r.tema = :tema")
    , @NamedQuery(name = "Registro.findByAutor", query = "SELECT r FROM Registro r WHERE r.autor = :autor")
    , @NamedQuery(name = "Registro.findByCantidad", query = "SELECT r FROM Registro r WHERE r.cantidad = :cantidad")
    , @NamedQuery(name = "Registro.findByFormaPago", query = "SELECT r FROM Registro r WHERE r.formaPago = :formaPago")
    , @NamedQuery(name = "Registro.findByNumeroCuenta", query = "SELECT r FROM Registro r WHERE r.numeroCuenta = :numeroCuenta")})
public class Registro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_registro")
    private Integer idRegistro;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "nombreEstampa")
    private String nombreEstampa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "precio")
    private String precio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "tema")
    private String tema;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "autor")
    private String autor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "cantidad")
    private String cantidad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "formaPago")
    private String formaPago;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "numeroCuenta")
    private String numeroCuenta;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idRegistro")
    private Collection<Pedido> pedidoCollection;
    @JoinColumn(name = "id_forma", referencedColumnName = "id_pago")
    @ManyToOne(optional = false)
    private FormaPago idForma;
    @JoinColumn(name = "id_carrito", referencedColumnName = "id_carro")
    @ManyToOne(optional = false)
    private CarroCompras idCarrito;

    public Registro() {
    }

    public Registro(Integer idRegistro) {
        this.idRegistro = idRegistro;
    }

    public Registro(Integer idRegistro, String nombreEstampa, String precio, String tema, String autor, String cantidad, String formaPago, String numeroCuenta) {
        this.idRegistro = idRegistro;
        this.nombreEstampa = nombreEstampa;
        this.precio = precio;
        this.tema = tema;
        this.autor = autor;
        this.cantidad = cantidad;
        this.formaPago = formaPago;
        this.numeroCuenta = numeroCuenta;
    }

    public Integer getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(Integer idRegistro) {
        this.idRegistro = idRegistro;
    }

    public String getNombreEstampa() {
        return nombreEstampa;
    }

    public void setNombreEstampa(String nombreEstampa) {
        this.nombreEstampa = nombreEstampa;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    @XmlTransient
    public Collection<Pedido> getPedidoCollection() {
        return pedidoCollection;
    }

    public void setPedidoCollection(Collection<Pedido> pedidoCollection) {
        this.pedidoCollection = pedidoCollection;
    }

    public FormaPago getIdForma() {
        return idForma;
    }

    public void setIdForma(FormaPago idForma) {
        this.idForma = idForma;
    }

    public CarroCompras getIdCarrito() {
        return idCarrito;
    }

    public void setIdCarrito(CarroCompras idCarrito) {
        this.idCarrito = idCarrito;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRegistro != null ? idRegistro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Registro)) {
            return false;
        }
        Registro other = (Registro) object;
        if ((this.idRegistro == null && other.idRegistro != null) || (this.idRegistro != null && !this.idRegistro.equals(other.idRegistro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.uniminuto.proyectoCamisetaEjb.entities.Registro[ idRegistro=" + idRegistro + " ]";
    }
    
}
