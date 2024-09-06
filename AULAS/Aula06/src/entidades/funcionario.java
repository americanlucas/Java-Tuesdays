package entidades;

public class funcionario {
    public static String nome;
    public static double salarioBruto;
    public static double imposto;
    public static Object salarioLiquido;

    public static double salarioLiquido() {
        return salarioBruto - imposto;
    }

    public static double aumentoSalario(double porcentagem) {
        double x = salarioBruto * ((porcentagem / 100) + 1);
        return x;
    }
}