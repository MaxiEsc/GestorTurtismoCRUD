package logica;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import logica.Ventas;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-12-19T12:07:36")
@StaticMetamodel(PaqueteTuristico.class)
public class PaqueteTuristico_ { 

    public static volatile SingularAttribute<PaqueteTuristico, Double> costo_paquete;
    public static volatile SingularAttribute<PaqueteTuristico, Integer> codigo_paquete;
    public static volatile ListAttribute<PaqueteTuristico, Ventas> ventas;

}