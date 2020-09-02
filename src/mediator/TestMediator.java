package mediator;

public class TestMediator {

	public static void main(String[] args) {
		User cagatay = new User("cagatay");
		User john = new User("john");
		cagatay.sendMessage("hello everyone");
		john.sendMessage("welcome aboard");
	}
}
