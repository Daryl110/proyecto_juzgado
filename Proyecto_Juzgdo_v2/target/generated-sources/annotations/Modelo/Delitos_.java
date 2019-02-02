package Modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Delitos.class)
public abstract class Delitos_ {

	public static volatile SingularAttribute<Delitos, String> descripcion;
	public static volatile SingularAttribute<Delitos, String> atributoDos;
	public static volatile SingularAttribute<Delitos, Integer> idDelitos;
	public static volatile ListAttribute<Delitos, PenaDelitos> penaDelitosList;
	public static volatile SingularAttribute<Delitos, String> atributoUno;
	public static volatile SingularAttribute<Delitos, String> atributoTres;
	public static volatile SingularAttribute<Delitos, String> atributoCuatro;

}

