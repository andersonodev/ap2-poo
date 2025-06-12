package model;

public class Laboratorio extends Local {
    private int numeroComputadores;
    private String tipo;
    
    public static final String TIPO_INFORMATICA = "informatica";
    public static final String TIPO_QUIMICA = "quimica";

    public Laboratorio(String nome, int capacidadeMaxima, String bloco, int numeroComputadores, String tipo) {
        super(nome, capacidadeMaxima, bloco);
        this.numeroComputadores = numeroComputadores;
        

        if (!tipo.equals(TIPO_INFORMATICA) && !tipo.equals(TIPO_QUIMICA)) {
            throw new IllegalArgumentException("Tipo de laboratório deve ser 'informatica' ou 'quimica'");
        }
        this.tipo = tipo;
    }

    public int getNumeroComputadores() {
        return numeroComputadores;
    }

    public void setNumeroComputadores(int numeroComputadores) {
        this.numeroComputadores = numeroComputadores;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (!tipo.equals(TIPO_INFORMATICA) && !tipo.equals(TIPO_QUIMICA)) {
            throw new IllegalArgumentException("Tipo de laboratório deve ser 'informatica' ou 'quimica'");
        }
        this.tipo = tipo;
    }
    
    @Override
    public String toString() {
        return getNome() + " (" + (tipo.equals(TIPO_INFORMATICA) ? "Laboratório de Informática" : "Laboratório de Química") + 
               ") - " + getNumeroComputadores() + " computadores";
    }
}
