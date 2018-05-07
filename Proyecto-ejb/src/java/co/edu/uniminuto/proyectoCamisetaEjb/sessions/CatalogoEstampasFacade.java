/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniminuto.proyectoCamisetaEjb.sessions;

import co.edu.uniminuto.proyectoCamisetaEjb.entities.CatalogoEstampas;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author andre
 */
@Stateless
public class CatalogoEstampasFacade extends AbstractFacade<CatalogoEstampas> {

    @PersistenceContext(unitName = "Proyecto-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CatalogoEstampasFacade() {
        super(CatalogoEstampas.class);
    }
     public List<CatalogoEstampas> mostrar() {
        String jpql = "SELECT c FROM catalogo_estampas c";
        Query query = em.createQuery(jpql);
        return query.getResultList();
    }
    public boolean  Insertar(Integer idEstampa,String nombre, String tema, String autor, String descripcion, String tamaño, String precio, String imagen ) {
        CatalogoEstampas c = em.find(CatalogoEstampas.class,idEstampa );
        if (c == null) {
            c = new CatalogoEstampas();
            c.setIdEstampa(idEstampa);
            c.setNombre(nombre);
            c.setTema(tema);
            c.setAutor(autor);
            c.setDescripcion(descripcion);
            c.setTamaño(tamaño);
            c.setPrecio(precio);
            c.setImagen(imagen);
    
            em.persist(c);
            return true;
}
        return false;
    }
     public boolean  Actualizar(Integer idEstampa,String nombre, String tema, String autor, String descripcion, String tamaño, String precio, String imagen ) {
        CatalogoEstampas c = em.find(CatalogoEstampas.class,idEstampa );
        if (c != null) {
            c = new CatalogoEstampas();
            c.setIdEstampa(idEstampa);
            c.setNombre(nombre);
            c.setTema(tema);
            c.setAutor(autor);
            c.setDescripcion(descripcion);
            c.setTamaño(tamaño);
            c.setPrecio(precio);
            c.setImagen(imagen);
    
            em.merge(c);
            return true;
}
        return false;
    }
      public boolean Eliminar( Integer idEstampa) {
       CatalogoEstampas c = em.find(CatalogoEstampas.class,idEstampa );
        if (c != null) {
            em.remove(c);
            return true;
        }
        return false;
    }
    
    
      
    
}
