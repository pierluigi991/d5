package MultiMediaPlayer;

public abstract class MultiMediaElement {

	static int def = 5;
    
	private String title;

    
	public MultiMediaElement(String title) {
		this.title = title;
	}

	
	public String getTitle() {
		return title;
	}
	
	protected void setTitle(String title) {
		this.title = title;
	}
	
  
	abstract public void run();
	
}
