package com.sistcob.entity;

import com.sistcob.entity.Cliente;
import com.sistcob.entity.Divida;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-11-22T06:29:16")
@StaticMetamodel(Pagamento.class)
public class Pagamento_ { 

    public static volatile SingularAttribute<Pagamento, Double> valorAsePagar;
    public static volatile SingularAttribute<Pagamento, Divida> idDivida;
    public static volatile SingularAttribute<Pagamento, Divida> statusDiv;
    public static volatile SingularAttribute<Pagamento, Divida> valor;
    public static volatile SingularAttribute<Pagamento, Date> dataDePagamento;
    public static volatile SingularAttribute<Pagamento, Cliente> nomeDev;
    public static volatile SingularAttribute<Pagamento, Long> id;
    public static volatile SingularAttribute<Pagamento, Divida> status;

}