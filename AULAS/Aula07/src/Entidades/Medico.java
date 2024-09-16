package Entidades;

import java.util.ArrayList;
import java.util.List;


public class Medico extends Pessoa {
     private String funcao;  // Ex: doutor, cirurgião, enfermeiro
     private List<Paciente> historicoPacientes;  // Lista de pacientes atendidos
 
     // Construtor
     public Medico(String nome, int idade, String funcao) {
         super(nome, idade);  // Chama o construtor da superclasse
         this.funcao = funcao;
         this.historicoPacientes = new ArrayList<>();  // Inicializa a lista de pacientes
     }
 
     // Getters e Setters
     public String getFuncao() {
         return funcao;
     }
 
     public void setFuncao(String funcao) {
         this.funcao = funcao;
     }
 
     // Método para adicionar paciente ao histórico
     public void adicionarPaciente(Paciente paciente) {
         historicoPacientes.add(paciente);
     }
 
     // Método para remover paciente do histórico
     public void removerPaciente(Paciente paciente) {
         historicoPacientes.remove(paciente);
     }
 
     // Método para imprimir o histórico de pacientes atendidos
     public void imprimirHistoricoPacientes() {
         System.out.println("Histórico de pacientes atendidos: ");
         for (Paciente paciente : historicoPacientes) {
             paciente.imprimirInfo();  // Polimorfismo: chama o método imprimirInfo do Paciente
         }
     }
 
     // Sobrescrevendo o método imprimirInfo para incluir a função
     @Override
     public void imprimirInfo() {
         super.imprimirInfo();
         System.out.println("Função: " + funcao);
     }
 }