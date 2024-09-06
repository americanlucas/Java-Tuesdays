package entidades;

public class retangulo {
    public static double largura;
    public static double altura;

    public static double Area() {
        return altura * largura;
    }

    public static double Perimetro() {
        return (altura * 2) * (largura * 2);
    }

    public static double Diagonal() {
        return Math.sqrt(Math.pow(largura, 2) + Math.pow(altura, 2));
    }


}
