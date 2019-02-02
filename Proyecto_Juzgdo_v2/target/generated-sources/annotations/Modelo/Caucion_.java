package Modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Caucion.class)
public abstract class Caucion_ {

	public static volatile SingularAttribute<Caucion, Integer> nDeposito;
	public static volatile SingularAttribute<Caucion, Date> fechaDevolucion;
	public static volatile SingularAttribute<Caucion, Integer> idcaucion;
	public static volatile SingularAttribute<Caucion, Situacionjuridica> situacionJuridica;
	public static volatile SingularAttribute<Caucion, Integer> valor;
	public static volatile SingularAttribute<Caucion, String> poliza;

}

