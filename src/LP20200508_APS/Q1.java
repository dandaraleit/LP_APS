package LP20200508_APS;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//01)
		//Faça um programa, utilizando a Linguagem Java, que identifique se em um
		//determinado vetor, existem ou não valores repetidos. O programa deve criar um
		//vetor de 30 números inteiros que deve ser preenchido pelo usuário antes de ser
		//verificado. 
				
				Scanner save = new Scanner (System.in);
				
				int qtd = 30;
				int[] vet1 = new int[qtd];
					
				
				for(int i=0; i<qtd; i++) {
					System.out.println("Digite um número inteiro: ");
					vet1[i] = save.nextInt();
				}
				
				for(int i=0; i<qtd; i++) {
					for(int j=i+1; j<qtd; j++) {
							
						if (vet1[i] == vet1[j]) {
						System.out.println("O número " + vet1[i] + " se repete na posição " + j);
					} 
				
				} 
					
			} 
				

	}

}
