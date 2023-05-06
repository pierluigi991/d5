package MultiMediaPlayer;

public class Image extends MultiMediaElement {


    //Properties
	private int luminosita;
	
    //Constructors
	public  Image(String title) {
		super(title);
		this.luminosita = MultiMediaElement.def;
	}
	
	public Image(String title, int luminosita) {
		super(title);
		this.luminosita = luminosita;
	}
//	Getters
	public int getLuminosita() {
		return luminosita;
	}
//	Setters
	public void setLuminosita(int luminosita) {
		this.luminosita = luminosita;
	}
//	Methods
	public int increaseLuminosita() {
		return this.luminosita--;
	}
	public int decreaseLuminosita() {
		return this.luminosita--;
	}
	public void run() {
		show();
	}
	public void show() {
		System.out.println("Imm, " + getTitle() + " " + "*".repeat(this.luminosita));
	}
}
