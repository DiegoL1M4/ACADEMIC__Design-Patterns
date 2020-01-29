
package ProxyExample;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		// Lista de Pessoas
		List<Pessoa> agenda = new ArrayList<Pessoa>();
	            
		// Criação
		agenda.add( new ProxyPessoa(10) );
		agenda.add( new ProxyPessoa(20) );
		agenda.add( new ProxyPessoa(30) );
	  
		// Chamada do Objeto: getNome()
		System.out.println("Nome: " + agenda.get(0).getNome()); 
		System.out.println("Nome: " + agenda.get(1).getNome());
		
		// Chamada do Objeto: getIdade()
		System.out.println("Idade: " + agenda.get(0).getIdade());
		System.out.println("Idade: " + agenda.get(1).getIdade());
	  
		// Lazy Loading
		System.out.println("Id da 3ª - " + agenda.get(2).getId());
		
	}
}
