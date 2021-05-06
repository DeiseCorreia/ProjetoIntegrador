/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistcob.controller;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author joual
 */
@Entity
@Table(name = "divida")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Divida.findAll", query = "SELECT d FROM Divida d")
    , @NamedQuery(name = "Divida.findById", query = "SELECT d FROM Divida d WHERE d.id = :id")
    , @NamedQuery(name = "Divida.findByCredor", query = "SELECT d FROM Divida d WHERE d.credor = :credor")
    , @NamedQuery(name = "Divida.findByDatadevencimento", query = "SELECT d FROM Divida d WHERE d.datadevencimento = :datadevencimento")
    , @NamedQuery(name = "Divida.findByDatadivda", query = "SELECT d FROM Divida d WHERE d.datadivda = :datadivda")
    , @NamedQuery(name = "Divida.findByStatus", query = "SELECT d FROM Divida d WHERE d.status = :status")
    , @NamedQuery(name = "Divida.findByValordiv", query = "SELECT d FROM Divida d WHERE d.valordiv = :valordiv")})
public class Divida implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "credor")
    private String credor;
    @Basic(optional = false)
    @NotNull
    @Column(name = "datadevencimento")
    @Temporal(TemporalType.DATE)
    private Date datadevencimento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "datadivda")
    @Temporal(TemporalType.DATE)
    private Date datadivda;
    @Size(max = 255)
    @Column(name = "status")
    private String status;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valordiv")
    private double valordiv;
    @JoinColumn(name = "devedor_id", referencedColumnName = "id")
    @ManyToOne
    private Cliente devedorId;
    @OneToMany(mappedBy = "iddividaId")
    private Collection<Pagamento> pagamentoCollection;
    @OneToMany(mappedBy = "statusId")
    private Collection<Pagamento> pagamentoCollection1;
    @OneToMany(mappedBy = "valorId")
    private Collection<Pagamento> pagamentoCollection2;

    public Divida() {
    }

    public Divida(Long id) {
        this.id = id;
    }

    public Divida(Long id, String credor, Date datadevencimento, Date datadivda, double valordiv) {
        this.id = id;
        this.credor = credor;
        this.datadevencimento = datadevencimento;
        this.datadivda = datadivda;
        this.valordiv = valordiv;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCredor() {
        return credor;
    }

    public void setCredor(String credor) {
        this.credor = credor;
    }

    public Date getDatadevencimento() {
        return datadevencimento;
    }

    public void setDatadevencimento(Date datadevencimento) {
        this.datadevencimento = datadevencimento;
    }

    public Date getDatadivda() {
        return datadivda;
    }

    public void setDatadivda(Date datadivda) {
        this.datadivda = datadivda;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getValordiv() {
        return valordiv;
    }

    public void setValordiv(double valordiv) {
        this.valordiv = valordiv;
    }

    public Cliente getDevedorId() {
        return devedorId;
    }

    public void setDevedorId(Cliente devedorId) {
        this.devedorId = devedorId;
    }

    @XmlTransient
    public Collection<Pagamento> getPagamentoCollection() {
        return pagamentoCollection;
    }

    public void setPagamentoCollection(Collection<Pagamento> pagamentoCollection) {
        this.pagamentoCollection = pagamentoCollection;
    }

    @XmlTransient
    public Collection<Pagamento> getPagamentoCollection1() {
        return pagamentoCollection1;
    }

    public void setPagamentoCollection1(Collection<Pagamento> pagamentoCollection1) {
        this.pagamentoCollection1 = pagamentoCollection1;
    }

    @XmlTransient
    public Collection<Pagamento> getPagamentoCollection2() {
        return pagamentoCollection2;
    }

    public void setPagamentoCollection2(Collection<Pagamento> pagamentoCollection2) {
        this.pagamentoCollection2 = pagamentoCollection2;
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
        return "com.sistcob.controller.Divida[ id=" + id + " ]";
    }
    
}
