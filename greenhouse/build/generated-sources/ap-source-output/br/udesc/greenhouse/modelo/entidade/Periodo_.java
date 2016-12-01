package br.udesc.greenhouse.modelo.entidade;

import br.udesc.greenhouse.modelo.entidade.Oficina;
import br.udesc.greenhouse.modelo.entidade.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-12-01T04:18:25")
@StaticMetamodel(Periodo.class)
public class Periodo_ { 

    public static volatile SingularAttribute<Periodo, Date> horaFim;
    public static volatile SingularAttribute<Periodo, String> diaDaSemana;
    public static volatile ListAttribute<Periodo, Oficina> oficinas;
    public static volatile SingularAttribute<Periodo, Long> periodoid;
    public static volatile ListAttribute<Periodo, Usuario> usuarios;
    public static volatile SingularAttribute<Periodo, Date> horaInicio;

}