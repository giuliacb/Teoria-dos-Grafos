package iesb.tg2024.devLab2.search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Caminho {
	
	private Map<String, String> caminho;
	
	public Caminho() {
		this.caminho = new HashMap<>();
	}
	
	public void ligarVertices(String anterior, String proximo) {
		this.caminho.put(anterior, proximo);
	}
	
	public List<String> gerarCaminho(String origem, String destino){
		List<String> resultado = new ArrayList<String>();
		String noh = destino;
		
		while(noh != origem && this.caminho.containsKey(noh)) {
			resultado.add(noh);
			noh = this.caminho.get(noh);
		}
		
		resultado.add(noh);
		
		//inverter ordem dos elemntos da lista
		Collections.reverse(resultado);
		
		return resultado;
	}

}
