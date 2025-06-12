package model;

import java.util.ArrayList;
import java.util.List;

public class Minicurso extends Evento {
    private final List<Instrutor> instrutores;
    private int cargaHoraria;
    private final List<String> materiaisApoio;

    public Minicurso(String titulo, String data, int duracao, double orcamento, Local local, int cargaHoraria) {
        super(titulo, data, duracao, orcamento, local);
        this.cargaHoraria = cargaHoraria;
        this.instrutores = new ArrayList<>();
        this.materiaisApoio = new ArrayList<>();
    }

    public List<Instrutor> getInstrutores() {
        return instrutores;
    }

    public void adicionarInstrutor(Instrutor instrutor) {
        if (!this.instrutores.contains(instrutor)) {
            this.instrutores.add(instrutor);
    
            instrutor.adicionarMinicurso(this);
        }
    }
    
    public void removerInstrutor(Instrutor instrutor) {
        if (this.instrutores.remove(instrutor)) {
            instrutor.removerMinicurso(this);
        }
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public List<String> getMateriaisApoio() {
        return materiaisApoio;
    }

    public void adicionarMaterialApoio(String material) {
        this.materiaisApoio.add(material);
    }

    @Override
    public String exibirInformacoes() {
        StringBuilder info = new StringBuilder(super.exibirInformacoes());
        info.append("\nCarga Horária: ").append(cargaHoraria).append(" horas");

        info.append("\nInstrutores: ");
        for (Instrutor instrutor : instrutores) {
            info.append("\n  - ").append(instrutor.getNome()).append(" (").append(instrutor.getAreaEspecializacao()).append(")");
        }

        info.append("\nMateriais de Apoio: ");
        for (String material : materiaisApoio) {
            info.append("\n  - ").append(material);
        }

        return info.toString();
    }
}
