package SingletonExample;

public class Main {

	public static void main(String[] args) {
		
		User1 user1 = new User1();
		User2 user2 = new User2();
		User3 user3 = new User3();
		
		user1.executar();
		user2.executar();
		user3.executar();
	}

}
