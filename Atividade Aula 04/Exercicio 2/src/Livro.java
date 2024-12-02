public class Livro {

    private  String nome;
    private String isnb;
    private String autor;

    public Livro(String nome, String autor, String isnb) {
        this.nome = nome;
        this.autor = autor;
        this.isnb = isnb;
    }

    public String getNome() {
        return nome;
    }

    public String getIsnb() {
        return isnb;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", isnb='" + isnb + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }
}
