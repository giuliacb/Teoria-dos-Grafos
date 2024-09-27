package iesb.tg2024.devLab1;

public class ManipulaMatrizAdj {
	
	public int [] [] gerarPrimeiraMatriz(int qtdLinhas, int qtdColunas, int valorInicial, 
			int valorDiagonal, boolean isArestaLoop) {
				
		System.out.println(">> Gerando Matriz de Adjacência");
		
		int [][] matriz = new int [qtdLinhas] [qtdColunas];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				 if(isArestaLoop && i==j) 
					 matriz [i][j] = valorDiagonal;
				 else 				
					 matriz[i][j] = valorInicial;
			}
		}
		System.out.println(">> matriz inicializando...");
		
		return matriz;
	}
		
	public void printMatrizAdj(int [][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}
}

