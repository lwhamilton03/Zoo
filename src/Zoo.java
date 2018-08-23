import java.util.ArrayList;

public class Zoo {

	ArrayList <Animal> arrayAnimal = new ArrayList <Animal>(); 
	
	public void addAnimal()
	{
		arrayAnimal.add(new Fish ("fish", "purple", 2, false, 5, "River"));
		arrayAnimal.add(new Anteater("anteater", "brown", 21, true, 63));
		arrayAnimal.add(new Tiger("tiger", "orange", 12, true, 72));
		arrayAnimal.add(new Fish("fish", "blue", 1, false, 2, "Lake"));
		arrayAnimal .add(new Tiger("tiger", "black", 6, true, 23));
		
	}
	
	public void printAnimal() 
	{
		for(Animal eachAnimal : arrayAnimal)
		{
			System.out.println(eachAnimal.toString());
		}
	}
	
	public void killAnimal(int death)
	{	
		for(int i = arrayAnimal.size() -1; i >= 0; i--)
		{
			if (arrayAnimal.get(i).getAge() >= death)
			{
				arrayAnimal.remove(i);
			}
		}	
		
	}
	
	public void killAllAnimals()
	{
		arrayAnimal.removeAll(arrayAnimal);
	}
}
