package LP20200508_APS;

import java.util.Scanner;

public class LP_APS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leitor = new Scanner (System.in);
		
		/*
				
		//03
		//Faça um programa, utilizando a Linguagem Java, que identifique se em um
		//determinado vetor, existem ou não valores repetidos. O programa deve criar um
		//vetor de 30 números inteiros que deve ser preenchido pelo usuário antes de ser
		//verificado. (
		
		
		
		int qtd = 30;
		int[] vet1 = new int[qtd];
			
		
		for(int i=0; i<qtd; i++) {
			System.out.println("Digite um número inteiro: ");
			vet1[i] = leitor.nextInt();
		}
		
		for(int i=0; i<qtd; i++) {
			for(int j=i+1; j<qtd; j++) {
					
				if (vet1[i] == vet1[j]) {
				System.out.println("O número " + vet1[i] + " se repete na posição " + j);
			} 
		
		} 
			
	} 
		
		
		
	*/
		
		//4
		//Escreva um programa, utilizando a Linguagem Java, que tenha dois vetores com
		//250 posições. Em cada vetor o usuário irá armazenar 250 números inteiros. Após o
		//preenchimento o programa deve mostrar os números de cada vetor e depois
		//somar números que pertençam a mesma posição e mostrar os resultados das
		//somas, ou seja: [0]+[0],[1]+[1],... (2,0 pontos)
		
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
				
				System.out.println("A soma do valor do vetor G [" + vetG[i] + "] com o valor do vetor H [" + vetH[i] +  "] na posição " + j++ + " é igual a: " + soma);
		
		}
		
		
		
		
		/*
		//5
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
		
		
		
		
		
		//6
		//Escrever um programa, utilizando a Linguagem Java, que receba aleatoriamente do
		//usuário 10 números inteiros e armazene estes em um vetor. Em seguida, o usuário
		//digita um número e seu programa deve acusar se o número digitado está no vetor
		//ou não. Se estiver, diga a posição que está. (2,0 pontos)
		
		int qntd = 10, numeroPesquisado, indiceEncontrado=0;		
		int[] numeros = new int[qntd];
		boolean existe = false;
		
		for (int i=0; i < qntd; i++) {
			System.out.println("Digite um número: ");
			numeros[i] = leitor.nextInt();
		}
		
		System.out.println("Digite o número que você quer pesquisar no vetor: ");
		numeroPesquisado = leitor.nextInt();
		
		for(int i=0; i < qntd; i++) {
			if (numeroPesquisado == numeros[i]) {
				existe = true;
				indiceEncontrado = i;
				break;
			}			
		}
		
		if(existe) {
			System.out.println("O número " + numeroPesquisado + " está na posição " + (indiceEncontrado+1));
		}else {
			System.out.println("O número pesquisado não existe no vetor!");
		}
		
		
		
		
		//7
		//Faça um programa para preencher uma matriz quadrada 4x4 com valores inteiros,
		//digitados pelo usuário, e imprima somente os valores das suas diagonais (principal
		//e secundária). (1,0 ponto)
		
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
		
		*/
		
		
	}

}
