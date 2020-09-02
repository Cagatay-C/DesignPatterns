package singleton;

public class Preferences {

	private static Preferences instance = null;

	private synchronized static void createInstance() {
		if (instance == null)
			instance = new Preferences();
	}

	public static Preferences getInstance() {
		if (instance == null)
			instance = new Preferences();
		return instance;
	}

	public void helloSingleton() {
		System.out.println("Hello from Singleton");
	}
}
