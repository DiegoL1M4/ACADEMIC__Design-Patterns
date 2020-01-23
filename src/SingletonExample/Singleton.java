package SingletonExample;

public class Singleton {

	private static Singleton instanciaSingleton;
	
	private int contador = 0;

	private Singleton() {}

	public static Singleton getInstance() {
		if(instanciaSingleton == null) {
			synchronized(Singleton.class) {
				if(instanciaSingleton == null) {
					instanciaSingleton = new Singleton();
				}
			}
		}
		return instanciaSingleton;
	}
	
	public void executar() {
		this.contador++;
		System.out.println("Contagem: " + this.contador);
	}

}
