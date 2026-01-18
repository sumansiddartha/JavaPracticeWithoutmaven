package Practice.DesignPatterns.StructuralDesign.Decorator;

public class TestDesignPattern {
	public static void main(String[] args) {
		ChristmasTree tree=new BubbleLights(new ChristmasTreeImpl());
		System.out.println(tree.decorate());
				
	}

}
