package singleton;

public class Test {

	public static void main(String[] args) {
		
		Preferences.getInstance().helloSingleton();
		Preferences obj = new Preferences();
		Preferences obj2 = new Preferences();
		obj.helloSingleton();
		Preferences.getInstance().helloSingleton();
		System.out.println(Preferences.getInstance().hashCode());

	}

}
