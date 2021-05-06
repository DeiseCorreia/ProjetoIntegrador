/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistcob.controller;

import com.sistcob.entity.Pagamento;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author joual
 */
@Stateless
public class PagamentoFacade extends AbstractFacade<Pagamento> {

    @PersistenceContext(unitName = "com.sistcob_SistCob_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PagamentoFacade() {
        super(Pagamento.class);
    }
    
}
