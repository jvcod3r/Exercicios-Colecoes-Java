package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
public static void main(String[] args) {
	Queue <String> fila = new LinkedList<>();
	fila.add("Ana");
	fila.add("Bia");
	fila.add("Rafaela");
	fila.offer("Ana"); 
	
	
	System.out.println(fila.peek()); 
	System.out.println(fila.element()); 
	System.out.println();
	
	
	

	System.out.println(fila.poll());
	System.out.println(fila.poll());
}
}
