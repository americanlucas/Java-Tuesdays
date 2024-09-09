package exercicios.entidades;

public class Pessoa {
     //atributos
     private String nome;
     private Enderecos endereco;

     //construtor 
     public Pessoa(String nome) {
          this.nome = nome;
          this.endereco = null;
     }

     //get e set
     public String getNome() {
          return nome;
     }

     public void setNome(String nome) {
          this.nome = nome;
     }

     public Enderecos getEndereco() {
          return endereco;
     }

     public void setEndereco(Enderecos endereco) {
          this.endereco = endereco;
     }

     //metodo para obter endereco
     public String getEnderecoCompleto() {
          if (endereco != null) {
               return endereco.getEnderecoCompleto();
          } else {
               return "Endereço inválido";
          }
     }
}
