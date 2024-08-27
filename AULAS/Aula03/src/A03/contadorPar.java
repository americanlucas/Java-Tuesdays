package A03;

public class contadorPar {
	
	//processamento 
	public static void cont (int i) {
		for (i = 0; i <= 20; i++) {
			if (i%2 ==0){
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		//saida
		int i = 0;
		
		cont(i);
	}

}
