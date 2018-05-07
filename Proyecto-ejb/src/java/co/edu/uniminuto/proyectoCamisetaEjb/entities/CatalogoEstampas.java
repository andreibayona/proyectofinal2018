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
@Table(name = "catalogo_estampas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatalogoEstampas.findAll", query = "SELECT c FROM CatalogoEstampas c")
    , @NamedQuery(name = "CatalogoEstampas.findByIdEstampa", query = "SELECT c FROM CatalogoEstampas c WHERE c.idEstampa = :idEstampa")
    , @NamedQuery(name = "CatalogoEstampas.findByNombre", query = "SELECT c FROM CatalogoEstampas c WHERE c.nombre = :nombre")
    , @NamedQuery(name = "CatalogoEstampas.findByTema", query = "SELECT c FROM CatalogoEstampas c WHERE c.tema = :tema")
    , @NamedQuery(name = "CatalogoEstampas.findByAutor", query = "SELECT c FROM CatalogoEstampas c WHERE c.autor = :autor")
    , @NamedQuery(name = "CatalogoEstampas.findByDescripcion", query = "SELECT c FROM CatalogoEstampas c WHERE c.descripcion = :descripcion")
    , @NamedQuery(name = "CatalogoEstampas.findByTama\u00f1o", query = "SELECT c FROM CatalogoEstampas c WHERE c.tama\u00f1o = :tama\u00f1o")
    , @NamedQuery(name = "CatalogoEstampas.findByPrecio", query = "SELECT c FROM CatalogoEstampas c WHERE c.precio = :precio")
    , @NamedQuery(name = "CatalogoEstampas.findByImagen", query = "SELECT c FROM CatalogoEstampas c WHERE c.imagen = :imagen")})
public class CatalogoEstampas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_estampa")
    private Integer idEstampa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "nombre")
    private String nombre;
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
    @Column(name = "descripcion")
    private String descripcion;
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
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "imagen")
    private String imagen;
    @JoinColumn(name = "id_artista", referencedColumnName = "id_artista")
    @ManyToOne(optional = false)
    private Artista idArtista;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCatalogo")
    private Collection<ConfiguracionEstampa> configuracionEstampaCollection;

    public CatalogoEstampas() {
    }

    public CatalogoEstampas(Integer idEstampa) {
        this.idEstampa = idEstampa;
    }

    public CatalogoEstampas(Integer idEstampa, String nombre, String tema, String autor, String descripcion, String tamaño, String precio, String imagen) {
        this.idEstampa = idEstampa;
        this.nombre = nombre;
        this.tema = tema;
        this.autor = autor;
        this.descripcion = descripcion;
        this.tamaño = tamaño;
        this.precio = precio;
        this.imagen = imagen;
    }

    public Integer getIdEstampa() {
        return idEstampa;
    }

    public void setIdEstampa(Integer idEstampa) {
        this.idEstampa = idEstampa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Artista getIdArtista() {
        return idArtista;
    }

    public void setIdArtista(Artista idArtista) {
        this.idArtista = idArtista;
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
        hash += (idEstampa != null ? idEstampa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatalogoEstampas)) {
            return false;
        }
        CatalogoEstampas other = (CatalogoEstampas) object;
        if ((this.idEstampa == null && other.idEstampa != null) || (this.idEstampa != null && !this.idEstampa.equals(other.idEstampa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.uniminuto.proyectoCamisetaEjb.entities.CatalogoEstampas[ idEstampa=" + idEstampa + " ]";
    }
    
}
