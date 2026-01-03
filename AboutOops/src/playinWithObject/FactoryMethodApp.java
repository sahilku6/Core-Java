package playinWithObject;

public class FactoryMethodApp {
	public static void main(String[] args) {
		FactoryMethod Box1=FactoryMethod.createBox();
		
		System.out.println(Box1);
		
		FactoryMethod Box2=FactoryMethod.createBox(56);
				
		System.out.println(Box2);
	}
}
