package model;

import java.util.ArrayList;
import java.util.List;

public abstract class Evento {
    private String titulo;
    private String data;
    private int duracao; 
    private double orcamento;
    private Local local;
    private final List<Participante> participantes;
    private Organizador organizadorResponsavel;

    public Evento(String titulo, String data, int duracao, double orcamento, Local local) {
        this.titulo = titulo;
        this.data = data;
        this.duracao = duracao;
        this.orcamento = orcamento;
        this.participantes = new ArrayList<>();
        setLocal(local);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public double getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(double orcamento) {
        this.orcamento = orcamento;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
       
        if (this.local != null) {
            this.local.removerEvento(this);
        }
        
        this.local = local;
        
        if (local != null) {
            local.adicionarEvento(this);
        }
    }
    
    public List<Participante> getParticipantes() {
        return participantes;
    }
    
    public boolean adicionarParticipante(Participante participante) {
        if (participantes.contains(participante)) {
            return true; 
        }
        
        if (participantes.size() < local.getCapacidadeMaxima()) {
            participantes.add(participante);
            return true;
        }
        return false;
    }
    
    public boolean removerParticipante(Participante participante) {
        return participantes.remove(participante);
    }

    public Organizador getOrganizadorResponsavel() {
        return organizadorResponsavel;
    }

    public void setOrganizadorResponsavel(Organizador organizador) {
    
        if (this.organizadorResponsavel != null) {
            this.organizadorResponsavel.removerEvento(this);
        }
        
        this.organizadorResponsavel = organizador;
        

        if (organizador != null) {
            organizador.adicionarEvento(this);
        }
    }
    
    public String exibirInformacoes() {
        StringBuilder info = new StringBuilder();
        info.append("Título: ").append(titulo)
            .append("\nData: ").append(data)
            .append("\nDuração: ").append(duracao).append(" horas")
            .append("\nLocal: ").append(local.getNome())
            .append("\nBloco: ").append(local.getBloco())
            .append("\nParticipantes inscritos: ").append(participantes.size()).append("/").append(local.getCapacidadeMaxima());
        
        if (organizadorResponsavel != null) {
            info.append("\nOrganizador: ").append(organizadorResponsavel.getNome())
                .append(" (").append(organizadorResponsavel.getFuncaoAdministrativa()).append(")");
        }
        
        return info.toString();
    }
}
