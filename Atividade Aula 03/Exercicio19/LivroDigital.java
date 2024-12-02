package Exercicio19;

public class LivroDigital {
        // Atributos da classe
        private String titulo;
        private String autor;
        private double tamanhoArquivo;
        private boolean aberto;
        private boolean fechado;

        // Construtor
        public LivroDigital(String titulo, String autor, double tamanhoArquivo) {
            this.titulo = titulo;
            this.autor = autor;
            this.tamanhoArquivo = tamanhoArquivo;
            this.aberto = false;
        }


        public String getTitulo() {
            return titulo;
        }

        public String getAutor() {
            return autor;
        }

        public double getTamanhoArquivo() {
            return tamanhoArquivo;
        }

        public boolean isAberto() {
            return aberto;
        }

        public boolean isFechado(){
            return fechado;
        }

        public void abrirL(){
            System.out.println("Abrindo livro");
        }

        public  void fecharL(){
            System.out.println("Fechando livro");
        }
    }

