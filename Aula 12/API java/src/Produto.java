import java.util.Objects;

public class Produto {
    private String nome;
    private Integer preco;

    public Produto(String nome, Integer preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(Integer preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Objects.equals(nome, produto.nome) && Objects.equals(preco, produto.preco);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, preco);
    }
}
