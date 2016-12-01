package br.udesc.greenhouse.modelo.entidade;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-12-01T04:18:25")
@StaticMetamodel(Noticia.class)
public class Noticia_ { 

    public static volatile SingularAttribute<Noticia, String> foto;
    public static volatile SingularAttribute<Noticia, Boolean> fixada;
    public static volatile SingularAttribute<Noticia, Date> data;
    public static volatile SingularAttribute<Noticia, String> titulo;
    public static volatile SingularAttribute<Noticia, Long> noticiaid;
    public static volatile SingularAttribute<Noticia, String> descricao;

}