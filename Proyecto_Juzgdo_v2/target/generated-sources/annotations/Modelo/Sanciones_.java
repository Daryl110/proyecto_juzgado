package Modelo;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Sanciones.class)
public abstract class Sanciones_ {

	public static volatile SingularAttribute<Sanciones, Date> fechaEjecutoria;
	public static volatile SingularAttribute<Sanciones, BigDecimal> diasCumplidos;
	public static volatile SingularAttribute<Sanciones, Integer> id;
	public static volatile SingularAttribute<Sanciones, Situacionjuridica> situacionJuridicaid;
	public static volatile SingularAttribute<Sanciones, BigDecimal> diasSancion;
	public static volatile SingularAttribute<Sanciones, BigDecimal> diasPendientes;

}

