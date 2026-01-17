package Practice.DesignPatterns.CreationalDesign.Factory;

public class FactoryDriver {

	public static void main(String[] args) {
		Polygon p;
		PolygonFactory factory=new PolygonFactory();
		p = factory.getPolygon(4);
		System.out.println("this polygon has 4 sides and is called as::"+p.getType());
		p = factory.getPolygon(5);
		System.out.println("this polygon has 5 sides and is called as::"+p.getType());

	}

}
