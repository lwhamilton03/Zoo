
public class Tiger extends Animal {

	private int noStripes; 
	
	public Tiger(String type, String colour, int age, boolean danger, int noStripes)
	{
		super(type, colour, age, danger);
		this.noStripes = noStripes;
	}
	
	public int getNoStripes()
	{
		return noStripes;
	}

	public void setNoStripes(int noStripes) 
	{
		this.noStripes = noStripes;
	}
}
