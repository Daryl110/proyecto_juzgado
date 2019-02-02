package Modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Auditoria.class)
public abstract class Auditoria_ {

	public static volatile SingularAttribute<Auditoria, String> accion;
	public static volatile SingularAttribute<Auditoria, Date> fecha;
	public static volatile SingularAttribute<Auditoria, String> persona;
	public static volatile SingularAttribute<Auditoria, String> entidad;
	public static volatile SingularAttribute<Auditoria, String> objeto;
	public static volatile SingularAttribute<Auditoria, Integer> idauditoria;

}

