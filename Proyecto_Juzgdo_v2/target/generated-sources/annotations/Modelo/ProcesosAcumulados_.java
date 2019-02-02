package Modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ProcesosAcumulados.class)
public abstract class ProcesosAcumulados_ {

	public static volatile SingularAttribute<ProcesosAcumulados, Pena> penaId;
	public static volatile SingularAttribute<ProcesosAcumulados, Procesos> procesoPrincipal;
	public static volatile SingularAttribute<ProcesosAcumulados, Integer> id;
	public static volatile SingularAttribute<ProcesosAcumulados, Procesos> procesoSecundario;

}

