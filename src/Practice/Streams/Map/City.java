package Practice.Streams.Map;

import java.util.List;

public class City {
	  private String name;
	    private String locatedIn;
	    private List<String> xya;

	    public City(String name, String locatedIn) {
	        this.name = name;
	        this.locatedIn = locatedIn;
	    }
	    

		public City(String name, String locatedIn, List<String> xya) {
			super();
			this.name = name;
			this.locatedIn = locatedIn;
			this.xya = xya;
		}


		public List<String> getXya() {
			return xya;
		}

		public void setXya(List<String> xya) {
			this.xya = xya;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getLocatedIn() {
			return locatedIn;
		}

		public void setLocatedIn(String locatedIn) {
			this.locatedIn = locatedIn;
		}

		@Override
		public String toString() {
			return "City [name=" + name + ", locatedIn=" + locatedIn + "]";
		}
	    
	    
}
