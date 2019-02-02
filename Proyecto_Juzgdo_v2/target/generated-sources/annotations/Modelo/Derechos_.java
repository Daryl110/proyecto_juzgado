package Modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Derechos.class)
public abstract class Derechos_ {

	public static volatile SingularAttribute<Derechos, String> descripcion;
	public static volatile ListAttribute<Derechos, Tutelas> tutelasList;
	public static volatile SingularAttribute<Derechos, Integer> idDerechos;
	public static volatile ListAttribute<Derechos, TutelasDerechos> tutelasDerechosList;

}

