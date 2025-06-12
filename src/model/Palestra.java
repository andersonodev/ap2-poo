package model;

public class Palestra extends Evento {
    private String nomePalestrante;
    private String emailPalestrante;
    private String instituicaoPalestrante;

    public Palestra(String titulo, String data, int duracao, double orcamento, Local local, 
                    String nomePalestrante, String emailPalestrante, String instituicaoPalestrante) {
        super(titulo, data, duracao, orcamento, local);
        this.nomePalestrante = nomePalestrante;
        this.emailPalestrante = emailPalestrante;
        this.instituicaoPalestrante = instituicaoPalestrante;
    }

    public String getNomePalestrante() {
        return nomePalestrante;
    }

    public void setNomePalestrante(String nomePalestrante) {
        this.nomePalestrante = nomePalestrante;
    }

    public String getEmailPalestrante() {
        return emailPalestrante;
    }

    public void setEmailPalestrante(String emailPalestrante) {
        this.emailPalestrante = emailPalestrante;
    }

    public String getInstituicaoPalestrante() {
        return instituicaoPalestrante;
    }

    public void setInstituicaoPalestrante(String instituicaoPalestrante) {
        this.instituicaoPalestrante = instituicaoPalestrante;
    }
    
    @Override
    public String exibirInformacoes() {
        return super.exibirInformacoes() + 
               "\nPalestrante: " + nomePalestrante + 
               "\nEmail: " + emailPalestrante + 
               "\nInstituição: " + instituicaoPalestrante;
    }
}
