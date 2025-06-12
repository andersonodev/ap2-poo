package model;

public class Seminario extends Evento {
    private String tema;
    private String nomeAlunoApresentador;
    private String nomeOrientador;

    public Seminario(String titulo, String data, int duracao, double orcamento, Local local,
    String tema, String nomeAlunoApresentador, String nomeOrientador) {
        super(titulo, data, duracao, orcamento, local);
        this.tema = tema;
        this.nomeAlunoApresentador = nomeAlunoApresentador;
        this.nomeOrientador = nomeOrientador;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getNomeAlunoApresentador() {
        return nomeAlunoApresentador;
    }

    public void setNomeAlunoApresentador(String nomeAlunoApresentador) {
        this.nomeAlunoApresentador = nomeAlunoApresentador;
    }

    public String getNomeOrientador() {
        return nomeOrientador;
    }

    public void setNomeOrientador(String nomeOrientador) {
        this.nomeOrientador = nomeOrientador;
    }
    
    @Override
    public String exibirInformacoes() {
        return super.exibirInformacoes() + 
               "\nTema: " + tema + 
               "\nApresentador: " + nomeAlunoApresentador + 
               "\nOrientador: " + nomeOrientador;
    }
}
