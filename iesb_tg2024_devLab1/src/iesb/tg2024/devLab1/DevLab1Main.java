package iesb.tg2024.devLab1;

public class DevLab1Main {
	
//	public void gerarPrimeiraMatriz(int qtdLinhas, int qtdColunas, int valorInicial, 
//			int valorDiagonal, boolean isArestaLoop) {
//				
//		System.out.println(">> DevLab1Main: gerarPrimeiraMatriz()");
//		
//		int [][] matriz = new int [qtdLinhas] [qtdColunas];
//		for (int i = 0; i < matriz.length; i++) {
//			for (int j = 0; j < matriz.length; j++) {
//				 if(isArestaLoop && i==j) 
//					 matriz [i][j] = valorDiagonal;
//				 else 				
//					 matriz[i][j] = valorInicial;
//			}
//		}
//		System.out.println(">> matriz inicializando...");
//		for (int i = 0; i < matriz.length; i++) {
//			for (int j = 0; j < matriz.length; j++) {
//				System.out.print(matriz[i][j] + " ");
//			}
//			System.out.println();
//		}
//	}

	public static void main(String[] args) {
		
		//exemplo 1
		//DevLab1Main lab1 = new DevLab1Main();
		//lab1.gerarPrimeiraMatriz(5,5,0,1,true);
		
		//exemplo 2
		//ManipulaMatrizAdj manipulaMatrizAdj = new ManipulaMatrizAdj();
		//int [][] matriz = manipulaMatrizAdj.gerarPrimeiraMatriz(5, 5, 0, 1, true);
		//manipulaMatrizAdj.printMatrizAdj(matriz);
		
		//meu exemplo
		ManipulaMatrizAdj manipulaMatrizAdj = new ManipulaMatrizAdj();
        int [][] matriz = manipulaMatrizAdj.gerarMatrizAdjacenciaGrafo();
        manipulaMatrizAdj.printMatrizAdj(matriz);
	}

}
