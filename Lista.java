package colecoes;
import java.util.ArrayList;
import hash.Usuarios;
public class Lista {

	public static void main(String[] args) {
		
		ArrayList<Usuarios> lista = new ArrayList<>();

		Usuarios u1 = new Usuarios("Ana");
		
		lista.add(u1);
		lista.add(new Usuarios("pedro"));
		lista.add(new Usuarios("carlos"));
		lista.add(new Usuarios("bia"));
		lista.add(new Usuarios("manu"));

		System.out.println(lista.get(3));//acessar pelo índice
		for(Usuarios u : lista) {
			System.out.println(u.nome);
		}
		

	}
}
