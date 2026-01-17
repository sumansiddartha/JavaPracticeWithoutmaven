package Practice.DesignPatterns.StructuralDesign.Decorator;

public class BubbleLights extends TreeDecorator{

	public BubbleLights() {
		super();
	}

	public BubbleLights(ChristmasTree tree) {
		super(tree);
		
	}
	@Override
	public String decorate() {
		
		return super.decorate()+decorateWithBubbleLights();
	}
	 private String decorateWithBubbleLights() {
	        return " with Bubble Lights";
	    }

}
