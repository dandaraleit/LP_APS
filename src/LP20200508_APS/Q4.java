package LP20200508_APS;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//6
				//Escrever um programa, utilizando a Linguagem Java, que receba aleatoriamente do
				//usu�rio 10 n�meros inteiros e armazene estes em um vetor. Em seguida, o usu�rio
				//digita um n�mero e seu programa deve acusar se o n�mero digitado est� no vetor
				//ou n�o. Se estiver, diga a posi��o que est�. (2,0 pontos)
				
				Scanner leitor = new Scanner(System.in);
				
				int qntd = 10, numeroPesquisado, indiceEncontrado=0;
				int[] numeros = new int[qntd];
				boolean existe = false;
				
				for (int i=0; i < qntd; i++) {
					System.out.println("Digite um n�mero: ");
					numeros[i] = leitor.nextInt();
				}
				
				System.out.println("Digite o n�mero que voc� quer pesquisar no vetor: ");
				numeroPesquisado = leitor.nextInt();
				
				for(int i=0; i < qntd; i++) {
					if (numeroPesquisado == numeros[i]) {
						existe = true;
						indiceEncontrado = i;
						break;
					}			
				}
				
				if(existe) {
					System.out.println("O n�mero " + numeroPesquisado + " est� na posi��o " + (indiceEncontrado+1));
				}else {
					System.out.println("O n�mero pesquisado n�o existe no vetor!");
				}
				
				
	}

}
