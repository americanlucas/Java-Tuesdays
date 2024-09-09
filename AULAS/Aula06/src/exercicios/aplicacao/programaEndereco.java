package exercicios.aplicacao;



import exercicios.entidades.Enderecos;
import exercicios.entidades.Pessoa;

public class programaEndereco {
     public static void main(String[] args) {
          //instanciar e scan
          Enderecos endereco = new Enderecos("SQN 215 APTO", 405, "Brasília");
          Pessoa pessoa = new Pessoa("Lucas");

          //entrada
          pessoa.setEndereco(endereco);
          System.out.println(pessoa.getNome() + " - " + pessoa.getEnderecoCompleto());
     }
}
