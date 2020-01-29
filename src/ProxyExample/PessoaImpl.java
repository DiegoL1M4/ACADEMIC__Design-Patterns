
package ProxyExample;

public class PessoaImpl implements Pessoa {
	
	private Integer id;
	private String nome;
	private Integer idade;
  
	// Construtor
	public PessoaImpl(Integer id, String nome, Integer idade) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		
		System.out.println("Retornou a pessoa do banco de dados ->  " + nome);
	}

	// Getters
	public Integer getId() {
		return this.id;
	}

	public String getNome() {
		return this.nome;
	}

	public Integer getIdade() {
		return this.idade;
	}
}
