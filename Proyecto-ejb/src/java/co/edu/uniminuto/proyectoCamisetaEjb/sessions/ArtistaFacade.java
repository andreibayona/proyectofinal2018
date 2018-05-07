/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniminuto.proyectoCamisetaEjb.sessions;

import co.edu.uniminuto.proyectoCamisetaEjb.entities.Artista;
import co.edu.uniminuto.proyectoCamisetaEjb.entities.CatalogoEstampas;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author andre
 */
@Stateless
public class ArtistaFacade extends AbstractFacade<Artista> {

    @PersistenceContext(unitName = "Proyecto-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ArtistaFacade() {
        super(Artista.class);
    }

    public boolean checkLogin(String correo, String password) {
         String jpql = "Select a From artista a Where a.correo=:correo  and a.password=:password";
        Query query = em.createQuery(jpql);
        query.setParameter("correo", correo);
        query.setParameter("password", password);
        //3. Truy van vao object
        try {
            query.getSingleResult();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
      public boolean  Insertar(Integer idArtista, String nombre, String apellido, String correo, String password, String genero, String telefono, String direccion ) {
        Artista c = em.find(Artista.class,idArtista );
        if (c == null) {
            c = new Artista();
            c.setIdArtista(idArtista);
            c.setNombre(nombre);
            c.setApellido(apellido);
            c.setCorreo(correo);
            c.setPassword(password);
            c.setGenero(genero);
            c.setTelefono(telefono);
            c.setDireccion(direccion);
    
            em.persist(c);
            return true;
}
        return false;
    }
    public void persist(Object object) {
        em.persist(object);
    }
    
}
