package Modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Situacionjuridica.class)
public abstract class Situacionjuridica_ {

	public static volatile SingularAttribute<Situacionjuridica, String> tipo;
	public static volatile SingularAttribute<Situacionjuridica, String> estado;
	public static volatile SingularAttribute<Situacionjuridica, Pena> penaId;
	public static volatile ListAttribute<Situacionjuridica, Condiciones> condicionesList;
	public static volatile SingularAttribute<Situacionjuridica, String> trabajo;
	public static volatile SingularAttribute<Situacionjuridica, String> diasPrivacion;
	public static volatile SingularAttribute<Situacionjuridica, Integer> diasTotales;
	public static volatile SingularAttribute<Situacionjuridica, String> carcel;
	public static volatile SingularAttribute<Situacionjuridica, Date> fechaFinalizacion;
	public static volatile SingularAttribute<Situacionjuridica, String> mostrarTotal;
	public static volatile ListAttribute<Situacionjuridica, Caucion> caucionList;
	public static volatile SingularAttribute<Situacionjuridica, String> totalRedenciones;
	public static volatile SingularAttribute<Situacionjuridica, String> diasDetencion;
	public static volatile SingularAttribute<Situacionjuridica, Date> fechaExtincion;
	public static volatile SingularAttribute<Situacionjuridica, Date> fechaCaptura;
	public static volatile SingularAttribute<Situacionjuridica, String> observaciones;
	public static volatile SingularAttribute<Situacionjuridica, Integer> folio;
	public static volatile ListAttribute<Situacionjuridica, Redencion> redencionList;
	public static volatile SingularAttribute<Situacionjuridica, Integer> id;
	public static volatile ListAttribute<Situacionjuridica, Sanciones> sancionesList;
	public static volatile SingularAttribute<Situacionjuridica, String> lugarCumplimiento;

}

