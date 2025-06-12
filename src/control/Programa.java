package control;
import model.*;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        // Criação de locais

        Sala sala101 = new Sala("Sala 101", 30, "Andar 1", 101, true);
        Auditorio auditorioPrincipal = new Auditorio("Auditório Principal", 200, "Andar 0", true, true);
        Laboratorio labInformatica = new Laboratorio("Laboratório de Informática", 25, "Andar 1", 25, Laboratorio.TIPO_INFORMATICA);
        Laboratorio labQuimica = new Laboratorio("Laboratório de Química", 20, "Andar 2", 15, Laboratorio.TIPO_QUIMICA);
        
        // Criação de cursos

        Curso engComputa = new Curso("Engenharia da Computação", "ENG-COMP");
        Curso cdia = new Curso("Ciência de Dados e IA", "CDIA");
        
        // Criação de pessoas responsáveis

        Instrutor instrutor1 = new Instrutor("Thiago", "Thiago@email.com", "Doutorado", "Inteligência Artificial em POO");
        Instrutor instrutor2 = new Instrutor("Clayton", "Clayton@email.com", "Doutorado", "Computação Quântica");
        Organizador organizador1 = new Organizador("Clayton", "Clayton@email.com", "Coordenador");
        Organizador organizador2 = new Organizador("Thiago", "Thiago@email.com", "Coordenador");


        Participante bernardo = new Participante("Bernardo", "000.000.000-00", "BernardoCasaNovas@email.com", cdia);
        Participante anderson = new Participante("Anderson Lima", "000.000.000-00", "Andersonodev@gmail.com", engComputa);


        String dataHoje = "12/06/2025";
        
        // Criação dos eventos

        Palestra palestra = new Palestra(
            "Tendências em IA", 
            dataHoje, 
            2, 
            1500.0, 
            auditorioPrincipal, 
            "Dr. Carlos Mendes", 
            "carlos@universidade.edu", 
            "Universidade Federal do Rio de Janeiro"
        );
        
        Minicurso minicurso = new Minicurso(
            "Programação em Java",
            dataHoje, 
            8, 
            3000.0,
            labInformatica,
            20
        );
        minicurso.adicionarInstrutor(instrutor1);
        minicurso.adicionarInstrutor(instrutor2);
        minicurso.adicionarMaterialApoio("Apostila de Java");
        minicurso.adicionarMaterialApoio("Exercícios práticos Em Poo");
        
        Seminario seminario = new Seminario(
            "Aplicações de Machine Learning", 
            dataHoje, 
            1, 
            500.0, 
            sala101, 
            "Deep Learning aplicado à Saúde", 
            "Lucas Ferreira", 
            "Profa. Beatriz Gomes"
        );
        
        Seminario ap2Poo = new Seminario(
            "AP2 de Programação Orientada a Objetos", 
            dataHoje,
            2, 
            300.0, 
            auditorioPrincipal,
            "Avaliação de Conceitos de OO",
            "Prof. Thiago",
            "Coordenação dos Cursos Techs"
        );
        
        Seminario provaArquitetura = new Seminario(
            "Prova de Arquitetura de Computadores", 
            dataHoje,
            2, 
            250.0, 
            labQuimica,
            "Avaliação sobre Hardware e Organização", 
            "Profa. Clayton",
            "Cordenador de Engenharias"
        );
        
        Palestra diaDosNamorados = new Palestra(
            "Workshop Dia dos Namorados",
            dataHoje,
            3,
            2000.0,
            auditorioPrincipal,
            "Dra. Mariana Campos",
            "mariana@relacionamentos.com",
            "Instituto de Psicologia"
        );


        // associacão de organizadores e responsáveis pelos eventos
        ap2Poo.setOrganizadorResponsavel(organizador2);
        minicurso.setOrganizadorResponsavel(organizador2);
        diaDosNamorados.setOrganizadorResponsavel(organizador2);
        provaArquitetura.setOrganizadorResponsavel(organizador1);
        

        bernardo.inscreverEvento(minicurso);
        anderson.inscreverEvento(minicurso);
        
        bernardo.inscreverEvento(ap2Poo);
        bernardo.inscreverEvento(provaArquitetura);
        bernardo.inscreverEvento(diaDosNamorados); 
        
        anderson.inscreverEvento(ap2Poo);
        anderson.inscreverEvento(provaArquitetura);

        // Menu interativo
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        
        do {
            // Exibir menu
            System.out.println("\n============ Sistema de Gestão de Eventos Acadêmicos ===============");
            System.out.println("1. Ver informações da Palestra 'Tendências em IA'");
            System.out.println("2. Ver informações do Minicurso 'Programação em Java'");
            System.out.println("3. Ver informações do Seminário 'Aplicações de Machine Learning'");
            System.out.println("4. Ver eventos do Bernardo");
            System.out.println("5. Ver eventos do Anderson");
            System.out.println("6. Ver informações do 'Workshop Dia dos Namorados'");
            System.out.println("7. Ver informações da 'AP2 de POO'");
            System.out.println("8. Ver informações da 'Prova de Arquitetura de Computadores'");
            System.out.println("9. Ver eventos organizados por Clayton");
            System.out.println("10. Ver eventos organizados por Thiago");
            System.out.println("11. Cancelar inscrição de Bernardo na AP2 de POO");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            
            try {
                opcao = scanner.nextInt();
                
                if (opcao == 1) {
                    System.out.println("\n" + palestra.exibirInformacoes());
                } 
                else if (opcao == 2) {
                    System.out.println("\n" + minicurso.exibirInformacoes());
                } 
                else if (opcao == 3) {
                    System.out.println("\n" + seminario.exibirInformacoes());
                } 
                else if (opcao == 4) {
                    System.out.println("\nEventos de " + bernardo.getNome() + " (Curso: " + bernardo.getCurso() + "):");
                    for (Evento e : bernardo.getEventosInscritos()) {
                        System.out.println("- " + e.getTitulo());
                    }
                } 
                else if (opcao == 5) {
                    System.out.println("\nEventos de " + anderson.getNome() + " (Curso: " + anderson.getCurso() + "):");
                    for (Evento e : anderson.getEventosInscritos()) {
                        System.out.println("- " + e.getTitulo());
                    }
                } 
                else if (opcao == 6) {
                    System.out.println("\n" + diaDosNamorados.exibirInformacoes());
                } 
                else if (opcao == 7) {
                    System.out.println("\n" + ap2Poo.exibirInformacoes());
                } 
                else if (opcao == 8) {
                    System.out.println("\n" + provaArquitetura.exibirInformacoes());
                } 
                else if (opcao == 9) {
                    System.out.println("\nEventos organizados por " + organizador1.getNome() + ":");
                    for (Evento e : organizador1.getEventosOrganizados()) {
                        System.out.println("- " + e.getTitulo());
                    }
                } 
                else if (opcao == 10) {
                    System.out.println("\nEventos organizados por " + organizador2.getNome() + ":");
                    for (Evento e : organizador2.getEventosOrganizados()) {
                        System.out.println("- " + e.getTitulo());
                    }
                }
                else if (opcao == 11) {
                    if (bernardo.cancelarInscricao(ap2Poo)) {
                        System.out.println("\nInscrição de " + bernardo.getNome() + " na AP2 de POO cancelada com sucesso!");
                    } else {
                        System.out.println("\nNão foi possível cancelar a inscrição.");
                    }
                    

                    System.out.println("\nEventos atuais de " + bernardo.getNome() + ":");
                    for (Evento e : bernardo.getEventosInscritos()) {
                        System.out.println("- " + e.getTitulo());
                    }
                }
                else if (opcao == 0) {
                    System.out.println("Saindo do sistema...");
                } 
                else {
                    System.out.println("Opção inválida!");
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida! Por favor, digite um número.");
                scanner.nextLine();
                opcao = -1;
            }
        } while (opcao != 0);
        
        scanner.close();
    }
}
