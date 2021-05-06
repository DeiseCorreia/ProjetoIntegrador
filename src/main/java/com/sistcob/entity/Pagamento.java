/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistcob.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author joual
 */
@Entity
public class Pagamento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    

    @ManyToOne
    private Divida idDivida;
     
    @ManyToOne
    private Divida valor;
     
     @ManyToOne
    private Divida status;
    
     @ManyToOne
    private Cliente nomeDev;
    
   
     
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dataDePagamento;

    @Column(nullable = false)
    private double valorAsePagar;
    
    
    public Divida getIdDivida() {
        return idDivida;
    }

    public void setIdDivida(Divida idDivida) {
        this.idDivida = idDivida;
    }

    public Divida getValor() {
        return valor;
    }

    public void setValor(Divida valor) {
        this.valor = valor;
    }

    public Divida getStatus() {
        return status;
    }

    public void setStatus(Divida status) {
        this.status = status;
    }
    
    
    

    public Cliente getNomeDev() {
        return nomeDev;
    }

    public void setNomeDev(Cliente nomeDev) {
        this.nomeDev = nomeDev;
    }

    public Date getDataDePagamento() {
        return dataDePagamento;
    }

    public void setDataDePagamento(Date dataDePagamento) {
        this.dataDePagamento = dataDePagamento;
    }

    

    

    public double getValorAsePagar() {
        return valorAsePagar;
    }

    public void setValorAsePagar(double valorAsePagar) {
        this.valorAsePagar = valorAsePagar;
    }
    
    

    
   
    public Long getId() {
        return id;
    }
    
    
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pagamento)) {
            return false;
        }
        Pagamento other = (Pagamento) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sistcob.entity.Pagamento[ id=" + id + " ]";
    }

    public void add(Pagamento pagamento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void remove(Pagamento pagamento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
