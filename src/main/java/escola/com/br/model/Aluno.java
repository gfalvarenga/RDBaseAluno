package escola.com.br.model;

import java.util.List;

public class Aluno {

    private String matricula;
    private String nome;
    private String turma;
    private List<Materia> notas;

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Materia> getNotas() {
        return notas;
    }

    public void setNotas(List<Materia> notas) {
        this.notas = notas;
    }

    public Aluno(String matricula, String nome, List<Materia> notas, String turma) {
        super();
        this.matricula = matricula;
        this.nome = nome;
        this.notas = notas;
        this.turma = turma;
    }

}
