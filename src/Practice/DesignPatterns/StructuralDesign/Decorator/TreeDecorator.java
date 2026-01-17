package Practice.DesignPatterns.StructuralDesign.Decorator;

public abstract class TreeDecorator implements ChristmasTree{

	private ChristmasTree tree;
	
	
	
	
	public TreeDecorator() {
		super();
		
	}




	public TreeDecorator(ChristmasTree tree) {
		super();
		this.tree = tree;
	}




	@Override
	public String decorate() {
		
		return tree.decorate();
	}

}
