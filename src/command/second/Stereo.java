package command.second;

public class Stereo {
	
	int vol;
	
	public Stereo() {
		vol = 5;
	}
	
	public void on() {
		System.out.println("Stereo is on...");
	}
	
	public void off() {
		System.out.println("Stereo is off...");
	}
	
	public void setCd() {
		System.out.println("Cd has been plugged...");
	}
	
	public void setDvd() {
		System.out.println("Dvd has been plugged...");
	}
	
	public void setRadio() {
		System.out.println("Radio is set...");
	}
	
	public void setVolume(int vol) {
		this.vol = vol;
		System.out.println("Volume is " + vol);
	}
}
