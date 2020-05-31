package LP20200508_APS;

import java.util.Scanner;

public class LP_APS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leitor = new Scanner (System.in);
		
		/*
				
		//03
		//Fa�a um programa, utilizando a Linguagem Java, que identifique se em um
		//determinado vetor, existem ou n�o valores repetidos. O programa deve criar um
		//vetor de 30 n�meros inteiros que deve ser preenchido pelo usu�rio antes de ser
		//verificado. (
		
		
		
		int qtd = 30;
		int[] vet1 = new int[qtd];
			
		
		for(int i=0; i<qtd; i++) {
			System.out.println("Digite um n�mero inteiro: ");
			vet1[i] = leitor.nextInt();
		}
		
		for(int i=0; i<qtd; i++) {
			for(int j=i+1; j<qtd; j++) {
					
				if (vet1[i] == vet1[j]) {
				System.out.println("O n�mero " + vet1[i] + " se repete na posi��o " + j);
			} 
		
		} 
			
	} 
		
		
		
	*/
		
		//4
		//Escreva um programa, utilizando a Linguagem Java, que tenha dois vetores com
		//250 posi��es. Em cada vetor o usu�rio ir� armazenar 250 n�meros inteiros. Ap�s o
		//preenchimento o programa deve mostrar os n�meros de cada vetor e depois
		//somar n�meros que perten�am a mesma posi��o e mostrar os resultados das
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
				
				System.out.println("A soma do valor do vetor G [" + vetG[i] + "] com o valor do vetor H [" + vetH[i] +  "] na posi��o " + j++ + " � igual a: " + soma);
		
		}
		
		
		
		
		/*
		//5
		//Escrever um programa, utilizando a Linguagem Java, que preencha um vetor com
		//os n�meros pares do n�mero 10000 a 80000. (1,0 ponto)
		
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
		//usu�rio 10 n�meros inteiros e armazene estes em um vetor. Em seguida, o usu�rio
		//digita um n�mero e seu programa deve acusar se o n�mero digitado est� no vetor
		//ou n�o. Se estiver, diga a posi��o que est�. (2,0 pontos)
		
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
		
		
		
		
		//7
		//Fa�a um programa para preencher uma matriz quadrada 4x4 com valores inteiros,
		//digitados pelo usu�rio, e imprima somente os valores das suas diagonais (principal
		//e secund�ria). (1,0 ponto)
		
		int qtdLinhas=4, qtdColunas=4;
		
		int[][] mat = new int[qtdLinhas][qtdColunas];
		
		for(int i=0; i<qtdLinhas; i++) {
			for(int j=0; j<qtdColunas; j++) {
				System.out.println("Digite um n�mero inteiro:");
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
		
		System.out.println("Diagonal Secund�ria:");
		
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
