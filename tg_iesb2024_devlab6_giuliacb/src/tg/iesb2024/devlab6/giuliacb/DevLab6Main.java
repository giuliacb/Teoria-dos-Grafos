package tg.iesb2024.devlab6.giuliacb;

public class DevLab6Main {

	public static void main(String[] args) {
		
		Grafo grafo = new Grafo(4);
		
		grafo.adicionarAresta(0, 1, 1);
		grafo.adicionarAresta(1, 2, 2);
		grafo.adicionarAresta(2, 3, 3);
		grafo.adicionarAresta(0, 3, 4);
		
		System.out.println("IESB TG 2024 - DevLab6 (Algoritmo de PRIM)!");
		
		grafo.executarAlgoritmoPRIM();
	}

}
