package Modelo;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Redencion.class)
public abstract class Redencion_ {

	public static volatile SingularAttribute<Redencion, BigDecimal> horas;
	public static volatile SingularAttribute<Redencion, Date> fecha;
	public static volatile SingularAttribute<Redencion, Situacionjuridica> situacionJuridica;
	public static volatile SingularAttribute<Redencion, Integer> cuaderno;
	public static volatile SingularAttribute<Redencion, Integer> folio;
	public static volatile SingularAttribute<Redencion, Integer> id;

}

