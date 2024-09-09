package exercicios.entidades;

public class Enderecos {
     
     //atributos
     private String rua;
     private int numero;
     private String cidade;

     //construtor
     public Enderecos (String rua, int numero, String cidade) {
          this.rua = rua;
          this.numero = numero;
          this.cidade = cidade;
     }

     //get e set atributos
     public String getRua() {
          return rua;
     }

     public void setRua(String rua) {
          this.rua = rua;
     }

     public int getNumero() {
          return numero;
     }

     public void setNumero(int numero) {
          this.numero = numero;
     }

     public String getCidade() {
          return cidade;
     }

     public void setCidade(String cidade) {
          this.cidade = cidade;
     }

     //metodo para obter endereco
     public String getEnderecoCompleto() {
          return rua + " " + numero + ", " + cidade;
     }
     
}
