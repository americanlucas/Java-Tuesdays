package A03;

public class multTres {
	
	//processamento
	public static void mult (int i) {
		for (i = 0; i <= 30; i++) {
			if (i%3 == 0) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		//saida
		int i = 0;
		
		mult(i);
	}

}
