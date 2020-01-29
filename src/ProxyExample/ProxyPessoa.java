
package ProxyExample;

class ProxyPessoa implements Pessoa {
	
	private Integer id;
	private Pessoa pessoa;
  
	// Construtor
	public ProxyPessoa(Integer id) {
		this.id = id;
	}
	
	// Getters
	public Integer getId() {
		return this.id;
	}
  
	public String getNome() {
		if (pessoa == null)
			pessoa = PessoaDAO.getPessoaByID(this.id);

		return pessoa.getNome();
	}
  
	public Integer getIdade() {
		if (pessoa == null)
			pessoa = PessoaDAO.getPessoaByID(this.id);

		return pessoa.getIdade();
	}
	
}