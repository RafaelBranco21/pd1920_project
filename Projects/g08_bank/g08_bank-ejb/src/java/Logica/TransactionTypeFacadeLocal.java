/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import data.TransactionType;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author karla
 */
@Local
public interface TransactionTypeFacadeLocal {

    void create(TransactionType transactionType);

    void edit(TransactionType transactionType);

    void remove(TransactionType transactionType);

    TransactionType find(Object id);

    List<TransactionType> findAll();

    List<TransactionType> findRange(int[] range);

    int count();
    
}
