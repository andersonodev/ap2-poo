package model;

import java.util.ArrayList;
import java.util.List;

public class Participante {
    private String nome;
    private String cpf;
    private String email;
    private Curso curso;
    private final List<Evento> eventosInscritos;

    public Participante(String nome, String cpf, String email, Curso curso) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.curso = curso;
        this.eventosInscritos = new ArrayList<>();
    }

    // Construtor adicional para compatibilidade com código existente
    public Participante(String nome, String cpf, String email, String nomeCurso) {
        this(nome, cpf, email, new Curso(nomeCurso, ""));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    
    public String getCursoNome() {
        return curso.getNome();
    }
    
    public List<Evento> getEventosInscritos() {
        return eventosInscritos;
    }
    
    public boolean inscreverEvento(Evento evento) {

        if (eventosInscritos.contains(evento)) {
            return true; 
        }
        

        if (evento.adicionarParticipante(this)) {
            eventosInscritos.add(evento);
            return true;
        }
        return false;
    }
    
    public boolean cancelarInscricao(Evento evento) {
        // Remove o participante do evento
        if (evento.removerParticipante(this)) {
            // Remove o evento da lista do participante
            return eventosInscritos.remove(evento);
        }
        return false;
    }
}
