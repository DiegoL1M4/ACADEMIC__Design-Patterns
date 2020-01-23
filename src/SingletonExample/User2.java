package SingletonExample;

public class User2 {

	private Singleton instanciaSingleton;
	
	public User2() {
		instanciaSingleton = Singleton.getInstance();
	}
	
	public void executar() {
		this.instanciaSingleton.executar();
	}
}
