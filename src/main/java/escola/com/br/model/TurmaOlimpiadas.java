package escola.com.br.model;

import java.util.List;

public class TurmaOlimpiadas {

    private String turma;
    private List<PontosOlimpiadasMes> pontosMes;

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public List<PontosOlimpiadasMes> getPontosMes() {
        return pontosMes;
    }

    public void setPontosMes(List<PontosOlimpiadasMes> pontosMes) {
        this.pontosMes = pontosMes;
    }

}
