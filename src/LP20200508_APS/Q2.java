package LP20200508_APS;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//02)
		//Escreva um programa, utilizando a Linguagem Java, que tenha dois vetores com
		//250 posições. Em cada vetor o usuário irá armazenar 250 números inteiros. Após o
		//preenchimento o programa deve mostrar os números de cada vetor e depois
		//somar números que pertençam a mesma posição e mostrar os resultados das
		//somas, ou seja: [0]+[0],[1]+[1],... 
		
			Scanner leitor = new Scanner(System.in);
				
			int qnt = 250;
			int[] vetG = new int[qnt];
			int[] vetH = new int[qnt];
			int soma = 0;
				
				
			
			for(int i=0; i<qnt; i++) {
				System.out.println("Digite um valor para o vetor G: ");
					vetG[i] = leitor.nextInt();
						System.out.println("Digite um valor para vetor H: ");
							vetH[i] = leitor.nextInt();
				}
				
				
				
			for(int j = 1; j< qnt; j++)	
				for(int i = 0; i< qnt; i++) {
					soma = vetG[i] + vetH[i];
						
				System.out.println("A soma do valor do vetor G [" + vetG[i] + "] com o valor do vetor H [" + vetH[i] +
						"] na posição " + j++ + " é igual a: " + soma);
				
				}
				
		
	}

}
