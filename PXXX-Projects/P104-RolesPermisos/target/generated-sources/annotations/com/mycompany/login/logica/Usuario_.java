package com.mycompany.login.logica;

import com.mycompany.login.logica.Rol;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-06-11T21:33:00", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, String> password;
    public static volatile SingularAttribute<Usuario, Rol> unRol;
    public static volatile SingularAttribute<Usuario, String> nombreUser;
    public static volatile SingularAttribute<Usuario, Integer> id;

}