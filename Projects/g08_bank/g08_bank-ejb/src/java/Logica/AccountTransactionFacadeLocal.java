/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import data.AccountTransaction;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author karla
 */
@Local
public interface AccountTransactionFacadeLocal {

    void create(AccountTransaction accountTransaction);

    void edit(AccountTransaction accountTransaction);

    void remove(AccountTransaction accountTransaction);

    AccountTransaction find(Object id);

    List<AccountTransaction> findAll();

    List<AccountTransaction> findRange(int[] range);

    int count();
    
}
