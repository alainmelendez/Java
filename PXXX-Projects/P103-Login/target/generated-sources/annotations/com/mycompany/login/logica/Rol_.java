package com.mycompany.login.logica;

import com.mycompany.login.logica.Usuario;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-04-08T18:26:08", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Rol.class)
public class Rol_ { 

    public static volatile SingularAttribute<Rol, String> descripcion;
    public static volatile SingularAttribute<Rol, Integer> idRol;
    public static volatile ListAttribute<Rol, Usuario> listaUsers;
    public static volatile SingularAttribute<Rol, String> nombreRol;

}