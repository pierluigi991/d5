package MultiMediaPlayer;

public class Video extends Registrazione{

	//Properties 
	
	private int luminosita;
	
    //Constructors
	
	public Video(String title) {
		super(title);
		this.luminosita = 5;
	}
	public Video(String title, int duration, int volume, int luminosita) {
		super( title, duration, volume);
		this.luminosita = luminosita;
	}
    //Methods
	public int aumentaLuminosita() {
		return this.luminosita--;
	}
	public int diminuisciLuminosita() {
		return this.luminosita--;
	}
	
	@Override
	public void play() {
		System.out.println("Vid, " + getTitle() + " " + "!".repeat(this.getVolume()) + "" + "*".repeat(this.luminosita));
	}
}