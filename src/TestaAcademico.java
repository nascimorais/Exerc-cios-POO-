public class TestaAcademico {

    public static void main(String[] args) {

        // Objetos independentes
        Aluno a1 = new Aluno(1, "Ana", "2023001", "Computacao");
        Aluno a2 = new Aluno(2, "Bruno", "2023002", "Computacao");

        // Disciplina
        Disciplina d = new Disciplina(1, "Programacao Orientada a Objetos", "Prof. Carlos");

        // Agregação
        d.matricularAluno(a1);
        d.matricularAluno(a2);

        // Composição
        Avaliacao prova = d.criarAvaliacao(1, "Prova Semestral");

        // Composição aninhada
        prova.adicionarQuestao(1, "Explique o que é POO", 3.0f);
        prova.adicionarQuestao(2, "Diferença entre agregação e composição", 3.5f);
        prova.adicionarQuestao(3, "Exemplo de encapsulamento em Java", 3.5f);

        // Mostrar estrutura
        System.out.println(d);
    }
}