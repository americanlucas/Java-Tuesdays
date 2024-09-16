package Entidades;

public class Aluno {
     //atributos
     public String nome;
     public int matricula;
     public double nota1, nota2, nota3;
     public double soma = nota1 + nota2 + nota2;

     //construtor
     public Aluno(String nome, int matricula, double nota1, double nota2, double nota3, double soma ) {
          this.nome = nome;
          this.matricula = matricula;
          this.soma = soma;
          this.nota1 = nota1;          
          this.nota2 = nota2;     
          this.nota3 = nota3;          
     }

     //metodos get e set
     public String getNome() {
          return nome;
     }

     public void setNome(String nome) {
          this.nome = nome;
     }

     public int getMatricula() {
          return matricula;
     }    

     public void setMatricula(int Matricula) {
          this.matricula = Matricula;
     }

     public double setNota1(double d) {
          return nota1;
     }

     public void getNota1(double nota1) {
          this.nota1 = nota1;
     }

     public double setNota2(double d) {
          return nota2;
     }

     public void getNota2(double nota2) {
          this.nota2 = nota2;
     }

     public double setNota3(double d) {
          return nota3;
     }

     public void getNota3(double nota3) {
          this.nota3 = nota3;
     }

     public double setSoma() {
          return soma;
     }

     public void getSoma(double soma) {
          this.soma = soma;
     }
     
     
     
     //metodos
     public double calculoMedia(double soma) {
          return (soma) / 3;
     }
}
