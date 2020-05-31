package LP20200508_APS;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//05)
		//Faça um programa para preencher uma matriz quadrada 4x4 com valores inteiros,
		//digitados pelo usuário, e imprima somente os valores das suas diagonais (principal
		//e secundária). 
				
				Scanner leitor = new Scanner(System.in);
				
				int qtdLinhas=4, qtdColunas=4;
				
				int[][] mat = new int[qtdLinhas][qtdColunas];
				
				for(int i=0; i<qtdLinhas; i++) {
					for(int j=0; j<qtdColunas; j++) {
						System.out.println("Digite um número inteiro:");
						mat[i][j] = leitor.nextInt();
					}
				}
				
				System.out.println("Diagonal Principal: ");
				
				for(int i=0; i<qtdLinhas; i++) {
					for(int j=0; j<qtdColunas; j++) {
						
						if (i == j ) {
							System.out.println(mat[i][j]);
						}
						
					}
				}
				
				System.out.println("Diagonal Secundária:");
				
				for(int i=0; i<qtdLinhas; i++) {
					for(int j=0; j<qtdColunas; j++) {
						
						if ( i+j == qtdLinhas - 1 ) {
							System.out.println(mat[i][j]);
					}
						
				 }
			}
				

	}

}
