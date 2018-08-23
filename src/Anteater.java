
public class Anteater extends Animal{

	private int snoutLength;
	
	public Anteater(String type, String colour, int age, boolean danger, int snoutLength)
	{
		super(type, colour, age, danger);
		this.snoutLength = snoutLength;
	}

	public int getSnoutLength() {
		return snoutLength;
	}

	public void setSnoutLength(int snoutLength) {
		this.snoutLength = snoutLength;
	}
	
}
