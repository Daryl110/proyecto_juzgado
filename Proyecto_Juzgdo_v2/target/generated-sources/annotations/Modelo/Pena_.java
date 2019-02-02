package Modelo;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Pena.class)
public abstract class Pena_ {

	public static volatile ListAttribute<Pena, Procesorequerido> procesorequeridoList;
	public static volatile SingularAttribute<Pena, String> tiempoPena;
	public static volatile ListAttribute<Pena, PenaDelitos> penaDelitosList;
	public static volatile ListAttribute<Pena, ProcesosAcumulados> procesosAcumuladosList;
	public static volatile SingularAttribute<Pena, String> nombreCondenado;
	public static volatile SingularAttribute<Pena, String> penaMulta;
	public static volatile SingularAttribute<Pena, String> identificacionCondenado;
	public static volatile SingularAttribute<Pena, Integer> id;
	public static volatile SingularAttribute<Pena, BigDecimal> diasPena;
	public static volatile SingularAttribute<Pena, Procesos> procesosNI;
	public static volatile ListAttribute<Pena, Situacionjuridica> situacionjuridicaList;

}

