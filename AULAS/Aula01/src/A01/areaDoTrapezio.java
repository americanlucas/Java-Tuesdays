package A01;

import java.util.Locale;

public class areaDoTrapezio {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		//var
		double baseMaior = 6.0;
		double baseMenor = 8.0;
		double altura = 5.0;
		
		double area;
		
		//processamento
		area = (((baseMaior + baseMenor) * altura) / 2);
		
		//saida
		System.out.printf("A área é igual a %.2f \n", area);

	}

}
