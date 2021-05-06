/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistcob.entity;

/**
 *
 * @author joual
 */
public enum EnumStatus {
   
    PENDENCIA("Pendência"),QUITADO("Quitado");
    private String descricao;



    private EnumStatus(String descricao) {
        this.descricao = descricao;
    }
    
   
  
    public String getDescricao() {
        return descricao;
    }
   
   
   
}
