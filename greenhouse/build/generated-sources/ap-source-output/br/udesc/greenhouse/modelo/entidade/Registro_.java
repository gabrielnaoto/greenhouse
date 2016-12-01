package br.udesc.greenhouse.modelo.entidade;

import br.udesc.greenhouse.modelo.entidade.Oficina;
import br.udesc.greenhouse.modelo.entidade.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-12-01T04:18:25")
@StaticMetamodel(Registro.class)
public class Registro_ { 

    public static volatile SingularAttribute<Registro, Oficina> oficina;
    public static volatile SingularAttribute<Registro, Date> data;
    public static volatile SingularAttribute<Registro, Usuario> usuario;
    public static volatile SingularAttribute<Registro, Long> registroid;
    public static volatile SingularAttribute<Registro, String> descricao;

}