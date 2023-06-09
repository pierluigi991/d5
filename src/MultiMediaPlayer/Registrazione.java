package MultiMediaPlayer;

import d5_interfacce.Riproducibile;

public class Registrazione extends MultiMediaElement implements Riproducibile{
	
    
	
	private int duration;
	private int volume;
	
    
	
	public Registrazione(String title) {
		super(title);
		this.duration = MultiMediaElement.def;
		this.volume = MultiMediaElement.def;
	}
	public Registrazione(String title, int duration, int volume) {
		super(title);
		this.duration = duration;
		this.volume = volume;
	}
    
	public int getDuration() {
		return duration;
	}
	public int getVolume() {
		return volume;
	}
     
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
    
	public int downVolume() {
		return this.volume--;
	}
	public int increasesVolume() {
		return this.volume--;
	}
	public void run() {
		play();
	}
	public void play() {
		System.out.println("Reg, " + getTitle() + " " + "!".repeat(this.volume));
	}
	
}
