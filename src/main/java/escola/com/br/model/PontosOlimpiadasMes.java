package escola.com.br.model;

public class PontosOlimpiadasMes {

    private String mes;
    private String pontos;

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getPontos() {
        return pontos;
    }

    public void setPontos(String pontos) {
        this.pontos = pontos;
    }

    public PontosOlimpiadasMes(String mes, String pontos) {
        super();
        this.mes = mes;
        this.pontos = pontos;
    }

}
