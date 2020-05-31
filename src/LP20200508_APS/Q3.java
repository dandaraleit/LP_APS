package LP20200508_APS;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//03)
		//Escrever um programa, utilizando a Linguagem Java, que preencha um vetor com
		//os números pares do número 10000 a 80000. (1,0 ponto)
		
		int qtd = 80000;
		int[] VetPar = new int [qtd];
				
		for(int i = 10000; i <= qtd; i++) {
				if(i % 2 == 0 ) {
					VetPar[i] = i;
						System.out.println(VetPar[i]);
					
					
			}
		}

	}

}
