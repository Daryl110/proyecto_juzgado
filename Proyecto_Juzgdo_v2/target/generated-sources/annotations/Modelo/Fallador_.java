package Modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Fallador.class)
public abstract class Fallador_ {

	public static volatile SingularAttribute<Fallador, String> descripcion;
	public static volatile ListAttribute<Fallador, Procesos> procesosList;
	public static volatile SingularAttribute<Fallador, Integer> idFallador;
	public static volatile ListAttribute<Fallador, Procesos> procesosList1;

}

