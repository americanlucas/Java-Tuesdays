package exercicios.entidades;

public class carro {
     private int ano;
     private String marca;
     private String modelo;

     //construtor
     public carro (int ano, String marca, String modelo) {
          this.ano = ano;
          this.marca = marca;
          this.modelo = modelo;
     }

     //getter ano
     public int getAno() {
          return ano;
     }

     //setter ano
     public void setAno(int ano) {
          this.ano = ano;
     }

     public String getMarca(){
          return marca;
     }

     public void setMarca(String marca){
          this.marca = marca;
     }

     public String getModelo(){
          return modelo;
     }

     public void setModelo(String modelo){
          this.modelo = modelo;
     }
}
