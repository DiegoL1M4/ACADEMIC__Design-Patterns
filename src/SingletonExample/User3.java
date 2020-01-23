package SingletonExample;

public class User3 {

	private Singleton instanciaSingleton;
	
	public User3() {
		instanciaSingleton = Singleton.getInstance();
	}
	
	public void executar() {
		this.instanciaSingleton.executar();
	}
}
