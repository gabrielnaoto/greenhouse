package br.udesc.greenhouse.modelo.entidade;

import br.udesc.greenhouse.modelo.entidade.Imagem;
import br.udesc.greenhouse.modelo.entidade.Periodo;
import br.udesc.greenhouse.modelo.entidade.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-12-01T04:18:25")
@StaticMetamodel(Oficina.class)
public class Oficina_ { 

    public static volatile SingularAttribute<Oficina, byte[]> fotoDestaque;
    public static volatile SingularAttribute<Oficina, Long> capacidade;
    public static volatile ListAttribute<Oficina, Periodo> periodos;
    public static volatile SingularAttribute<Oficina, String> nome;
    public static volatile SingularAttribute<Oficina, Long> oficinaid;
    public static volatile SingularAttribute<Oficina, String> video;
    public static volatile ListAttribute<Oficina, Usuario> usuarios;
    public static volatile ListAttribute<Oficina, Imagem> fotos;
    public static volatile SingularAttribute<Oficina, String> descricao;

}