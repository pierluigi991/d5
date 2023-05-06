package MultiMediaPlayer;

public abstract class MultiMediaElement {

	static int def = 5;
    // Properties
	private String title;

    //Constructor
	public MultiMediaElement(String title) {
		this.title = title;
	}

	
	public String getTitle() {
		return title;
	}
	
	protected void setTitle(String title) {
		this.title = title;
	}
	
    //Method
	abstract public void run();
	
}
