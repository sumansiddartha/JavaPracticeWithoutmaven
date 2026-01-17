package Practice.strings;

import java.util.regex.Pattern;

public class CheckStringisNumeric {
	
	private static Pattern pattern=Pattern.compile("-?\\d+(\\.\\d+)?") ;
	public static boolean isNumeric(String str) {
		if(str==null)
			return false;
	return pattern.matcher(str).matches();
	}
	
	public static void main(String[] args) {
		System.out.println(isNumeric("45222"));
		
	}

}
