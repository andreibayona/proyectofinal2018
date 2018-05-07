/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniminuto.proyectoCamisetaEjb.sessions;

import co.edu.uniminuto.proyectoCamisetaEjb.entities.Camiseta;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author andre
 */
@Stateless
public class CamisetaFacade extends AbstractFacade<Camiseta> {

    @PersistenceContext(unitName = "Proyecto-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CamisetaFacade() {
        super(Camiseta.class);
    }
    
}
