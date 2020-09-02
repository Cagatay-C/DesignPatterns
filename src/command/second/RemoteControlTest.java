package command.second;

public class RemoteControlTest {
	
	public static void main(String[] args) {
		
		RemoteControl remote = new RemoteControl();
		Light kitchenLight = new Light("Kitchen");
		LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
		
		GarageDoor garageDoor = new GarageDoor();
		GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
		
		remote.setCommand(0, kitchenLightOn, kitchenLightOff);
		remote.onButtonWasPressed(0);
		remote.offButtonWasPressed(0);
		remote.undoButtonWasPressed();
	}
}
