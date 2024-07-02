package escola.com.br.model;

public class Eventos {

    private String bimestre;
    private String data;
    private String nome;

    public String getBimestre() {
        return bimestre;
    }

    public void setBimestre(String bimestre) {
        this.bimestre = bimestre;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Eventos(String bimestre, String data, String nome) {
        super();
        this.bimestre = bimestre;
        this.data = data;
        this.nome = nome;
    }

}
