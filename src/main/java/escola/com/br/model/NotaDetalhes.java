package escola.com.br.model;

public class NotaDetalhes {

    private String materia;
    private String codigoMateiria;
    private String prova1;
    private String prova2;
    private String conselho;

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getCodigoMateiria() {
        return codigoMateiria;
    }

    public void setCodigoMateiria(String codigoMateiria) {
        this.codigoMateiria = codigoMateiria;
    }

    public String getProva1() {
        return prova1;
    }

    public void setProva1(String prova1) {
        this.prova1 = prova1;
    }

    public String getProva2() {
        return prova2;
    }

    public void setProva2(String prova2) {
        this.prova2 = prova2;
    }

    public String getConselho() {
        return conselho;
    }

    public void setConselho(String conselho) {
        this.conselho = conselho;
    }

    public NotaDetalhes(String materia, String codigoMateiria, String prova1, String prova2, String conselho) {
        super();
        this.materia = materia;
        this.codigoMateiria = codigoMateiria;
        this.prova1 = prova1;
        this.prova2 = prova2;
        this.conselho = conselho;
    }

    public NotaDetalhes() {
    }
}