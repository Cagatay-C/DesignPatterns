package command.second;

public class Light {
	
	String room;

	public Light(String room) {
		this.room = room;
	}
	
	public void on() {
		if(room.equals("Living Room")) {
			System.out.println("Living Room Light On...");
		}else if(room.equals("Kitchen")) {
			System.out.println("Kitchen Light On...");
		}
	}
	
	public void off() {
		if(room.equals("Living Room")) {
			System.out.println("Living Room Light Off...");
		}else if(room.equals("Kitchen")) {
			System.out.println("Kitchen Light Off...");
		}
	}
}
