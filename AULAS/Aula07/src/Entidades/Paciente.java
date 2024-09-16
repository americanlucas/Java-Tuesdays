package Entidades;

import java.util.ArrayList;
import java.util.List;

// Classe Paciente (Subclasse de Pessoa)
public class Paciente extends Pessoa {
    private String condicaoSaude;
    private List<String> examesRealizados;

    // Construtor
    public Paciente(String nome, int idade, String condicaoSaude) {
        super(nome, idade);  // Chama o construtor da superclasse
        this.condicaoSaude = condicaoSaude;
        this.examesRealizados = new ArrayList<>();  // Inicializa a lista de exames
    }

    // Getters e Setters
    public String getCondicaoSaude() {
        return condicaoSaude;
    }

    public void setCondicaoSaude(String condicaoSaude) {
        this.condicaoSaude = condicaoSaude;
    }

    // Método para adicionar um exame realizado
    public void adicionarExame(String exame) {
        examesRealizados.add(exame);
    }

    // Método para imprimir exames
    public void imprimirExames() {
        System.out.println("Exames realizados: " + examesRealizados);
    }

    // Sobrescrevendo o método imprimirInfo para incluir a condição de saúde
    @Override
    public void imprimirInfo() {
        super.imprimirInfo();
        System.out.println("Condição de saúde: " + condicaoSaude);
    }
}
