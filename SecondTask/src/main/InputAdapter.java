package main;

public class InputAdapter implements Input {
	private Scanner scanner;
	
	@Override
	public String read() {
		return scanner.scan();
	}
	
	
	public InputAdapter(Scanner scanner) {
		super();
		this.scanner = scanner;
	}


	public static void main(String[] args) {
		ScannerSPT1500 spt1500 = new ScannerSPT1500();
		InputAdapter ia = new InputAdapter((Scanner)spt1500);
		Label lb = new Label(ia);
		lb.useSourceAdapter();
		System.out.println(lb.getText());
	}
}
