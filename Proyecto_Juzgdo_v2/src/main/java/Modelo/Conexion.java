package Modelo;

import Controlador.Main;
import java.util.HashMap;
import java.util.Map;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author Alvaro Corrales
 */
public class Conexion {
    
	private EntityManagerFactory factory;
        
        public Conexion(String unidad){
            //<editor-fold defaultstate="collapsed" desc=" Propiedades del persistence.xml ">
            /**
             * <properties>
                    <!-- Configuring JDBC properties -->
                    <property name="javax.persistence.jdbc.url" value="jdbc:mysql://localhost:3306/juzgado"/>
                    <property name="javax.persistence.jdbc.user" value="root"/>
                    <property name="javax.persistence.jdbc.password" value=""/>
                    <property name="javax.persistence.jdbc.driver" value="com.mysql.jdbc.Driver"/>
                    <!-- Hibernate properties -->
                    <property name="hibernate.show_sql" value="true"/>
                    <property name="hibernate.format_sql" value="true"/>
                    <property name="hibernate.dialect" value="org.hibernate.dialect.MySQL5InnoDBDialect"/>
                    <property name="hibernate.hbm2ddl.auto" value="validate"/>
                    <!-- Configuring Connection Pool 
                    <property name="hibernate.c3p0.min_size" value="5"/>
                    <property name="hibernate.c3p0.max_size" value="20"/>
                    <property name="hibernate.c3p0.timeout" value="500"/>
                    <property name="hibernate.c3p0.max_statements" value="50"/>
                    <property name="hibernate.c3p0.idle_test_period" value="2000"/>-->
                </properties>
            */
            //</editor-fold>
            Map propiedades = new HashMap();
            //Propiedades de la persistencia
            propiedades.put("javax.persistence.jdbc.url", "jdbc:"+Main.joConfiguracion.get("servidorBD").toString()+"://"+Main.joConfiguracion.get("host").toString()+":3306/juzgado");
            propiedades.put("javax.persistence.jdbc.user", Main.joConfiguracion.get("usuario").toString());
            propiedades.put("javax.persistence.jdbc.password", Main.joConfiguracion.get("contrasena").toString());
            propiedades.put("javax.persistence.jdbc.driver", Main.joConfiguracion.get("driver").toString());
            //Propiedades del hibernate
            propiedades.put("hibernate.show_sql", Main.joConfiguracion.get("showSql").toString());
            propiedades.put("hibernate.format_sql", Main.joConfiguracion.get("formatSql").toString());
            propiedades.put("hibernate.dialect", Main.joConfiguracion.get("dialecto").toString());
            propiedades.put("hibernate.hbm2ddl.auto", Main.joConfiguracion.get("arquitecturaJpa").toString());
            
            factory = Persistence.createEntityManagerFactory(unidad, propiedades);
        }

	public EntityManagerFactory getFactory() {
		return factory;
	}

	public void setFactory(EntityManagerFactory factory) {
		this.factory = factory;
	}
	
	
}
