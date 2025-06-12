# Apliquei conhecimentos adquiridos em aula, do curso da Oracle e do curso do professor Nélio Alves da Udemy, que estou realizando

Implemente em Java o domínio descrito a seguir.
Sistema de Gestão de Eventos Acadêmicos
Uma universidade deseja desenvolver um sistema para organizar seus eventos acadêmicos, como
palestras, minicursos e seminários. Cada evento possui:
• Título
• Data
• Duração (em horas)
• Orçamento (valor em reais destinado à realização do evento)
• Um local associado, que pode ser uma sala, um auditório ou um laboratório
Cada local possui um nome identificador, uma capacidade máxima de pessoas e um
bloco/prédio. Os locais podem ser de diferentes tipos:
• Sala, que informa o número da sala e se tem equipamento multimídia
• Auditório, que informa se tem sistema de som e estrutura para tradução simultânea
• Laboratório, que informa o número de computadores disponíveis e se o laboratório é de
informática ou de química
Os eventos podem ser de três tipos:
• Palestras: possuem um palestrante convidado, com nome, e-mail e instituição.
• Minicursos: são ministrados por um ou mais instrutores e têm uma carga horária e uma
lista de materiais de apoio.
• Seminários: envolvem apresentações feitas por alunos, com um tema, o nome do aluno
apresentador e o nome do orientador.
A universidade conta com pessoas responsáveis pela organização dos eventos, que podem ser:
• Instrutores, com nome, e-mail, formação e área de especialização.
• Organizadores, com nome, e-mail e função administrativa (ex: “coordenador”,
“responsável por inscrições”).
Tanto instrutores quanto organizadores herdam de uma classe genérica chamada
PessoaResponsavel.
Os participantes dos eventos são alunos interessados. Cada participante possui:
• Nome
• CPF
• E-mail
• Curso
Um participante pode se inscrever em mais de um evento, desde que haja vagas disponíveis no
local.
Tarefas da Prova:
Com base no minimundo apresentado, realize as seguintes atividades:
1. Identifique as classes de modelo (“model”), com seus atributos e relacionamentos.
2. Implemente essas classes, com seus métodos construtores, getters e setters.
3. Instancie mais de um objeto de cada classe para exemplificar o modelo representado.
4. Publique a solução em um repositório público do GitHub e poste o link no Estudante.
