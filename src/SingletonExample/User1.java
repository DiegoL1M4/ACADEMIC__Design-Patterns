package SingletonExample;

public class User1 {
	
	private Singleton instanciaSingleton;
	
	public User1() {
		instanciaSingleton = Singleton.getInstance();
	}
	
	public void executar() {
		this.instanciaSingleton.executar();
	}

}
