package exercicios.entidades;

public class animal {
     
     public String tipoAnimal; 

     public void fazer_som(String tipoAnimal) {
          if (tipoAnimal.equals("Gato")) {
               System.out.println("Miau");
          } else if (tipoAnimal.equals("Cachorro")) {
               System.out.println("Rouf, Rouf!");
          }
          
     }

}
