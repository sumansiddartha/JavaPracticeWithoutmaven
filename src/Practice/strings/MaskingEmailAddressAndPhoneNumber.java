package Practice.strings;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MaskingEmailAddressAndPhoneNumber {

	static String email = "testemailaddressssssssssssssssssssssss@example.com";
	public static void givenEmailAddress_whenUsingStringManipulation_thenMaskEmail() {
		int atIndex=email.indexOf('@');
		System.out.println(atIndex);
		String repetedString=IntStream.range(0,atIndex-2).mapToObj(i->"*").collect(Collectors.joining());
	System.out.println(repetedString);
	String maskedPart = email.substring(0, atIndex - repetedString.length()) + repetedString;
	System.out.println(maskedPart);
	String maskedEmail = maskedPart + email.substring(atIndex);
	System.out.println(maskedEmail);
	}
	
	public static void main(String[] args) {
		givenEmailAddress_whenUsingStringManipulation_thenMaskEmail();

	}

}
