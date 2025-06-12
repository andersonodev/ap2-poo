package model;

import java.util.ArrayList;
import java.util.List;

public class Organizador extends PessoaResponsavel {
    private String funcaoAdministrativa;
    private final List<Evento> eventosOrganizados;

    public Organizador(String nome, String email, String funcaoAdministrativa) {
        super(nome, email);
        this.funcaoAdministrativa = funcaoAdministrativa;
        this.eventosOrganizados = new ArrayList<>();
    }

    public String getFuncaoAdministrativa() {
        return funcaoAdministrativa;
    }

    public void setFuncaoAdministrativa(String funcaoAdministrativa) {
        this.funcaoAdministrativa = funcaoAdministrativa;
    }
    
    public List<Evento> getEventosOrganizados() {
        return eventosOrganizados;
    }
    
    public void adicionarEvento(Evento evento) {
        if (!eventosOrganizados.contains(evento)) {
            eventosOrganizados.add(evento);
        }
    }
    
    public void removerEvento(Evento evento) {
        eventosOrganizados.remove(evento);
    }
}
