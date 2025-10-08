package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
public static void main(String[] args) {
	
	Map<Integer , String> usuarios = new HashMap();
	usuarios.put(1 , "roberto");
	usuarios.put(2 , "ricardo");
	usuarios.put(3 , "rafael");
	System.out.println(usuarios.size());
	System.out.println(usuarios.keySet());
	System.out.println(usuarios.values());
	System.out.println(usuarios.entrySet());
	
	System.out.println(usuarios.get(2));
	
	for(int chave : usuarios.keySet()) { 
		System.out.println(chave);
	}
	for(String valor : usuarios.values()) { 
		System.out.println(valor);
	}
	
	//ESSE SERVE PARA PERCORRER COM A CHAVE E O VALOR AO MESMO TEMPO!
	for(Entry<Integer , String> registro : usuarios.entrySet()) { //lembre-se de importar o entry do map
		System.out.println(registro.getKey() + "==>" + registro.getValue());
		
	}
}
}
