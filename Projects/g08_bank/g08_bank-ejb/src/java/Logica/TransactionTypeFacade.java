/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import data.TransactionType;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author karla
 */
@Stateless
public class TransactionTypeFacade extends AbstractFacade<TransactionType> implements TransactionTypeFacadeLocal {

    @PersistenceContext(unitName = "g08_bank-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TransactionTypeFacade() {
        super(TransactionType.class);
    }
    
}
