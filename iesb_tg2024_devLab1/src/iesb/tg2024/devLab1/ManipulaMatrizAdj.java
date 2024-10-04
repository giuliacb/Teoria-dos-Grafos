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
	
	public int[][] gerarMatrizAdjacenciaGrafo() {
        
        int qtdVertices = 5;
        int[][] matriz = new int[qtdVertices][qtdVertices];

        // v1 conectado com v2 e v5
        matriz[0][1] = 1;
        matriz[1][0] = 1;
        matriz[0][4] = 1;
        matriz[4][0] = 1;

        // v2 conectado com v1, v3 e v4
        matriz[1][2] = 1;
        matriz[2][1] = 1;
        matriz[1][3] = 1;
        matriz[3][1] = 1;

        // v3 conectado com v2 e v4
        matriz[2][3] = 1;
        matriz[3][2] = 1;

        // v4 conectado com v2 e v5
        matriz[3][4] = 1;
        matriz[4][3] = 1;

        return matriz;
    }
		
	public void printMatrizAdj(int [][] matriz) {
		System.out.println("Minha Matriz de Adjacência:");
		for (int i = 0; i < matriz.length; i++) {
			//for (int j = 0; j < matriz.length; j++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}
}

