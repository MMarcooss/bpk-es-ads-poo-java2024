package cadastroPessoa;

public class Endereco {

    private String cidade;
    private String logradouro;
    private String estado;

    public Endereco(String cidadade, String estado, String logradouro) {
        this.cidade = cidadade;
        this.estado = estado;
        this.logradouro = logradouro;
    }

    public String getCidadade() {
        return cidade;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getEstado() {
        return estado;
    }

}
