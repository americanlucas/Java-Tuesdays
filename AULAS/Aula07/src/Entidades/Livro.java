package Entidades;

public class Livro extends Autor {
     private String titulo;
     private String editora;
     private String sinopse;
 
     // Construtor
     public Livro(String nome, String nacionalidade, String titulo, String editora, String sinopse) {
         super(nome, nacionalidade);  // Chama o construtor da superclasse Autor
         this.titulo = titulo;
         this.editora = editora;
         this.sinopse = sinopse;
     }
 
     // Getters e Setters
     public String getTitulo() {
         return titulo;
     }
 
     public void setTitulo(String titulo) {
         this.titulo = titulo;
     }
 
     public String getEditora() {
         return editora;
     }
 
     public void setEditora(String editora) {
         this.editora = editora;
     }
 
     public String getSinopse() {
         return sinopse;
     }
 
     public void setSinopse(String sinopse) {
         this.sinopse = sinopse;
     }
 
     // Método para imprimir informações do livro
     public void imprimirInfoLivro() {
         System.out.println("Título: " + titulo);
         System.out.println("Editora: " + editora);
         System.out.println("Sinopse: " + sinopse);
         imprimirInfo();  // Chama o método da superclasse (Autor)
     }
 }
 
