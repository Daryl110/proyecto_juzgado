package Modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Procesos.class)
public abstract class Procesos_ {

	public static volatile SingularAttribute<Procesos, Date> fechaHechos;
	public static volatile SingularAttribute<Procesos, String> estado;
	public static volatile SingularAttribute<Procesos, String> numero;
	public static volatile SingularAttribute<Procesos, Ofendidos> ofendido;
	public static volatile ListAttribute<Procesos, ProcesosAcumulados> procesosAcumuladosList;
	public static volatile ListAttribute<Procesos, Pena> penaList;
	public static volatile SingularAttribute<Procesos, String> fechaSentencia2;
	public static volatile SingularAttribute<Procesos, String> fechaIngreso;
	public static volatile ListAttribute<Procesos, Procesorequerido> procesorequeridoList;
	public static volatile SingularAttribute<Procesos, String> fechaReparto;
	public static volatile SingularAttribute<Procesos, String> fechaSentencia;
	public static volatile SingularAttribute<Procesos, String> juzgado;
	public static volatile SingularAttribute<Procesos, Integer> numeroCuadernos;
	public static volatile SingularAttribute<Procesos, Fallador> fallador1;
	public static volatile SingularAttribute<Procesos, Fallador> fallador2;
	public static volatile SingularAttribute<Procesos, Usuario> usuario;
	public static volatile SingularAttribute<Procesos, Integer> ni;
	public static volatile ListAttribute<Procesos, ProcesosAcumulados> procesosAcumuladosList1;

}

