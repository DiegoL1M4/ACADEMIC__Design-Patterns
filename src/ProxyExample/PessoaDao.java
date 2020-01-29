
package ProxyExample;

class PessoaDAO {
	
	public static Pessoa getPessoaByID(Integer id){
		System.out.println("\nSELECT * FROM pessoa WHERE id=" + id);
		
		return new PessoaImpl(
				id, 
				"Pessoa " + id + " da Silva", 
				id + 20);
	}
	
}
