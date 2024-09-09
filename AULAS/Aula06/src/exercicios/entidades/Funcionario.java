package exercicios.entidades;

public class Funcionario {
     public Funcionario(String nome, String cargo, double salario) {
          
     }

     public String nome;
     public String cargo;
     public double salario;


     public String getNome() {
          return nome;
     }

     public void setNome(String nome) {
          this.nome = nome;
     }

     public String getCargo() {
          return cargo;
     }

     public void setCargo(String cargo) {
          this.cargo = cargo;
     }

     public double getSalario() {
          return salario;
     }

     public void setSalario(double salario) {
          this.salario = salario;
     }

     

     public class Gerente extends Funcionario {
          public Gerente(String nome, String cargo, double salario) {
               super(nome, cargo, salario);
          }
     }

     public class Desenvolvedor extends Funcionario {
          public Desenvolvedor(String nome, String cargo, double salario){
               super(nome, cargo, salario);
          }
     }



     public double calcularBonificação(double salario) {
          if (cargo.equals("Gerente")) {
               return salario * 1.2;
          } else {
               return salario * 1.15;
          }
          
     }
}
