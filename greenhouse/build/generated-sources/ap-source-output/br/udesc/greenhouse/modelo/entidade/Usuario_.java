package br.udesc.greenhouse.modelo.entidade;

import br.udesc.greenhouse.modelo.entidade.Oficina;
import br.udesc.greenhouse.modelo.entidade.Periodo;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-12-01T04:18:25")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, String> senha;
    public static volatile SingularAttribute<Usuario, Boolean> administrador;
    public static volatile ListAttribute<Usuario, Oficina> oficinas;
    public static volatile SingularAttribute<Usuario, String> cpf;
    public static volatile ListAttribute<Usuario, Periodo> periodos;
    public static volatile SingularAttribute<Usuario, String> nome;
    public static volatile SingularAttribute<Usuario, Long> usuarioid;
    public static volatile SingularAttribute<Usuario, String> email;

}