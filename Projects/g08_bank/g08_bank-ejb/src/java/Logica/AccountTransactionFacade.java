/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import data.AccountTransaction;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author karla
 */
@Stateless
public class AccountTransactionFacade extends AbstractFacade<AccountTransaction> implements AccountTransactionFacadeLocal {

    @PersistenceContext(unitName = "g08_bank-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AccountTransactionFacade() {
        super(AccountTransaction.class);
    }
    
}
