package main;

public class Label {
	private Input fSource;
	private String text;

    public Label(Input source) {
        fSource = source;
    } 

    public void useSourceAdapter() {

        this.text = fSource.read();
    }
    
    public String getText(){
    	return text;
    }

}
