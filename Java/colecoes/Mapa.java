package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	public static void main(String[] args) {
		Map<Integer, String> usuarios = new HashMap<>();
		usuarios.put(1, "Roberto");
		usuarios.put(20, "Ricardo");
		usuarios.put(3, "Rafaela");
		usuarios.put(4, "Rebeca");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		System.out.println(usuarios.containsKey(20));
		System.out.println(usuarios.containsValue("Rebeca"));
		System.out.println(usuarios.get(20));
		System.out.println(usuarios.remove(20));
		
		for (int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		
		for (String usuario: usuarios.values()) {
			System.out.println(usuario);
		}
		
		for (Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.println(registro);
		}
		
	}
}
