//6
		//Escrever um programa, utilizando a Linguagem Java, que receba aleatoriamente do
		//usuário 10 números inteiros e armazene estes em um vetor. Em seguida, o usuário
		//digita um número e seu programa deve acusar se o número digitado está no vetor
		//ou não. Se estiver, diga a posição que está. (2,0 pontos)
		
				
		int[] numeros = new int[qntd];
		int qntd = 10, numeroPesquisado, indiceEncontrado=0;
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
		
		
