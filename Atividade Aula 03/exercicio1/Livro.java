package exercicio1;

public class Livro {
    public String titulo;
    public String autor;
    public  int numerodepaginas;
    public  int paginapercorrida;
    public boolean livroaberto;

    public Livro(){
    }

    public Livro(String titulo, String autor, int numerodepaginas){

        this.autor = autor;
        this.titulo = titulo;
        this.numerodepaginas = numerodepaginas;

    }

    public void lerpagina(int pagina){
        this.paginapercorrida = pagina;
    }

    public void abrirlivro(){
        this.livroaberto = true;
    }


    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numerodepaginas='" + numerodepaginas + '\'' +
                '}';
    }
}

