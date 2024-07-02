package escola.com.br.model;

public class Materia {

    private String materia;
    private String codigoMateiria;
    private String primeiro;
    private String segundo;
    private String terceiro;
    private String quarto;

    public String getCodigoMateiria() {
        return codigoMateiria;
    }

    public void setCodigoMateiria(String codigoMateiria) {
        this.codigoMateiria = codigoMateiria;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(String primeiro) {
        this.primeiro = primeiro;
    }

    public String getSegundo() {
        return segundo;
    }

    public void setSegundo(String segundo) {
        this.segundo = segundo;
    }

    public String getTerceiro() {
        return terceiro;
    }

    public void setTerceiro(String terceiro) {
        this.terceiro = terceiro;
    }

    public String getQuarto() {
        return quarto;
    }

    public void setQuarto(String quarto) {
        this.quarto = quarto;
    }

    public Materia(String materia, String codigoMateiria, String primeiro, String segundo, String terceiro,
            String quarto) {
        super();
        this.materia = materia;
        this.codigoMateiria = codigoMateiria;
        this.primeiro = primeiro;
        this.segundo = segundo;
        this.terceiro = terceiro;
        this.quarto = quarto;
    }

}
