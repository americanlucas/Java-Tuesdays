package Aplicacao;

import Entidades.Medico;
import Entidades.Paciente;

public class ProgramaMedico {
     public static void main(String[] args) {
        // Criando um paciente
        Paciente paciente1 = new Paciente("João", 30, "Diabetes");
        paciente1.adicionarExame("Exame de sangue");
        paciente1.adicionarExame("Raio X");

        // Criando um médico
        Medico medico1 = new Medico("Dra. Maria", 45, "Cardiologista");

        // Adicionando o paciente ao histórico do médico
        medico1.adicionarPaciente(paciente1);

        // Imprimindo informações do paciente
        paciente1.imprimirInfo();
        paciente1.imprimirExames();

        // Imprimindo informações do médico e seu histórico de pacientes
        medico1.imprimirInfo();
        medico1.imprimirHistoricoPacientes();
    }
}
