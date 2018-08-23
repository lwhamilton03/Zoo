
public class MainRunnerAnimalia {
	
		public static void main(String[] args)
		{
			Zoo zooz = new Zoo(); 
			
			zooz.addAnimal();
			
			zooz.printAnimal();
			System.out.println("the lucky ones");
			zooz.killAnimal(20);
			
			zooz.printAnimal();
			System.out.println("you think you are safe");
			
			zooz.killAllAnimals();
			
			System.out.println("All Alone?");
			zooz.printAnimal();
		
		}
}
