package Estoque;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Estoque {
	public static void main(String[] args) {
		Collection<String> prod = new ArrayList();
		prod.add("Camisa");
		prod.add("Calça");
		prod.add("Tênis");
		prod.add("Meia");
		System.out.println("Produtos adicionados a lista: "+prod);
		
		prod.remove("Calça");
		System.out.println("\nItem removido: Calça");
		
		Collection<String> prod1 = Arrays.asList("Blusão","Touca");
		prod.addAll(prod1);
		System.out.println("\nItens adicionados: "+prod1);
		
		System.out.println("\n**DADOS DA LISTA**");
		for(String list:prod){
			System.out.println("Produtos: "+list);
		}
	}
}
