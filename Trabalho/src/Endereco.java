public class Endereco {

    private  String rua;
    private String cidade;
    private  String numero;
    private  String cep;
    private boolean enderecoatual;
    private String estado;

    public Endereco(String rua, String estado, boolean enderecoatual, String cep, String numero, String cidade) {
        this.rua = rua;
        this.estado = estado;
        this.enderecoatual = enderecoatual;
        this.cep = cep;
        this.numero = numero;
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public String getEstado() {
        return estado;
    }

    public boolean isEnderecoatual() {
        return enderecoatual;
    }

    public String getCep() {
        return cep;
    }

    public String getNumero() {
        return numero;
    }

    public String getCidade() {
        return cidade;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s, %s, %s, ",rua,cidade,numero,cep,estado  );
    }
}
