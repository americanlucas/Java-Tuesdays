package EXERCICIO_01;

import java.util.Locale;
import java.util.Scanner;

public class areaDePoligonos {

	public static void main(String[] args) {
		//var e scanner
		Scanner leitor = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		double A;
		double B;
		double C;
		
		
		double areaTrianguloRetangulo;
		double areaCirculo;
		double areaTrapezio;
		double areaQuadrado;
		double areaRetangulo;
		
		//entrada 
		A = 3;
		B = 4;
		C = 5.2;
		
		//processamento 
		areaTrianguloRetangulo = (A * C) / 2;
		areaCirculo = (Math.PI) * (Math.pow(C, 2));
		areaTrapezio = ((A + B) * C) / 2;
		areaQuadrado = B * B;
		areaRetangulo = A * B;
		
		//saida
		System.out.printf("Area do Triângulo Retângulo: %.2f %nArea do Círculo: %.2f %nArea do Trapézio: %.2f %nArea do Quadrado: %.2f %nArea do retangulo: %.2f %n",areaTrianguloRetangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo);
	}

}
