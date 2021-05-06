/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistcob.entity;
import javax.persistence.Column;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



/**
 *
 * @author joual
 */
@Entity
public class Divida implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @ManyToOne
    private Cliente devedor;
    
    @Column(nullable = false)
    private double valorDiv;
    
    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date dataDivda;
    
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dataDeVencimento;
    
    @ManyToOne
    @Enumerated(EnumType.STRING)
    private EnumStatus status;
    
    
    
    @Column(nullable = false)
    private String credor;

    public Cliente getDevedor() {
        return devedor;
    }

    public void setDevedor(Cliente devedor) {
        this.devedor = devedor;
    }

    public double getValorDiv() {
        return valorDiv;
    }

    public void setValorDiv(double valorDiv) {
        this.valorDiv = valorDiv;
    }

    public Date getDataDivda() {
        return dataDivda;
    }

    public void setDataDivda(Date dataDivda) {
        this.dataDivda = dataDivda;
    }

    public Date getDataDeVencimento() {
        return dataDeVencimento;
    }

    public void setDataDeVencimento(Date dataDeVencimento) {
        this.dataDeVencimento = dataDeVencimento;
    }
    
    
    
  

    public String getCredor() {
        return credor;
    }

    public void setCredor(String credor) {
        this.credor = credor;
    }

    public EnumStatus getStatus() {
        return status;
    }

    public void setStatus(EnumStatus status) {
        this.status = status;
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
        if (!(object instanceof Divida)) {
            return false;
        }
        Divida other = (Divida) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sistcob.entity.Divida[ id=" + id + " ]";
    }
    
}
