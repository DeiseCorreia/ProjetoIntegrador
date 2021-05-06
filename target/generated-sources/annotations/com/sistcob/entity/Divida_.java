package com.sistcob.entity;

import com.sistcob.entity.Cliente;
import com.sistcob.entity.EnumStatus;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-11-22T06:29:16")
@StaticMetamodel(Divida.class)
public class Divida_ { 

    public static volatile SingularAttribute<Divida, Cliente> devedor;
    public static volatile SingularAttribute<Divida, Date> dataDivda;
    public static volatile SingularAttribute<Divida, String> credor;
    public static volatile SingularAttribute<Divida, Long> id;
    public static volatile SingularAttribute<Divida, Double> valorDiv;
    public static volatile SingularAttribute<Divida, EnumStatus> status;

}