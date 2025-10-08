package colecoes;

import java.util.HashSet;
import hash.Usuarios;

public class Hash {
public static void main(String[] args) {
	
	HashSet<Usuarios> usuarios = new HashSet<Usuarios>();
	usuarios.add(new Usuarios("pedro"));
	usuarios.add(new Usuarios("ana"));
	usuarios.add(new Usuarios("guilherme"));
	
	boolean result = usuarios.contains( new Usuarios("guilherme"));
	System.out.println(result);
}
}
