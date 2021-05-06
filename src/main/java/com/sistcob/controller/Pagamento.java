/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistcob.controller;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author joual
 */
@Entity
@Table(name = "pagamento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pagamento.findAll", query = "SELECT p FROM Pagamento p")
    , @NamedQuery(name = "Pagamento.findById", query = "SELECT p FROM Pagamento p WHERE p.id = :id")
    , @NamedQuery(name = "Pagamento.findByDatadepagamento", query = "SELECT p FROM Pagamento p WHERE p.datadepagamento = :datadepagamento")
    , @NamedQuery(name = "Pagamento.findByValorasepagar", query = "SELECT p FROM Pagamento p WHERE p.valorasepagar = :valorasepagar")})
public class Pagamento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "datadepagamento")
    @Temporal(TemporalType.DATE)
    private Date datadepagamento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valorasepagar")
    private double valorasepagar;
    @JoinColumn(name = "nomedev_id", referencedColumnName = "id")
    @ManyToOne
    private Cliente nomedevId;
    @JoinColumn(name = "iddivida_id", referencedColumnName = "id")
    @ManyToOne
    private Divida iddividaId;
    @JoinColumn(name = "status_id", referencedColumnName = "id")
    @ManyToOne
    private Divida statusId;
    @JoinColumn(name = "valor_id", referencedColumnName = "id")
    @ManyToOne
    private Divida valorId;

    public Pagamento() {
    }

    public Pagamento(Long id) {
        this.id = id;
    }

    public Pagamento(Long id, Date datadepagamento, double valorasepagar) {
        this.id = id;
        this.datadepagamento = datadepagamento;
        this.valorasepagar = valorasepagar;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDatadepagamento() {
        return datadepagamento;
    }

    public void setDatadepagamento(Date datadepagamento) {
        this.datadepagamento = datadepagamento;
    }

    public double getValorasepagar() {
        return valorasepagar;
    }

    public void setValorasepagar(double valorasepagar) {
        this.valorasepagar = valorasepagar;
    }

    public Cliente getNomedevId() {
        return nomedevId;
    }

    public void setNomedevId(Cliente nomedevId) {
        this.nomedevId = nomedevId;
    }

    public Divida getIddividaId() {
        return iddividaId;
    }

    public void setIddividaId(Divida iddividaId) {
        this.iddividaId = iddividaId;
    }

    public Divida getStatusId() {
        return statusId;
    }

    public void setStatusId(Divida statusId) {
        this.statusId = statusId;
    }

    public Divida getValorId() {
        return valorId;
    }

    public void setValorId(Divida valorId) {
        this.valorId = valorId;
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
        return "com.sistcob.controller.Pagamento[ id=" + id + " ]";
    }
    
}
