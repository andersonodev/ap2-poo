package model;

import java.util.ArrayList;
import java.util.List;

public abstract class Local {
    private String nome;
    private int capacidadeMaxima;
    private String bloco; 
    private final List<Evento> eventos;

    public Local(String nome, int capacidadeMaxima, String bloco) {
        this.nome = nome;
        this.capacidadeMaxima = capacidadeMaxima;
        this.bloco = bloco;
        this.eventos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public String getBloco() {
        return bloco;
    }

    public void setBloco(String bloco) {
        this.bloco = bloco;
    }

    public List<Evento> getEventos() {
        return eventos;
    }
    
    public void adicionarEvento(Evento evento) {
        if (!eventos.contains(evento)) {
            eventos.add(evento);
        }
    }
    
    public void removerEvento(Evento evento) {
        eventos.remove(evento);
    }
}
