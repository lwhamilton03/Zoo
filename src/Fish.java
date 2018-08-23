
public class Fish extends Animal{

	private int swimSpeed;
	private String waterType;
	
	public Fish(String type, String colour, int age, boolean danger, int swimSpeed, String waterType)
	{
		super(type, colour, age, danger);
		this.swimSpeed = swimSpeed;
		this.waterType = waterType;
	}

	public int getSwimSpeed() {
		return swimSpeed;
	}

	public void setSwimSpeed(int swimSpeed) {
		this.swimSpeed = swimSpeed;
	}

	public String getWaterType() {
		return waterType;
	}

	public void setWaterType(String waterType) {
		this.waterType = waterType;
	}
	
	
	
}
