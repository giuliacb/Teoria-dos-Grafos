package iesb.tg2024.devlab7.giuliacb;

import java.util.ArrayList;
import java.util.List;

/*
 * IESB - AULA DE TEORIA DOS GRAFOS
 * GIULIA CAMPELO BEZERRA
 * 2024/2S
 * 
 * PRATICA: DEVLAB7 - IMPLEMENTANDO ALGORITMO DIJKSTRA EM JAVA
 */

public class DevLab7Main {

	public static void main(String[] args) {

		int qtdVerticesGrafo = 5;
		int origem = 0;
		List<List<Vertice>> matrizAdj = new ArrayList<List<Vertice>>();

		for(int i = 0; i < qtdVerticesGrafo; i++) {
			List<Vertice> item = new ArrayList<Vertice>();
			matrizAdj.add(item);
		}
		
		//inicializa matriz adj
		matrizAdj.get(0).add(new Vertice(1, 9));
		matrizAdj.get(0).add(new Vertice(2, 6));
		matrizAdj.get(0).add(new Vertice(3, 5));
		matrizAdj.get(0).add(new Vertice(4, 3));
		
		matrizAdj.get(2).add(new Vertice(1, 2));
		matrizAdj.get(2).add(new Vertice(3, 4));
		
		//cria grafo do alg
		Grafo grafo = new Grafo(qtdVerticesGrafo);
		
		//calcula caminho mais curto a partir da origem
		grafo.executarAlgoritmoDijkstra(matrizAdj, origem);
		
		System.out.println(">> Giulia Campelo Bezerra TG2024");
		System.out.println(">> O caminho mais curto a partir do vertice de origem é: ");
		for(int i = 0; i < grafo.getArrayDistancias().length; i++) {
			System.out.println(">> A distancia da origm [" + origem + "] até o vertice [" + i + "] é: [" + grafo.getArrayDistancias()[i] + "].");
		}
	}
}
