// %n e \n para quebrar linha
//%s - string
//%d - int
//%.2f - double
//%c - char

package A01;

public class Projeto {
	public static void main (String args[]) {
		String product1 = "Computer";
		String product2 = "Office Desk";
		double price1 = 2100.0;
		double price2 = 650.0;
		double measure = 53.234567;
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		System.out.printf("Produtos: %n");
		System.out.printf("%s, cujo preço é R$%.2f %n", product1, price1 );
		System.out.printf("%s, cujo preço é R$%.2f %n", product2, price2 );
		System.out.printf("Registro: %d ANOS, CODIGO %d e gênero: %c %n", age, code, gender);
		System.out.printf("Medida com oito casas decimais: %.8f %n", measure);
		System.out.printf("Cercado(Três casas decimais): %.3f", measure);
	}
}
