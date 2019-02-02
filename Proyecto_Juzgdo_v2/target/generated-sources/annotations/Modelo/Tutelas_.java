package Modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Tutelas.class)
public abstract class Tutelas_ {

	public static volatile SingularAttribute<Tutelas, Date> fechaPresentaciion;
	public static volatile SingularAttribute<Tutelas, String> agente;
	public static volatile SingularAttribute<Tutelas, String> numero;
	public static volatile SingularAttribute<Tutelas, Date> fechaVencimiento;
	public static volatile SingularAttribute<Tutelas, String> identificacionAccionante;
	public static volatile SingularAttribute<Tutelas, String> despacho;
	public static volatile SingularAttribute<Tutelas, String> vinculadas;
	public static volatile SingularAttribute<Tutelas, String> identificacionAgente;
	public static volatile SingularAttribute<Tutelas, Date> fechaAvocase;
	public static volatile SingularAttribute<Tutelas, String> accionadas;
	public static volatile SingularAttribute<Tutelas, Date> fechaIngreso;
	public static volatile SingularAttribute<Tutelas, String> actuaciones;
	public static volatile SingularAttribute<Tutelas, Date> fechaActuacion;
	public static volatile SingularAttribute<Tutelas, String> apoderado;
	public static volatile SingularAttribute<Tutelas, String> accionante;
	public static volatile SingularAttribute<Tutelas, Integer> idTutelas;
	public static volatile SingularAttribute<Tutelas, Usuario> usuario;
	public static volatile SingularAttribute<Tutelas, Derechos> derechoPrincipal;
	public static volatile ListAttribute<Tutelas, TutelasDerechos> tutelasDerechosList;

}

