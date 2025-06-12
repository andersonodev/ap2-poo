package model;

import java.util.ArrayList;
import java.util.List;

public class Instrutor extends PessoaResponsavel {
    private String formacao;
    private String areaEspecializacao;
    private final List<Minicurso> minicursos;

    public Instrutor(String nome, String email, String formacao, String areaEspecializacao) {
        super(nome, email);
        this.formacao = formacao;
        this.areaEspecializacao = areaEspecializacao;
        this.minicursos = new ArrayList<>();
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getAreaEspecializacao() {
        return areaEspecializacao;
    }

    public void setAreaEspecializacao(String areaEspecializacao) {
        this.areaEspecializacao = areaEspecializacao;
    }

    public List<Minicurso> getMinicursos() {
        return minicursos;
    }
    
    public void adicionarMinicurso(Minicurso minicurso) {
        if (!minicursos.contains(minicurso)) {
            minicursos.add(minicurso);
           
            if (!minicurso.getInstrutores().contains(this)) {
                minicurso.adicionarInstrutor(this);
            }
        }
    }
    
    public void removerMinicurso(Minicurso minicurso) {
        if (minicursos.remove(minicurso)) {
     
            if (minicurso.getInstrutores().contains(this)) {
                minicurso.removerInstrutor(this);
            }
        }
    }
}
