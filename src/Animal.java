
public class Animal {
	
	//VARIABLES
	private String type;
	private String colour; 
	private int age; 
	private boolean danger; 
	
	//CONSTRUCTOR
	public Animal(String type, String colour, int age, boolean danger)
	{
		this.type = type; 
		this.colour = colour; 
		this.age = age; 
		this.danger = danger;
	}
	
	//SETTERS
	public void setType(String type) {
		this.type = type;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setDanger(boolean danger) {
		this.danger = danger;
	}

	//TOSTRING
	public String toString() 
	{
		if(danger)
		{
			return "This animal is a " + type + ", it is " + colour + " and is " + age + " years old and they are endangered"; 
		}
		else 
		{
			return "This animal is a " + type + ", it is " + colour + " and is " + age + " years old and they are not endangered";
		}
	}
	
	// GETTERS 
	public String getType() 
	{
		return type; 
	}
	
	public String getColour()
	{
		return colour;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public boolean getDanger()
	{
		return danger;
	}
}

